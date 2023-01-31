package goblin;

import java.util.Random;
import java.util.Scanner;

public class Funciones1D {

	public static void jugar(String nombreJugador, char generoJugador) {
		Random r = new Random();
		System.out.println("Bienvenid" + Funciones.terminacionGenero(generoJugador, true) + ", " + nombreJugador
				+ " al Ataque de los Goblin 1D");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el tamaño que tendra el tablero");
		byte tamaño = Byte.parseByte(sc.nextLine());

		String[] tablero = Funciones1D.creaTablero(tamaño);

		String iconoJugador = (generoJugador == 'm' ? "👨" : generoJugador == 'f' ? "👩" : "웃");

		byte posJugador = 0;

		tablero[posJugador] = iconoJugador;

		for (byte i = (byte) ((tablero.length * 2) / 3); i < tablero.length; i++) {
			tablero[i] = "👺";
		}

		for (short i = 0; i < 1000; i++) {

			Funciones1D.intercambiaPosicion((byte) (r.nextInt(tablero.length)), (byte) (r.nextInt(tablero.length)),
					tablero);
		}

		System.out.println(Funciones1D.imprime(tablero));
	}

	public static String[] creaTablero(byte tamaño) {

		String tablero[] = new String[tamaño];

		for (byte i = 0; i < tamaño; i++) {
			tablero[i] = "♒";
		}

		return tablero;

	}

	public static String imprime(String[] array) {

		Random r = new Random();
		String[] icono = { "♨", "🏞", "🌀", "🍙" };
		String ret = "";
		for (byte i = 0; i < array.length + 2; i++) {
			ret += icono[r.nextInt(icono.length)];
		}
		ret += "\n" + icono[r.nextInt(icono.length)];

		for (byte i = 0; i < array.length; i++) {
			ret += array[i];
		}

		ret += icono[r.nextInt(icono.length)] + "\n";

		for (byte i = 0; i < array.length + 2; i++) {
			ret += icono[r.nextInt(icono.length)];
		}

		return ret;

	}

	public static void intercambiaPosicion(byte p1, byte p2, String[] tablero) {

		String g = tablero[p1];
		tablero[p1] = tablero[p2];
		tablero[p2] = g;

	}

}
