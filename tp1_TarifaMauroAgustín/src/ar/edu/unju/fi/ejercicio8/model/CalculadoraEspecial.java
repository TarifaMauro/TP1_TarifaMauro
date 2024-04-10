package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	private Double num ;
	
	//CONSTRUCTOR POR DEFECTO
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}


	public Double getNum() {
		return num;
	}


	public void setNum(Double num) {
		this.num = num;
	}


	public double calcularSumatoria(){
		double sumatoria = 0;
		for(int k = 1; k <= num; k++) {
			sumatoria += Math.pow((k*(k+1)/2), 2);
		}
		return sumatoria;
	}
	
	public int calcularProductorial(){
		int productorial = 1;
		for(int k = 1; k <= num; k ++) {
			productorial *= (k*(k+4));
		}
		return productorial;
	}

}
