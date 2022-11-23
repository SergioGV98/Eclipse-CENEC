package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * Pide por teclado dos números, que no puedan tener decimales. Asegúrate que
		 * están entre 1 y 10, y usa para almacenarlos el tipo de dato más pequeño
		 * posible donde te quepan los números. Después, muestra por pantalla la media
		 * de los dos, con decimales si los tuviese.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		byte n1, n2;

		do {
			System.out.println("Dime el numero 1");
			n1 = Byte.parseByte(sc.nextLine());

			System.out.println("Dime el numero 2");
			n2 = Byte.parseByte(sc.nextLine());
		} while ((n1 <= 1 || n1 >= 10) && (n2 <= 1 || n2 >= 10));

		System.out.println("La media es: " + Funciones.media(n1, n2));

	}

}
