package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
    private static Scanner scanner;
    private static ArrayList<Jugador> jugadores;

    public static void main(String[] args) {
    	
    	scanner = new Scanner(System.in);
    	
        jugadores = new ArrayList<>();

        int op;
        try {
            do {
                mostrarMenu();
                try {
                    op = scanner.nextInt();
                    scanner.nextLine();

                    switch (op) {
                        case 1:
                            altaJugador(jugadores);
                            break;
                        case 2:
                            mostrarDatosJugador(jugadores);
                            break;
                        case 3:
                            mostrarJugadoresOrdenadosPorApellido(jugadores);
                            break;
                        case 4:
                            modificarJugador(jugadores);
                            break;
                        case 5:
                            eliminarJugador(jugadores);
                            break;
                        case 6:
                            mostrarCantidadTotalJugadores(jugadores);
                            break;
                        case 7:
                            mostrarCantidadJugadoresPorNacionalidad(jugadores);
                            break;
                        case 8:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error: " + e.getMessage());
                    System.out.println("Por favor ingrese una opcion valida. " );
                    scanner.nextLine();
                    op = 0;
                }
            } while (op != 8);
        } finally {
            scanner.close();
        }
    }

    private static void mostrarMenu() {
        System.out.println("************************** MENÚ DE OPCIONES ******************************");
        System.out.println("1 - Alta de jugador. ");
        System.out.println("2 - Mostrar los datos del jugador. ");
        System.out.println("3 - Mostrar todos los jugadores ordenados por apellido. ");
        System.out.println("4 - Modificar los datos de un jugador. ");
        System.out.println("5 - Eliminar un jugador. ");
        System.out.println("6 - Mostrar la cantidad total de jugadores. ");
        System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad. ");
        System.out.println("8 - Salir. ");
        System.out.println("**************************************************************************");
        System.out.println("Seleccione una opción: ");
    }

    private static void altaJugador(ArrayList<Jugador> jugadores) {
        try {
            System.out.println("Ingrese nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
            System.out.println("Ingrese nacionalidad: ");
            String nacionalidad = scanner.nextLine();
            System.out.println("Ingrese estatura: ");
            double estatura = scanner.nextDouble();
            System.out.println("Ingrese peso: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ingrese posición (delantero, medio, defensa, arquero): ");
            String posicion = scanner.nextLine();
               
            if (posicion.equalsIgnoreCase("delantero") || posicion.equalsIgnoreCase("medio") ||
                    posicion.equalsIgnoreCase("defensa") || posicion.equalsIgnoreCase("arquero")) {

                Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
                jugadores.add(jugador);
                System.out.println("Jugador agregado exitosamente.");
            } else {
                System.out.println("La posicion ingresada no es valida. Por favor, ingrese una posición valida.");
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al dar de alta al jugador: " + e.getMessage());
            scanner.nextLine();
        }

    
    }

    private static void mostrarDatosJugador(ArrayList<Jugador> jugadores) {
        try {
            System.out.println("Ingrese nombre del jugador:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese apellido del jugador:");
            String apellido = scanner.nextLine();

            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                    System.out.println("Nombre: " + jugador.getNombre());
                    System.out.println("Apellido: " + jugador.getApellido());
                    System.out.println("Fecha de Nacimiento: " + jugador.getFechaNacimiento());
                    System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                    System.out.println("Estatura: " + jugador.getEstatura() + "m" );
                    System.out.println("Peso: " + jugador.getPeso() + "kg");
                    System.out.println("Posición: " + jugador.getPosicion());
                    System.out.println("Edad: " + jugador.calcularEdad() + " año/s");
                    return;
                }
            }
            System.out.println("Jugador no encontrado. ");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al mostrar los datos del jugador: " + e.getMessage());
        }
    }

    private static void mostrarJugadoresOrdenadosPorApellido(ArrayList<Jugador> jugadores) {
        try {
            jugadores.sort((j1, j2) -> j1.getApellido().compareTo(j2.getApellido()));

            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getApellido() + ", " + jugador.getNombre());
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al mostrar los jugadores ordenados por apellido: " + e.getMessage());
        }
    }

    private static void modificarJugador(ArrayList<Jugador> jugadores) {
        try {
            System.out.println("Ingrese nombre del jugador:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese apellido del jugador:");
            String apellido = scanner.nextLine();

            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                    System.out.println("Ingrese la nueva nacionalidad: ");
                    String nacionalidad = scanner.nextLine();
                    System.out.println("Ingrese la nueva estatura: ");
                    double estatura = scanner.nextDouble();
                    System.out.println("Ingrese el nuevo peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Ingrese la nueva posicion posición (delantero, medio, defensa, arquero): ");
                    String posicion = scanner.nextLine();
                    if (posicion.equalsIgnoreCase("delantero") || posicion.equalsIgnoreCase("medio") ||
                            posicion.equalsIgnoreCase("defensa") || posicion.equalsIgnoreCase("arquero")) {
                    	jugador.setNacionalidad(nacionalidad);
                    	jugador.setEstatura(estatura);
                        jugador.setPeso(peso);
                        jugador.setPosicion(posicion);
                        System.out.println("Datos modificados exitosamente.");
                        return;
                    } else {
                        System.out.println("La posicion ingresada no es valida. Por favor, ingrese una posición valida.");
                        System.out.println("No se pudo modificar los datos de manera correcta. Intente nuevamente. ");
                    }
                }
            }
            System.out.println("Jugador no encontrado. ");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al modificar el jugador: " + e.getMessage());
        }
    }

    private static void eliminarJugador(ArrayList<Jugador> jugadores) {
        try {
            System.out.println("Ingrese nombre del jugador:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese apellido del jugador:");
            String apellido = scanner.nextLine();

            Iterator<Jugador> iterator = jugadores.iterator();
            while (iterator.hasNext()) {
                Jugador jugador = iterator.next();
                if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                    iterator.remove();
                    System.out.println("Jugador eliminado exitosamente.");
                    return;
                }
            }
            System.out.println("Jugador no encontrado.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al eliminar el jugador: " + e.getMessage());
        }
    }

    private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
        try {
            System.out.println("La cantidad total de jugadores es: " + jugadores.size());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al mostrar la cantidad total de jugadores: " + e.getMessage());
        }
    }

    private static void mostrarCantidadJugadoresPorNacionalidad(ArrayList<Jugador> jugadores) {
        try {
            System.out.println("Ingrese nacionalidad:");
            String nacionalidad = scanner.nextLine();

            int contador = 0;
            for (Jugador jugador : jugadores) {
                if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                    contador++;
                }
            }
            System.out.println("La cantidad de jugadores de nacionalidad " + nacionalidad + " es: " + contador);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al mostrar la cantidad de jugadores por nacionalidad: " + e.getMessage());
        }
    }
}