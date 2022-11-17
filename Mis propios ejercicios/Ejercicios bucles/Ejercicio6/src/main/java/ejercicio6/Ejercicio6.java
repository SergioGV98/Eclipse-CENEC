package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		byte base = 0;
		byte exponente = 0;
		int resultado = 0;
		
		do {
			System.out.println("Dime tu base");
			base = Byte.parseByte(sc.nextLine());
			
			System.out.println("Dime tu exponente");
			exponente = Byte.parseByte(sc.nextLine());
			
			if (base <= 0) {
				System.out.println("No puedes elegir 0 o un numero negativo para tu base");
			}
			
			if (exponente <= 0) {
				System.out.println("No puedes elegir 0 o un numero negativo para tu exponente");
			}
			
		}while(exponente <= 0 && base <= 0);
		
		resultado=base;
		
		for(byte i = 1; i < exponente; i++) {
			resultado = (resultado * base);
		}
		
		System.out.println("El numero " +base +" con exponente " + exponente + " es " + resultado);
	}

}
