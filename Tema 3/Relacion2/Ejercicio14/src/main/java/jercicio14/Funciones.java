package jercicio14;

import java.util.Random;

public class Funciones {

	//Funcion que se ha creado miguel
	public static char[] generoAleatorio(byte tamaño) {
		
		char[] miPequeñoArray = new char[tamaño];
		Random r = new Random();
		
		for(byte i = 0; i < miPequeñoArray.length; i++) {
			miPequeñoArray[i] = (char) (r.nextInt(97, 123));
		}
		return miPequeñoArray;
	}
	
	public static String imprimeArray(char [] arr) {
		String ret = "";
		
		for(byte i = 0; i < arr.length; i++) {
			ret += arr[i]+ " ";
		}
		
		return ret;
	}
}
