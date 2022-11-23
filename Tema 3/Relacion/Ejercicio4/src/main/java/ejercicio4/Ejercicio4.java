package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte numero = 0;
		String palabra = "";
		
		System.out.println("Escribeme una de estas palabras " + "\n\t0 - cero" + "\n\t1 - uno" + "\n\t2 - dos");
		
		System.out.println(Funcion.devolverNumero(numero, palabra));

	}

}
