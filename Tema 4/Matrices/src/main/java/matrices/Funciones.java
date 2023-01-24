package matrices;

import java.util.Random;

public class Funciones {

	public static char[][] creaSopa(byte filas, byte columnas) {
		Random r = new Random();
		char[][] matriz = new char[filas][columnas];
		for (byte i = 0; i < matriz.length; i++) {
			for(byte j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (char) r.nextInt('a',('z'+1));
			}
		}
		return matriz;
	}

	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";
		
		for (byte i = 0; i < matriz.length; i++) {
			for(byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j]+" ";
			}
			ret += "\n";
		}
		
		return ret;
	}
	
	public static boolean insertaPalabra(char [][] matriz, String palabra, byte fila, byte columna) {
		if(columna+palabra.length()-1 < matriz[fila].length) {
			for(byte i = 0; i<palabra.length(); i++) {
				matriz[fila][columna+i] = palabra.toUpperCase().charAt(i);
			}
			return true;
		}
		
		return false;
	}
	
}
