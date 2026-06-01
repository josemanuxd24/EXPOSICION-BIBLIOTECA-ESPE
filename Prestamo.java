/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public class Prestamo {
    // Atributos
    private Usuario usuario; 
    private MaterialBiblioteca material; 
    private String fechaPrestamo; 
    private String fechaDevolucion; 
    private double multa; 
    private String comprobanteMulta;

    // Constructor 
    public Prestamo(Usuario usuario, MaterialBiblioteca material, String fechaPrestamo) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = "No devuelto aún";
        this.multa = 0.0;
        this.comprobanteMulta = "Sin multa"; 
    }
    // Metodo 

    public void registrarDevolucion(String fechaDevolucion, int diasRetraso) {
        
    this.fechaDevolucion = fechaDevolucion; 
    
    if (diasRetraso > 0) {
        multa = material.calcularMulta(diasRetraso); 
        comprobanteMulta = "MULTA PENDIENTE";        
    } else {
        multa = 0.0;
        comprobanteMulta = "Sin multa";
        }
    }

    // GETTERS Y SETTERS TRADICIONALES
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public MaterialBiblioteca getMaterial() {
        return material;
    }

    public void setMaterial(MaterialBiblioteca material) {
        this.material = material;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public String getComprobanteMulta() {
        return comprobanteMulta;
    }

    public void setComprobanteMulta(String comprobanteMulta) {
        this.comprobanteMulta = comprobanteMulta;
    }
}
