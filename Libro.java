/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public class Libro extends MaterialBiblioteca implements IPrestamo {
    
    // Atributos propios
    private String genero; 
    private int numeroPaginas; 

    // Constructor
    public Libro(String codigo, String titulo, String autor, int anioPublicacion, String genero, int numeroPaginas) throws DatosInvalidosException {
        super(codigo, titulo, autor, anioPublicacion);
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    // Polimorfismo
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 0.50; // El libro cobra $0.50 por día de atraso
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Libro] Codigo: " + getCodigo() + 
                " | Titulo: " + getTitulo() + " | Genero: " + 
                genero + " | Paginas: " + numeroPaginas);
    }

    //  Método 
    @Override
    public void prestar(Usuario usuario, String fechaPrestamo) throws BibliotecaException {
        if (isDisponible() == false) {
            throw new MaterialNoDisponibleException("El libro '" + getTitulo() + "' ya está prestado.");
        }
        setDisponible(false); // Si estaba disponible, ahora pasa a falso (prestado)
    }

    @Override
    public void devolver(String fechaDevolucion, int diasRetraso) throws BibliotecaException {
        setDisponible(true); // Al devolverlo, vuelve a estar disponible (verdadero)
    }

    // GETTERS Y SETTERS 
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    @Override
    public String obtenerTipo() {
        return "Libro";
    }
}
