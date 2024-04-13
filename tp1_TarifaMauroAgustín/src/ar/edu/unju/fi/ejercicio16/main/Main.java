package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] nombres = new String[5];
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese un nombre: ");
			nombres[i]=scanner.nextLine();
		}
		
		System.out.println("\nValores guardados en el array: ");
		int j = 0;
		
		while(j < nombres.length) {
			System.out.println(nombres[j]);
			j++;
		}
		
		System.out.println("\nTamaño del array: "+nombres.length);
		byte indice = -1;
		do {
			System.out.println("\nIngrese el indice del elemnto a eliminar (0-4): ");
		    indice = scanner.nextByte();
		}while(indice < 0 || indice >= nombres.length);
		
		for(int i = indice; i < nombres.length-1; i++) {
			nombres[i]=nombres[i + 1];
		}
		
		nombres[nombres.length - 1] = "";
		System.out.println("\nArray despues de eliminar un elemento. ");
		for(int i = 0; i <= nombres.length -1; i++) {
			System.out.println(nombres[i]);
		}
		scanner.close();
		

	}

}
