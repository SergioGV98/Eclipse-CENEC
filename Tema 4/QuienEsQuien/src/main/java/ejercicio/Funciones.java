package ejercicio;

public class Funciones {

	public static String imprimeArray(String[] arr) {
		String nuevo = "";
		for (byte i = 0; i < arr.length; i++) {
			nuevo += arr[i] + " ";
		}

		return nuevo;
	}
	
}
