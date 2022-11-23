package funciones;

import java.util.Random;

public class Funciones {

	public static void funcionVoid() {

		System.out.println("Hola desde la funcion Void");
	}

	public static int numeroAleatorio(int minimo, int maximo) {
		Random aleatorio = new Random();
		return aleatorio.nextInt(minimo, maximo);
	}

	public static int numeroAleatorio(int maximo) {
		Random aleatorio = new Random();
		return aleatorio.nextInt(maximo);
	}

	public static String imprimeTrozo(String trozo, byte nVeces) {
		String ret = "";
		for (byte i = 0; i < nVeces; i++) {
			if (trozo.equals("pelo")) {
				ret += Funciones.dibujaPelo();
			} else if (trozo.equals("ojos")) {
				ret += Funciones.dibujaOjos();
			} else if (trozo.equals("boca")) {
				ret += Funciones.dibujaBoca();
			} else {
				ret += trozo;
			}
		}
		return ret;
	}

	public static String sustituir(String trozo, char paraSustituir, char sustituto) {
		return trozo.replace(paraSustituir, sustituto);
	}

	public static String dibujaPelo() {
		Random r = new Random();
		String pelo = "";
		switch (r.nextInt(4)) {
		case 0:
			pelo = " /'''\\ ";
			break;
		case 1:
			pelo = " /\\_/\\ ";
			break;
		case 2:
			pelo = " @@@@@ ";
			break;
		case 3:
			pelo = " /|||\\ ";
			break;
		}
		return pelo;
	}

	public static String dibujaOjos() {
		Random r = new Random();
		String ojos = "";
		switch (r.nextInt(4)) {
		case 0:
			ojos = "( o o )";
			break;
		case 1:
			ojos = "( ^ ^ )";
			break;
		case 2:
			ojos = "( ? ? )";
			break;
		case 3:
			ojos = "( + + )";
			break;
		}
		return ojos;
	}
	
	public static String dibujaBoca() {
		Random r = new Random();
		String boca = "";
		switch (r.nextInt(4)) {
		case 0:
			boca = " \\ - / ";
			break;
		case 1:
			boca = " \\ v / ";
			break;
		case 2:
			boca = " \\ m / ";
			break;
		case 3:
			boca = " \\ ~ / ";
			break;
		}
		return boca;
	}
}
