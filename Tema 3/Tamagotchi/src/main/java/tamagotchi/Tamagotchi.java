package tamagotchi;

import java.util.Scanner;

/*
 * Sergio García Vico
 */

public class Tamagotchi {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		byte razaElegida = 0;
		String nombre = " ";
		short hambre = 50, sueño = 50, higiene = 50, diversion = 50, paseo = 50, mate = 50;
		byte turnos = 0;
		byte accion = 0;

		// Bucle para conseguir la raza
		do {

			System.out.println(imprimeMenu.menu());

			razaElegida = Byte.parseByte(sc.nextLine());

			switch (razaElegida) {

			case 1:
				System.out.println("Has elegido un Perro para tu Tamagotchi");
				break;

			case 2:
				System.out.println("Has elegido un Gato para tu Tamagotchi");
				break;

			case 3:
				System.out.println("Has elegido un Hipopótamo para tu Tamagotchi");
				break;

			case 4:
				System.out.println("Has elegido un Carpincho para tu Tamagotchi");
				break;
			}

			if (razaElegida >= 5) {
				System.out.println("Debes elegir entre las opciones (1-4)");
			}

		} while (razaElegida >= 5);

		// Nombre sin numeros
		while (nombre.contains("0") || nombre.contains("1") || nombre.contains("2") || nombre.contains("3")
				|| nombre.contains("4") || nombre.contains("5") || nombre.contains("6") || nombre.contains("7")
				|| nombre.contains("8") || nombre.contains("9") || nombre.contains(" ")) {
			System.out.println("Dime un nombre para tu Tamagotchi");
			nombre = sc.nextLine();
		}

