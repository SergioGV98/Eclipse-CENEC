package PracticaExamen1Y2.SGV;

import java.util.Scanner;

public class PracticaExamen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Variables Generales
		String nombre;
		short añoNacimiento;
		float peso;
		
		//Variables Planetas
		float mercurio;
		float venus;
		float marte;
		float jupiter;
		float saturno;
		float urano;
		float neptuno;
		float pluto;
		
		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();
		System.out.println("Dime tu año de nacimiento");
		añoNacimiento = Short.parseShort(sc.nextLine());
		System.out.println("Dime tu peso (Kg)");
		peso = Float.parseFloat(sc.nextLine());
		
		//Cuentas de mi peso en los planetas
		mercurio=(peso*0.377f);
		venus=(peso*0.904f);
		marte=(peso*0.378f);
		jupiter=(peso*2.527f);
		saturno=(peso*1.064f);
		urano=(peso*0.886f);
		neptuno=(peso*1.136f);
		pluto=(peso*0.063f);
		
		//Imprimir
		System.out.println("¡Hola " + nombre + "!");
		System.out.println("Han pasado " + (2022-añoNacimiento) + " años desde que naci.");
		System.out.println("Cumpliras 85 años en el año " + (añoNacimiento+85));
		
		System.out.println("------------------Peso en los 8 Planetas del Sistema Solar------------------");
		System.out.println("Mercurio: " + mercurio + " Kg");
		System.out.println("Venus: " + venus + " Kg");
		System.out.println("Tierra: " + peso + " Kg");
		System.out.println("Marte: " + marte + " Kg");
		System.out.println("Jupiter: " + jupiter + " Kg");
		System.out.println("Saturno: " + saturno + " Kg");
		System.out.println("Urano: " + urano + " Kg");
		System.out.println("Neptuno: " + neptuno + " Kg");
		System.out.println("Pluto: " + pluto + " Kg");
		
		System.out.println("------------------Cierto o No------------------");
		System.out.println((mercurio+venus > marte) || (jupiter>peso+marte));
	}	
}
