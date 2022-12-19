package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribeme una frase y te la voy a cifrar");
		String texto = sc.nextLine();
		System.out.println("Dime el valor del cifrado");
		byte cifrado = Byte.parseByte(sc.nextLine());

		System.out.println("Texto cifrado " + Funciones.cifrado(texto, cifrado, (byte) 0));

	}

}
