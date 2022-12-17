package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribeme un refran");
		String refran = sc.nextLine();
		
		System.out.println(Funciones.patadizarRefrán(Funciones.refranAzar()));
		
		

	}

}
