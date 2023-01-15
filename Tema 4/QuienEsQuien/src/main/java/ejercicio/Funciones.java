package ejercicio;

public class Funciones {

	public static String imprimeArray(String[] arr) {
		String nuevo = "";
		for (byte i = 0; i < arr.length; i++) {
			nuevo += arr[i] + " ";
		}

		return nuevo;
	}

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
	
	
}
