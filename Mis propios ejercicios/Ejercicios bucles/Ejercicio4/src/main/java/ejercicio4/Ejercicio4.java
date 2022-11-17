package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte n1;
		byte n2;

		System.out.println("Dime el Numero 1");
		n1 = Byte.parseByte(sc.nextLine());
		System.out.println("Dime el Numero 2");
		n2 = Byte.parseByte(sc.nextLine());

		if (n2 > n1) {
			System.out.println("N2 es mayor que N1");
			for (byte i = n1; i <= n2; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}

		if (n1 > n2) {
			System.out.println("N1 es mayor que N2");
			for (byte i = n2; i <= n1; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
	}

}
