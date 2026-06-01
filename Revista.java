/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public class Revista extends MaterialBiblioteca implements IPrestamo {
    
    // 1. Atributos propios (Encapsulados)
    private int edicion;       // Ejemplo: Edición N° 5
    private String categoria;  // Ejemplo: "Científica" o "Variedades"

    // 2. Constructor (Envía los datos comunes a la mamá)
    public Revista(String codigo, String titulo, String autor, int anioPublicacion, int edicion, String categoria) throws DatosInvalidosException {
        super(codigo, titulo, autor, anioPublicacion); // Llama al constructor de MaterialBiblioteca
        this.edicion = edicion;
        this.categoria = categoria;
    }

    // Polimorfismo
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 1.00; 
    }


    @Override
    public void mostrarInformacion() {
        System.out.println("[Revista] Codigo: " + getCodigo() + 
                           " | Titulo: " + getTitulo() + 
                           " | Edicion: " + edicion + 
                           " | Categoria: " + categoria);
    }

    // Métodos
    @Override
    public void prestar(Usuario usuario, String fechaPrestamo) throws BibliotecaException {
        if (isDisponible() == false) {
            throw new MaterialNoDisponibleException("La revista '" + getTitulo() + "' ya está prestada.");
        }
        setDisponible(false); // Cambia el estado a prestada
    }

    @Override
    public void devolver(String fechaDevolucion, int diasRetraso) throws BibliotecaException {
        setDisponible(true); // Vuelve a estar disponible en el estante
    }

    // GETTERS Y SETTERS 
    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String obtenerTipo() {
        return "Revista";
    }
}

