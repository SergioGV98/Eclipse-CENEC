package tema3;

import java.util.Random;

/**
 *  Clase que contiene 3 funciones, una encargada de generar un nombre aleatorio,
 *  otra que te genera un apellido aleatorio y ota que te imprime los datos de 
 *  una persona.
 * @author Sergio García Vico
 *
 */

public class Funciones {
	
	/**
	 * Funcion el cual generamos un nombre aleatorio segun sea masculino o femenino
	 * a partir del char genero que cogemos por agumentos.
	 * @param genero cogemos el genero del main 'm' o 'h' en un char
	 * @return nos devuelve el nombre que ha salido por una cadena.
	 */

	public static String generarNombreAleatorio(char genero) {

		Random r = new Random();
		String ret = "";
		byte numero;

		numero = (byte) (r.nextInt(1, 6));

		if (genero == 'm') {
			switch (numero) {
			case 1:
				ret = "Carlos";
				break;
			case 2:
				ret = "Sergio";
				break;
			case 3:
				ret = "Javier";
				break;
			case 4:
				ret = "Miguel";
				break;
			case 5:
				ret = "Pedro";
				break;
			}
		}

		if (genero == 'f') {
			switch (numero) {
			case 1:
				ret = "Julia";
				break;
			case 2:
				ret = "Paola";
				break;
			case 3:
				ret = "Elena";
				break;
			case 4:
				ret = "Isabel";
				break;
			case 5:
				ret = "Cristina";
				break;
			}
		}

		return ret;
	}

	/**
	 * Funcion que genera un apellido aleatorio.
	 * @return Nos devuelve el apellido aleatorio en un String.
	 */
	
	public static String generaApellidoAleatorio() {

		Random r = new Random();
		String ret = "";
		byte numero;

		numero = (byte) (r.nextInt(1, 6));

		switch (numero) {
		case 1:
			ret = "Garcia";
			break;
		case 2:
			ret = "Alvarez";
			break;
		case 3:
			ret = "Dominguez";
			break;
		case 4:
			ret = "Tomas";
			break;
		case 5:
			ret = "Cortes";
			break;
		}

		return ret;
	}
	
	/**
	 * Funcion que se encarga de encadenarnos la informacion del usuario, nombre,
	 * apellidos, etc para luego poder imprimirla en el main.
	 * @param nombre recibe un String por el main de su nombre.
	 * @param primerApellido recibe un String por el main de su primer apellido.
	 * @param segundoApellido recibe un String por el main de su segundo apellido.
	 * @param nacimiento recibe un short por el main de su fecha de nacimiento.
	 * @param totalHorasJugadas recibe un short por el main de las horas totales jugadas de este usuario.
	 * @param juegosPasados recibe la cantidad de juegos completados en un byte.
	 * @return nos devuelve una cadena de texto con toda la informacion del usuario para imprimirla.
	 */
	
	public static String imprimeDatosPersona(String nombre, String primerApellido, String segundoApellido, short nacimiento, short totalHorasJugadas, byte juegosPasados) {
		
		String ret = "";
		short anchuraMaxima;

		ret += segundoApellido + " " + primerApellido + ", " + nombre;
		anchuraMaxima = (short) ret.length();
		
		ret += "\n";
		for(short i = 0; i < anchuraMaxima; i++) {
			ret += "_";
		}
		ret += "\n";
		ret += "	Año de nacimiento: " + nacimiento;
		ret += "\n";
		ret += "	Horas jugadas en 2022: " + totalHorasJugadas;
		ret += "\n";
		ret += "	Juegos completados en 2022: " + juegosPasados;
		ret += "\n";
		ret += "\n";
		
		return ret;
	}

}
