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

		String iconoJugador = (generoJugador == 'm' ? "H" : generoJugador == 'f' ? "M" : "웃");

		// En posJugador[0] fila y en posJugador[1] la columna
		byte[] posJugador = { 0, 0 };

		tablero[posJugador[0]][posJugador[1]] = iconoJugador;

		for (byte i = (byte) ((tablero.length * 2) / 3); i < tablero.length; i++) {
			for (byte j = (byte) ((tablero.length * 2) / 3); j < tablero[i].length; j++) {
				tablero[i][j] = "G";
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
		System.out.println(Funciones2D.goblinsAlrededor(tablero, posJugador));
	}

	public static String[][] creaTablero(byte tamaño) {

		String tablero[][] = new String[tamaño][tamaño];

		for (byte i = 0; i < tamaño; i++) {
			for (byte j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = "_";
			}
		}

		return tablero;

	}

	public static String imprime(String[][] matriz) {

		Random r = new Random();
		String[] icono = { "Z", "X", "C", "V" };
		String ret = "";

		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += icono[r.nextInt(icono.length)] + " ";
		}
		ret += "\n";

		for (byte i = 0; i < matriz.length; i++) {
			ret += icono[r.nextInt(icono.length)];
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += icono[r.nextInt(icono.length)] + " ";
			ret += "\n";
		}
		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += icono[r.nextInt(icono.length)] + " ";
		}

		return ret;
	}

	public static void intercambiaPosicion(String[][] tablero, byte f0, byte c0, byte f1, byte c1) {

		String g = tablero[f0][c0];
		tablero[f0][c0] = tablero[f1][c1];
		tablero[f1][c1] = g;

	}

	public static byte goblinsAlrededor(String[][] matriz, byte[] posJugador) {

		byte contador = 0;
		byte fila = posJugador[0];
		byte columna = posJugador[1];

		  // Verificar arriba
	    if (fila - 1 >= 0 && !matriz[fila - 1][columna].equals("")) {
	        contador++;
	    }
	    // Verificar abajo
	    if (fila + 1 < matriz.length && !matriz[fila + 1][columna].equals("")) {
	        contador++;
	    }
	    // Verificar a la izquierda
	    if (columna - 1 >= 0 && !matriz[fila][columna - 1].equals("")) {
	        contador++;
	    }
	    // Verificar a la derecha
	    if (columna + 1 < matriz[0].length && !matriz[fila][columna + 1].equals("")) {
	        contador++;
	    }
	    // Verificar arriba a la izquierda
	    if (fila - 1 >= 0 && columna - 1 >= 0 && !matriz[fila - 1][columna - 1].equals("")) {
	        contador++;
	    }
	    // Verificar arriba a la derecha
	    if (fila - 1 >= 0 && columna + 1 < matriz[0].length && !matriz[fila - 1][columna + 1].equals("")) {
	        contador++;
	    }
	    // Verificar abajo a la izquierda
	    if (fila + 1 < matriz.length && columna - 1 >= 0 && !matriz[fila + 1][columna - 1].equals("")) {
	        contador++;
	    }
	    // Verificar abajo a la derecha
	    if (fila + 1 < matriz.length && columna + 1 < matriz[0].length && !matriz[fila + 1][columna + 1].equals("")) {
	        contador++;
	    }

	    return contador;
	}
}
