package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String palabra;
		
		System.out.println("Escribe cualquier palabra y te pondra la primera letra en mayuscula");
		palabra = sc.nextLine();
		
		String resultado = "" + palabra.toUpperCase().charAt(0);
		for (short i = 1; i < palabra.length(); i++) {
			resultado += palabra.toLowerCase().charAt(i);
		}
		System.out.println(resultado);
	}

}
