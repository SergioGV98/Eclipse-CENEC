package marquesina;

/**
 * Clase main que contiene el ejercicio de la Marquesina.
 * @author Sergio García Vico
 *
 */

public class Main {
	/**
	 * Funcion main que nos va a ir imprimiendo la marquesina, letra a letra y corriendo una
	 * posicion cada letra hasta llenarnos el Array y terminara una vez que se imprima toda la marquesina,
	 * si encuentra otra letra en esa posicion la reemplazara por la nueva.
	 * @param args no se usa
	 */
	public static void main(String[] args) {

		String texto = "Mira como mola esto, una marquesina!";

		char[] marquesina = new char[10];

		for (byte i = 0; i < texto.length(); i++) {
			for (byte j = 0; j < marquesina.length - 1; j++) {
				System.out.print(marquesina[j] = marquesina[j + 1]);
				marquesina[marquesina.length - 1] = texto.charAt(i);
			}
			System.out.println();
		}

	}

}
