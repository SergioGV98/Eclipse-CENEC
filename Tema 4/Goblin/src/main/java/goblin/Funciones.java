package goblin;

import java.util.Scanner;

public class Funciones {

	public static char pideGenero() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el genero de tu personaje (M/F/N)");
		char genero = sc.nextLine().charAt(0);

		if (genero != 'M' && genero != 'F' && genero != 'N') {
			return pideGenero();
		}

		return genero;
	}

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
