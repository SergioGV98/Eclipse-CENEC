package matrices;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿De cuantas filas quieres la sopa?");
		byte filas = Byte.parseByte(sc.nextLine());
		
		System.out.println("¿De cuantas columnas quieres la sopa?");
		byte columnas = Byte.parseByte(sc.nextLine());
		
		char sopa [][] = Funciones.creaSopa(filas, columnas);
		boolean puedoSeguir = false;
		
		do {		
			System.out.println("Dime una palabra que quieras insertar en la sopa");
			String palabra = sc.nextLine();
			
			System.out.println("Dime la fila donde quieres insertar la palabra");
			byte filaInsercion = Byte.parseByte(sc.nextLine());
			
			System.out.println("Dime la columna donde quieres insertar la palabra");
			byte columnaInsercion = Byte.parseByte(sc.nextLine());
			
			puedoSeguir = Funciones.insertaPalabra(sopa, palabra, filaInsercion, columnaInsercion);
			
			if(!puedoSeguir) {
				System.out.println("La palabra no cabe ahi. Escribe otra cosa");
			}
			
		}while(!puedoSeguir);
		
		
		
		System.out.println(Funciones.imprimeMatriz(sopa));
		
		
		/*byte[][] matriz = new byte[3][3];
		byte[][] matriz2 = {{5,3,22},
							{4,44,1}};
		
		byte[][][] matrizGrande = new byte[3][2][2];
		
		for(byte i = 0; i < matriz2.length; i++) {
			for(byte j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Imprime al reves la matriz
		for(byte i = 0; i < matriz2.length; i++) {
			for(byte j = (byte) (matriz2[i].length-1); j >= 0; j--) {
				System.out.print(matriz2[i][j] + "\t");
			}
			System.out.println();
		}*/
	}

}
