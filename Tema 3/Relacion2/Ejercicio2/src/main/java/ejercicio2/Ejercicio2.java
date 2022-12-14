package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * Crea una función llamada cuentaLetras, que reciba por argumentos un String y
		 * un char. Devolverá un short, que indicará el nº de veces que el char aparece
		 * en el String.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribeme un texto");
		String texto = sc.nextLine();
		System.out.println("Escribeme una letra");
		char letra = sc.nextLine().charAt(0);
		
		System.out.println("La letra " +"["+letra+"]" + " aparece " + Funciones.cuentaLetras(texto, letra) + " veces.");
		
	}
}
