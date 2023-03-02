package main;

public class Funciones {

	// Ejercicio 2
	public static char[][] matrizChar(byte [] vector) {

		char arr [][] = new char[vector.length][];
		
		arr[0] = new char[vector[0]];
		arr[1] = new char[vector[1]];
		arr[2] = new char[vector[2]];
		arr[3] = new char[vector[3]];
		arr[4] = new char[vector[4]];
		
		for(byte i = 0; i < arr.length; i++) {
			for(byte j = 0; j < arr[i].length; j++) {
				arr[i][j] = '#';
			}
		}
		
		return arr;
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

}
