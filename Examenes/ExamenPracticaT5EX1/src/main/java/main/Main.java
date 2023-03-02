package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero (T)");
		byte t = Byte.parseByte(sc.nextLine());
		System.out.println("Dime un numero (A)");
		byte a = Byte.parseByte(sc.nextLine());
		
		// Ejercicio 1 
		Boolean arr [] = new Boolean[t];
		
		for(byte i = 0; i < arr.length; i++) {
			if(i%a == 0) {
				arr[i] = true;
			} else {
				arr[i] = false;
			}
		}
		
		System.out.print("{");
		for(byte i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.print("}");

		// Ejercicio 2
		byte vector[] = {3,1,3,1,3};
		
		char ej2 [][] = Funciones.matrizChar(vector);
		
		System.out.println("\n" + Funciones.imprimeMatriz(ej2));
		
		
		// Ejercicio 3
	}

}
