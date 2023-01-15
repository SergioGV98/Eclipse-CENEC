package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

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
		
		while (!(personas.length == 1)) {

			System.out.println("Te voy a monstrar las personas restantes.");
			for (byte i = 0; i < personasNombre.length; i++) {
				System.out.println(personasNombre[i]);
			}
			System.out.println("Las caracteristicas que vas a pedir, ¿Estan o NO estan? (S o N)");

			char opcionCaracteristica = sc.nextLine().toUpperCase().charAt(0);

			if (opcionCaracteristica == 'S') {

				System.out.println("\n\t 1 - Es Hombre" + "\n\t 2 - Es Mujer" + "\n\t 3 - Tiene Gafas"
						+ "\n\t 4 - Tiene un Collar" + "\n\t 5 - Tiene Sombrero" + "\n\t 6 - Tiene Pelo Rubio"
						+ "\n\t 7 - Tiene Pelo Moreno" + "\n\t 8 - Tiene Ojos Marrones" + "\n\t 9 - Tiene Ojos Verdes"
						+ "\n\t 10 - Tiene Ojos Azules" + "\n\t 11 - Tiene Barba");

				byte opcion = Byte.parseByte(sc.nextLine());
				switch (opcion) {
				case 1:
					System.out.println("Has elegido que la persona es un hombre.");
					for (byte i = 0; i < personas.length; i++) {
						if (personas[i].contains("Mujer")) {
							personasNombre[i] = personasNombre[i].replaceAll(personasNombre[i], "");
						}
					}
					break;
				case 2:
					System.out.println("Has elegido que la persona es una mujer.");

					break;
				case 3:
					System.out.println("Has elegido que la persona tiene gafas.");

					break;
				case 4:
					System.out.println("Has elegido que la persona tiene un collar.");

					break;
				case 5:
					System.out.println("Has elegido que la persona tiene un sombrero.");
					for (byte i = 0; i < personas.length; i++) {
						if (!(personas[i].contains("Sombrero"))) {
							personasNombre[i] = personasNombre[i].replaceAll(personasNombre[i], "");
						}
					}
					break;
				case 6:
					System.out.println("Has elegido que la persona tiene pelo rubio.");

					break;
				case 7:
					System.out.println("Has elegido que la persona tiene pelo moreno.");

					break;
				case 8:
					System.out.println("Has elegido que la persona tiene ojos marrones.");

					break;
				case 9:
					System.out.println("Has elegido que la persona tiene ojos verdes.");

					break;
				case 10:
					System.out.println("Has elegido que la persona tiene ojos azules.");

					break;
				case 11:
					System.out.println("Has elegido que la persona tiene barba.");

					break;
				}

			} else {

			}

		}

		System.out.println("¡Has adivinado a la persona!");

	}

}
