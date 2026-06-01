/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_sp;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class Biblioteca {
    // Atributos 
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<MaterialBiblioteca> listaMateriales;
    private ArrayList<Prestamo> listaPrestamos;

    // Constructor 
    public Biblioteca() {
        listaUsuarios = new ArrayList<>();
        listaMateriales = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
    }

    // Métodos
    public void agregarUsuario(Usuario u) {
        listaUsuarios.add(u);
    }

    public void agregarMaterial(MaterialBiblioteca m) {
        listaMateriales.add(m);
    }

    // LÓGICA PARA PRESTAR 
    public void prestarMaterial(Usuario u, MaterialBiblioteca m, String fecha) throws BibliotecaException {
        
        //  Restricción 
        if (m.obtenerTipo().equalsIgnoreCase("Tesis")) {
            throw new BibliotecaException("Restriccion ESPE: Las tesis son de uso exclusivo en sala y no aplican para prestamos externos.");
        }
        
        // Control de disponibilidad
        if (m.isDisponible() == false) {
            throw new MaterialNoDisponibleException("El material '" + m.getTitulo() + "' ya se encuentra prestado actualmente.");
        }
        
        //Proceso de préstamo 
        m.setDisponible(false); 
        
        Prestamo nuevoPrestamo = new Prestamo(u, m, fecha); 
        listaPrestamos.add(nuevoPrestamo);
        System.out.println("¡Prestamo registrado exitosamente en el sistema!");
    }

    public void devolverMaterial(MaterialBiblioteca m, String fechaDev, int diasRetraso) throws BibliotecaException {
        Prestamo prestamoEncontrado = null;
        
        for (Prestamo p : listaPrestamos) {
            if (p.getMaterial().getCodigo().equalsIgnoreCase(m.getCodigo())) {
                prestamoEncontrado = p;
                break;
            }
        }

        if (prestamoEncontrado != null) {
            m.setDisponible(true); // El material vuelve a estar libre en los estantes
            prestamoEncontrado.registrarDevolucion(fechaDev, diasRetraso); // Se calculan las multas
            
            System.out.println("¡Devolucion procesada con exito!");
            System.out.println("Estado actual del comprobante: " + prestamoEncontrado.getComprobanteMulta());
        } else {
            // Alerta si el código ingresado no tiene un flujo de préstamo activo
            throw new MaterialInexistenteException("El codigo ingresado no coincide con ningun prestamo activo registrado en el sistema.");
        }
    }

    // Métodos 
    public void mostrarUsuarios() {
        System.out.println("--- LISTA DE USUARIOS REGISTRADOS ---");
        for (Usuario u : listaUsuarios) {
            System.out.println("ID: " + u.getId() + " | Nombre: " + u.getNombres());
        }
    }

    public void mostrarMateriales() {
        System.out.println("--- INVENTARIO DE MATERIALES ---");
        for (MaterialBiblioteca m : listaMateriales) {
            m.mostrarInformacion();
        }
    }

    public void mostrarPrestamos() {
        System.out.println("--- HISTORIAL DE PRESTAMOS ---");
        for (Prestamo p : listaPrestamos) {
            System.out.println("Usuario: " + p.getUsuario().getNombres() + " | Material: " + p.getMaterial().getTitulo() + " | Estado: " + p.getComprobanteMulta());
        }
    }

    // GETTERS TRADICIONALES
    public ArrayList<MaterialBiblioteca> getListaMateriales() {
        return listaMateriales;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
