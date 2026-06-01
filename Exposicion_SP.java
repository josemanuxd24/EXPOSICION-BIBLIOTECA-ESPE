/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicion_sp;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Exposicion_SP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca espeBiblioteca = new Biblioteca();
        Scanner entrada = new Scanner(System.in);     
        
        try {
            // --- 10 LIBROS ---
            Libro l1 = new Libro("L01", "Cien anos de soledad", "G. Garcia Marquez", 1967, "Novela", 496);
            Libro l2 = new Libro("L02", "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Clasico", 860);
            Libro l3 = new Libro("L03", "El Principito", "Antoine de Saint-Exupery", 1943, "Infantil", 96);
            Libro l4 = new Libro("L04", "1984", "George Orwell", 1949, "Distopia", 328);
            Libro l5 = new Libro("L05", "Un mundo feliz", "Aldous Huxley", 1932, "Ciencia Ficcion", 288);
            Libro l6 = new Libro("L06", "Crimen y castigo", "Fiodor Dostoievski", 1866, "Psicologico", 544);
            Libro l7 = new Libro("L07", "Orgullo y prejuicio", "Jane Austen", 1813, "Romance", 352);
            Libro l8 = new Libro("L08", "El hobbit", "J.R.R. Tolkien", 1937, "Fantasia", 310);
            Libro l9 = new Libro("L09", "Rayuela", "Julio Cortazar", 1963, "Surrealismo", 600); l9.setDisponible(false);
            Libro l10 = new Libro("L10", "Ficciones", "Jorge Luis Borges", 1944, "Filosofico", 220); l10.setDisponible(false);

            // --- 10 REVISTAS ---
            Revista r1 = new Revista("R01", "National Geographic", "NatGeo Society", 2023, 500, "Ciencia");
            Revista r2 = new Revista("R02", "Scientific American", "Springer Nature", 2024, 312, "Divulgacion");
            Revista r3 = new Revista("R03", "Time Magazine", "Time Inc.", 2025, 1024, "Actualidad");
            Revista r4 = new Revista("R04", "Vogue", "Conde Nast", 2023, 850, "Moda");
            Revista r5 = new Revista("R05", "Forbes", "Whale Media", 2024, 915, "Negocios");
            Revista r6 = new Revista("R06", "Muy Interesante", "Zinet Media", 2022, 410, "Cultura");
            Revista r7 = new Revista("R07", "The Economist", "The Economist Group", 2025, 110, "Economia");
            Revista r8 = new Revista("R08", "Sports Illustrated", "Authentic Brands", 2023, 620, "Deportes");
            Revista r9 = new Revista("R09", "Rolling Stone", "Penske Media", 2021, 880, "Musica"); r9.setDisponible(false);
            Revista r10 = new Revista("R10", "PC World", "IDG", 2022, 145, "Tecnologia"); r10.setDisponible(false);

            // --- 10 TESIS ---
            Tesis t1 = new Tesis("T01", "Diseno de un brazo robotico", "Carlos Torres", 2021, "Robotica", "Mecatronica");
            Tesis t2 = new Tesis("T02", "Control de procesos industriales", "Ana Gomez", 2022, "Automatizacion", "Mecatronica");
            Tesis t3 = new Tesis("T03", "Sistema de visio artificial", "Luis Chang", 2023, "IA", "Software");
            Tesis t4 = new Tesis("T04", "Analisis de vibraciones en motores", "Pedro Baca", 2020, "Mantenimiento", "Mecanica");
            Tesis t5 = new Tesis("T05", "Seguridad en redes IoT", "Elena Silva", 2024, "Ciberseguridad", "Software");
            Tesis t6 = new Tesis("T06", "Drones para monitoreo agricola", "Diego Rios", 2023, "Aerodinamica", "Mecatronica");
            Tesis t7 = new Tesis("T07", "Impresion 3D de protesis", "Sofia Lara", 2025, "Bioingenieria", "Mecanica");
            Tesis t8 = new Tesis("T08", "Optimizacion de energia solar", "Jorge Vera", 2022, "Renovables", "Energia");
            Tesis t9 = new Tesis("T09", "Vehiculos autonomos terrestres", "Benito", 2026, "Autonomos", "Mecatronica"); t9.setDisponible(false);
            Tesis t10 = new Tesis("T10", "Redes neuronales predictivas", "Mateo", 2025, "Deep Learning", "Software"); t10.setDisponible(false);

            // Se agregan de forma interna a las listas sin imprimir textos en pantalla
            espeBiblioteca.getListaMateriales().add(l1); espeBiblioteca.getListaMateriales().add(l2); espeBiblioteca.getListaMateriales().add(l3);
            espeBiblioteca.getListaMateriales().add(l4); espeBiblioteca.getListaMateriales().add(l5); espeBiblioteca.getListaMateriales().add(l6);
            espeBiblioteca.getListaMateriales().add(l7); espeBiblioteca.getListaMateriales().add(l8); espeBiblioteca.getListaMateriales().add(l9); 
            espeBiblioteca.getListaMateriales().add(l10);

            espeBiblioteca.getListaMateriales().add(r1); espeBiblioteca.getListaMateriales().add(r2); espeBiblioteca.getListaMateriales().add(r3);
            espeBiblioteca.getListaMateriales().add(r4); espeBiblioteca.getListaMateriales().add(r5); espeBiblioteca.getListaMateriales().add(r6);
            espeBiblioteca.getListaMateriales().add(r7); espeBiblioteca.getListaMateriales().add(r8); espeBiblioteca.getListaMateriales().add(r9); 
            espeBiblioteca.getListaMateriales().add(r10);

            espeBiblioteca.getListaMateriales().add(t1); espeBiblioteca.getListaMateriales().add(t2); espeBiblioteca.getListaMateriales().add(t3);
            espeBiblioteca.getListaMateriales().add(t4); espeBiblioteca.getListaMateriales().add(t5); espeBiblioteca.getListaMateriales().add(t6);
            espeBiblioteca.getListaMateriales().add(t7); espeBiblioteca.getListaMateriales().add(t8); espeBiblioteca.getListaMateriales().add(t9); 
            espeBiblioteca.getListaMateriales().add(t10);

        } catch (DatosInvalidosException e) {
            System.out.println("Error en cargar el inventario: " + e.getMessage());
        }

        int opcionPrincipal = 0;
        Usuario usuarioActual = null; 

        do {
            System.out.println("----------SISTEMA DE GESTION BIBLIOTECARIA - ESPE----------");
            System.out.println("------------------------------------------------------------");
            if (usuarioActual != null) {
                System.out.println(" SESION ACTIVA: " + usuarioActual.getNombres().toUpperCase() + " (" + usuarioActual.getClass().getSimpleName() + ")");
            } else {
                System.out.println(" SESION: [Ningun usuario registrado aun]");
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("1. Registrarse como estudiante");
            System.out.println("2. Registrarse como docente");
            System.out.println("3. Ver inventario de la biblioteca (Acciones de Prestamo y Consulta)");
            System.out.println("4. Devolver material (Calcular Multa si aplica)");
            System.out.println("5. Ingresar comprobantes de pago (MULTAS)");
            System.out.println("6. Salir del Programa");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcionPrincipal = Integer.parseInt(entrada.nextLine());

                switch (opcionPrincipal) {
                    case 1:
                        System.out.println("\n--- FORMULARIO DE REGISTRO: ESTUDIANTE ---");
                        System.out.print("ID de Usuario: "); String idE = entrada.nextLine();
                        System.out.print("Cedula: "); String cedE = entrada.nextLine();
                        System.out.print("Nombre: "); String nomE = entrada.nextLine();
                        System.out.print("Edad: "); int edadE = Integer.parseInt(entrada.nextLine());
                        System.out.print("Direccion: "); String dirE = entrada.nextLine();
                        System.out.print("Carrera: "); String carE = entrada.nextLine();
                        System.out.print("Semestre (Numero): "); int semE = Integer.parseInt(entrada.nextLine());

                        usuarioActual = new Estudiante(idE, cedE, nomE, edadE, dirE, carE, semE);
                        espeBiblioteca.agregarUsuario(usuarioActual);
                        System.out.println("\nEstudiante registrado e inicio de sesion exitoso.");
                        break;

                    case 2:
                        System.out.println("\n--- FORMULARIO DE REGISTRO: DOCENTE ---");
                        System.out.print("ID de Usuario: "); String idD = entrada.nextLine();
                        System.out.print("Cedula: "); String cedD = entrada.nextLine();
                        System.out.print("Nombre: "); String nomD = entrada.nextLine();
                        System.out.print("Edad: "); int edadD = Integer.parseInt(entrada.nextLine());
                        System.out.print("Direccion: "); String dirD = entrada.nextLine();
                        System.out.print("Departamento: "); String depD = entrada.nextLine();
                        System.out.print("Especialidad: "); String espD = entrada.nextLine();

                        usuarioActual = new Docente(idD, cedD, nomD, edadD, dirD, depD, espD);
                        espeBiblioteca.agregarUsuario(usuarioActual);
                        System.out.println("\nDocente registrado e inicio de sesion exitoso.");
                        break;

                    case 3: 
                        System.out.println("\n--- INVENTARIO GENERAL DE MATERIALES ---");                      
                        
                        // Recorremos el inventario de forma polimorfica
                        for (MaterialBiblioteca mat : espeBiblioteca.getListaMateriales()) {
                            String estado = "Disponible";
                            if (!mat.isDisponible()) {
                                if (mat.obtenerTipo().equalsIgnoreCase("Tesis")) {
                                    estado = "Uso exclusivo en sala";
                                } else {
                                    estado = "Prestado";
                                }
                            }
                            System.out.print("[" + estado + "] ");
                            mat.mostrarInformacion();
                        }
                        System.out.println("=======================================================");
                        
                        // Control de acceso para visitantes
                        if (usuarioActual == null) {
                            System.out.println("[RESTRICCION] Modo visitante activo. Registrese para solicitar materiales.");
                            break;
                        }

                        System.out.println("\nMenu de operaciones para: " + usuarioActual.getNombres().toUpperCase());
                        System.out.println("  1. Solicitar prestamo o consulta de un material");
                        System.out.println("  2. Volver al menu principal");
                        System.out.print("Seleccione una accion: ");
                        int accion = Integer.parseInt(entrada.nextLine());

                        if (accion == 1) {
                            System.out.print("Ingrese el codigo del material deseado: ");
                            String codBuscado = entrada.nextLine();
                            MaterialBiblioteca materialSeleccionado = null;

                            // Busqueda del material en la lista general
                            for (MaterialBiblioteca m : espeBiblioteca.getListaMateriales()) {
                                if (m.getCodigo().equalsIgnoreCase(codBuscado)) {
                                    materialSeleccionado = m;
                                    break;
                                }
                            }

                            if (materialSeleccionado == null) {
                                System.out.println("\n[ERROR] El codigo ingresado no corresponde a ningun material.");
                            } else {
                                // Aplicacion de reglas polimorficas de la institucion
                                if (materialSeleccionado.obtenerTipo().equalsIgnoreCase("Tesis")) {
                                    System.out.println("");
                                    usuarioActual.consultarMaterial(materialSeleccionado);
                                    System.out.println("[REGLA] Las tesis solo se permiten consultar en sala de lectura, no se puede prestar");
                                } else {
                                    System.out.print("Ingrese la fecha de prestamo (DD-MM-AAAA): ");
                                    String fechaHoy = entrada.nextLine();
                                    espeBiblioteca.prestarMaterial(usuarioActual, materialSeleccionado, fechaHoy);
                                }
                            }
                        }
                        break;

                    case 4:
                        // Control de seguridad para transacciones
                        if (usuarioActual == null) {
                            System.out.println("\n[RESTRICCION] Debe iniciar sesion primero para procesar una devolucion.");
                            break;
                        }
                        
                        System.out.println("\n--- DEVOLUCION DE MATERIAL ---");
                        System.out.print("Ingrese el codigo del material: ");
                        String codDev = entrada.nextLine();
                        MaterialBiblioteca matDevolver = null;

                        // Busqueda del material a devolver en el inventario
                        for (MaterialBiblioteca m : espeBiblioteca.getListaMateriales()) {
                            if (m.getCodigo().equalsIgnoreCase(codDev)) {
                                matDevolver = m;
                                break;
                            }
                        }

                        if (matDevolver == null) {
                            System.out.println("\n[ERROR] El codigo ingresado no existe en el inventario.");
                        } else {
                            System.out.print("Ingrese la fecha de devolucion (DD-MM-AAAA): ");
                            String fDev = entrada.nextLine();
                            System.out.print("Ingrese los dias de retraso (0 si no hay retraso): ");
                            int dias = Integer.parseInt(entrada.nextLine());
                            
                            // Procesamiento de la devolucion y calculo interno de multas
                            espeBiblioteca.devolverMaterial(matDevolver, fDev, dias);
                        }
                        break;

                    case 5:
                        if (usuarioActual == null) {
                            System.out.println("Alerta: Debe iniciar sesion para verificar sus multas.");
                            break;
                        }
                        System.out.println("\n--- ESTADO DE CUENTA Y LIQUIDACION DE MULTAS ---");
                        boolean registroMultas = false;
                        
                        for (Prestamo p : espeBiblioteca.getListaPrestamos()) {
                            if (p.getMulta() > 0) { 
                                registroMultas = true;
                                System.out.println(">> Material: " + p.getMaterial().getTitulo() + 
                                                   " | Multa actual: $" + p.getMulta() + 
                                                   " | Estado: " + p.getComprobanteMulta());
                                
                                if (p.getComprobanteMulta().contains("PENDIENTE")) {
                                    System.out.print("Ingrese el Numero de Comprobante de Pago: ");
                                    String comp = entrada.nextLine();
                                    p.setComprobanteMulta("PAGADO (Comprobante Ref: " + comp + ")");
                                    System.out.println("Comprobante guardado y verificado con exito!");
                                }
                            }
                        }
                        if (!registroMultas) {
                            System.out.println("No se encontraron registros de multas acumuladas en el sistema.");
                            System.out.println("Recuerda: Para generar una, primero debes usar la opcion 3 para prestar un libro,");
                            System.out.println("y luego la opcion 4 para devolverlo.");
                        }
                        break;
                    case 6:
                        System.out.println("Cerrando el sistema de biblioteca ESPE.");
                        System.out.println("Hasta luego");
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero entero valido.");
            } catch (BibliotecaException e) {
                System.out.println("\n>>> CONTROL DE EXCEPCION COGIDA: " + e.getMessage());
            }
        } while (opcionPrincipal != 6);
    }
    
}
