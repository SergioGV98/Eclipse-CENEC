package ejercicio3;

public class Funciones {

	public static String dibujarBarcos(Byte numero) {

		String ret = "";

		for (byte i = 0; i < numero; i++) {
			for (byte j = 0; j < 6; j++) {
				ret += " ";
			}
			ret += "/|";
			for (byte j = 0; j < 7; j++) {
				ret += " ";
			}
		}

		ret += "\n";

		for (byte i = 0; i < numero; i++) {
			for (byte j = 0; j < 6; j++) {
				ret += " ";
			}
			ret += "\\|";
			for (byte j = 0; j < 7; j++) {
				ret += " ";
			}
		}

		ret += "\n";

		for (byte i = 0; i < numero; i++) {
			for (byte j = 0; j < 7; j++) {
				ret += "-";
			}
			ret += "|";
			for (byte j = 0; j < 7; j++) {
				ret += "-";
			}
		}

		ret += "\n";
		for (byte i = 0; i < numero; i++) {
			ret += "\\";
			for (byte j = 0; j < 13; j++) {
				ret += "-";
			}
			ret += "/";
		}

		return ret;
	}
}