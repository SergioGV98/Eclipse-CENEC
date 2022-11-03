package PracticaExamen1Y2.SGV;

import java.util.Scanner;

public class PracticaExamen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Variables
		String nombre;
		short añoNacimiento;
		float peso;
		
		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();
		System.out.println("Dime tu año de nacimiento");
		añoNacimiento = Short.parseShort(sc.nextLine());
		System.out.println("Dime tu peso (Kg)");
		peso = Float.parseFloat(sc.nextLine());
		
		//Imprimir
		System.out.println("¡Hola " + nombre + "!");
		System.out.println("Han pasado " + (2022-añoNacimiento) + "desde que naci.");
		System.out.println("Cumpliras 85 años en el año " + (añoNacimiento+85));
		
	}	
}
