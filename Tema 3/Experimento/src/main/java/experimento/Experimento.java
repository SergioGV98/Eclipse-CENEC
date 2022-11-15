package experimento;

import java.util.Random;
import java.util.Scanner;

public class Experimento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribeme un texto, y le hacemos transformaciones " + "en el programa");
		String codificado="";
		String original;
		String mimificado="";
		String mimificado2="";
		byte opcion;
		
		String texto = sc.nextLine();
		
		/*
		 * Ejercicio 5 a partir de la cadena mimificado usar un bucle para obtener la cadena original
		 * Hacer el caso 8 | copypaste del caso 6 y entre letra y letra colocar una letra aleatoria entra a y z.
		 */
		
		do {
			System.out.println("Elige una opcion: " + "\n\t0 - Salir" + "\n\t1 - Invertir la cadena"
					+ "\n\t2 - Poner todo en mayusculas" + "\n\t3 - Poner todo en minusculas"
					+ "\n\t4 - Poner mayuscula la primera letra, minuscula el resto" + "\n\t5 - Mimificar el texto"
					+ "\n\t6 - Codificar el texto" + "\n\t7 - Decodificar el texto"
					+ "\n\t8 - Codificar con caracteres aleatorios"
					+ "\n\t9 - EXTRA (sin relacion) - Adivina que numero he pensado");
			opcion = Byte.parseByte(sc.nextLine());

			switch (opcion) {
			case 1:
				for (short i = (short) (texto.length()-1); i >= 0; i--) {
					System.out.print(texto.charAt(i));
				}
				System.out.println();
				break;
			case 2:
				texto=texto.toUpperCase();
				System.out.println(texto);
				break;
			case 3:
				texto=texto.toLowerCase();
				System.out.println(texto);
				break;
			case 4:
				String resultado=""+texto.toUpperCase().charAt(0);
				for(short i=1; i <texto.length(); i++) {
					resultado+=texto.toLowerCase().charAt(i);
				}
				System.out.println(resultado);
				break;
			case 5:
				for (short i = 0; i < texto.length(); i++) {
					mimificado+=texto.charAt(i)+"mi";
				}
				System.out.println(mimificado);
				
				for (short i = 0; i < texto.length(); i++) {
					mimificado2+=texto.charAt(i);
					
					//mimificado = mimificado.replaceAll("mi", "");
				}
				System.out.println(mimificado2);
				
				break;
			case 6:
				codificado = "";
				for (short i = 0; i < texto.length(); i++) {
					codificado+=(char)(texto.charAt(i)+8);
				}
				System.out.println(codificado);
				break;
			case 7:
				original = "";
				for (short i = 0; i < codificado.length(); i++) {
					original+=(char)(codificado.charAt(i)-8);
				}
				System.out.println(original);
				break;
			case 8:
				codificado = "";
				Random rnd = new Random();
				char randomChar = (char) (rnd.nextInt(47,50));
				for (short i = 0; i < texto.length(); i++) {
					codificado+=(char)(texto.charAt(i)+8);
					for(short j = 0; j < 1; j++) {
						codificado += randomChar;
					}
				}
				System.out.println(codificado);
			case 9:
				Random aleatorio = new Random();
				int numeroElegido = aleatorio.nextInt(1,11);
				System.out.println("Adivina el numero entre (1 y 10)");
				byte numeroEscogido;
				do {
					numeroEscogido = Byte.parseByte(sc.nextLine());
					if(numeroEscogido != numeroElegido) {
						System.out.println("Ese numero no era.");
					}
				}while(numeroEscogido != numeroElegido);
				System.out.println("¡Has adivinado el numero!");
				break;
			}
			System.out.println("\nPulsa intro para continuar o escribe 0 para salir");
			sc.nextLine();
		} while (opcion != 0);
		System.out.println("Programa terminado");
	}
}
