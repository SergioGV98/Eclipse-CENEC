package controlflujo.sergio;

import java.util.Scanner;

public class ControlFlujo {

	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);

		//Variables
		
		
		//Programa
		System.out.println("Escribeme una palabra que no sea \"Cermuzo\"");
		String palabra = sc.nextLine();
		
		if(palabra.length() > 8) {
			System.out.println("No me gustan las palabras tan largas.");
		} else if(palabra.equals("cermuzo") || palabra.equals("Cermuzo")) {
			System.out.println("Has escrito cermuzo, no escribas cermuzo.");
		} else {
			System.out.println("Bonita palabra.");
		}
		}	
	}
