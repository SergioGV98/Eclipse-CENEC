package ejercicioDragonBall;

import java.util.Scanner;

/*Sergio Garcia Vico*/
/*Finalizado*/

public class EjercicioDragonBall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Nombres de los guerreros (Variables)
		String guerrero1;
		String guerreroFusion;
		//Niveles de poder (Variables)
		byte tuPoder;
		byte poderGuerreroFusion;
		
		//Usuario introduce nombres de los guerreros
		System.out.println("Introduce tu nombre");
		guerrero1 = sc.nextLine();
		System.out.println("Introduce el nombre del Guerrero con el que te vas a fusionar.");
		guerreroFusion = sc.nextLine();
		//Niveles de poder
		System.out.println("Indica tu poder base (1 y 127) " + guerrero1);
		tuPoder = Byte.parseByte(sc.nextLine());
		System.out.println("Indica el poder base (1 y 127) de " +guerreroFusion + ", que es tu compañero de fusion.");
		poderGuerreroFusion = Byte.parseByte(sc.nextLine());
		//Monstrar por pantalla y calculos
		System.out.println("El poder de " + guerrero1 + " si hace un Kaioken x 10 es de: " + (tuPoder * 10));
		System.out.println("El poder de " + guerrero1 + " si se transforma en SSJ1 es de (x50): " + (tuPoder * 50));
		System.out.println("El poder de " + guerrero1 + " si se transforma en SSJ2 es de (x100): " + (tuPoder * 100));
		System.out.println("El nombre de tu fusion es: " + guerrero1+guerreroFusion);
		System.out.println("El poder de fusion base (x1.5) de " + guerrero1+guerreroFusion + " es de: " + ((tuPoder+poderGuerreroFusion)*1.5));
		System.out.println("El poder de fusion (SSJ2) de " + guerrero1+guerreroFusion + " es de: " + (((tuPoder*100)+(poderGuerreroFusion*100))*3));
		System.out.println("El poder de fusion de " + guerrero1+guerreroFusion + " mal fusionado es de: " + ((tuPoder/2f)+(poderGuerreroFusion/2f))*0.7f);
		System.out.println("La media de poder en SSJ1 de " + guerrero1 + " y " + guerreroFusion + "es de: " + (((tuPoder*50)+(poderGuerreroFusion*50))/2f));
		System.out.println("La diferencia de poder de " + guerrero1 + " y " + guerreroFusion + " en SSJ2 es de: " + ((tuPoder*100)-(poderGuerreroFusion*100)));
		
	}

}
