package rueDelPercebe;

import java.util.Scanner;

public class RueDelPercebe {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		byte np;
		byte cp;

		System.out.println("Dime el numero de plantas que tiene tu piso");
		np = Byte.parseByte(sc.nextLine());

		System.out.println("Dime el numero de casa que tiene tu piso");
		cp = Byte.parseByte(sc.nextLine());

		System.out.print("|----------------------------|\r\n" + "| 13 Rue del Percebe |\r\n"
				+ "|----------------------------|\r\n" + "");
		for (byte i = 0; i < np; i++) {
			for (byte j = 0; j < cp; j++) {
				System.out.print("|----|");
			}
			System.out.println();
			for (byte j = 0; j < np; j++) {
				System.out.print("|    |");
			}
			System.out.println();
			for (byte j = 0; j < np; j++) {
				System.out.print("|    |");
			}
			System.out.println();
		}
	}
}