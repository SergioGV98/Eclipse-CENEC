package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Pide por teclado un String llamado original, luego otro llamado substring.
		 * Comprueba si el substring está contenido en el string original. Si es así
		 * muestra el mensaje “El substring está presente”. En caso contrario, muestra
		 * el mensaje : “El substring no está presente”.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribeme un texto");
		String original = sc.nextLine();
		
		System.out.println("Escribeme otro texto");
		String subString = sc.nextLine();
		
		if(original.contains(subString)) {
			System.out.println("El substring está presente");
		} else {
			System.out.println("El substring no está presente");
		}
	}
}
