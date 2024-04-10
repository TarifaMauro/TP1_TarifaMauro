package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de n: ");
		double n = scanner.nextDouble();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		calculadora.setNum(n);
		
		double sumatoria = calculadora.calcularSumatoria();
		int productoria = calculadora.calcularProductorial();
		
		System.out.println("La sumatoria es: "+sumatoria);
		System.out.println("La productoria es: "+productoria);
		
		scanner.close();

	}

}
