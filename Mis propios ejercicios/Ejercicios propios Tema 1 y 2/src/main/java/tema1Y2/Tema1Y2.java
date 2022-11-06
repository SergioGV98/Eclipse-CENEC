package tema1Y2;

import java.util.Scanner;

public class Tema1Y2 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		/* Ejercicio 1
		 * Programa que lea una cantidad de grados centígrados y la pase a grados
		 * Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a
		 * fahrenheit es: F = 32 + ( 9 * C / 5)
		 */
		
		byte gradosCentigrado;
		float gradosFahrenheit;
		
		System.out.println("Dime una cantidad de grados centigrados (Lo normal ronda de -30 a 104)");
		gradosCentigrado = Byte.parseByte(sc.nextLine());
		
		gradosFahrenheit = 32 + 9*gradosCentigrado/5f;
		
		System.out.println("La conversion de Grados Centigrados a Grados Fahrenheit es " +gradosFahrenheit);
		
	}

}
