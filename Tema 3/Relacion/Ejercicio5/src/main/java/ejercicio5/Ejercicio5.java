package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String textoIntroducido = "";
		
		System.out.println("Escriebeme un texto y te renplazare ciertas palabras por numeros");
		textoIntroducido = " " + sc.nextLine() + " ";
			
		System.out.println(Funciones.remplazarTexto(textoIntroducido));
		
	}

}