		// Perro
		if (razaElegida == 1) {
			while (razaElegida == 1 && hambre != 0 && sueño != 0 && higiene != 0 && diversion != 0 && paseo != 0
					&& turnos < 30) {
				System.out.println("El turno actual es " + turnos);
				turnos++;

				System.out.println("Las estadisticas de tu tamagotchi son: ");

				if (razaElegida == 1) {
					System.out.println(nombre + " el Perro");
					System.out.println("------------------------------");
					if (hambre >= 100) {
						System.out.println("Hambre: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Hambre: " + hambre);
					}
					if (sueño >= 100) {
						System.out.println("Sueño: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Sueño: " + sueño);
					}
					if (higiene >= 100) {
						System.out.println("Higiene: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Higiene: " + higiene);
					}
					if (diversion >= 100) {
						System.out.println("Diversion: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Diversion: " + diversion);
					}
					if (paseo >= 100) {
						System.out.println("Paseo: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Paseo: " + paseo);
					}
				}

				System.out.println("Elige una de las siguientes acciones: " + "\n\t1 - Alimentar" + "\n\t2 - Dormir"
						+ "\n\t3 - Lavar" + "\n\t4 - Jugar" + "\n\t5 - Pasear");

				System.out.println("Elige una accion");
				accion = Byte.parseByte(sc.nextLine());
				while (accion >= 6) {
					System.out.println("Debes elegir entre las opciones (1-5)");
					accion = Byte.parseByte(sc.nextLine());
				}

				switch (accion) {

				case 1:
					System.out.println("Has elegido alimentar a tu Tamagotchi");
					hambre += 20;
					sueño -= 10;
					higiene -= 10;
					diversion -= 10;
					paseo -= 10;
					break;

				case 2:
					System.out.println("Has elegido dormir a tu Tamagotchi");
					hambre -= 10;
					sueño += 20;
					higiene -= 10;
					diversion -= 10;
					paseo -= 10;
					break;

				case 3:
					System.out.println("Has elegido lavar a tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene += 20;
					diversion -= 10;
					paseo -= 10;
					break;

				case 4:
					System.out.println("Has elegido jugar con tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene -= 10;
					diversion += 20;
					paseo -= 10;
					break;

				case 5:
					System.out.println("Has elegido pasear a tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene -= 10;
					diversion -= 10;
					paseo += 20;
					break;
				}

				if (hambre <= 0 || sueño <= 0 || higiene <= 0 || diversion <= 0 || paseo <= 0 || turnos > 30) {
					System.out.println("Tu tamagotchi ha muerto");
					if (hambre <= 0) {
						System.out.println("Tu tamagotchi ha muerto de hambre");
					}
					if (sueño <= 0) {
						System.out.println("Tu tamagotchi ha muerto de sueño");
					}
					if (higiene <= 0) {
						System.out.println("Tu tamagotchi ha muerto por falta higiene");
					}
					if (diversion <= 0) {
						System.out.println("Tu tamagotchi ha muerto por falta de diversion");
					}
					if (paseo <= 0) {
						System.out.println("Tu tamagotchi ha muerto porque no lo has sacado de paseo");
					}
					if (turnos > 30) {
						System.out.println("Tu tamagotchi ha muerto de viejo");
					}
				}

			}
		}

		// Gato
		if (razaElegida == 2) {
			while (razaElegida == 2 && hambre != 0 && sueño != 0 && higiene != 0 && diversion != 0 && turnos < 30) {
				System.out.println("El turno actual es " + turnos);
				turnos++;

				System.out.println("Las estadisticas de tu tamagotchi son: ");

				if (razaElegida == 2) {
					System.out.println(nombre + " el Gato");
					System.out.println("------------------------------");
					if (hambre >= 100) {
						System.out.println("Hambre: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Hambre: " + hambre);
					}
					if (sueño >= 100) {
						System.out.println("Sueño: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Sueño: " + sueño);
					}
					if (higiene >= 100) {
						System.out.println("Higiene: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Higiene: " + higiene);
					}
					if (diversion >= 100) {
						System.out.println("Diversion: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Diversion: " + diversion);
					}
				}

				System.out.println("Elige una de las siguientes acciones: " + "\n\t1 - Alimentar" + "\n\t2 - Dormir"
						+ "\n\t3 - Lavar" + "\n\t4 - Jugar");

				System.out.println("Elige una accion");
				accion = Byte.parseByte(sc.nextLine());
				while (accion >= 5) {
					System.out.println("Debes elegir entre las opciones (1-4)");
					accion = Byte.parseByte(sc.nextLine());
				}

				switch (accion) {

				case 1:
					System.out.println("Has elegido alimentar a tu Tamagotchi");
					hambre += 20;
					sueño -= 10;
					higiene -= 10;
					diversion -= 10;
					break;

				case 2:
					System.out.println("Has elegido dormir a tu Tamagotchi");
					hambre -= 10;
					sueño += 20;
					higiene -= 10;
					diversion -= 10;
					break;

				case 3:
					System.out.println("Has elegido lavar a tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene += 20;
					diversion -= 10;
					break;

				case 4:
					System.out.println("Has elegido jugar con tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene -= 10;
					diversion += 20;
					break;
				}

				if (hambre <= 0 || sueño <= 0 || higiene <= 0 || diversion <= 0 || turnos > 30) {
					System.out.println("Tu tamagotchi ha muerto");
					if (hambre <= 0) {
						System.out.println("Tu tamagotchi ha muerto de hambre");
					}
					if (sueño <= 0) {
						System.out.println("Tu tamagotchi ha muerto de sueño");
					}
					if (higiene <= 0) {
						System.out.println("Tu tamagotchi ha muerto por falta higiene");
					}
					if (diversion <= 0) {
						System.out.println("Tu tamagotchi ha muerto por falta de diversion");
					}
					if (turnos > 30) {
						System.out.println("Tu tamagotchi ha muerto de viejo");
					}
				}

			}

		}

		// Hipopótamo
		if (razaElegida == 3) {
			while (razaElegida == 3 && hambre != 0 && sueño != 0 && higiene != 0 && diversion != 0 && turnos < 30) {
				System.out.println("El turno actual es " + turnos);
				turnos++;

				System.out.println("Las estadisticas de tu tamagotchi son: ");

				if (razaElegida == 3) {
					System.out.println(nombre + " el Hipopótamo");
					System.out.println("------------------------------");
					if (hambre >= 100) {
						System.out.println("Hambre: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Hambre: " + hambre);
					}
					if (sueño >= 100) {
						System.out.println("Sueño: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Sueño: " + sueño);
					}
					if (higiene >= 100) {
						System.out.println("Higiene: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Higiene: " + higiene);
					}
					if (diversion >= 100) {
						System.out.println("Diversion: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Diversion: " + diversion);
					}
				}

				System.out.println("Elige una de las siguientes acciones: " + "\n\t1 - Alimentar" + "\n\t2 - Dormir"
						+ "\n\t3 - Lavar" + "\n\t4 - Jugar");

				System.out.println("Elige una accion");
				accion = Byte.parseByte(sc.nextLine());
				while (accion >= 5) {
					System.out.println("Debes elegir entre las opciones (1-4)");
					accion = Byte.parseByte(sc.nextLine());
				}

				switch (accion) {

				case 1:
					System.out.println("Has elegido alimentar a tu Tamagotchi");
					hambre += 20;
					sueño -= 10;
					higiene -= 10;
					diversion -= 10;
					break;

				case 2:
					System.out.println("Has elegido dormir a tu Tamagotchi");
					hambre -= 10;
					sueño += 20;
					higiene -= 10;
					diversion -= 10;
					break;

				case 3:
					System.out.println("Has elegido lavar a tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene += 20;
					diversion -= 10;
					break;

				case 4:
					System.out.println("Has elegido jugar con tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene -= 10;
					diversion += 20;
					break;
				}

				if (hambre <= 0 || sueño <= 0 || higiene <= 0 || diversion <= 0 || turnos > 30) {
					System.out.println("Tu tamagotchi ha muerto");
					if (hambre <= 0) {
						System.out.println("Tu tamagotchi ha muerto de hambre");
					}
					if (sueño <= 0) {
						System.out.println("Tu tamagotchi ha muerto de sueño");
					}
					if (higiene <= 0) {
						System.out.println("Tu tamagotchi ha muerto por falta higiene");
					}
					if (diversion <= 0) {
						System.out.println("Tu tamagotchi ha muerto por falta de diversion");
					}
					if (turnos > 30) {
						System.out.println("Tu tamagotchi ha muerto de viejo");
					}
				}

			}
		}

		// Carpincho
		if (razaElegida == 4) {

			while (razaElegida == 4 && hambre != 0 && sueño != 0 && higiene != 0 && diversion != 0 && paseo != 0
					&& turnos < 30) {
				System.out.println("El turno actual es " + turnos);
				turnos++;

				System.out.println("Las estadisticas de tu tamagotchi son: ");

				if (razaElegida == 4) {
					System.out.println(nombre + " el Carpincho");
					System.out.println("------------------------------");
					if (hambre >= 100) {
						System.out.println("Hambre: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Hambre: " + hambre);
					}
					if (sueño >= 100) {
						System.out.println("Sueño: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Sueño: " + sueño);
					}
					if (higiene >= 100) {
						System.out.println("Higiene: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Higiene: " + higiene);
					}
					if (diversion >= 100) {
						System.out.println("Diversion: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Diversion: " + diversion);
					}
					if (mate >= 100) {
						System.out.println("Mate: 100 (Ha llegado al maximo)");
					} else {
						System.out.println("Mate: " + mate);
					}
				}

				System.out.println("Elige una de las siguientes acciones: " + "\n\t1 - Alimentar" + "\n\t2 - Dormir"
						+ "\n\t3 - Lavar" + "\n\t4 - Jugar" + "\n\t5 - Mate");

				System.out.println("Elige una accion");
				accion = Byte.parseByte(sc.nextLine());
				while (accion >= 6) {
					System.out.println("Debes elegir entre las opciones (1-5)");
					accion = Byte.parseByte(sc.nextLine());
				}

				switch (accion) {

				case 1:
					System.out.println("Has elegido alimentar a tu Tamagotchi");
					hambre += 20;
					sueño -= 10;
					higiene -= 10;
					diversion -= 10;
					mate -= 10;
					break;

				case 2:
					System.out.println("Has elegido dormir a tu Tamagotchi");
					hambre -= 10;
					sueño += 20;
					higiene -= 10;
					diversion -= 10;
					mate -= 10;
					break;

				case 3:
					System.out.println("Has elegido lavar a tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene += 20;
					diversion -= 10;
					mate -= 10;
					break;

				case 4:
					System.out.println("Has elegido jugar con tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene -= 10;
					diversion += 20;
					mate -= 10;
					break;

				case 5:
					System.out.println("Has elegido dar mate a tu Tamagotchi");
					hambre -= 10;
					sueño -= 10;
					higiene -= 10;
					diversion -= 10;
					mate += 20;
					break;
				}

				if (hambre <= 0 || sueño <= 0 || higiene <= 0 || diversion <= 0 || mate <= 0 || turnos > 30) {
					System.out.println("Tu tamagotchi ha muerto");
					if (hambre <= 0) {
						System.out.println("Tu tamagotchi ha muerto de hambre");
					}
					if (sueño <= 0) {
						System.out.println("Tu tamagotchi ha muerto de sueño");
					}
					if (higiene <= 0) {
						System.out.println("Tu tamagotchi ha muerto por falta higiene");
					}
					if (diversion <= 0) {
						System.out.println("Tu tamagotchi ha muerto por falta de diversion");
					}
					if (mate <= 0) {
						System.out.println("Tu tamagotchi ha muerto porque no le has dado mate");
					}
					if (turnos > 30) {
						System.out.println("Tu tamagotchi ha muerto de viejo");
					}
				}

			}
		}

		Muerte.muerte(razaElegida, turnos, nombre);
		

	}

}
