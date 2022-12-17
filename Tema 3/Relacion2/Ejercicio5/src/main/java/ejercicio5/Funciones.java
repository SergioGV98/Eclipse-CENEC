package ejercicio5;

import java.util.Random;

public class Funciones {

	public static String refranAzar() {
		Random r = new Random();

		String[] refranes = { "Al mal tiempo, buena cara", "A palabras necias, oidos sordos",
				"A buen entendedor, pocas palabras bastan", "Al que madruga, dios le ayuda",
				"Al que a buen arbol se arrima, buena sombra le cobija", "No por mucho madrugar, amanecerá temprano",
				"Personas que duermen en el mismo colchon, se vuelven de la misma condicion",
				"La vida es una lenteja, o la tomas o la dejas", "Pan para hoy, hambre para mañana",
				"Cuando acaba la partida, rey y peon duerme en la misma caja" };

		byte numero = (byte) r.nextInt(refranes.length);

		return refranes[numero];
	}

	public static String patadizarRefrán(String refran) {

		if (refran.indexOf(",") == -1 || refran.indexOf(",") != refran.lastIndexOf(",")) {
			return null;
		}

		byte position = (byte) refran.indexOf(",");

		refran = refran.substring(0, position + 1);
		refran = Funciones.simboloAzar() + " " + refran + " patada en la entrepierna " + Funciones.simboloAzar();

		return refran;
	}

	public static char simboloAzar() {

		char[] simbolosPosibles = { '☺', '☮', '♫', '★', '☀' };

		Random r = new Random();

		byte numero = (byte) r.nextInt(simbolosPosibles.length);

		return simbolosPosibles[numero];
	}
}
