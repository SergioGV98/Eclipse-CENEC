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
			for (byte j = 0; j < tablero[i].length; j++) {
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
		System.out.println(Funciones2D.goblinsAlrededor(tablero, posJugador, iconoJugador));
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

		for (byte i = 0; i < matriz.length + 2; i++) {
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
		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += icono[r.nextInt(icono.length)];
		}

		return ret;
	}

	public static void intercambiaPosicion(String[][] tablero, byte f0, byte c0, byte f1, byte c1) {

		String g = tablero[f0][c0];
		tablero[f0][c0] = tablero[f1][c1];
		tablero[f1][c1] = g;

	}

	public static byte goblinsAlrededor(String[][] matriz, byte[] posJugador, String iconoJugador) {

		byte contador = 0;

		for(byte i = 0; i < matriz.length; i++) {
			for(byte j = 0; j  < matriz[i].length; j++) {
				if(matriz[i][j] == iconoJugador ) {
					posJugador[0] = i;
					posJugador[1] = j;
				}
			}
		}
		
		for (byte i = (byte) (posJugador[0] - 1); i <= posJugador[0] + 1; i++) {
			for (byte j = (byte) (posJugador[1] - 1); j <= posJugador[1] + 1; j++) {
				if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length
						 && matriz[i][j].equals("👺")) {
					contador++;
				}
			}
		}
		
		
		/*byte fila = posJugador[0];
		byte col = posJugador[1];*/

		
	
/*
		// Vertical hacia arriba
		if (fila - 1 >= 0 && (matriz[fila - 1][col].equals("👺"))) {
			contador++;
		}
		// Vertical hacia abaja
		if (fila + 1 < matriz.length && (matriz[fila + 1][col].equals("👺"))) {
			contador++;
		}
		// Horizontal hacia atras
		if (col - 1 >= 0 && (matriz[fila][col - 1].equals("👺"))) {
			contador++;
		}
		// Horizontal hacia adelante
		if (col + 1 < matriz.length && (matriz[fila][col + 1].equals("👺"))) {
			contador++;
		}
		// Diagonal hacia arriba a la izquierda
		if (fila - 1 >= 0 && col - 1 >= 0 && (matriz[fila - 1][col - 1].equals("👺"))) {
			contador++;
		}
		// Diagonal hacia arriba a la derecha
		if (fila - 1 >= 0 && col + 1 < matriz.length && (matriz[fila - 1][col + 1].equals("👺"))) {
			contador++;
		}
		// Diagonal hacia abajo a la izda
		if (fila + 1 < matriz.length && col - 1 >= 0 && (matriz[fila + 1][col - 1].equals("👺"))) {
			contador++;
		}
		// Diagonal hacia abajo a la derecha
		if (fila + 1 < matriz.length && col + 1 < matriz.length && (matriz[fila + 1][col + 1].equals("👺"))) {
			contador++;
		}*/

		return contador;
	}
}
