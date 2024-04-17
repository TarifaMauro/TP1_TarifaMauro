package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private Double estatura;
	private Double peso;
	private String posicion;
	
	
	
	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, Double estatura,
			Double peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	public Double getEstatura() {
		return estatura;
	}



	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}



	public Double getPeso() {
		return peso;
	}



	public void setPeso(Double peso) {
		this.peso = peso;
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public int calcularEdad() {
		LocalDate hoy = LocalDate.now();
		return Period.between(getFechaNacimiento(), hoy).getYears();
	}
	

}
