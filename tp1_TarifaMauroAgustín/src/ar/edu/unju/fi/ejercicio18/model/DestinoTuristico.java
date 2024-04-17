package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private String codigo;
	private String nombre;
	private double precio;
	private Pais pais;
	private int cantDias;
	
	
	
	public DestinoTuristico(String codigo, String nombre, double precio, Pais pais, int cantDias) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantDias = cantDias;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getCantDias() {
		return cantDias;
	}
	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}
	
	
	

}
