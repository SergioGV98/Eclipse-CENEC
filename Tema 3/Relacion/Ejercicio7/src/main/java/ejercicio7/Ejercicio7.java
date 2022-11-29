package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String texto;
		byte posicionInicial = 0;
		byte posicionFinal = 0;

		System.out.println("Escribeme un texto");
		texto = sc.nextLine();

		do {
			System.out.println("Dime un numero para la posicion Inicial");
			posicionInicial = Byte.parseByte(sc.nextLine());
			System.out.println("Dime un numero para la posicion Final");
			posicionFinal = Byte.parseByte(sc.nextLine());
			
			while ((posicionInicial > posicionFinal)) {

				System.out.println("Dime un numero para la posicion Inicial");
				posicionInicial = Byte.parseByte(sc.nextLine());
				System.out.println("Dime un numero para la posicion Final");
				posicionFinal = Byte.parseByte(sc.nextLine());

			}

		} while (((posicionInicial > texto.length()) || (posicionFinal > texto.length())));

		System.out.println(texto.substring(posicionInicial,posicionFinal));
		System.out.println(texto.substring(posicionInicial)); //Te da desde la posicion inicial adelante
		System.out.println(texto.substring(posicionFinal)); //Te da desde la posicion final adelante
	}

}
