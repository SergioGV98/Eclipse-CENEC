package Practica2;

import java.util.Random;
import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Primer examen del año pasado

		byte tamaño = 0;
		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-tamaño")) {
				tamaño = Byte.parseByte(args[i + 1]);
			} else if (args[i].equals("-h")||args[i].equals("-help")) {
				System.out.println("Se pueden usar los argumentos:\n\t-tamaño : "+
			"el argumento siguiente indica el tamaño de la matriz.");
				System.exit(0);
			}
		}
		if (tamaño == 0) {
			System.out.println("Dime un tamaño pleased");
			tamaño = Byte.parseByte(sc.nextLine());
		}

		while (tamaño < 2 || tamaño > 10) {
			System.out.println("Repite tamaño leases debe de estar entre 2-10");
			tamaño = Byte.parseByte(sc.nextLine());
		}
		String[][] escena = Funciones.ciudad(tamaño);
		Funciones.solAleatorio(escena);
		byte filasVacias = Funciones.ponerAgua(escena);
		System.out.println(filasVacias);

		if (filasVacias > 0) {
			Funciones.colocarElementos(escena);
		}
		for (byte i = 0; i < escena.length; i++) {
			for (byte j = 0; j < escena[i].length; j++) {
				System.out.print((escena[i][j]!=null?escena[i][j]:"  ") + " ");
			}
			System.out.println();

		}

		// Examen mas antiguo y ultimo del moodle de este tema

		System.out.println("Dime un numero");
		byte numero = Byte.parseByte(sc.nextLine());
		boolean[] array = new boolean[20];
		for (byte i = 0; i < array.length; i++) {
			array[i] = false;
		}
		for (byte i = 0; i <= numero; i++) {
			array[numero * i] = true;
		}
		for (byte i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		System.out.println("\nDime un numero nuevo");
		byte a = Byte.parseByte(sc.nextLine());
		System.out.println("Dime un segundo numero nuevo");
		byte b = Byte.parseByte(sc.nextLine());
		while (a == b) {
			System.out.println("No pueden ser iguales por favor vuelve elegir un numero diferente en uno de ellos");
			a = Byte.parseByte(sc.nextLine());
		}
		int[][] matriz = new int[a][b];
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				if (i == 0 && j == 0) {
					matriz[i][j] = 1;
				} else {
					if (i != 0 && j == 0) {
						matriz[i][j] = matriz[i - 1][matriz[0].length - 1] * 2;
					} else {
						matriz[i][j] = matriz[i][j - 1] * 2;
					}

				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		char[][] sopaLetras = Funciones.crearSopa(a, b);
		System.out.println("Dime una palabara");
		String palabra = sc.nextLine();
		System.out.println("Dime la fila");
		byte posX = Byte.parseByte(sc.nextLine());
		System.out.println("Dime la columna");
		byte posY = Byte.parseByte(sc.nextLine());

		while (!Funciones.introducirPalabra(sopaLetras, palabra, posX, posY)) {
			System.out.println("Aqui no cabe empezaremos de nuevo a elegir fila y columna y palabra");
			System.out.println("Dime una palabara");
			palabra = sc.nextLine();
			System.out.println("Dime la fila");
			posX = Byte.parseByte(sc.nextLine());
			System.out.println("Dime la columna");
			posY = Byte.parseByte(sc.nextLine());
		}
		for (byte i = 0; i < sopaLetras.length; i++) {
			for (byte j = 0; j < sopaLetras[i].length; j++) {
				System.out.print(sopaLetras[i][j] + " ");
			}
			System.out.println();
		}

		// Examen de mapas
		byte var1 = 0;
		byte var2 = 0;
		for (byte i = 0; i < args.length; i++) {
			if (args[i].contains("-filas")) {
				var1 = Byte.parseByte(args[i + 1]);
			} else if (args[i].contains("-columnas")) {
				var2 = Byte.parseByte(args[i + 1]);
			}
		}
		if (var1 == 0) {
			System.out.println("Dime un numero para la fila");
			var1 = Byte.parseByte(sc.nextLine());
		}
		if (var2 == 0) {
			System.out.println("Dime un segundo numero para la columna");
			var2 = Byte.parseByte(sc.nextLine());
		}

		while ((var1 < 10. || var1 > 127) || (var2 < 10 || var2 > 127)) {
			System.out.println("Porfavor repite los nueros ya que deben de estar entre 10 y 127 ambos icluidos");
			var1 = Byte.parseByte(sc.nextLine());
			System.out.println("Y el otro numero");
			var2 = Byte.parseByte(sc.nextLine());
		}
		char[][] mapa = Mapas.matrizAgua(var1, var2);
		System.out.println("Dime el numero de continentes");
		byte nContinentes = Byte.parseByte(sc.nextLine());
		while (nContinentes >= mapa.length || nContinentes >= mapa[0].length) {
			System.out.println(
					"El numero de continentes no puede ser mayor a el numero de filas ni al numero de columnas repite numero");
			nContinentes = Byte.parseByte(sc.nextLine());
		}
		Mapas.ponerTerreno(mapa, nContinentes);
		System.out.println("Dime la extension maxima");
		byte extensionMaxima = Byte.parseByte(sc.nextLine());
		while (extensionMaxima < 2 || extensionMaxima > 5) {
			System.out.println("Debe de estar entre 2 y 5 por favor repite el numero");
			extensionMaxima = Byte.parseByte(sc.nextLine());
		}
		for (byte i = 0; i < extensionMaxima; i++) {
			Mapas.extenderTerreno(mapa);
		}

		for (byte i = 0; i < mapa.length; i++) {
			for (byte j = 0; j < mapa[i].length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
			System.out.println();
		}

	}

}