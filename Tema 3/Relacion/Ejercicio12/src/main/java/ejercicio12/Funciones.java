package ejercicio12;

import java.util.Scanner;

public class Funciones {

	public static char LetraRecursiva() {
		
		Scanner sc = new Scanner(System.in);
		char letra = '0';
		
		while(((letra < 65 || letra > 90) && (letra < 97 || letra > 122) && letra != 'ñ' && letra != 'Ñ')) {
		
			letra = sc.nextLine().toLowerCase().charAt(0);
			
		}
		return letra;
	}
	
	
	
	
}
