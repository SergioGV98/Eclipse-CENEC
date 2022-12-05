package strings.sgv;

import java.util.Random;

public class Funciones {

	public static String mayusculasAleatorias(String original) {

		Random r = new Random();
		String ret = "";

		for (int i = 0; i < original.length(); i++) {
			char letra = original.charAt(i);
			if (r.nextBoolean()) {
				ret += ("" + letra).toUpperCase();
			} else {
				ret += ("" + letra).toLowerCase();
			}
		}
		return ret;
	}

	public static String quitaEspacios(String original) {
		String copia = original;

		while (copia.contains("\t\t")) {
			copia = copia.replace("\t\t", "\t");
		}

		while (copia.contains("\t ")) {
			copia = copia.replace("\t", " ");
		}

		while (copia.contains(" \t")) {
			copia = copia.replace(" \t", " ");
		}

		while (copia.contains("  ")) {
			copia = copia.replace("  ", " ");
		}

		return copia;
	}

}
