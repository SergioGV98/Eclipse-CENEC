package arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el tamaño del Array");
		byte tamaño = Byte.parseByte(sc.nextLine());
		
		int[] numero = new int[tamaño];
		int suma = 0;
		
		for (byte i = 0; i < numero.length; i++) {
			System.out.println("Numero para el puesto de la Array " + "[" + i + "]");
			numero[i] = Integer.parseInt(sc.nextLine());
			suma += numero[i];
		}
		
		for (byte i = 0; i < numero.length; i++) {
			System.out.println("Array "+"["+i+"]: " + numero[i]);
		}
		System.out.println("\n" + "Media del Array: " +1f*suma/numero.length);

	}
}
