package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean band = false;
		int num;
		do {
			System.out.println("ingrese un valor entre 3 y 10 para el tamaño del array: ");
			num = scanner.nextInt();
			if(num < 3 || num > 10) {
				System.out.println("Valor incorrecto. Ingrese nuevamente. ");
			}
			else {
				band = true;
			}
		}while(band == false);
		
		int[] array = new int[num];
		

		for( int i = 0; i < num;i++) {
			System.out.println("Ingrese un valor entero para la posicion "+i+" : ");
			array[i] = scanner.nextInt();
		}
		
		for( int i = 0; i < num;i++) {
			System.out.println("indice: " +i+ ". valor: " +array[i]);
		}
		
		int suma = 0;
		
		for( int i = 0; i < num; i++) {
			suma += array[i];
		}
		System.out.println("La suma de todos sus valores es: "+suma );
		
		scanner.close();

	}

}
