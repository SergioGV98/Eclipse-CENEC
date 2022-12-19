package ejercicio6;

public class Funciones {

	public static byte descrifrarQuiero(String texto) {

		for (byte i = 1; i < 127; i++) {
			String descodificado = "";

			for (byte j = 0; j < texto.length(); j++) {
				descodificado += (char) (texto.charAt(j) - i);
			}

			if (descodificado.contains("Quiero")) {
				return i;
			}

		}

		return -1;
	}

	// Una mas potente
	public static byte descrifrarQuiero(String texto, String buscado) {

		byte contador = 0;
		String ret = "";
		do {
			ret = "";
			contador++;
			for (short i = 0; i < texto.length(); i++) {
				ret += (char) texto.charAt(i) - contador;
			}
		} while (!ret.contains(buscado));

		return contador;
	}

	public static String descodificar(String texto) {

		texto = texto.replace("-", "a");
		texto = texto.replace("@", "p");
		texto = texto.replace("%", "b");

		return texto;
	}
}