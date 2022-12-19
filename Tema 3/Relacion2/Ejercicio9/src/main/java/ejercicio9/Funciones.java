package ejercicio9;

import java.util.Scanner;

public class Funciones {

	public static byte recursiva(byte maximo) {
		Scanner sc = new Scanner(System.in);
		byte num = -1;
		
		System.out.println("Dime un valor comprendido entre 0 y " + maximo);
		num = Byte.parseByte(sc.nextLine());
		
		if(num>=0 && num <= maximo) {
			return num;
		}
		
		return Funciones.recursiva(maximo);
	}
	
}
