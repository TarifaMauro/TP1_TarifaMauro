package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	    private int diametro;
	    private double precio;
	    private double area;
	    private boolean ingredientesEspeciales;
	    
	    
	    //CONSTANTES
	    
	    private static final double ADICIONAL_20 = 500;
	    private static final double ADICIONAL_30 = 750;
	    private static final double ADICIONAL_40 = 1000;
	    
	    //CONSTRUCTOR
	    public Pizza() {
			// TODO Auto-generated constructor stub
		}

		public int getDiametro() {
			return diametro;
		}

		public void setDiametro(int diametro) {
			this.diametro = diametro;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public double getArea() {
			return area;
		}

		public void setArea(double area) {
			this.area = area;
		}

		public boolean isIngredientesEspeciales() {
			return ingredientesEspeciales;
		}

		public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
			this.ingredientesEspeciales = ingredientesEspeciales;
		}
	    
	    
		public void calcularPrecio() {
		        switch (diametro) {
		            case 20:
		                precio = ingredientesEspeciales ? 4500 + ADICIONAL_20 : 4500;
		                break;
		            case 30:
		                precio = ingredientesEspeciales ? 4800 + ADICIONAL_30 : 4800;
		                break;
		            case 40:
		                precio = ingredientesEspeciales ? 5500 + ADICIONAL_40 : 5500;
		                break;
		            default:
		                System.out.println("Diámetro no válido.");
		        }
		   }

		    
		public void calcularArea() {
		        double radio = diametro / 2.0;
		        area = Math.PI * radio * radio;
		   }

}
