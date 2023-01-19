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
	 * @param args si tiene al menos un argumento, el primer argumento contendra el
	 * numero de casas que hay en el edificio. Debe estar entre 1 y 127.
	 * El segundo argumento contendra el numero de pisos que hay en el edificio. Debe
	 * estar entre 1 y 127.
	 */

	public static void main(String[] args) {
		
		//Argumentos para la segunda forma (La mas larga, pero la mejor)
		
		//Paso 1 - Las variables a las que afecten los argumentos
		//las declaraos al principio y le damos un valor absurdo (imposible)

		// Variables
		byte np = -1;
		byte cp = -1;
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		if (args.length < 1) {
			//En este caso no hay argumentos pido por teclado
			System.out.println("Dime el numero de casa que tiene tu piso");
			cp = Byte.parseByte(sc.nextLine());
		} else {
			//Como hay al menos un argumentos lo uso para el nVeces
			cp = Byte.parseByte(args[0]);
		}
		
		if (args.length < 2) {
			//En este caso no hay argumentos pido por teclado
			System.out.println("Dime el numero de plantas que tiene tu piso");
			np = Byte.parseByte(sc.nextLine());
		} else {
			//Como hay al menos un argumentos lo uso para el nVeces
			np = Byte.parseByte(args[1]);
		}

		System.out.print("|----------------------------|\r\n" + "| 13 Rue del Percebe |\r\n"
				+ "|----------------------------|\r\n" + "");
		for (byte i = 0; i < np; i++) {
			System.out.println(Funciones.pintarAltura("|----|", cp));
			System.out.println(Funciones.pintarAltura("|    |", cp));
			System.out.println(Funciones.pintarAltura("|    |", cp));
		}

	}

}
