package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese los datos para el nuevo empleado. ");
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el legajo del empleado:");
        Integer legajo = scanner.nextInt();
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();
        Empleado empleado = new Empleado(nombre, legajo, salario);
        
        //DATOS DEL EMPLEADO
        empleado.mostrar();
        //AUMNETO DE SALARIO
        empleado.aumento();
        //DATOS DEL EMPLEADO DESPUES DEL AUMENTO
        System.out.println();
        System.out.println("Datos del empleado despues del aumento: ");
        System.out.println();
        empleado.mostrar();
        
        scanner.close();

	}

}
