/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public abstract class MaterialBiblioteca {
    
    private String codigo;
    private String titulo; 
    private String autor; 
    private int anioPublicacion; 
    private boolean disponible; 

    // Constructor 
    public MaterialBiblioteca(String codigo, String titulo, String autor, int anioPublicacion) throws DatosInvalidosException {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        // Llamamos al setter para que él valide el año
        setAnioPublicacion(anioPublicacion); 
        this.disponible = true; 
    }

    // Métodos abstractos 
    public abstract String obtenerTipo();
    
    public abstract double calcularMulta(int diasRetraso); 
    public abstract void mostrarInformacion(); 

    // GETTERS Y SETTERS 
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Exception (no permite ingresar fechas que no exisiten
    public void setAnioPublicacion(int anioPublicacion) throws DatosInvalidosException {
        if (anioPublicacion > 2026) {
            throw new DatosInvalidosException("El año de publicación no puede ser del futuro.");
        }
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}