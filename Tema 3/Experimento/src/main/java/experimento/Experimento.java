package experimento;

import java.util.Scanner;

public class Experimento {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Escribeme un texto, y le hacemos transformaciones " + "en el programa");

		String texto = sc.nextLine();
		byte opcion;
		
		do {
			System.out.println("Elige una opcion: " 
			+ "\n\t0 - Salir"
			+ "\n\t1 - Invertir la cadena"
			+ "\n\t2 - Poner todo en mayusculas"
			+ "\n\t3 - Poner todo en minusculas"
			+ "\n\t4 - Poner mayuscula la primera letra, minuscula el resto"
			+ "\n\t5 - Mimificar el texto"
			+ "\n\t6 - Codificar el texto"
			+ "\n\t7 - Decodificar el texto"
			+ "\n\t8 - Codificar con caracteres aleatorios"
			+ "\n\t9 - EXTRA (sin relacion) - Adivina que numero he pensado");
			opcion=Byte.parseByte(sc.nextLine());
		}while(opcion!=0);
		
		switch(opcion) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		}
	}
}
