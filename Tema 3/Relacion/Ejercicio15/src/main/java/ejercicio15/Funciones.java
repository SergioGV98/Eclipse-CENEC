package ejercicio15;

import java.util.Random;

public class Funciones {

	public static String metalizarNombreBanda(String nombreBanda) {
		Random simbolo = new Random();
		String ret = "";
		String terminado = "";
		char randomChar = '0';
		byte probabilidad = 0;
		byte simboloFinal = -1;
		char caracter = ' ';

		for (short i = 0; i < nombreBanda.length(); i++) {
			if (nombreBanda.charAt(i) == ' ') {
				simboloFinal = (byte) (simbolo.nextInt(1, 5));
				switch (simboloFinal) {
				case 1:
					caracter = '#';
					ret += " " + caracter + " ";
					break;
				case 2:
					caracter = '%';
					ret += " " + caracter + " ";
					break;
				case 3:
					caracter = '@';
					ret += " " + caracter + " ";
					break;
				case 4:
					caracter = '&';
					ret += " " + caracter + " ";
					break;
				}
			} else {
				ret += nombreBanda.charAt(i);
			}
		}

		for (short i = 0; i < ret.length(); i++) {
			if (ret.charAt(i) == ' ') {
				terminado += ret.charAt(i);
			} else if (ret.charAt(i) != ' ') {
				probabilidad = (byte) simbolo.nextInt(1, 101);
				if (probabilidad <= 30) {
					simboloFinal = (byte) simbolo.nextInt(1, 4);
					switch (simboloFinal) {
					case 1:
						caracter = '1';
						terminado += caracter;
						break;
					case 2:
						caracter = '2';
						terminado += caracter;
						break;
					case 3:
						caracter = '3';
						terminado += caracter;
						break;
					}
				}
				terminado += ret.charAt(i);
			}
		}

		return terminado;
	}
}
