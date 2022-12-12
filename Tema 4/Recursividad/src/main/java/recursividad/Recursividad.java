package recursividad;

import java.util.Scanner;

public class Recursividad {

	public static void main(String[] args) {
		
		//Funciones.funcionRecursivaWhile();
		//Funciones.funcionRecursivaFor((byte) 0);
		//System.out.println(Funciones.funcionRecursivaForString((byte) 0));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero y te imrpimo los divisores");
		long numero = Long.parseLong(sc.nextLine());
		/*
		 * Convierte a funcion recursiva este bucle con una funcion String:
		 * for(byte i=2; i<numero/2;i++){
		 * if (numero%i==0){
		 * sytem.out.println(i);
		 * }
		 * }
		 */
		System.out.println(Funciones.ejercicio((byte)(2), (long)(numero)));
	}

}
