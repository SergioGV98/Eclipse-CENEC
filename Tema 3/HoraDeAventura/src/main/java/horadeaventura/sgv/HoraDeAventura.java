package horadeaventura.sgv;

import java.util.Scanner;

public class HoraDeAventura {

	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		byte opcionElegida;
		byte subElegida2 = 0;
		
		//Empieza la aventura
		System.out.println("Estamos en CENEC un pacifico dia en clase." +
		"\n Y de repente, cae del tragaluz" + "una jirafa con gafas de sol y manos, \n" + 
		"Una botella de vodka en una mano y una bandurria en la otra mano" +
		"\n ¿Como reaccionas?" +
		//Eleccion 01
		"\n\t1 - Decirle: ¡Vamonos de fiesta!" 
		+ "\n\t2 - Intentar robarle el vozkza"
		+ "\n\t3 - Pegarle con la bandurria en la cabeza");
		
		//Opcion elegida 1
		opcionElegida=Byte.parseByte(sc.nextLine());
		
		if(opcionElegida == 1 || opcionElegida == 2 || opcionElegida == 3) {
		
			if(opcionElegida == 1) {
				System.out.println("Jirafa: " + "¿De fiesta?");
				System.out.println("Jirafa: " + "Me acabo de caer por un tragaluz, estoy molida. \n" +
				"Claro, ves una jirafa con vodka y te quieres ir de fiesta, \n" +
				"pero nadie pregunta cómo está la jirafa después de caerse.");
				
				//Opcion elegida 1 Eleccion 2
				System.out.println("¿Qué haces?" + 
						"\n\t1 - Jirafa tia, lo siento, ¿Estás bien?" 
						+ "\n\t2 - ¿Y tu me has preguntado como estoy yo?");
				
				subElegida2=Byte.parseByte(sc.nextLine());
					 
				if(subElegida2 == 1) {
					System.out.println("Jirafa: " + "¿Puedes llamar a una ambulancia?");
				} else if (subElegida2 == 2){
					System.out.println("Porque yo necesito irme de fiesta.");
					System.out.println("Jirafa: " + "Pues toma el vodka y vete.\n" + 
					"*Te tira el vodka a la cara*\n" + 
				    "*Te vas de fiesta con la nariz rota por un vodkazo.*");
				} else {
					System.out.println("No has elegido entre las opciones [1-2]");
				}
			} 
			
			//Opcion elegida 2
			if(opcionElegida == 2) {
				System.out.println("Jirafa: " + "Es mi vodka, mequetrefe.\n" + 
			    "*La girafa te da un cabezado*");
				
				//Opcion elegida 2 Eleccion 2
				System.out.println("¿Qué haces?" + 
						"\n\t1 - Le hago un RKO" 
						+ "\n\t2 - Salgo corriendo.");
				
				subElegida2=Byte.parseByte(sc.nextLine());
					 
				if(subElegida2 == 1) {
					System.out.println("*Le haces un RKO, increible y le partes el cuello a la jirafa.*");
				} else if (subElegida2 == 2){
					System.out.println("*Sales corriendo y la jirafa te persige, acabas muriendo de un infarto por correr tanto*");
				} else {
					System.out.println("No has elegido entre las opciones [1-2]");
				}
			} 
			
			//Opcion elegida 3
			if(opcionElegida == 3) {
				System.out.println("*Le metes con la bandurria en la cabeza y decides hacerte " + 
			"el mejor solo de la historia por tu amor a la pelicula Whiplash*");
			} 
			
		} else {
			System.out.println("No has elegido entre las opciones [1-3]");
		}
	}

}
