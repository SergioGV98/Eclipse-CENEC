package relacionEjercicios;

import java.util.Scanner;

public class Funciones {

	/*
	 * 1 - Pide por teclado un número que pueda tener decimales, e imprímelo por
	 * pantalla
	 */
	public static void ejercicio1(float numero) {
		System.out.println(numero);
	}

	/*
	 * 2 - Pide por teclado un número que pueda tener decimales, y asegúrate de que
	 * está entre 1 y 10. Si no es así, vuelve a pedirlo tantas veces como sea
	 * necesario, hasta que esté entre 1 y 10. Luego, imprímelo por pantalla.
	 */

	public static float ejercicio2(float n2) {
		Scanner sc = new Scanner(System.in);

		return n2;
	}

	/*
	 * Pide por teclado una palabra, indica que tiene que ser “cero”, “uno”,
	 * “dos”,”tres”,”cuatro”,”cinco”,”seis”,”siete”,”ocho”,”nueve” o “diez”. Si no
	 * es ninguna de ellas, volver a pedir el texto, hasta que lo sea. Una vez hecho
	 * esto, mostrar por pantalla el número equivalente a la palabra introducida.
	 * Por ejemplo, si se pone “siete”, mostrar por pantalla un 7.
	 */

	public static byte palabra() {
		Scanner sc = new Scanner(System.in);
		Byte numero = -1;
		
		String palabra = sc.nextLine();
		while (palabra != "cero" || palabra != "uno") {
			palabra = sc.nextLine();
		}
		
		if(palabra == "cero") {
			numero = 0;
		}
		if(palabra == "uno") {
			numero = 1;
		}
		return numero;
	}
}
