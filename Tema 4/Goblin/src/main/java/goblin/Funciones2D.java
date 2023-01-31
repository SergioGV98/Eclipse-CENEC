package goblin;

import java.util.Random;
import java.util.Scanner;

public class Funciones2D {

	public static void jugar(String nombreJugador, char generoJugador) {
		Random r = new Random();
		System.out.println("Bienvenid" + Funciones.terminacionGenero(generoJugador, true) + ", " + nombreJugador
				+ " al Ataque de los Goblin 2D");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el tamaño que tendra el tablero");
		byte tamaño = Byte.parseByte(sc.nextLine());

		String[][] tablero = Funciones2D.creaTablero(tamaño);

		String iconoJugador = (generoJugador == 'm' ? "👨" : generoJugador == 'f' ? "👩" : "웃"); 

		// En posJugador[0] fila y en posJugador[1] la columna
		byte[] posJugador = { 0, 0 };

		tablero[posJugador[0]][posJugador[1]] = iconoJugador;

		for (byte i = (byte) ((tablero.length * 2) / 3); i < tablero.length; i++) {
			for (byte j = (byte) ((tablero.length * 2) / 3); j < tablero[i].length; j++) {
				tablero[i][j] = "👺";
			}
		}

		for (short i = 0; i < 1000; i++) {
			byte f0 = (byte) (r.nextInt(tablero.length));
			byte c0 = (byte) (r.nextInt(tablero[f0].length));
			byte f1 = (byte) (r.nextInt(tablero.length));
			byte c1 = (byte) (r.nextInt(tablero[f1].length));
			Funciones2D.intercambiaPosicion(tablero, f0, c0, f1, c1);
		}

		System.out.println(Funciones2D.imprime(tablero));
	}

	public static String[][] creaTablero(byte tamaño) {

		String tablero[][] = new String[tamaño][tamaño];

		for (byte i = 0; i < tamaño; i++) {
			for (byte j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = "♒";
			}
		}

		return tablero;

	}

	public static String imprime(String[][] matriz) {

		Random r = new Random();
		String[] icono = { "♨", "🏞", "🌀", "🍙" };
		String ret = "";

		for (byte i = 0; i < matriz.length+2; i++) {
			ret += icono[r.nextInt(icono.length)];
		}
		ret += "\n";

		for (byte i = 0; i < matriz.length; i++) {
			ret += icono[r.nextInt(icono.length)];
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j];
			}
			ret += icono[r.nextInt(icono.length)];
			ret += "\n";
		}
		for (byte i = 0; i < matriz.length+2; i++) {
			ret += icono[r.nextInt(icono.length)];
		}

		return ret;
	}

	public static void intercambiaPosicion(String[][] tablero, byte f0, byte c0, byte f1, byte c1) {

		String g = tablero[f0][c0];
		tablero[f0][c0] = tablero[f1][c1];
		tablero[f1][c1] = g;

	}
	
	/**
	 * Funcion compruebe en los alrededores de posJugador cuantas casillas hay 
	 * que tengan u goblin, y devuelva en un byte el nº de goblins que tiene alrededor
	 * @param matriz matriz tablero (usa la de la funcion jugar)
	 * @param posJugador array siempre dedos posiciones. En la posicion 0 esta el nº
	 * de fila donde esta el jugador, y en la posicion 1, el nºde columna donde esta
	 * el jugador
	 * @return que cuenta cuantos goblins ahi alrededor del jugador
	 */
	
	public static byte goblinsAlrededor(String[][] matriz, byte[] posJugador) {
		
		return 1;
	}

}
