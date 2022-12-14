package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el numero de barcos que quieres que te dibuje");
		Byte numero = Byte.parseByte(sc.nextLine());
		
		System.out.println(Funciones.dibujarBarcos(numero));
		
	}

}
