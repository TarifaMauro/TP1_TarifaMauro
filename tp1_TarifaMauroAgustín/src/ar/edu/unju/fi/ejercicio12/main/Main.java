package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese fecha de nacimiento (dd/mm/aaaa): " );
		
		String fechaNacimiento = scanner.nextLine();
		
		int primerBarra = fechaNacimiento.indexOf('/');
        int segundaBarra = fechaNacimiento.lastIndexOf('/');
        
        int dia = Integer.parseInt(fechaNacimiento.substring(0, primerBarra));
        int mes = Integer.parseInt(fechaNacimiento.substring(primerBarra + 1, segundaBarra)) - 1; 
        int anio = Integer.parseInt(fechaNacimiento.substring(segundaBarra + 1));
        
        
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.set(Calendar.DAY_OF_MONTH, dia);
        fechaNac.set(Calendar.MONTH, mes);
        fechaNac.set(Calendar.YEAR, anio);
        
        Persona persona = new Persona(nombre, fechaNac);
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio); 
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.signoZodiacal());
        System.out.println("Estación del año: " + persona.obtenerEstacion());
        
        scanner.close();

	}

}
