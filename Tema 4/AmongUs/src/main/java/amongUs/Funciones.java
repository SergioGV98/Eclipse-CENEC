package amongUs;

import java.util.Random;

public class Funciones {
	/**
	 * Funcion que dado un tamaño, crea un array de se tamaño, con todas las
	 * posiciones rellenas con el string "_"
	 * 
	 * @param tamaño tamaño del array
	 * @return null si el tamaño no esta entre 5 y 15, un array del tamaño indicado
	 *         con todas sus posiciones rellenas con "_" en caso contrario.
	 */
	public static String[] generaTablero(byte tamaño) {

		if (tamaño < 5 || tamaño > 15) {
			return null;
		} else {
			String arr[] = new String[tamaño];
			for (byte i = 0; i < tamaño; i++) {
				arr[i] = "_";
			}
			return arr;
		}
	}

	public static String imprimeTablero(String[] tablero, String[] tumbas) {
		String ret = "| ";
		for (byte i = 0; i < tablero.length - 1; i++) {
			if (tablero[i].equals("_")) {
				ret += tumbas[i] + "\t";
			} else {
				ret += tablero[i] + "\t";
			}
		}
		ret += (tablero[tablero.length - 1].equals("_") ? tumbas[tumbas.length - 1] : tablero[tablero.length - 1])
				+ (tablero.length > 11 ? " " : "") + " |\n| ";
		for (byte i = 0; i < tablero.length - 1; i++) {
			ret += i + "\t";
		}
		return ret + (tablero.length - 1) + (!tablero[tablero.length - 1].equals("_") ? " " : "") + " |";
	}

	public static byte colocarElemento(String[] tablero, char elemento) {
		Random r = new Random();

		byte posicionAleatoria = (byte) r.nextInt(tablero.length);

		while (!tablero[posicionAleatoria].equals("_")) {
			posicionAleatoria = (byte) r.nextInt(tablero.length);
		}

		tablero[posicionAleatoria] = elemento + "";

		return posicionAleatoria;
	}

	public static byte colocarElementoRecursivo(String[] tablero, char elemento) {
		Random r = new Random();

		byte posicionAleatoria = (byte) r.nextInt(tablero.length);

		if (!tablero[posicionAleatoria].equals("_")) {
			posicionAleatoria = colocarElementoRecursivo(tablero, elemento);
		} else {
			tablero[posicionAleatoria] = elemento + "";
		}
		return posicionAleatoria;
	}
	

}
