package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		char vocal1 = 'a';
		char vocal2 = 'e';
		char vocal3 = 'i';
		char vocal4 = 'o';
		char vocal5 = 'u';
		char terminar = ' ';
		char letra;
		boolean fin = false;

		while (fin == false) {

			System.out.println("Introduceme una letra");
			letra = sc.nextLine().charAt(0);

			if (letra == vocal1 || letra == vocal2 || letra == vocal3 || letra == vocal4 || letra == vocal5) {
				System.out.println("Has introducido la vocal " + letra);
			} else if (letra == terminar) {
				System.out.println("Hemos acabado.");
				fin = true;
			} else {
				System.out.println("Has introducido una consonante");
			}

		}

	}

}
