package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
    private Integer legajo;
    private double salario;

    // CONSTANTES
    private static final double salarioMinimo = 210000.00;
    private static final double aumentoPorMeritos = 20000.00;
    
    //CONSTRUCTOR PARAMETRIZADO
    
	public Empleado(String nombre, Integer legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if( salario >= salarioMinimo ) {
            this.salario = salario;
        } 
		else {
            this.salario = salarioMinimo;
        }
	}
    
    //MOSTRAR DATOS DE EMPLEADO
	
	public void mostrar() {
		System.out.println("Nombre del Empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario $:"+salario);
	}
	
	//AUMENTO
	
	public void aumento(){
		salario += aumentoPorMeritos;
	}


}