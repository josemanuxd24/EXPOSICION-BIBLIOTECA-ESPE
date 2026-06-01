/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public class Estudiante extends Usuario {
    
    // Atributos
    private String carrera; 
    private int semestre;   // Ejemplo: 1, 2, 3...

    // Constructor 
    public Estudiante(String id, String cedula, String nombres, int edad, String direccionDomicilio, String carrera, int semestre) throws DatosInvalidosException {
        super(id, cedula, nombres, edad, direccionDomicilio); // Invoca al padre
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    // GETTERS Y SETTERS
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
