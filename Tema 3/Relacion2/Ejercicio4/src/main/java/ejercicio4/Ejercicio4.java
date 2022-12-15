package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Escribeme un texto");
		String original = sc.nextLine();
		
		System.out.println("Escribeme otro texto");
		String subOriginal = sc.nextLine();
		
		System.out.println(Funciones.loQueQueda(original, subOriginal));
		

	}

}
