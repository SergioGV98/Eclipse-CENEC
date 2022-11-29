package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte veces;
		float minimo = 0;
		float maximo = 0;
		boolean igualar = true;
		
		//float maximo = Float.MIN_NORMAL; Otra forma de hacer mi if de igualar
		//float minimo = Float.MAX_VALUE;
		
		System.out.println("Dime un numero entre 1 y 10");
		
		do {
			
			veces = Byte.parseByte(sc.nextLine());
			
		}while(veces < 1 || veces > 10);

		for(byte i = 1; i <= veces; i++) {
			System.out.println("Introduce un numero ("+i+"/"+veces+")");
			float numero = Float.parseFloat(sc.nextLine());
			
			if(igualar == true) {
				minimo = numero;
				maximo = minimo;
				igualar = false;
			}
			
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
