package sopa;

import java.util.Scanner;

public class SopaLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿De cuantas filas quieres la sopa?");
		byte filas = Byte.parseByte(sc.nextLine());

		System.out.println("¿De cuantas columnas quieres la sopa?");
		byte columnas = Byte.parseByte(sc.nextLine());

		/*System.out.println("Dime el numero de palabras que quieres insertar");
		byte nPalabras = Byte.parseByte(sc.nextLine());*/

		char sopa[][] = Funciones.creaSopa(filas, columnas);
		boolean [][] palabraAqui = Funciones.creaSopaComprobador(filas, columnas);
				
		boolean puedoSeguir = false;

		do {

			System.out.println("Dime una palabra que quieras insertar en la sopa");
			String palabra = sc.nextLine();
			
			System.out.println("Dime la fila donde quieres insertar la palabra");
			byte filaInsercion = Byte.parseByte(sc.nextLine());

			System.out.println("Dime la columna donde quieres insertar la palabra");
			byte columnaInsercion = Byte.parseByte(sc.nextLine());
			
			System.out.println(Funciones.imprimeMenu());
			byte opcion = Byte.parseByte(sc.nextLine());

			puedoSeguir = Funciones.insertaPalabra(sopa, palabraAqui, palabra, filaInsercion, columnaInsercion, opcion);

			if(!puedoSeguir) {
				System.out.println("La palabra no cabe ahi. Escribe otra cosa");
			}
			
		} while (!puedoSeguir);

		System.out.println(Funciones.imprimeMatriz(sopa));
		System.out.println(Funciones.imprimeMatriz(palabraAqui));
	}

}
