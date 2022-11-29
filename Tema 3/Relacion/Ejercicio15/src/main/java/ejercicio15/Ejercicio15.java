package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		String nombreBandaMetal = null;
		byte eleccion;
		boolean salir = false;
		
		do {
			System.out.println("¿Que quieres hacer?" + "\n\t0 - Salir" + "\n\t1 - Nombre banda de Metal" + "\n\t2 - Metalizar texto");
			eleccion = Byte.parseByte(sc.nextLine());
			
		}while(eleccion < 0 || eleccion > 2);
		
		switch(eleccion) {
		case 0:
			salir = true;
			break;
		case 1:
			System.out.println("Dime el nombre para tu banda");
			nombreBandaMetal = sc.nextLine();
			break;
		case 2:
			
			break;
		}
		

	}

}
