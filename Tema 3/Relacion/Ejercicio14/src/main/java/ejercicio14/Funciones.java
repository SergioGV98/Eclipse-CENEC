package ejercicio14;

import java.util.Random;

public class Funciones {

	public static String generarFechaAleatoria() {

		Random r = new Random();
		String dia = "";
		short año = (short) r.nextInt(1895, 2022);
		short mes = (short) r.nextInt(1, 13);
		short numero = (short) r.nextInt(1, 32);
		
		while ((numero > 28 && mes == 2) ||(numero == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))) {
			numero = (short) r.nextInt(1, 32);
			mes = (short) r.nextInt(1, 13);
		}

		if (mes < 10) {
			dia += numero + "/" + "0" + mes + "/" + año;
		} else {
			dia += numero + "/" + mes + "/" + año;
		}

		return dia;
	}
}
