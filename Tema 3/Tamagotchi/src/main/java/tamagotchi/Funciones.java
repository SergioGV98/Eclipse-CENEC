package tamagotchi;

import java.util.Random;

/**
 * Clase que contiene dos funciones, una encargada de devolvernos en un String las razas disponibles para elegir y otra
 * que nos devolvera en un string una lapida totalmente ajustada segun los datos que vayamos introduciendo por la 
 * consola.
 * @author Sergio Garcia Vico
 *
 */


public class Funciones {

	/**
	 * Funciones encargada de monstrarnos una cadena de texto con las elecciones de la razas disponibles
	 * @return nos devuelve el texto de las razas
	 */
	
	
	public static String menu() {

		return ("Elige una de las siguientes razas seleccionando su numero" + "\n\t1 - Perro" + "\n\t2 - Gato"
				+ "\n\t3 - Hipopótamo" + "\n\t4 - Carpincho");
	}

	/**
	 * Esta funcion se encarga de crearnos una lapida con un dibujo ASCII y en el interior de la lapida contendra el
	 * nombre del animal y su raza, una frase aleatoria de su muerte y los turnos que vivio, todo nuestros textos se
	 * ajustara totalmente a una anchura maxima de 25.
	 * @param nombre recibira desde el main el nombre de nuestro animal.
	 * @param raza recibira desde el main que tipo de raza es guardada en byte.
	 * @param turnos recibira desde el main cuantos turnos vivio nuestro tamagotchi.
	 * @return nos devolvera una cadena de texto monstrandonos la lapida que contendra la palabra DEP, el nombre del animal + su raza, una frase aleatoria de su muerte y los turnos que vivio.
	 */
	
	
	public static String imprimeLapida(String nombre, byte raza, byte turnos) {

		String perro = " el Perro";
		String gato = " el Gato";
		String hipopotamo = " el Hipopotamo";
		String carpincho = " el Carpincho";

		String frase1 = "Se ha morido";
		String frase2 = "Dimitió de existir";
		String frase3 = "La ha espichado";
		String frase4 = "Viaja hacia las estrellas";

		String vivio = "Vivio";
		String turnosR = " turnos";
		String nombreFinal = "";
		byte anchuraMaxima = 25;

		// Parte inicial del DEP
		String ret = "";
		boolean longitudPar = anchuraMaxima % 2 == 0;
		for (byte i = 0; i < 1; i++) {
			ret += " _________________________";
		}
		ret += "\n";
		ret += "|";
		for (byte i = 0; i < 1; i++) {
			ret += "\\_________________________\\";
		}
		ret += "\n";
		ret += "||";
		for (byte i = 0; i < (anchuraMaxima / 2) - ("DEP".length() / 2 + (longitudPar ? 1 : 0)); i++) {
			ret += " ";
		}
		ret += "DEP";
		for (byte i = 0; i < (anchuraMaxima / 2) - "DEP".length() / 2; i++) {
			ret += " ";
		}
		ret += "|";
		ret += "\n";
		// Parte final del DEP
		// Parte inicial del nombre + raza
		ret += "||";

		if (perro.length() % 2 == 0) {
			perro += " ";
		}

		if (gato.length() % 2 == 0) {
			gato += " ";
		}

		if (hipopotamo.length() % 2 == 0) {
			hipopotamo += " ";
		}

		if (carpincho.length() % 2 == 0) {
			carpincho += " ";
		}

		if (frase1.length() % 2 == 0) {
			frase1 += " ";
		}

		if (frase2.length() % 2 == 0) {
			frase2 += " ";
		}

		if (frase3.length() % 2 == 0) {
			frase3 += " ";
		}
		if (frase4.length() % 2 == 0) {
			frase4 += " ";
		}
		if (nombre.length() % 2 >= 1) {
			nombreFinal = " " + nombre;
		} else {
			nombreFinal = nombre;
		}

		if (raza == 1) {
			for (byte i = 0; i < (anchuraMaxima / 2)
					- (((nombreFinal.length()) / 2 + perro.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += nombreFinal + perro;
		}
		if (raza == 2) {
			for (byte i = 0; i < (anchuraMaxima / 2)
					- ((nombreFinal.length() / 2 + gato.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += nombreFinal + gato;
		}
		if (raza == 3) {
			for (byte i = 0; i < (anchuraMaxima / 2)
					- ((nombreFinal.length() / 2 + hipopotamo.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += nombreFinal + hipopotamo;
		}
		if (raza == 4) {
			for (byte i = 0; i < (anchuraMaxima / 2)
					- ((nombreFinal.length() / 2 + carpincho.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += nombreFinal + carpincho;
		}

		if (raza == 1) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((perro.length() / 2) + (nombreFinal.length() / 2)); i++) {
				ret += " ";
			}
		}

		if (raza == 2) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((gato.length() / 2) + (nombreFinal.length() / 2)); i++) {
				ret += " ";
			}
		}

		if (raza == 3) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((hipopotamo.length() / 2) + (nombreFinal.length() / 2)); i++) {
				ret += " ";
			}
		}

		if (raza == 4) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((carpincho.length() / 2) + (nombreFinal.length() / 2)); i++) {
				ret += " ";
			}
		}
		ret += "|";
		ret += "\n";
		// Parte final del nombre + raza
		// Parte inicial frase aleatoria
		Random fraseRandom = new Random();
		int frase = fraseRandom.nextInt(4);
		ret += "||";
		if (frase == 0) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase1.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += frase1;
		}
		if (frase == 1) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase2.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += frase2;
		}
		if (frase == 2) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase3.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += frase3;
		}
		if (frase == 3) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase4.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += frase4;
		}

		if (frase == 0) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase1.length() / 2)); i++) {
				ret += " ";
			}
		}
		if (frase == 1) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (frase2.length() / 2); i++) {
				ret += " ";
			}
		}
		if (frase == 2) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (frase3.length() / 2); i++) {
				ret += " ";
			}
		}
		if (frase == 3) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (frase4.length() / 2); i++) {
				ret += " ";
			}
		}
		ret += "|";
		ret += "\n";
		// Parte final frase aleatoria
		// Parte turnos Inicio
		ret += "||";
		String turnosCadena = "";
		if (turnos < 9) {
			turnosCadena += " " + turnos;
		} else {
			turnosCadena += " " + turnos + " ";
		}

		for (byte i = 0; i < (anchuraMaxima / 2) - ((vivio.length() / 2) + (turnosCadena.length() / 2)
				+ (turnosR.length() / 2) + (longitudPar ? 1 : 0)); i++) {
			ret += " ";
		}
		ret += vivio;
		for (byte i = 0; i < (vivio.length() / 2) - ((turnosCadena.length())); i++) {
			ret += " ";
		}
		ret += turnosCadena;
		for (byte i = 0; i < (turnosCadena.length()) - ((turnosR.length())); i++) {
			ret += " ";
		}
		ret += turnosR;
		for (byte i = 1; i < (anchuraMaxima / 2)
				- ((vivio.length() / 2) + (turnosCadena.length() / 2) + (turnosR.length() / 2)); i++) {
			ret += " ";
		}
		ret += "|";
		ret += "\n";
		// Parte turnos fin
		// Parte inicial espaciado
		ret += "||";
		for (byte i = 0; i < anchuraMaxima; i++) {
			ret += " ";
		}
		ret += "|";
		// Parte final espaciado
		// Parte final
		ret += "\n";
		for (byte i = 0; i < anchuraMaxima + 3; i++) {
			ret += "~";
		}
		ret += "\n";

		return ret;
	}

}
