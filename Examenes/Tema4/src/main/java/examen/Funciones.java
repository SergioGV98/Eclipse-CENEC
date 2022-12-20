package examen;
/**
 *  Clase que contiene una unica funcion encargada de contrar simbolos que no son letras.
 * @author Sergio García Vico
 *
 */
public class Funciones {
	
	/**
	 * Funcion recursiva que se encarga de cogernos un array de letras e ir comprobandolo letra a letra si 
	 * el caracter en ese posicion no es [a-z] o [A-Z] y en caso de no serlo sumarlo a un contador.
	 * @param letras cogemos el array de letras del main
	 * @param frase cogemos la frase del main que tendra concatenada todas las letras y usarlo para contar la longitud.
	 * @param i el contador de nuestro bucle for del main para usarlo en la recursividad
	 * @return nos devolvera un Int de cuantas veces ha salido algo que no es [a-z] o [A-Z]
	 */

	public static int cuentaNoLetras(char letras[], String frase, short i) {
		int contador = 0;
		if (i < frase.length()) { // Funcion recursiva
			if (!((letras[i] >= 'a' && letras[i] <= 'z') || (letras[i] >= 'A' && letras[i] <= 'Z'))) {
				contador++;
			}
			contador += Funciones.cuentaNoLetras(letras, frase, (short) (i + 1));
		} else { // Caso base

		}

		return contador;
	}

}
