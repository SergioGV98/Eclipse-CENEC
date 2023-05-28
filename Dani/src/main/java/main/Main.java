package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		System.out.println("Ingresa una frase");
		frase = sc.nextLine();
		
		contarCaracteres(frase);
		

	}
	
	public static void contarCaracteres(String frase) {
		 
		char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] contadores = new int[abecedario.length];
 
		for (int i = 0; i < frase.length(); i++) {

			char caracter = frase.toLowerCase().charAt(i);

			for (int j = 0; j < abecedario.length; j++) {
				if (caracter == abecedario[j])
					contadores[j]++;
			}
		}

		for (int i = 0; i < contadores.length; i++) {
			if (contadores[i] > 0) {
				System.out.println("La letra " + abecedario[i] + " aparece " + contadores[i] + " veces.");
			}
		}
	}

}
