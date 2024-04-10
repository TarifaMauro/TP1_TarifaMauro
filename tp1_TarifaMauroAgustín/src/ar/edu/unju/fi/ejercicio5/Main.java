package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);	        
	     System.out.print("Ingrese un numero entero entre 1 y 9: ");
	     int num = scanner.nextInt();
	     if (num < 1 || num > 9) {
	            System.out.println("El numero ingresado esta fuera de rango");
	     } 
	     else {
	            System.out.println("Tabla de multiplicar del numero " + num + " es:");
	            for (int i = 1; i <= 10; i++) {
	                int resultado = num * i;
	                System.out.println(num + " x " + i + " = " + resultado);
	            }
	     }    
	     scanner.close();
	}

}