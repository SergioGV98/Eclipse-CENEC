package arrayRepasoNuevas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char [] palabra = {'p','e','l','o','t','a'};
		
		//palabra = Funciones.intercambiar(palabra[], pos1, pos2);
		Funciones.intercambiar(palabra, (byte) 2, (byte) 4);
		for(byte i = 0; i<palabra.length; i++) {
			System.out.print(palabra[i]);
		}
		
		
		
		
		
		
		
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
