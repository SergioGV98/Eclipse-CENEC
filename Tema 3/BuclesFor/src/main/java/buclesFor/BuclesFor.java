package buclesFor;

import java.util.Scanner;

public class BuclesFor {

	public static void main(String[] args) {

		// Variables
		// long numero;
		byte altura;

		// Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Te voy a construir una piramide torcia dime la altura");
		altura = Byte.parseByte(sc.nextLine());

		for (byte i = 0; i < altura; i++) {
			for (byte j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for (byte i = altura; i > 0; i--) {
			for (byte j = 0; j < i-1; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

		// System.out.println("Dime que tabla de multiplicar quieres");
		/*
		 * System.out.println("Dime un numero y te digo si es Primo"); numero =
		 * Long.parseLong(sc.nextLine());
		 * 
		 * for (long j = 0; j < numero; j++) { boolean esPrimo = true; long i; for (i =
		 * 2; i <= j/2; i++) { if (numero % i == 0) { esPrimo = false; break; } }
		 * 
		 * if (esPrimo == true) { System.out.println(j + " es primo"); } }
		 */

		/*
		 * for(byte i=0 ; i<=10 ; i++) { System.out.println("Tabla de multiplicar del "
		 * + numero + ": " + numero*i);
		 * 
		 * }
		 */
	}

}
