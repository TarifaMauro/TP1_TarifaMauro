package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac;
	
	
	public Persona(String nombre, Calendar fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Calendar getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	//CALCULO DE LA EDAD
	
	public int calcularEdad() {
		
		Calendar hoy = Calendar.getInstance();
		int edad = hoy.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
		if(hoy.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)) {
			edad --;
		}
		return edad;
	}
	
	public String signoZodiacal() {
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNac.get(Calendar.MONTH)+1;
		
		String signo = "";
		
		switch(mes) {
		
		case 1:
			signo = (dia < 20) ? "Capricornio" : "Acuario";
            break;
		case 2:
			signo = (dia < 29) ? "Acuario" : "Picis";
            break;
		case 3:
			signo = (dia < 21) ? "Picis" : "Aries";
            break;
		case 4:
			signo = (dia < 20) ? "Aries" : "Tauro";
            break;
		case 5:
			signo = (dia < 21) ? "Tauro" : "Geminis";
            break;
		case 6:
			signo = (dia < 21) ? "Geminis" : "Cancer";
            break;
		case 7:
			signo = (dia < 23) ? "Cancer" : "Leo";
            break;
		case 8:
			signo = (dia < 23) ? "Leo" : "Virgo";
            break;
		case 9:
			signo = (dia < 23) ? "Virgo" : "Libra";
            break;
		case 10:
			signo = (dia < 23) ? "Libra" : "Escorpio";
            break;
		case 11:
			signo = (dia < 22) ? "Escorpio" : "Sagitario";
            break;
		case 12:
			signo = (dia < 22) ? "Sagitrio" : "Capricornio";
            break;
        default:
        	signo = "Signo no encontrado";
        	break;
		}
		return signo;
	}
	
	public String obtenerEstacion() {
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNac.get(Calendar.MONTH)+1;
		
		String estacion = "";
		
		if((dia>=21 && mes>=3) || (dia<21 && mes<=6)) {
			estacion = "Otoño";
		}else {
		      if((dia>=21 && mes>=6) || (dia<21 && mes<=9)) {
			     estacion = "Invierno";
		      }
		      else {
		          if((dia>=21 && mes>=9) || (dia<21 && mes<=12)) {
			          estacion = "Primavera";
		             }
		      }
		}
		if((dia>=21 && mes==12) || (dia<21 && mes<=3)) {
			estacion = "Verano";	
		}
		return estacion;
	}

}
