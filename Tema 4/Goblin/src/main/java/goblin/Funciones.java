package goblin;

import java.util.Scanner;

/**
 * Aqui tendremos todas las funcioens generales que se vayan a usar en el
 * programa
 * 
 * @author Sergio García Vico
 *
 */
public class Funciones {
	/**
	 * Funcion recursiva encargada de pedirte el genero y en caso de escribirlo mal,
	 * volver a pedirtelo.
	 * 
	 * @return devolvera el genero (M o F o N)
	 */
	public static char pideGenero() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el genero de tu personaje (M/F/N)");
		char genero = sc.nextLine().charAt(0);

		if (genero != 'M' && genero != 'F' && genero != 'N') {
			return pideGenero();
		}

		return genero;
	}

	/**
	 * Funcion que segun el genero que sea te devolvera un char, para agregar a final
	 * de la frase o palabra que deses (jugadora/jugadori/jugador) segun a nuestra
	 * conveniencia
	 * @param generoJugador recibe el genero del jugador (M o F o N)
	 * @param masculinoIncluido recibe un booleano en el que si es M por defecto 
	 * masculinoIncluido sera true.
	 * @return
	 */
	public static char terminacionGenero(char generoJugador, boolean masculinoIncluido) {
		if (generoJugador == 'f') {
			return 'a';
		}
		if (generoJugador == 'n') {
			return 'i';
		}
		if (generoJugador == 'm') {
			if (masculinoIncluido == true) {
				return 'o';
			}
		}
		return 0;
	}

}
