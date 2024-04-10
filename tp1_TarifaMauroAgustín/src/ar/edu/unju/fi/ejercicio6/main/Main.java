package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// CONSTRUCTOR POR DEFECTO
		Persona persona1 = new Persona();
		System.out.println("Primer persona. ");
		System.out.println();
		System.out.println("Ingrese el numero de DNI: ");
		String dni = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("La fecha de nacimiento (yyyy-mm-dd): ");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println("Ingrese la provincia: ");
		String provincia = scanner.nextLine();
		
		persona1.setDni(dni);
		persona1.setNombre(nombre);
		persona1.setFechaNacimiento(fechaNacimiento);
		persona1.setProvincia(provincia);
		persona1.mostrarDatos();
		
		
		// UTILIZANDO CONTRUCTOR PARAMETRIZADO
		System.out.println();
		System.out.println("Segunda persona");
		System.out.println();
		System.out.println("Ingrese el numero de DNI: ");
		dni = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		nombre = scanner.nextLine();
		System.out.println("La fecha de nacimiento (yyyy-mm-dd): ");
		fechaNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println("Ingrese la provincia: ");
		provincia = scanner.nextLine();
		
		System.out.println();
		System.out.println("Constructor parametrizado: ");
		System.out.println();
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);

		persona2.mostrarDatos();
		
		//UTILIZANDO EL TERCER CONSTRUCTOR
		
		System.out.println();
		System.out.println("Tercera persona.");
		System.out.println();
		System.out.println("Ingrese el numero de DNI: ");
		dni = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
	    nombre = scanner.nextLine();
		System.out.println("La fecha de nacimiento (yyyy-mm-dd): ");
		fechaNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println();
		System.out.println("Contructor parametrizado inicializado. ");
	    System.out.println();
		Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
		System.out.println("Ingrese el numero de DNI: ");
		
		persona3.mostrarDatos();
		scanner.close();

	}

}