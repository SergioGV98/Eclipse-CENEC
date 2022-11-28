package tamagotchi;

import java.util.Random;

public class Tumba {

	/*
	 * switch(Byte.parseByte(sc.nextLine())) Se puede hacear asi para ahorrar crear
	 * variables
	 */

	public static String enterrar(String nombre, String raza, byte turnos) {
		String ret = " ";
		String dep = "D.E.P";
		String nombreRaza = nombre + " el " + raza;
		String turnosVividos = "Vivio " + turnos + " turnos";
		String fraseAleatoria = null;
		
		Random r = new Random();

		switch (r.nextInt(4)) {
		case 0:
			fraseAleatoria = "Se ha morido";
			break;
		case 1:
			fraseAleatoria = "Dimitio de existir";
			break;
		case 2:
			fraseAleatoria = "La ha espichado";
			break;
		case 3:
			fraseAleatoria = "Viaja hacia las estrellas";
			break;
		}

		short longitudMaxima = (short) dep.length();
		String cadenaMasLarga=dep;
		
		if (fraseAleatoria.length() > longitudMaxima) {
			longitudMaxima = (short) fraseAleatoria.length();
			cadenaMasLarga = fraseAleatoria;
		}

		if (turnosVividos.length() > longitudMaxima) {
			longitudMaxima = (short) turnosVividos.length();
			cadenaMasLarga = turnosVividos;
		}

		if (nombreRaza.length() > longitudMaxima) {
			longitudMaxima = (short) nombreRaza.length();
			cadenaMasLarga = nombreRaza;
		}
		// Para poder poner un espacio al principio y otro al final de la frase
		// para dejar margen con los bordes de la lapida.
		longitudMaxima += 2;

		for (short i = 0; i < longitudMaxima + 1; i++) {
			ret += "_";
		}
		ret+="\n|\\";
		
		for (short i = 0; i < longitudMaxima; i++) {
			ret += "_";
		}
		ret+="\\\n||";
		
		//INICIO DEP
		
		for (short i = 0; i < longitudMaxima/2 - dep.length()/2; i++) {
			ret+=" ";
		}
		
		ret+=dep;
		
		for (short i = 0; i < longitudMaxima/2 - dep.length()/2 - (dep.length()%2+longitudMaxima%2)%2; i++) {
			ret+=" ";
		}
		ret+="|\n||";
		
		//FIN DEP
		
		//INICIO NOMBRE Y RAZA
		
		ret+=nombreRaza;
		
		if(cadenaMasLarga.equals(nombreRaza)) {

			for (short i = 0; i < longitudMaxima/2 - nombreRaza.length()/2 + (nombreRaza.length()%2+longitudMaxima%2); i++) {
				ret+=" ";
			}
		} else {

			for (short i = 0; i < longitudMaxima/2 - nombreRaza.length()/2 - (nombreRaza.length()%2+longitudMaxima%2)%2; i++) {
				ret+=" ";
			}
		}
		ret+=nombreRaza;
		
		ret+="|\n||";
		
		//FIN NOMBRE Y RAZA
		
		//INICIO FRASE ALEATORIA
		
		for (short i = 0; i < longitudMaxima/2 - fraseAleatoria.length()/2; i++) {
			ret+=" ";
		}
		
		ret+=fraseAleatoria;
		
		for (short i = 0; i < longitudMaxima/2 - fraseAleatoria.length()/2 - (fraseAleatoria.length()%2+longitudMaxima%2)%2; i++) {
			ret+=" ";
		}
		ret+="|\n||";
		
		//FIN FRASE ALEATORIA
		
		//INICIO TURNOS
		
		for (short i = 0; i < longitudMaxima/2 - turnosVividos.length()/2; i++) {
			ret+=" ";
		}
		
		ret+=turnosVividos;
		
		for (short i = 0; i < longitudMaxima/2 - turnosVividos.length()/2 - (turnosVividos.length()%2+longitudMaxima%2)%2; i++) {
			ret+=" ";
		}
		ret+="|\n||";
		
		//FIN TURNOS
		
		return ret;
	}
}
