package programa.io.sergiogvproject;

import java.util.Scanner;

public class ProgramaIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Bonito nombre " + nombre + ".");
		System.out.println("¿Cual es tu edad?");
		byte edad = sc.nextByte();
		System.out.println("Vaya yo tambien tengo " + edad);
		System.out.println("¿En que año vivimos?");
		short año = sc.nextShort();
		System.out.println("Vivimos en el año " + año);*/
		//Simbolos 
		//char verdad = '✅';
		//char mal = '❌';
		//System.out.println(verdad);
		//System.out.println(mal);
		System.out.println("Dime un número con decimales");
		float n1 = sc.nextFloat();
		System.out.println("Dime otro número con decimales");
		float n2 = sc.nextFloat();
		float resultadoN3= n1+n2;
		System.out.println("La suma es: " + resultadoN3);
		System.out.println("La resta es: " + (n1 - n2));
		System.out.println("La multiplicacion es: " + (n1 * n2));
		System.out.println("La division es: " + (n1/n2));
		System.out.println("El modulo es: " + (n1%n2));
		
	}

}
