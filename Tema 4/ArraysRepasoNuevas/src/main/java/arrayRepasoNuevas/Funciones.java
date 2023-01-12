package arrayRepasoNuevas;

public class Funciones {

	/*
	 * public static boolean insertarEnArray(String [] arr, byte pos, String valor)
	 * {
	 * 
	 * if(pos<0 || pos >= arr.length) { return false; } arr[pos] = valor; return
	 * true; }
	 */

	public static void intercambiar(char[] arr, byte pos1, byte pos2) {

		char aux;

		aux = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = aux;

	}

	public static String imprimeArray(char[] arr) {
		String nuevo = "";
		for (byte i = 0; i < arr.length; i++) {
			nuevo += arr[i];
		}

		return nuevo;
	}

	public static String imprimeArrayNuevoFor(char[] arr) {
		String nuevo = "";
		for (char elemento : arr) {
			nuevo += elemento;
		}

		return nuevo;
	}
	
	public static String imprimeArray(String[] arr) {
		String nuevo = "";
		for (byte i = 0; i < arr.length; i++) {
			nuevo += arr[i];
		}

		return nuevo;
	}

	/*
	 * public static String imprimeArrayAlReves(char [] arr) { String nuevo = "";
	 * for(byte i = (byte) (arr.length-1); i <= arr.length; i--) { nuevo += arr[i];
	 * }
	 * 
	 * return nuevo; }
	 */

	public static char[] copiarArray(char[] arr) {

		char[] copia = new char[arr.length];

		for (byte i = 0; i < copia.length; i++) {
			copia[i] += arr[i];
		}
		return copia;
	}

}
