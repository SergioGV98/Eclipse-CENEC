package goblin;

import java.util.Random;
import java.util.Scanner;

public class Funciones1D {

	public static void jugar(String nombreJugador, char generoJugador) {
		System.out.println("Bienvenid" + Funciones.terminacionGenero(generoJugador, true) + ", " + nombreJugador
				+ " al Ataque de los Goblin 1D");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el tamaño que tendra el tablero");
		byte tamaño = Byte.parseByte(sc.nextLine());
	}

	public static String[] creaTablero(byte tamaño) {

		String tablero[] = new String[tamaño];

		for (byte i = 0; i < tamaño; i++) {
			tablero[i] = "_";
		}

		return tablero;

	}

	public static String imprime(String[] array) {

		Random r = new Random();

		String ret = "";

		for(byte i = 0; i < array.length+2; i++) {
			ret += r.nextInt(1,5) + " ";
		}
		ret += "\n" + r.nextInt(1,5) + " " ;
		
		for(byte i = 0; i < array.length; i++) {
			ret += "_" + " ";
		}
		
		ret += r.nextInt(1,5) + "\n";
		
		for(byte i = 0; i < array.length+2; i++) {
			ret += r.nextInt(1,5) + " ";
		}
		
		return ret;
		
	}

}
