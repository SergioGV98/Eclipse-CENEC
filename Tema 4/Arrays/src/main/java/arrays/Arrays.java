package arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Una forma de hacer un Array
		/*System.out.println("Dime el tamaño del Array");
		byte tamaño = Byte.parseByte(sc.nextLine());
		
		int[] numero = new int[tamaño];
		int suma = 0;
		
		for (byte i = 0; i < numero.length; i++) {
			System.out.println("Numero para el puesto de la Array " + "[" + i + "]");
			numero[i] = Integer.parseInt(sc.nextLine());
			suma += numero[i];
		}
		
		for (byte i = 0; i < numero.length; i++) {
			System.out.println("Array "+"["+i+"]: " + numero[i]);
		}
		System.out.println("\n" + "Media del Array: " +1f*suma/numero.length);*/

		
		String [] nombres1 = {}; //Esto tiene la estructura no es null
		String [] nombres2 = null; //Esto no tiene la estructura solamente null
		
		String [] nombres = {"Ana", "Paco", "Gustavo", "Sergio", "Pablo", "Sofia", "Carlos"};
		String [] apellidos = {"Gomez", "Gonzalez", "Castro", "Martin"};
		nombres[1] = "Pedro"; //Sustituye paco por Pedro
		
		/*for(byte i=0; i<nombres.length; i++ ) {
			String actual = nombres[i];
			System.out.println("Array "+"["+i+"]: " + nombres[i]);
			System.out.println("¿El Nombres contiene una a? " + actual.contains("a"));
			System.out.println("Nombres con mayusculas " + actual.toUpperCase() + "\n");
		}*/
		
		Random r = new Random();
		byte posAleatoria=(byte) r.nextInt(nombres.length);
		System.out.println("Nombre aleatorio: " + nombres[posAleatoria] + " " + apellidos[r.nextInt(apellidos.length)]); //Este me coge el numero aleatorio que ha salido arriba y me elige el nombre
		System.out.println("Nombre aleatorio: " + nombres[r.nextInt(nombres.length)] + " " + apellidos[r.nextInt(apellidos.length)]); //Este me genera un numero aleatoria cada vez que lo llamo
	}
}
