package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte n1, n2;
		
		System.out.println("Dime el Numero 1");
		n1 = Byte.parseByte(sc.nextLine());

		System.out.println("Dime el Numero 2");
		n2 = Byte.parseByte(sc.nextLine());
		
		System.out.println("La media es: " + Funciones.media(n1, n2));
	}

}
