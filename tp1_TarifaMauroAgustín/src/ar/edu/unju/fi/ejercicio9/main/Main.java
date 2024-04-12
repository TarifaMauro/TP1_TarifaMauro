package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//CREAR LOS TRES OBJETOS DE LA CLASE PRODUCTO.
		
		for( int i = 0; i < 3 ; i++ ) {
			
			Producto producto = new Producto();
			
			System.out.println("Ingrese los datos del producto " +(i+1)+ ":");
			System.out.println("Nombre: ");
			producto.setNombre(scanner.nextLine());
			
			System.out.println("Codigo: ");
			producto.setCodigo(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("Precio: ");
			producto.setPrecio(Double.parseDouble(scanner.nextLine()));
			
			int descuento;
			
			//CONTROL PARA QUE EL DESCUENTO ESTE ENTRE O Y 50
            do {
                System.out.print("Descuento (%): ");
                descuento = Integer.parseInt(scanner.nextLine());
                if (descuento < 0 || descuento > 50) {
                    System.out.println("El descuento debe estar entre 0 y 50.");
                }
            } while (descuento < 0 || descuento > 50);
            producto.setDescuento(descuento);
			
			//SE MUESTRAN LOS DATOS INGRESADOS MAS EL DESCUENTO.
			
			System.out.println();
			System.out.println("Producto " + (i + 1) + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Descuento (%): " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: $" + producto.calcularDescuento());
            System.out.println("-----------------------------------------");
            System.out.println();
            
            
		}
		scanner.close();

	}

}
