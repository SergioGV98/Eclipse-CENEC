package horadeaventura.sgv;

import java.util.Scanner;

public class HoraDeAventura {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		byte opcionElegida = 0;
		byte subElegida = 0;
		byte subElegida2 = 0;

		// Empieza la aventura
		System.out.println("Estamos en CENEC un pacifico dia en clase." + "\n Y de repente, cae del tragaluz"
				+ "una jirafa con gafas de sol y manos, \n"
				+ "Una botella de vodka en una mano y una bandurria en la otra mano" + "\n ¿Como reaccionas?" 
				+"\n\t1 - Decirle: ¡Vamonos de fiesta!" 
				+ "\n\t2 - Intentar robarle el vozkza"
				+ "\n\t3 - Pegarle con la bandurria en la cabeza");

		while (opcionElegida != 1 && opcionElegida != 2 && opcionElegida != 3) {
			// Opcion elegida [1-3]
			System.out.println("Elige una opcion del [1-3]");
			opcionElegida = Byte.parseByte(sc.nextLine());
		}

		// Opcion elegida 1
		if (opcionElegida == 1) {
			System.out.println("Jirafa: " + "¿De fiesta?");
			System.out.println("Jirafa: " + "Me acabo de caer por un tragaluz, estoy molida. \n"
					+ "Claro, ves una jirafa con vodka y te quieres ir de fiesta, \n"
					+ "pero nadie pregunta cómo está la jirafa después de caerse.");

			// Opcion elegida 1 Eleccion 1 y 2
			System.out.println("¿Qué haces?" 
					+ "\n\t1 - Jirafa tia, lo siento, ¿Estás bien?"
					+ "\n\t2 - ¿Y tu me has preguntado como estoy yo?");

			while (subElegida != 1 && subElegida != 2) {
				System.out.println("Elige una opcion del [1-2]");
				subElegida = Byte.parseByte(sc.nextLine());
			}

			switch (subElegida) {

			case 1:
				System.out.println("Jirafa: " + "¿Puedes llamar a una ambulancia?");
				break;
			case 2:
				System.out.println("Porque yo necesito irme de fiesta.");
				System.out.println("Jirafa: " + "Pues toma el vodka y vete.\n" + "*Te tira el vodka a la cara*\n"
						+ "*Te vas de fiesta con la nariz rota por un vodkazo.*");
				break;
			}
		}

		// Opcion elegida 2
		if (opcionElegida == 2) {
			System.out.println("Jirafa: " + "Es mi vodka, mequetrefe.\n" + "*La girafa te da un cabezado*");

			// Opcion elegida 2 Eleccion 1 y 2
			System.out.println("¿Qué haces?" 
				+ "\n\t1 - Le hago un RKO" 
				+ "\n\t2 - Salgo corriendo.");

			subElegida2 = Byte.parseByte(sc.nextLine());

			while (subElegida2 != 1 && subElegida2 != 2) {
				System.out.println("Elige una opcion del [1-2]");
				subElegida2 = Byte.parseByte(sc.nextLine());
			}

			switch (subElegida2) {

			case 1:
				System.out.println("*Le haces un RKO, increible y le partes el cuello a la jirafa.*");
				break;
			case 2:
				System.out.println(
						"*Sales corriendo y la jirafa te persige, acabas muriendo de un infarto por correr tanto*");
				break;
			}
		}

		// Opcion elegida 3
		if (opcionElegida == 3) {
			System.out.println("*Le metes con la bandurria en la cabeza y decides hacerte "
					+ "el mejor solo de la historia la gente de alrededor que te esta mirando "
					+ "le recuerdas al loco de la pelicula Whiplash*");
		}

	}

}
