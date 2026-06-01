/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exposicion_sp;

/**
 *
 * @author DELL
 */
public interface IPrestamo {
    void prestar(Usuario usuario, String fechaPrestamo) throws BibliotecaException;
    void devolver(String fechaDevolucion, int diasRetraso) throws BibliotecaException;
}
