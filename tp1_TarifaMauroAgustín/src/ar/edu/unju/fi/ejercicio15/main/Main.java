package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean band = false;
		int num;
		do {
			System.out.println("ingrese un valor entre 5 y 10 para el tamaño del array: ");
			num = scanner.nextInt();
			if(num < 5 || num > 10) {
				System.out.println("Valor incorrecto. Ingrese nuevamente. ");
			}
			else {
				band = true;
			}
		}while(band == false);
		
		scanner.nextLine();
		String[] nombres = new String[num];
		
		for (int i = 0; i < num ; i++) {
			System.out.println("Ingrese el nombre la persona #"+(i+1)+ ": ");
			nombres[i]=scanner.nextLine();
		}
		
		//DE PRINCIPIO A FIN
		System.out.println();
		System.out.println("Del primero al ultimo");
		for (int i = 0; i < num; i++) {
			System.out.println("Indice: " +i+ ". Nombre: "+nombres[i]);
		}
		
		System.out.println();
		System.out.println("Del ultimo al primero.");
		//DESDE EL FINAL
		for (int i = num - 1; i >=0; i--) {
			System.out.println("Indice: " +i+ ". Nombre: "+nombres[i]);
		}
		
		scanner.close();

	}

}
