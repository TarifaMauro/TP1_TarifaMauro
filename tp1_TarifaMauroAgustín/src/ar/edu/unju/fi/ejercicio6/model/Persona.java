package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	// GENERACION DE CONSTRUCTORES
	
	// CONSTRUCTOR POR DEFECTO
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTOR PARAMETRIZADO

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	//CONSTRUCTOR QUE ASIGNA A PROVINCICON EL VALOR  JUJUY

	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	// CALCULO EDAD DE LA PERSONA
	
	public int calculoEdad() {
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.getYear() - fechaNacimiento.getYear();
		if (fechaNacimiento.getMonthValue() > fechaActual.getMonthValue() ||
           (fechaNacimiento.getMonthValue() == fechaActual.getMonthValue() &&
            fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth())) {
            edad--;
        }
		return edad;		
	}
	// RETORNA VERDADERO SI ES MAYOR DE EDAD
	public boolean mayor() {	
		return calculoEdad() >= 18;
	}
	
	// MOSTRAR LOS DATOS
	
	public void mostrarDatos() {
		System.out.println("DNI: "+dni);
		System.out.println("Nombre: " +nombre);
		System.out.println("Fecha de nacimiento: "+fechaNacimiento);
		System.out.println("Provincia: "+provincia);
		System.out.println("Edad: "+calculoEdad()+" años");
		
		if (mayor() == true) {
			System.out.println("La persona es mayor de edad. ");
		}
		else {
			System.out.println("La persona no es mayor de edad.");
		}
	}
}