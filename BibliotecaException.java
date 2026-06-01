/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public class BibliotecaException extends Exception {
    public BibliotecaException(String mensaje) {
        super(mensaje);
    }
}

// Intentar prestar un material no disponible
class MaterialNoDisponibleException extends BibliotecaException {
    public MaterialNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}

// Datos inválidos (Edades, años, etc.)
class DatosInvalidosException extends BibliotecaException {
    public DatosInvalidosException(String mensaje) {
        super(mensaje);
    }
}

// Intentar devolver un material inexistente o no prestado
class MaterialInexistenteException extends BibliotecaException {
    public MaterialInexistenteException(String mensaje) {
        super(mensaje);
    }
}
