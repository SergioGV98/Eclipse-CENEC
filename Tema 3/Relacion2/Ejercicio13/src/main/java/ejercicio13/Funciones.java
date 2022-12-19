package ejercicio13;

import java.util.Scanner;

public class Funciones {

	public static byte recursiva() {
		
		Scanner sc = new Scanner(System.in);
		byte num = -1;
		
		System.out.println("Dime un numero entre 1 y 50");
		num = Byte.parseByte(sc.nextLine());
		
		if(num >= 1 && num <= 50) {
			return num;
		}
		
		return Funciones.recursiva();
	}
	
	//Explicacion de como hacerlo sin el sysout en la recursiva, una funcion que se
	//usaria simplemente para consola y no entornos
	public static float pideFloat(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return Float.parseFloat(sc.nextLine());
		
		
	}
	
	
}
