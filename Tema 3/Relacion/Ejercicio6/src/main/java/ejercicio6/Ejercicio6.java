package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte numero = 0;
		byte veces;
		byte minimo;
		byte maximo;
		
		System.out.println("Dime un numero entre 1 y 10");
		
		do {
			
			numero = Byte.parseByte(sc.nextLine());
			
		}while(numero < 1 || numero > 10);
		
		veces = numero;
		
		minimo = numero;
		maximo = minimo;
		
		for(byte i = 0; i < veces; i++) {
			System.out.println("Introduce un numero");
			numero = Byte.parseByte(sc.nextLine());
			
			if(numero < minimo) {
				minimo = numero;
			}
			
			if(numero > maximo) {
				maximo = numero;
			}
		}
		
		System.out.println("Minimo: " + minimo);
		System.out.println("Maximo: " + maximo);
	}

}
