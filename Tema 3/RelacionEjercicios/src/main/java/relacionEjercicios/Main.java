package relacionEjercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * 1 - Pide por teclado un número que pueda tener decimales, e imprímelo por
		 * pantalla
		 */
		System.out.println("Dime un numero (puede tener decimales)");
		float n1 = Float.parseFloat(sc.nextLine());

		Funciones.ejercicio1(n1);

		/*
		 * 2 - Pide por teclado un número que pueda tener decimales, y asegúrate de que
		 * está entre 1 y 10. Si no es así, vuelve a pedirlo tantas veces como sea
		 * necesario, hasta que esté entre 1 y 10. Luego, imprímelo por pantalla.
		 */
		System.out.println("Dime un numero, puede ser con decimales y comprendido entre 1 y 10");
		float n2 = Float.parseFloat(sc.nextLine());
		System.out.println("Numero " + Funciones.ejercicio2(n2));

		/*
		 * Pide por teclado una palabra, indica que tiene que ser “cero”, “uno”,
		 * “dos”,”tres”,”cuatro”,”cinco”,”seis”,”siete”,”ocho”,”nueve” o “diez”. Si no
		 * es ninguna de ellas, volver a pedir el texto, hasta que lo sea. Una vez hecho
		 * esto, mostrar por pantalla el número equivalente a la palabra introducida.
		 * Por ejemplo, si se pone “siete”, mostrar por pantalla un 7.
		 */

		System.out.println(
				"Escribeme la palabra (“cero”, “uno”, “dos”,”tres”,”cuatro”,”cinco”,”seis”,”siete”,”ocho”,”nueve” o “diez”)");

		Byte numero = -1;
		boolean comprobador = false;
		String palabra = sc.nextLine();

		while (comprobador == false) {

			if (palabra == "cero") {
				numero = 0;
				System.out.println("0");
				comprobador = true;
			}
			if (palabra == "uno") {
				numero = 1;
				System.out.println("1");
				comprobador = true;
			}
			palabra = sc.nextLine();
		}

		// System.out.println(Funciones.palabra());
	}

}
