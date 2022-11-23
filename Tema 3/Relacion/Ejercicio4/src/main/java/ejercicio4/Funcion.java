package ejercicio4;

import java.util.Scanner;

public class Funcion {

	public static String comprobadorPalabra(String palabra) {

		do {
			Scanner sc = new Scanner(System.in);
			palabra = sc.nextLine();
		} while (!palabra.contains("cero") && !palabra.contains("uno") && !palabra.contains("dos"));
		return palabra;
	}
	
	public static byte devolverNumero(byte numero, String palabra) {
		
		palabra = Funcion.comprobadorPalabra(palabra);
		
		if (palabra.contains("cero")) {
			numero = 0;
		}
		if (palabra.contains("uno")) {
			numero = 1;
		}
		if (palabra.contains("dos")) {
			numero = 2;
		}
	
		return numero;
	}

}
