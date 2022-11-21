package funciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables
		int numero0y30 = Funciones.numeroAleatorio(0, 31);
		int numero50y80 = Funciones.numeroAleatorio(50, 81);

		// funcionVoid(); // Llamada desde la misma clase
		Funciones.funcionVoid(); // Si la quisiera llamar desde otra clase
		System.out.println(numero0y30);
		System.out.println(numero50y80);

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas caras quieres?");
		byte nCaras = Byte.parseByte(sc.nextLine());

		System.out.println(Funciones.imprimeTrozo(" /'''\\ ", nCaras));
		System.out.println(Funciones.imprimeTrozo("( o o )", nCaras) + Funciones.sustituir("( o o )", '@'));
		System.out.println(Funciones.imprimeTrozo(" \\ - / ", nCaras));
		System.out.println(Funciones.imprimeTrozo("/-----\\", nCaras));
	}

}
