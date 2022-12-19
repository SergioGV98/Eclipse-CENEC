package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un valor maximo");
		
		byte maximo = Byte.parseByte(sc.nextLine());
		
		System.out.println(Funciones.recursiva(maximo));
		
	}

}
