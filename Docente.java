/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public class Docente extends Usuario {
    
    // Atributos
    private String departamento; 
    private String titulo;

    // Constructor 
    public Docente(String id, String cedula, String nombres, int edad, String direccionDomicilio, String departamento, String titulo) throws DatosInvalidosException {
        super(id, cedula, nombres, edad, direccionDomicilio); // Pasa los datos hacia arriba
        this.departamento = departamento;
        this.titulo = titulo;
    }

    // GETTERS Y SETTERS 
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
