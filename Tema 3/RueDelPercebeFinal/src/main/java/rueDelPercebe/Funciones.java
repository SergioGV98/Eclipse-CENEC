package rueDelPercebe;

/**
 * Clase que contiene funcion para dibujar un piso y su casa.
 * @author Sergio García Vico
 * @version Final
 * @since Final
 */

public class Funciones {

	/**
	 * La funcion recoge un String que sera un dibujo desde el main y lo repite un numero de veces
	 * usando la variable del main cp.
	 * @author Sergio García Vico
	 * @param dibujo una cadena de texto que tiene que ser un dibujo.
	 * @param nVeces las veces que va a imprimir el dibujo introducido.
	 * @return devuelve la cadena concatenada las veces que se ha repetido el bucle.
	 */
	
	public static String pintarAltura(String dibujo, byte nVeces) {
		String ret = "";
		for(byte i=0; i<nVeces; i++) {
			ret+=dibujo;
		}
		return ret;
	}
	
	
}
