/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public class Tesis extends MaterialBiblioteca { 
    
    // Atributos
    private String areaInvestigacion;
    private String carrera;           
    // Constructor
    public Tesis(String codigo, String titulo, String autor, int anioPublicacion, String areaInvestigacion, String carrera) throws DatosInvalidosException {
        super(codigo, titulo, autor, anioPublicacion); 
        this.areaInvestigacion = areaInvestigacion;
        this.carrera = carrera;
    }

    // Polimorfismo
    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 1.50; 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Tesis] Codigo: " + getCodigo() + 
                           " | Titulo: " + getTitulo() + 
                           " | Area: " + areaInvestigacion + 
                           " | Carrera: " + carrera);
    }

    // GETTERS Y SETTERS
    public String getAreaInvestigacion() {
        return areaInvestigacion;
    }

    public void setAreaInvestigacion(String areaInvestigacion) {
        this.areaInvestigacion = areaInvestigacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String obtenerTipo() {
        return "Tesis";
    }
}