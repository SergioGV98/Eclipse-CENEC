package tamagotchi;

import java.util.Random;

public class Muerte {

	// Hacerlo con un String

	/*
	 * System.out.println("| |     Vivio " + turnos + " turnos" + "     |");
	 * System.out.println("| |                        |");
	 * System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 */



	// Esto para mejorar la lapida y quede casi centrada
	public static String imprimeLapida(byte anchuraMaxima, String nombre, byte raza, byte turnos) {

		String perro = " el Perro";
		String gato = " el Gato";
		String hipopotamo = " el Hipopotamo";
		String carpincho = " el Carpincho";
		
		String frase1 = "Se ha morido";
		String frase2 = "Dimitió de existir";
		String frase3 = "La ha espichado";
		String frase4 = "Viaja hacia las estrellas";
		// Lo del if de la longitudPar solo se le hace a uno del final o del inicio

		//Parte inicial del DEP
		String ret = "|";
		boolean longitudPar = anchuraMaxima % 2 == 0;
		for (byte i = 0; i < (anchuraMaxima / 2) - ("DEP".length() / 2 + (longitudPar ? 1 : 0)); i++) {
			ret += " ";
		}
		ret += "DEP";
		for (byte i = 0; i < (anchuraMaxima / 2) - "DEP".length() / 2; i++) {
			ret += " ";
		}
		ret += "|";
		ret += "\n";
		//Parte final del DEP
		//Parte inicial del nombre + raza
		ret += "|";
		if(raza == 1) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((nombre.length() / 2) + (perro.length()/2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += nombre + perro;
		}
		if(raza == 2) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((nombre.length() / 2) + (gato.length()/2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += nombre + gato;
		}
		if(raza == 3) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((nombre.length() / 2) + (hipopotamo.length()/2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += nombre + hipopotamo;
		}
		if(raza == 4) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((nombre.length() / 2) + (carpincho.length()/2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += nombre + carpincho;
		}
		
		if(raza == 1) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (nombre.length() / 2) - (perro.length()/2); i++) {
				ret += " ";
			}
		}
		
		if(raza == 2) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (nombre.length() / 2) - (gato.length()/2); i++) {
				ret += " ";
			}
		}
		
		if(raza == 3) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (nombre.length() / 2) - (hipopotamo.length()/2); i++) {
				ret += " ";
			}
		}
		
		if(raza == 4) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (nombre.length() / 2) - (carpincho.length()/2); i++) {
				ret += " ";
			}
		}
		ret += "|";
		ret += "\n";
		//Parte final del nombre + raza
		//Parte inicial frase aleatoria
		Random fraseRandom = new Random();
		int frase = fraseRandom.nextInt(4);
		ret += "|";
		if(frase == 0) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase1.length() / 2)  + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += frase1;
		}
		if(frase == 1) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase2.length() / 2)  + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += frase2;
		}
		if(frase == 2) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase3.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += frase3;
		}
		if(frase == 3) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase4.length() / 2) + (longitudPar ? 1 : 0)); i++) {
				ret += " ";
			}
			ret += frase4;
		}
		
		if(frase == 0) {
			for (byte i = 0; i < (anchuraMaxima / 2) - ((frase1.length() / 2)); i++) {
				ret += " ";
			}
		}
		if(frase == 1) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (frase2.length() / 2); i++) {
				ret += " ";
			}
		}
		if(frase == 2) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (frase3.length() / 2); i++) {
				ret += " ";
			}
		}
		if(frase == 3) {
			for (byte i = 0; i < (anchuraMaxima / 2) - (frase4.length() / 2); i++) {
				ret += " ";
			}
		}
		ret += "|";
		ret += "\n";
		//Parte final frase aleatoria
		//Parte turnos Inicio
		ret += "|";
		String turnosCadena;
		if(turnos < 9) {
			turnosCadena = " ";
		} else {
			turnosCadena = "  ";
		}
		
		for (byte i = 0; i < (anchuraMaxima / 2) - ((("Vivió ".length() / 2)+(" turnos".length()/2)+(turnosCadena.length()/2))+ (longitudPar ? 1 : 0)); i++) {
			ret += " ";
		}
		ret += "Vivió " + turnos + " turnos";
		for (byte i = 0; i < (anchuraMaxima / 2) - (("Vivió ".length() / 2)+(" turnos".length()/2)+(turnosCadena.length()/2)); i++) {
			ret += " ";
		}
		ret += "|";
		ret += "\n";
		//Parte turnos fin
		//Parte inicial espaciado
		ret += "|";
		
		
		
		
		
		
		//Parte final espaciado
		// Parte final
		ret += "\n";
		for (byte i = 0; i < anchuraMaxima; i++) {
			ret += "-";
		}
		ret += ">\n";

		return ret;
	}

}
