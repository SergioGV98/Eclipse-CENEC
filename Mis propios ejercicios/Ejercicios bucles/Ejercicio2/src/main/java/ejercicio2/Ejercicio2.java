package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		byte numeros = 0;
		byte n1;
		boolean numeroIntroducido = false;
		
		
		System.out.println("Introduce cuantos numeros vas a introducir");
		while(numeroIntroducido == false) {
			
			numeros = Byte.parseByte(sc.nextLine());
			
			if(numeros == 0) {
				System.out.println("No puedes introducir 0 numeros.");
				System.out.println("Vuelve a introducir numeros.");
			}
			if(numeros != 0) {
				System.out.println("Muy bien procederemos con " + numeros + " numero que vas a introducir.");
				numeroIntroducido = true;
			}
		}
		
		while(numeros > 0) {
			System.out.println("Introduce un numero (-127-127)");
			n1 = Byte.parseByte(sc.nextLine());
			
			numeros--;
			
			if(n1 < 0) {
				System.out.println("El numero introducido es menor que 0");
			}
			
			if(n1 > 0) {
				System.out.println("El numero introducido es mayor que 0");
			}
			
			if(n1 == 0) {
				System.out.println("El numero introducido es 0");
			}
			if(numeros == 0) {
				System.out.println("Has terminado de introducir todos tus numeros.");
			}
		}
		

	}

}
