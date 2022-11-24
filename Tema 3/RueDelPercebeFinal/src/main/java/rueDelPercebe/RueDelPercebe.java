package rueDelPercebe;

import java.util.Scanner;

/**
 * Clase principal que contiene el main
 * 
 * @author Sergio García Vico
 *
 */

public class RueDelPercebe {

	/**
	 * Main que nos pide el numero de casas y pisos que queremos en la capacidad
	 * maxima de un byte y nos imprime el edifico llamando a la funcion de
	 * pintarAltura para dibujarlo tantas veces.
	 * 
	 * @param args sin uso
	 */

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		byte np;
		byte cp;

		System.out.println("Dime el numero de plantas que tiene tu piso");
		np = Byte.parseByte(sc.nextLine());

		System.out.println("Dime el numero de casa que tiene tu piso");
		cp = Byte.parseByte(sc.nextLine());

		System.out.print("|----------------------------|\r\n" + "| 13 Rue del Percebe |\r\n"
				+ "|----------------------------|\r\n" + "");
		for (byte i = 0; i < np; i++) {
			System.out.println(Funciones.pintarAltura("|----|", cp));
			System.out.println(Funciones.pintarAltura("|    |", cp));
			System.out.println(Funciones.pintarAltura("|    |", cp));
		}

	}

}
