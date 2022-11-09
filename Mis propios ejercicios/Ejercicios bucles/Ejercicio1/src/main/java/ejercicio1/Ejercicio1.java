package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		byte numeroAleatorio;
		byte intento = 0;
		byte intentosRestantes = 10+1;
		
		//Numero aleatorio
		numeroAleatorio = (byte) (Math.random()*10+1);

		while(intentosRestantes > 0 && numeroAleatorio != intento) {
			
			System.out.println("Dime un numero");
			intento = Byte.parseByte(sc.nextLine());
			
			if(intento < numeroAleatorio) {
				System.out.println("El numero que has introducido es menor al numero aleatorio generado");
			} else if (intento > numeroAleatorio){
				System.out.println("El numero que has introducido es mayor al numero aleatorio generado");
			} else if (intento == numeroAleatorio) {
				System.out.println("Has adivinado el numero, era " + numeroAleatorio);
			}
			
			intentosRestantes--;
			
			if(intento != numeroAleatorio) {
				System.out.println("Te quedan " + intentosRestantes + " intentos");
				if(intentosRestantes == 1) {
					System.out.println("Te queda un ultimo intento.");
				}
				
				if(intentosRestantes == 0) {
					System.out.println("Te has quedado sin intentos.");
				}
			}		
		}
	}
}
