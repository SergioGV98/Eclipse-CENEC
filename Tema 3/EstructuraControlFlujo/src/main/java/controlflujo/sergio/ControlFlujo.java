package controlflujo.sergio;

import java.util.Scanner;

public class ControlFlujo {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);

		//Variables
		//boolean genero;
		char genero;
		byte opcion;
		
		System.out.println("Escribeme H si eres hombre o " +
		"M si eres mujer o N si eres género neutro");
		
		genero=sc.nextLine().charAt(0);
		
		switch (genero) {
		
			case 'h':
				System.out.println("Bienvenido al programa");
				break;
			case 'm':
				System.out.println("Bienvenida al programa");
				break;
			case 'n':
				System.out.println("Bienvenide al programa");
				break;
			case 'H':
				System.out.println("Bienvenido al programa");
				break;
			case 'M':
				System.out.println("Bienvenida al programa");
				break;
			case 'N':
				System.out.println("Bienvenide al programa");
				break;
			default:
				System.out.println("Debiste poner h o H | m o M | n o N");
				break;
		}
		
		
		
		//boolean genero = (sc.nextLine().equals("H")?true:false);
		
		/*
		if(sc.nextLine().equals("H")) {
			System.out.println("Eres hombre.");
			genero=true;
		} else {
			System.out.println("Eres mujer.");
			genero=false;
		}*/
		
		//Programa
		/*System.out.println("Escribeme una palabra que no sea \"Cermuzo\"");
		String palabra = sc.nextLine();*/
		
		/*if(palabra.length() > 8) {
			System.out.println("No me gustan las palabras tan largas.");
		} else if(palabra.equals("cermuzo") || palabra.equals("Cermuzo")) {
			System.out.println("Has escrito cermuzo, no escribas cermuzo, so cermuz" + (genero?"o":"a"));
		} else {
			System.out.println("Bonita palabra.");
		} */
		
		/*System.out.println("Bienvenid" + (genero?"o":"a") +", " + "Has puesto la palabra: " +palabra + 
				", ¿Que quieres hacer"  +  " con ella?" 
				+ "\n\t1 - Invertir la palabra"
				+ "\n\t2 - Codificar la palabra");
		opcion = Byte.parseByte(sc.nextLine());
		
		switch(opcion) {
			//Opcion 1 - Invertir la palabra
			case 1:
				System.out.println("Aqui pondre la palabra al reves");
				break;
			
			//Opcion 2 - Codificar la palabra
			case 2:
				System.out.println("Aqui codificare la palabra");
				break;
				
			//Opcion que se ejecuta si no has elegido 1 o 2
			default:
				System.out.println("Debiste elegir 1 o 2");
				break;
		}*/	
		
		}	
	}
