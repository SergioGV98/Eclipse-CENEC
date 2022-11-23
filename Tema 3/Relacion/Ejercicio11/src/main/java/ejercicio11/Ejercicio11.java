package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String texto, texto2, texto3, texto4;
		
		System.out.println("Escribeme el texto 1");
		texto = sc.nextLine();
		
		System.out.println("Escribeme el texto 2");
		texto2 = sc.nextLine();
		
		System.out.println("Escribeme el texto 3");
		texto3 = sc.nextLine();
		
		System.out.println("Escribeme el texto 4");
		texto4 = sc.nextLine();
		
		System.out.println(Funciones.mayorString(texto, texto2, texto3, texto4));
		
	}

}
