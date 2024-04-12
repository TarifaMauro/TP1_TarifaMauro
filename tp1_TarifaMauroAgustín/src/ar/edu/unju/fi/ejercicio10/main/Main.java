package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3 ; i++) {
			Pizza pizza = new Pizza();
			
			System.out.println("Ingrese los datos de la pizza " +(i+1)+ ":");
			int diametro;
			
			do {
				System.out.println("Diametro (20, 30 ,40): ");
				diametro = Integer.parseInt(scanner.nextLine());
				if (diametro != 20 && diametro != 30 && diametro != 40) {
					System.out.println("Diametro incorrecto");
					System.out.println("Ingrese el diametro nuevamente. ");
					System.out.println();
				}
			}while (diametro != 20 && diametro != 30 && diametro != 40);
			
            pizza.setDiametro(diametro);
            
            System.out.println("¿Lleva ingredientes especiales? (true/false): ");
            boolean ingredientesEspeciales = Boolean.parseBoolean(scanner.nextLine());
            pizza.setIngredientesEspeciales(ingredientesEspeciales);
            
			pizza.calcularPrecio();		
			pizza.calcularArea();
			
			System.out.println();
			System.out.println("** Pizza " + (i + 1) + " **");
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = $" + pizza.getPrecio());
            System.out.println("Área de la pizza = " + pizza.getArea());

            System.out.println("-----------------------------------------");
		}

	        scanner.close();
	}

}
