package ejercicio;

import java.util.Scanner;

/**
 * Clase main que contiene el juego de Quien es quien.
 * @author Sergio García Vico
 *
 */

public class Main {

	/**
	 * Clase main que contiene todo el juego de Quien es quien, el cual nos pedira caracteristicas
	 * hasta que adivinemos la persona, en caso de que no encontremos la persona, se reiniciara todo
	 * para empezar de nuevo.
	 * @param args no se usa
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String marta = "Gafas|Sombrero|Mujer|PeloRubio|OjosMarrones";
		String andres = "Barba|Hombre|PeloMoreno|OjosVerdes";
		String sofia = "Collar|Mujer|PeloMoreno|OjosVerdes";
		String samuel = "Gafas|Hombre|Sombrero|PeloRubio|OjosMarrones";
		String laura = "Gafas|Collar|Mujer|PeloMoreno|OjosVerdes";
		String anselmo = "Hombre|Gafas|Barba|PeloRubio|OjosAzules";
		String elvira = "Mujer|Collar|Sombrero|PeloMoreno|OjosAzules";

		String[] personas = { marta, andres, sofia, samuel, laura, anselmo, elvira };
		String[] personasNombre = { "marta", "andres", "sofia", "samuel", "laura", "anselmo", "elvira" };
		String[] caracteristicas = { "Gafas", "Barba", "Collar", "Hombre", "Mujer", "Sombrero", "PeloMoreno",
				"PeloRubio", "OjosMarrones", "OjosVerdes", "OjosAzules" };

		byte parada = 0;

		while (!(parada == 6)) {

			if (parada == 7) {
				System.out.println("No he podido encontrar a la persona que buscabas, vamos a empezar de nuevo.");
				personas = Funciones.resetPersonas(personas);
				personasNombre = Funciones.resetNombres(personasNombre);
			}

			String caracteristicaElegida;

			System.out.println("Te voy a monstrar las personas restantes.");
			System.out.println(Funciones.imprimeArray(personasNombre));
			System.out.println("Las caracteristicas que vas a pedir, ¿Estan o NO estan? (S o N)");
			char opcion = sc.nextLine().toUpperCase().charAt(0);
			while (opcion != 'S' && opcion != 'N') {
				System.out.println("Debe ser S o N");
				opcion = sc.nextLine().toUpperCase().charAt(0);
			}
			// Si la caracteristica que quieres la tiene la persona
			if (opcion == 'S') {
				do {
					System.out.println("Estas son las caracteristicas que puedes elegir: "
							+ Funciones.imprimeArray(caracteristicas));
					caracteristicaElegida = sc.nextLine();
				} while (Funciones.comprobadorCaracteristica(caracteristicas, caracteristicaElegida) == false);

				for (byte i = 0; i < personas.length; i++) {
					if (!(personas[i].contains(caracteristicaElegida))) {
						personas[i] = personas[i].replace(personas[i], "Null");
						personasNombre[i] = personasNombre[i].replace(personasNombre[i], "");
					}
				}
				parada = 0;
				for (byte i = 0; i < personas.length; i++) {
					if (personas[i].contains("Null")) {
						parada++;
					}
				}

			} else {
				// Si la caracteristica que quieres no la tiene la persona
				do {
					System.out.println("Estas son las caracteristicas que puedes elegir: "
							+ Funciones.imprimeArray(caracteristicas));
					caracteristicaElegida = sc.nextLine();
				} while (Funciones.comprobadorCaracteristica(caracteristicas, caracteristicaElegida) == false);

				for (byte i = 0; i < personas.length; i++) {
					if (personas[i].contains(caracteristicaElegida)) {
						personas[i] = personas[i].replace(personas[i], "Null");
						personasNombre[i] = personasNombre[i].replace(personasNombre[i], "");
					}
				}
				parada = 0;
				for (byte i = 0; i < personas.length; i++) {
					if (personas[i].contains("Null")) {
						parada++;
					}
				}

			}

		}

		System.out.println("¡Has adivinado a la persona! era " + Funciones.imprimeArray(personasNombre));
	}
}
