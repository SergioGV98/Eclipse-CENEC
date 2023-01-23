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
	 *             numero de casas que hay en el edificio. Debe estar entre 1 y 127.
	 *             El segundo argumento contendra el numero de pisos que hay en el
	 *             edificio. Debe estar entre 1 y 127.
	 */

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Argumentos para la segunda forma (La mas larga, pero la mejor)

		// Paso 1 - Las variables a las que afecten los argumentos
		// las declaraos al principio y le damos un valor absurdo (imposible)

		byte np = -1;
		byte cp = -1;
		boolean pintoCartel = true;
		boolean cartelPorArgumentos = false;

		// Paso 2 - Recorrer con un bucle todos los argumentos, buscando los que nos
		// interesan, e ignorando el resto

		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-np")) {
				np = Byte.parseByte(args[i + 1]);
			}
			if (args[i].equals("-cp")) {
				cp = Byte.parseByte(args[i + 1]);
			}
			if (args[i].equals("-sinCartel")) {
				pintoCartel = false;
			}
			if(args[i].equals("-conCartel")) {
				cartelPorArgumentos = true;
			}
		}

		// Paso 3 - Si se piden por teclado, en el momento de hacerlo, solo los pedimos
		// si siguen teniendo el valor imposible del principio. Porque si valen otra
		// cosa
		// quiere decir que se ha cogido por argumentos.

		if (np == -1) {
			System.out.println("Dime el numero de plantas que tiene tu piso");
			np = Byte.parseByte(sc.nextLine());
		}

		if (cp == -1) {
			System.out.println("Dime el numero de casa que tiene tu piso");
			cp = Byte.parseByte(sc.nextLine());
		}

		// Argumento Forma 1 (FACIL, PERO OBLIGATORIO PONER TODOS LOS ARGUMENTOS)
		/*
		 * if (args.length < 1) { //En este caso no hay argumentos pido por teclado
		 * System.out.println("Dime el numero de casa que tiene tu piso"); cp =
		 * Byte.parseByte(sc.nextLine()); } else { //Como hay al menos un argumentos lo
		 * uso para el nVeces cp = Byte.parseByte(args[0]); }
		 * 
		 * if (args.length < 2) { //En este caso no hay argumentos pido por teclado
		 * System.out.println("Dime el numero de plantas que tiene tu piso"); np =
		 * Byte.parseByte(sc.nextLine()); } else { //Como hay al menos un argumentos lo
		 * uso para el nVeces np = Byte.parseByte(args[1]); }
		 */

		if (pintoCartel == true && cartelPorArgumentos == false) {
			System.out.println("¿Quieres que pinte el cartel? (s/n)");
			pintoCartel = sc.nextLine().toLowerCase().charAt(0) == 's';
		}
		
		if(pintoCartel) {
			System.out.print("|----------------------------|\r\n" + "| 13 Rue del Percebe |\r\n"
					+ "|----------------------------|\r\n" + "");
		}
		
		for (byte i = 0; i < np; i++) {
			System.out.println(Funciones.pintarAltura("|----|", cp));
			System.out.println(Funciones.pintarAltura("|    |", cp));
			System.out.println(Funciones.pintarAltura("|    |", cp));
		}

	}

}
