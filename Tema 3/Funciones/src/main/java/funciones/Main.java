package funciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables
		int numero0y30 = Funciones.numeroAleatorio(0, 31);
		int numero50y80 = Funciones.numeroAleatorio(50, 81);
		long numero;

		// funcionVoid(); // Llamada desde la misma clase
		Funciones.funcionVoid(); // Si la quisiera llamar desde otra clase
		System.out.println(numero0y30);
		System.out.println(numero50y80);

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas caras quieres?");
		byte nCaras = Byte.parseByte(sc.nextLine());
		
		/*System.out.println("Dime el caracter para tus ojos");
		char ojos = sc.nextLine().charAt(0);*/
		
		System.out.println(Funciones.imprimeTrozo("pelo", nCaras));
		System.out.println(Funciones.imprimeTrozo("ojos", nCaras));
		//System.out.println(Funciones.imprimeTrozo(Funciones.sustituir("( o o )", 'o', ojos), nCaras)); //Lo mismo pero en una unica linea
		//String trozosOjos = Funciones.imprimeTrozo("( o o )", nCaras);
		//trozosOjos = Funciones.sustituir(trozosOjos, ojos);
		//System.out.println(trozosOjos);
		System.out.println(Funciones.imprimeTrozo("boca", nCaras));
		System.out.println(Funciones.imprimeTrozo("/-----\\", nCaras));
		
		System.out.println("Dime un numero y te dire si es primo");
		numero = Long.parseLong(sc.nextLine());
		System.out.println(Funciones.esPrimo(numero));
		
	}

}
