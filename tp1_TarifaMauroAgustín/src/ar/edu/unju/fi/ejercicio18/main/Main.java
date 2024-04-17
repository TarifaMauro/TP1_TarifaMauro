package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;


public class Main {
	
	private static Scanner scanner;	
	private static ArrayList<Pais> paises;
	private static ArrayList<DestinoTuristico> destinos;
	
	public static void main(String[] args) {
		
		paises = new ArrayList<>();
		paises.add(new Pais("Argentina", "AR"));
		paises.add(new Pais("Mexico", "MX"));
		paises.add(new Pais("Brasil", "BR"));
		paises.add(new Pais("Estados Unidos", "US"));
		paises.add(new Pais("Francia", "FR"));
		paises.add(new Pais("Uruguay", "UY"));
		
		destinos = new ArrayList<>();
		
		scanner = new Scanner(System.in);
		int op = 0;
		
		try {
			do {
				mostrarMenu();
				try {
					op = scanner.nextInt();
					scanner.nextLine();
					
					switch (op){
					case 1:
                        altaDestinoTuristico(destinos, paises);
                        break;
                    case 2:
                        mostrarDestinos(destinos);
                        break;
                    case 3:
                    	modificarPaisDestinoTuristico(destinos, paises);
                        break;
                    case 4:
                        destinos.clear();
                        System.out.println("ArrayList de destinos turísticos limpio.");
                        break;
                    case 5:
                    	eliminarDestinoTuristico(destinos);
                        break;
                    case 6:
                        mostrarDestinosOrdenados(destinos);
                        break;
                    case 7:
                        mostrarPaises(paises);
                        break;
                    case 8:
                    	mostrarDestinosPorPais(destinos);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
					} catch (Exception e) {
	                    System.out.println("Ha ocurrido un error: " + e.getMessage());
	                    System.out.println("Por favor ingrese una opcion valida. " );
	                    scanner.nextLine();
	                    op = 0;
					}
				}while (op != 9);
	        } catch (Exception e) {
	            System.err.println("Ocurrió un error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
			
	}
	
	private static void mostrarMenu() {
        System.out.println("************************** MENÚ DE OPCIONES ******************************");
        System.out.println("1 - Alta del destino turistico. ");
        System.out.println("2 - Mostrar todos los destinos turisticos. ");
        System.out.println("3 - Modificar el Pais del destino turistico. ");
        System.out.println("4 - Limpiar el ArrayList de destinos turisticos. ");
        System.out.println("5 - Eliminar un destino turistico. ");
        System.out.println("6 - Mostrar los destinos turisticos ordenados por nombre. ");
        System.out.println("7 - Mostrar todos los paises. ");
        System.out.println("8 - Mostrar los destinos turisticos que pertenecen a un pais");
        System.out.println("9 - Salir. ");
        System.out.println("**************************************************************************");
        System.out.println("Seleccione una opción: ");
    }
	
	private static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
	    try {
	        System.out.println("Ingrese el código del destino turistico:");
	        String codigo = scanner.nextLine();
	        System.out.println("Ingrese el nombre del destino turistico:");
	        String nombre = scanner.nextLine();
	        System.out.println("Ingrese el precio del destino turistico:");
	        double precio = scanner.nextDouble();
	        System.out.println("Ingrese el codigo del país asociado al destino turistico:");
	        String codigoPais = scanner.next();
	        Pais paisAsociado = buscarPaisPorCodigo(paises, codigoPais);
	        if (paisAsociado == null) {
	            System.out.println("No se encontró un pais con ese codigo.");
	            return;
	        }
	        System.out.println("Ingrese la cantidad de dias del destino turístico:");
	        int cantidadDias = scanner.nextInt();
	        scanner.nextLine();

	        DestinoTuristico nuevoDestino = new DestinoTuristico(codigo, nombre, precio, paisAsociado, cantidadDias);
	        destinos.add(nuevoDestino);
	        System.out.println("Destino turistico agregado correctamente.");
	    } catch (Exception e) {
	        System.err.println("Error al ingresar los datos del destino turistico: " + e.getMessage());
	    }
	}
	
	
	 private static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, String codigo) {
	        for (Pais pais : paises) {
	            if (pais.getCodigo().equals(codigo)) {
	                return pais;
	            }
	        }
	        return null;
	    }
	
	 private static void mostrarDestinos(ArrayList<DestinoTuristico> destinos) {
	        if (destinos.isEmpty()) {
	            System.out.println("No hay destinos turisticos para mostrar.");
	            return;
	        }

	        for (DestinoTuristico destino : destinos) {
	            System.out.println("Destino: "+destino.getNombre()+" .Codigo: "+destino.getCodigo()+ " Precio: "+destino.getPrecio()+"$");
	            System.out.println("Cantidad de dias: "+ destino.getCantDias()+ " Pais: "+destino.getPais());
	            System.out.println();
	        }
	    }
	 private static void modificarPaisDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
		    try {
		        System.out.println("Ingrese el codigo del destino turistico que desea modificar:");
		        String codigoDestino = scanner.next();
		        
		        DestinoTuristico destinoModificar = buscarDestinoPorCodigo(destinos, codigoDestino);
		        if (destinoModificar == null) {
		            System.out.println("No se encontró un destino turistico con ese código.");
		            return;
		        }
		        
		        System.out.println("Ingrese el nuevo código de pais para el destino turistico:");
		        String codigoPais = scanner.next();
		        Pais nuevoPais = buscarPaisPorCodigo(paises, codigoPais);
		        if (nuevoPais == null) {
		            System.out.println("No se encontró un pais con ese código.");
		            mostrarDestinos(destinos);
		            return;
		        }
		        
		        destinoModificar.setPais(nuevoPais);
		        System.out.println("Pais del destino turistico modificado correctamente.");
		    } catch (Exception e) {
		        System.err.println("Error al modificar el pais del destino turistico: " + e.getMessage());
		    }
		}
	 private static DestinoTuristico buscarDestinoPorCodigo(ArrayList<DestinoTuristico> destinos, String codigo) {
		    for (DestinoTuristico destino : destinos) {
		        if (destino.getCodigo().equals(codigo)) {
		            return destino;
		        }
		    }
		    return null;
		}
	 
