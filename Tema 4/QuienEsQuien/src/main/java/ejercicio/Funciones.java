package ejercicio;

import java.util.Arrays;

/**
 * 
 * @author Sergio García Vico
 *
 */
public class Funciones {

	/**
	 * Funcion que sirve para imprimir el Array
	 * @param arr el Array que queremos recorrer
	 * @return Nos devolvera un String de todo el Array
	 */

	public static String imprimeArray(String[] arr) {
		String nuevo = "";
		for (byte i = 0; i < arr.length; i++) {
			nuevo += arr[i] + " ";
		}

		return nuevo;
	}

	/**
	 * Funcion que recibe un Array de caracteristicas y un String de la caracteristica elegida y
	 * lo busca en el Array de caracteristicas, si no existe o esta mal escrito, nos devolvera true or false.
	 * @param caracteristicas Array que contiene todas las caracteristicas que puede tener las personas.
	 * @param caracteristicasElegida String de la caracteristica que busca el usuario.
	 * @return Nos devuelve un booleano llamado comprobador que sera true or false.
	 */
	public static boolean comprobadorCaracteristica(String[] caracteristicas, String caracteristicasElegida) {

		boolean comprobador = false;

		for (byte i = 0; i < caracteristicas.length; i++) {
			if (caracteristicas[i].contains(caracteristicasElegida)) {
				comprobador = true;
			} else {

			}
		}
		return comprobador;
	}

	/**
	 * Funcion que recibe un Array con todas las personas que tenemos en el juego y nos
	 * vuelve a reinscribir todas las personas en las misma posiciones en caso de que no
	 * encontremos a quien buscabamos en el juego (Sirve para resetear el juego)
	 * @param personasArr Array de todas las personas que ahi en el juego.
	 * @return Nos devuelve el array copiado (para hacer el reset)
	 */

	public static String[] resetPersonas(String[] personasArr) {
		String marta = "Gafas|Sombrero|Mujer|PeloRubio|OjosMarrones";
		String andres = "Barba|Hombre|PeloMoreno|OjosVerdes";
		String sofia = "Collar|Mujer|PeloMoreno|OjosVerdes";
		String samuel = "Gafas|Hombre|Sombrero|PeloRubio|OjosMarrones";
		String laura = "Gafas|Collar|Mujer|PeloMoreno|OjosVerdes";
		String anselmo = "Hombre|Gafas|Barba|PeloRubio|OjosAzules";
		String elvira = "Mujer|Collar|Sombrero|PeloMoreno|OjosAzules";

		String[] personas = { marta, andres, sofia, samuel, laura, anselmo, elvira };

		return personasArr = Arrays.copyOf(personas, personas.length);

	}

	/**
	 * Funcion que recibe un Array con todas las personas (sus nombres) que tenemos en el juego y nos
	 * vuelve a reinscribir todas las personas en las misma posiciones en caso de que no
	 * encontremos a quien buscabamos en el juego (Sirve para resetear el juego)
	 * @param personasNombreArr Array de todos los nombres de las personas.
	 * @return Nos devuelve el array copiado (para hacer el reset)
	 */
	
	public static String[] resetNombres(String[] personasNombreArr) {

		String[] personasNombre = { "marta", "andres", "sofia", "samuel", "laura", "anselmo", "elvira" };

		return personasNombreArr = Arrays.copyOf(personasNombre, personasNombre.length);

	}

}
