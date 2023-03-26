package solucion.tamagotchi.daw;

import java.util.Scanner;

import clases.Comida;
import clases.Gato;
import clases.Juego;
import clases.Perro;
import clases.Tamagotchi;
import enums.Especie;
import excepciones.NombreSinNumeroExcepcion;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		byte hambre = 0;
		boolean hambreOk = false;
		do {
			try {
				System.out.println(
						"Dame el valor de hambre con el que va empezar tu Tamagotchi (Si le pones un valor de menos de 30, la comida empezara automaticamente a 30)");
				hambre = Byte.parseByte(sc.nextLine());
				hambreOk = true;
			} catch (NumberFormatException e) {
				System.err.println(e);
			}
		} while (!hambreOk);

		Tamagotchi tamagotchi = null;
		String nombre = "";
		boolean nombreOk = false;
		byte opcion;

		do {
			try {
				System.out.println("Dime el nombre del tamagotchi (no puede contener numeros)");
				nombre = sc.nextLine();
					do {
						System.out.println(
								"Dime la especie del tamagotchi\n\t1-Dragón\n\t2-Pollito" + "\n\t3-Perro\n\t4-Gato");
						opcion = Byte.parseByte(sc.nextLine());
					} while (opcion < 1 || opcion > 4);
					switch (opcion) {
					case 1:
						tamagotchi = new Tamagotchi(nombre, Especie.DRAGON);
						break;
					case 2:
						tamagotchi = new Tamagotchi(nombre, Especie.DRAGON);
						break;
					case 3:
						tamagotchi = new Perro(nombre);
						break;
					case 4:
						tamagotchi = new Gato(nombre);
						break;
					}
					nombreOk = true;
			} catch (NombreSinNumeroExcepcion e) {
				System.err.println(e);
			}
		} while (!nombreOk);

		tamagotchi.setHambre(hambre);

		while (tamagotchi.estaVivo()) {
			System.out.println(tamagotchi);
			System.out.println("¿Qué quieres hacer?\n\t1-Comer\n\t2-Dormir\n\t3-Jugar" + "\n\t4-Relajarse"
					+ (tamagotchi.getEspecie() == Especie.GATO ? "\n\t5-Causar Caos" : "")
					+ (tamagotchi.getEspecie() == Especie.PERRO ? "\n\t5-Pasear" : ""));
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				Comida hamburguesa = null;
				do {
					try {
						System.out.println("Dime el nombre de la comida (no puede contener numeros)");
						nombre = sc.nextLine();
						hamburguesa = new Comida(nombre, (byte) 7, (byte) 2);
						nombreOk = true;
					} catch (NombreSinNumeroExcepcion e) {
						System.err.println(e);
					}
				} while (!nombreOk);
				if (hamburguesa != null) {
					tamagotchi.comer(hamburguesa);
					System.out.println(tamagotchi.getNombre() + " ha comido " + hamburguesa.getNombre());
				}
				break;
			case 2:
				tamagotchi.dormir();
				break;
			case 3:
				Juego futbol = null;
				do {
					try {
						System.out.println("Dime el nombre del juego (no puede contener numeros)");
						nombre = sc.nextLine();
						futbol = new Juego(nombre, (byte) 8, (byte) 8);
						nombreOk = true;
					} catch (NombreSinNumeroExcepcion e) {
						System.err.println(e);
					}
				} while (!nombreOk);
				if (futbol != null) {
					tamagotchi.jugar(futbol);
					System.out.println(tamagotchi.getNombre() + " ha jugado a " + futbol.getNombre());
				}
				break;
			case 4:
				tamagotchi.relajarse();
				break;
			case 5:
				if (tamagotchi.getEspecie() == Especie.GATO) {
					((Gato) tamagotchi).causarCaos();
				} else if (tamagotchi.getClass().equals(Perro.class)) {
					((Perro) tamagotchi).pasear();
				}
				break;
			default:
				System.out.println("Esa opcion no es válida");
				break;
			}

		}
		System.out.println("El tamagotchi se ha muerto");

	}

}
