/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public class Usuario {
    private String id; 
    private String cedula; 
    private String nombres; 
    private int edad; 
    private String direccionDomicilio; 

    // Constructor tradicional y natural
    public Usuario(String id, String cedula, String nombres, int edad, String direccionDomicilio) throws DatosInvalidosException {
        validarEdad(edad); 
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
        this.direccionDomicilio = direccionDomicilio;
    }

    private void validarEdad(int edad) throws DatosInvalidosException {
        if (edad < 0) { 
            throw new DatosInvalidosException("La edad no puede ser un número negativo."); 
        }
    }

    public void consultarMaterial(MaterialBiblioteca material) {
        System.out.println(nombres + " está consultando el material:"); 
        material.mostrarInformacion(); 
    }

    // GETTERS Y SETTERS 
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public int getEdad() { return edad; }
    
    public void setEdad(int edad) throws DatosInvalidosException {
        validarEdad(edad); 
        this.edad = edad;
    }

    public String getDireccionDomicilio() { return direccionDomicilio; }
    public void setDireccionDomicilio(String direccionDomicilio) { this.direccionDomicilio = direccionDomicilio; }
}
