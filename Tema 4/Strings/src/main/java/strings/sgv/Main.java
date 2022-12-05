package strings.sgv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Variables
		String texto = null;

		System.out.println("Dime un texto");
		texto = sc.nextLine();
		System.out.println(texto.strip());
		
		System.out.println(Funciones.mayusculasAleatorias(texto));

		System.out.println("¿Empieza el texto con \"hol \"?" + texto.startsWith("hol"));
		System.out.println("¿Termina el texto con \"o \"?" + texto.endsWith("o"));
		System.out.println("¿Esta en blanco? " + texto.isBlank());
		System.out.println("¿Esta vacia? " + texto.isEmpty());
		System.out.println(Funciones.quitaEspacios(texto));
		System.out.println(texto.repeat(5421));
	}
}
