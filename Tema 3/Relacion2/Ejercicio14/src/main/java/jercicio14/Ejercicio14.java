package jercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] array = new char[10];
		String vocales = "";
		
		for (byte i = 0; i < array.length; i++) {
			System.out.println("Letra para el puesto de la Array " + "[" + i + "]");
			array[i] = sc.nextLine().charAt(0);
			if(array[i] == 'a' || array[i] == 'e' || array[i] == 'u' || array[i] == 'i' || array[i] == 'o') {
				vocales += array[i];
			}
		}
		
		//System.out.println("Array: " + array); Preguntar a miguel
		System.out.println("Vocales del Array: " + vocales);

	}
}
