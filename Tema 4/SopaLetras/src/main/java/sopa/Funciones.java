package sopa;

import java.util.Random;

public class Funciones {

	public static String imprimeMenu() {
		String ret = "";

		ret += "\n\t 0 - Insertar en horizontal hacia adelante" + "\n\t 1 - Insertar en horizontal hacia atrás"
				+ "\n\t 2 - Insertar en vertical hacia arriba" + "\n\t 3 - Insertar en vertical hacia abajo"
				+ "\n\t 4 - Insertar en diagonal hacia arriba a la derecha"
				+ "\n\t 5 - Insertar en diagonal hacia arriba a la izquierda"
				+ "\n\t 6 - Insertar en diagonal hacia abajo a la derecha"
				+ "\n\t 7 - Insertar en diagonal hacia abajo a la izda\n";

		return ret;
	}

	public static char[][] creaSopa(byte filas, byte columnas) {
		Random r = new Random();
		char[][] matriz = new char[filas][columnas];
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (char) r.nextInt('a', ('z' + 1));
			}
		}
		return matriz;
	}

	public static boolean[][] creaSopaComprobador(byte filas, byte columnas) {
		Random r = new Random();
		boolean[][] matriz = new boolean[filas][columnas];
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = false;
			}
		}
		return matriz;
	}

	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";

		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += "\n";
		}

		return ret;
	}

	public static String imprimeMatriz(boolean[][] matriz) {
		String ret = "";

		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += "\n";
		}

		return ret;
	}

	public static boolean insertaPalabra(char[][] matriz, boolean[][] matrizComprobador, String palabra, byte fila,
			byte columna, byte opcion) {

		switch (opcion) {
		case 0:
			// Insertar en horizontal hacia adelante
			if (columna + (palabra.length() - 1) < matriz[columna].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fila][columna + i] = palabra.toUpperCase().charAt(i);
					matrizComprobador[fila][columna + i] = true;
				}
				return true;
			} else {
				return false;
			}
		case 1:
			// Insertar en horizontal hacia atrás
			if (columna - (palabra.length() - 1) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fila][columna - i] = palabra.toUpperCase().charAt(i);
					matrizComprobador[fila][columna - i] = true;
				}
				return true;
			} else {
				return false;
			}
		case 2:
			// Insertar en vertical hacia arriba
			if (fila - (palabra.length() - 1) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fila - i][columna] = palabra.toUpperCase().charAt(i);
					matrizComprobador[fila - i][columna] = true;
				}
				return true;
			} else {
				return false;
			}
		case 3:
			// Insertar en vertical hacia abajo
			if (fila + (palabra.length() - 1) < matriz[fila].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fila + i][columna] = palabra.toUpperCase().charAt(i);
					matrizComprobador[fila + i][columna] = true;
				}
				return true;
			} else {
				return false;
			}
		case 4:
			// Insertar en diagonal hacia arriba a la derecha
			if ((fila - (palabra.length() - 1) >= 0) && (columna + (palabra.length() - 1)) < matriz[columna].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fila - i][columna + i] = palabra.toUpperCase().charAt(i);
					matrizComprobador[fila - i][columna + i] = true;
				}
				return true;
			} else {
				return false;
			}
		case 5:
			// Insertar en diagonal hacia arriba a la izquierda
			if ((fila - (palabra.length() - 1) >= 0) && (columna - (palabra.length() - 1)) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fila - i][columna - i] = palabra.toUpperCase().charAt(i);
					matrizComprobador[fila - i][columna - i] = true;
				}
				return true;
			} else {
				return false;
			}
		case 6:
			// Insertar en diagonal hacia abajo a la derecha
			if ((fila + (palabra.length() - 1) < matriz[fila].length)
					&& (columna + (palabra.length() - 1)) < matriz[columna].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fila + i][columna + i] = palabra.toUpperCase().charAt(i);
					matrizComprobador[fila + i][columna + i] = true;
				}
				return true;
			} else {
				return false;
			}
		case 7:
			// Insertar en diagonal hacia abajo a la izda
			if ((fila + (palabra.length() - 1) < matriz[fila].length) && (columna - (palabra.length() - 1)) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fila + i][columna - i] = palabra.toUpperCase().charAt(i);
					matrizComprobador[fila + i][columna - i] = true;
				}
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

}
