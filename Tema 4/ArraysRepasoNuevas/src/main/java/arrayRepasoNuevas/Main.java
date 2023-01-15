package arrayRepasoNuevas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		char [] palabra = {'p','e','l','o','t','a'};
		//char [] copia = Funciones.copiarArray(palabra);
		char [] copia = {'p','e','l','o','r','a'};
		
		System.out.println("¿La cadena es igual?" + Funciones.sonIguales(palabra, copia));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*char [] palabra = {'p','e','l','o','t','a'};
		char [] original = Funciones.copiarArray(palabra);
		String frase = "A las tres de la tarde, es muy mala hora para empezar una clase, " 
		+ " es la hora de estar tranquilo sentado, digiriendo la comida";
		String [] resultado = frase.split(" ");
		System.out.println("Numero de palabras: " + resultado.length);
		System.out.println("Numero de espacios: " + (resultado.length-1));
		System.out.println(Funciones.imprimeArray(resultado));
		//char [] original = Arrays.copyOf(palabra, palabra.length);
		
		//Esta echo en una funcion
		/*char [] original = new char[palabra.length];
		
		for (byte i = 0; i < palabra.length; i++) {
			original [i] += palabra[i];
		}*/
		
		/*Funciones.intercambiar(palabra, (byte) 2, (byte) 4);
		for(byte i = 0; i<palabra.length; i++) {
			System.out.print(palabra[i]);
		}	
		
		System.out.println();*/
		/*System.out.println("¿Cuantos cambios aleatorios quieres que se hagan?");
		short nCambios = Short.parseShort(sc.nextLine());
		
		for(short i=0; i<nCambios; i++) {
			byte pos1=(byte) r.nextInt(palabra.length);
			byte pos2=(byte) r.nextInt(palabra.length);
			Funciones.intercambiar(palabra, pos1, pos2);
		}
		System.out.println("Adivina la palabra original:\n"+Funciones.imprimeArray(palabra));
		String intento = sc.nextLine();
		
		String solucion = "";
		for(byte i = 0; i < original.length; i++) {
			solucion += original[i];
		}
		
		if(solucion.equals(intento)) {
			System.out.println("¡Has adivinado la palabra!");
		} else {
			System.out.println("¡No es la palabra correcta!");
		}
		
		
		//System.out.println(Funciones.imprimeArrayAlReves(palabra));
		
		/*String[] nombres = new String[7];
		
		//nombres[4] = "hola";
		
		System.out.println("Dime una posicion para poner un nombre (0-"+(nombres.length-1)+")");
			
		byte posicion = Byte.parseByte(sc.nextLine());
		
		System.out.println("Dime un nombre para la posicion " + posicion);
		
		String nom = sc.nextLine();
		
		if(Funciones.insertarEnArray(nombres, posicion, nom)) {
			System.out.println("Insertado correctamente");
		} else {
			System.out.println("El valor no se puede insertar");
		}

		for (byte i = 0; i < nombres.length; i++) {
			System.out.println(i + ": " +(nombres[i]!=null?nombres[i].toUpperCase():"-"));
		}*/

	}

}
