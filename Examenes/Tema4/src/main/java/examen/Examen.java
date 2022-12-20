package examen;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase principal que contiene nuestro main
 * @author Sergio García Vico
 *
 */

public class Examen {

	/**
	 * Main que nos pide un tamaño para nuestro Array llamado numeros que puede llegar hasta un Short,
	 * luego a este Array se le van introduciendo numeros aleatorios comprendidos entre
	 * 32 y 127.
	 * Luego se crea otro Array de char llamado letras que contiene el mismo tamaño que el 
	 * Array de numeros y esta vez coge las posiciones de los numeros del Array anterior y 
	 * nos lo convierte a Char.
	 * Mas adelante remplazara la frase con todas las letras concatenadas y quitara las Vocales
	 * mayusculas y las reemplazara por minusculas.
	 * Mas adelante nos pedira dos numeros y nos devolvera el String de la frase que ahi
	 * entre esas dos posiciones
	 * Para acabar un pequeño bucle que nos va a contrar todos los simbolos que no sean [a-z] o
	 * [A-Z] y nos lo devolvera con un short.
	 * @param args sin uso
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String frase = "";

		System.out.println("Dime un numero para el tamaño de Array (Short)");
		short tamano = Short.parseShort(sc.nextLine());

		byte numeros[] = new byte[tamano];

		for (short i = 0; i < numeros.length; i++) {
			numeros[i] = (byte) r.nextInt(32, 127);
		}

		char letras[] = new char[tamano];

		for (short i = 0; i < letras.length; i++) {
			letras[i] = (char) numeros[i];
		}

		for (short i = 0; i < letras.length; i++) {
			frase += letras[i];
		}

		System.out.println("Frase original con posibles vocales mayusculas: " + frase);

		frase = frase.replace("A", "a");
		frase = frase.replace("E", "e");
		frase = frase.replace("I", "i");
		frase = frase.replace("O", "o");
		frase = frase.replace("U", "u");

		System.out.println("Frase con las vocales en mayusculas en minusculas: " + frase);
		
		System.out.println("Te voy a pedir dos numeros y te voy a dar la cadena del String frase, comprendida entre esos dos numeros");
		System.out.println("Numero 1");
		short n1 = Short.parseShort(sc.nextLine());;
		System.out.println("Numero 2");
		short n2 = Short.parseShort(sc.nextLine());;
		
		System.out.println("Cadena entre la posisicion " + n1 + " y " + n2 + ": " + frase.substring(n1, n2));
		
		
		short contador = 0;
		
		for(short i = 0; i < frase.length(); i++) {
			if(!((letras[i] >= 'a' && letras[i] <= 'z') || (letras[i] >= 'A' && letras[i] <= 'Z'))) {
				contador++;
			}
		}
		System.out.println("Simbolos que no son letras Mayusculas o minusculas: " + contador); 
		System.out.println("Simbolos que no son letras Mayusculas o minusculas (Recursiva): " + Funciones.cuentaNoLetras(letras, frase, (short) 0));
	}
}
