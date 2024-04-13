package ar.edu.unju.fi.ejercicio13main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[8];
		
		for( int i = 0; i < 8;i++) {
			System.out.println("Ingrese un valor entero para la posicion "+i+" : ");
			array[i] = scanner.nextInt();
		}
		
		for( int i = 0; i < 8;i++) {
			System.out.println("indice: " +i+ " valor: " +array[i]);
		}
		scanner.close();
	}

}
