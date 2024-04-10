package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        int num = scanner.nextInt();
        
        if (num % 2 != 0) {
            int resultado = num * 2;
            System.out.println("El numero ingresado es impar. ");
            System.out.println("El doble del numero es: " + resultado);
        } 
        else {
            int resultado = num * 3;
            System.out.println("El numero ingresado es par. ");
            System.out.println("El triple del numero es: " + resultado);
        }
        scanner.close();



	}

}