package Practica2;

import java.util.Random;

public class Funciones {

	public static boolean insertarEnArray(String[] arr, byte pos, String valor) {
		if (pos < 0 || pos >= arr.length) {
			return false;
		}
		arr[pos] = valor;
		return true;
	}

	public static void intercambiarPalabra(char[] intercambio, byte posicion1, byte posicion2) {
		char letra = intercambio[posicion1];
		intercambio[posicion1] = intercambio[posicion2];
		intercambio[posicion2] = letra;

	}

	public static String imprimeArray(char[] arr) {
		String nuevo = "";
		for (char elemento : arr) {
			nuevo += elemento;

		}
		return nuevo;
	}

	public static char[] copiaArray(char[] orig) {
		char[] copia = new char[orig.length];
		for (byte i = 0; i < copia.length; i++) {
			copia[i] = orig[i];
		}
		return copia;
	}

	public static String[][] ciudad(byte tamaño) {
		String[][] matriz = new String[tamaño][tamaño];
		for (byte j = 0; j < tamaño; j++) {
			matriz[tamaño - 1][j] = "🌃";
		}
		return matriz;
	}

	public static void solAleatorio(String[][] matriz) {
		Random ran = new Random();
		matriz[0][ran.nextInt(matriz[0].length)] = "☀";
	}

	public static byte ponerAgua(String[][] matriz) {
		byte contador = 0;

		if (4 == matriz.length) {
			for (byte i = 0; i < matriz[0].length; i++) {
				matriz[1][i] = "♒";
				matriz[2][i] = "🌊";
			}
			return 0;
		} else if (5 == matriz.length||6 == matriz.length) {
			for (byte i = 0; i < matriz[0].length; i++) {
				matriz[2][i] = "♒";
				matriz[3][i] = "🌊";
			}
			return (byte)(matriz.length-4);
		}  else if (matriz.length >= 7) {
			for (byte i = 0; i < matriz[0].length; i++) {
				matriz[3][i] = "♒";
				matriz[matriz.length - 3][i] = "🌊";
			}
			return (byte)(matriz.length-4);
		} else {
			return -1;
		}

	}

	public static void colocarElementos(String[][] matriz) {
		Random ran = new Random();
		String[] barcoSurf = { "  ", "🏄", "⛵" };
	
		for (byte i = 0; i < matriz.length; i++) {
			if (matriz[1][i]!=null) {
				for (byte j = 0; j < 4; j++) {
					matriz[1][ran.nextInt(matriz[0].length)] = "☁";
				}
				break;
			}
		}
		boolean conElementos=false;
		for (byte i = 0; i < matriz.length; i++) {
			if (matriz[2][i]!=null) {
				conElementos=true;
				break;
			}
		}
		if(!conElementos) {
			matriz[2][ran.nextInt(matriz[2].length)] = " ⛴";
			matriz[2][ran.nextInt(matriz[2].length)] = " ⛴";
		}
		
		conElementos=false;
		for (byte i = 0; i < matriz[0].length; i++) {
			if (matriz[matriz.length - 2][i]!=null) {
				conElementos=true;
				break;
			}
		}
		if(!conElementos) {
			for (byte i = 0; i < matriz[0].length; i++) {
				matriz[matriz.length - 2][i] = (ran.nextBoolean()?"⛱":null);
			}
		}

		byte posOla=0;
		byte posMar=0;
		for(byte i=0;i<matriz.length;i++) {
			if(matriz[i][0]!=null&&matriz[i][0].equals("🌊")) {
				posOla=i;
			}
			if(matriz[i][0]!=null&&matriz[i][0].equals("♒")) {
				posMar=i;
			}
		}
		for(byte i=(byte)(posMar+1);i<posOla;i++) {
			for(byte j=0;j<matriz[i].length;j++) {
				matriz[i][j]=barcoSurf[ran.nextInt(barcoSurf.length)];
			}
		}

	}

	public static char[][] crearSopa(byte nFilas, byte nColumnas) {
		Random ran = new Random();
		char[][] matriz = new char[nFilas][nColumnas];
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (char) ran.nextInt('a', 'z' + 1);
			}
		}
		return matriz;

	}

	public static boolean introducirPalabra(char[][] sopa, String palabra, byte posX, byte posY) {
		if (posY + palabra.length() - 1 < sopa[0].length) {
			for (byte i = 0; i < palabra.length(); i++) {
				sopa[posX][posY + i] = palabra.charAt(i);
			}
			return true;

		} else {
			return false;
		}
		// Aqui no llega papasito

	}
}
