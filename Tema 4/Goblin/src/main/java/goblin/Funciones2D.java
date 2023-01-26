package goblin;

import java.util.Scanner;

public class Funciones2D {

	public static void jugar(String nombreJugador, char generoJugador) {
		System.out.println("Bienvenid"+Funciones.terminacionGenero(generoJugador, true) +
				", " +nombreJugador+" al Ataque de los Goblin 2D");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el tamaño que tendra el tablero");
		byte tamaño = Byte.parseByte(sc.nextLine());
	}
	
	public static String[][] creaTablero(byte tamaño) {

		String tablero[][] = new String[tamaño][tamaño];

		for (byte i = 0; i < tamaño; i++) {
			for(byte j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = "_";
			}
		}

		return tablero;

	}
}