	 private static void eliminarDestinoTuristico(ArrayList<DestinoTuristico> destinos) {
		    try {
		        System.out.println("Ingrese el codigo del destino turistico que desea eliminar:");
		        String codigoDestino = scanner.next();
		        
		        Iterator<DestinoTuristico> iterador = destinos.iterator();
		        while (iterador.hasNext()) {
		            DestinoTuristico destino = iterador.next();
		            if (destino.getCodigo().equals(codigoDestino)) {
		                iterador.remove();
		                System.out.println("Destino turístico eliminado correctamente.");
		                return;
		            }
		        }
		        
		        System.out.println("No se encontro un destino turistico con ese codigo.");
		    } catch (Exception e) {
		        System.err.println("Error al eliminar el destino turistico: " + e.getMessage());
		    }
		}
	 
	  private static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
	        if (destinos.isEmpty()) {
	            System.out.println("No hay destinos turisticos para mostrar.");
	            return;
	        }
	     
	        destinos.sort((d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));

	        for (DestinoTuristico destino : destinos) {
	            System.out.println("Nombre: "+destino.getNombre()+ " .Codigo: "+destino.getCodigo());
	            System.out.println();
	        }
	    }
	  
	  private static void mostrarPaises(ArrayList<Pais> paises) {
	        if (paises.isEmpty()) {
	            System.out.println("No hay paises para mostrar.");
	            return;
	        }
	        for (Pais pais : paises) {
	            System.out.print("Pais: "+pais.getNombre()+ ". codigo: "+pais.getCodigo());
	            System.out.println();
	        }
	    }
	  
	  private static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos) {
		    boolean encontrado = false;
		    System.out.println("Ingrese el codigo del pais: ");
		    String codPais = scanner.nextLine();
		    for (DestinoTuristico destino : destinos) {
		        if (destino.getPais().getCodigo().equalsIgnoreCase(codPais)) {
		            encontrado = true;
		            System.out.println(destino.getNombre());
		        }
		    }
		    if (!encontrado) {
		        System.out.println("No se encontraron destinos turisticos para el pais con codigo " + codPais);
		    }
		}
}

