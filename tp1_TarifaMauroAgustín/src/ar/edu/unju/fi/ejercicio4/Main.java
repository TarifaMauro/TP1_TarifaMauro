package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero entre 0 y 10: ");
        int num = scanner.nextInt();
        
        if (num > 0 && num < 10) {
            int fact = 1;
            int cont = 1;
            
            while (cont <= num) {
                fact = fact * cont;
                cont++;
            }
            
            System.out.println("El factorial de " + num + " es: " + fact);
        }
        else {    
            System.out.println("El numero ingresado está fuera del rango valido");
        }
        scanner.close();



	}

}