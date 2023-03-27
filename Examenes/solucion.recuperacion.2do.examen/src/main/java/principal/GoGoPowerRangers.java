package principal;

import java.util.Scanner;

import enums.Color;
import excepciones.NombreConNumerosException;
import excepciones.NombreZordInvalidoException;
import clases.Zord;
import clases.Base;
import clases.PowerRanger;
import java.util.ArrayList;

public class GoGoPowerRangers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Zord> zordsBase = new ArrayList<Zord>();

		String nombreZord;
		try {
			zordsBase.add(new Zord("Rojonzord", Color.ROJO));
			zordsBase.add(new Zord("Tiranozord", Color.ROJO));
			zordsBase.add(new Zord("Mastodonzord", Color.NEGRO));
			zordsBase.add(new Zord("Tricerazord", Color.AZUL));
			zordsBase.add(new Zord("Sabrezord", Color.AMARILLO));
			zordsBase.add(new Zord("Pterodactzord", Color.ROSA));
			zordsBase.add(new Zord("Dragonzord", Color.VERDE));
			zordsBase.add(new Zord("Tigrezord", Color.BLANCO));
		} catch (NombreZordInvalidoException e) {
			System.err.println(e);
		} catch (NombreConNumerosException e) {
			System.err.println(e);
		}

		Base centroDeMando = null;
		try {
			centroDeMando = new Base("Centro de Mando", zordsBase);
		} catch (NombreConNumerosException e) {
			System.err.println(e);
		} catch (NombreZordInvalidoException e) {
			System.err.println(e);
		}

		System.out.println(Color.imprimirMenuSeleccionColor());
		boolean colorOk = false;
		byte opcion = 0;
		do {
			try {
				System.out.println("Dime el color que quieres para tu Zord");
				opcion = Byte.parseByte(sc.nextLine());
				colorOk = true;
			} catch (NumberFormatException e) {
				System.err.println(e);
			}
		} while (!colorOk);
		colorOk = false;
		Color colorZord = Color.opcionNumericaAColor(opcion);

		boolean nombreOk = false;
		do {
			try {
				System.out.println("Dime el nombre de un nuevo zord");
				nombreZord = sc.nextLine();
				centroDeMando.getZordsAlmacenados().add(new Zord(nombreZord, colorZord));
				nombreOk = true;
			} catch (NombreConNumerosException e) {
				e.printStackTrace();
			} catch (NombreZordInvalidoException e) {
				e.printStackTrace();
			}
		} while (!nombreOk);
		nombreOk = false;

		System.out.println(Color.imprimirMenuSeleccionColor());
		do {
			try {
				System.out.println("Dime el color que quieres para tu PowerRangers");
				opcion = Byte.parseByte(sc.nextLine());
				colorOk = true;
			} catch (NumberFormatException e) {
				System.err.println(e);
			}
		} while (!colorOk);
		Color colorRanger = Color.opcionNumericaAColor(opcion);

		PowerRanger ranger = null;
		do {
			try {
				System.out.println("Dime el nombre del Power Ranger");
				String nombreRanger = sc.nextLine();
				ranger = new PowerRanger(nombreRanger, colorRanger);
				nombreOk = true;
			} catch (NombreConNumerosException e) {
				System.err.println(e);
			} catch (NombreZordInvalidoException e) {
				System.err.println(e);
			}
		} while (!nombreOk);

		ranger.asignarZord(centroDeMando);
		System.out.println(ranger + "\n");
		ranger.devolverZord(centroDeMando);
		System.out.println(ranger);

	}

}
