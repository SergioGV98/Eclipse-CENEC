package ejercicio;

import java.util.Arrays;

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
	
	public static String [] comprobador(String[] personasArr) {
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
	
	public static String [] comprobador2(String[] personasNombreArr) {
		
		String[] personasNombre = { "marta", "andres", "sofia", "samuel", "laura", "anselmo", "elvira" };
		
		return personasNombreArr = Arrays.copyOf(personasNombre, personasNombre.length);
		
	}
	
}
