package amongUs;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("AAAAA Que viene el Amongus AAAAA");
		byte tamaño;
		do {
			System.out.println("Dime tamaño del tablero ( 5 - 15)");
			tamaño = Byte.parseByte(sc.nextLine());
		}while(tamaño<5||tamaño>15);
		
		String [] tablero = Funciones.generaTablero(tamaño);
		
		System.out.println(Funciones.imprimeTablero(tablero));
		
		System.out.println();
		
		Funciones.colocarElemento(tablero, 'M');
		Funciones.colocarElemento(tablero, 'A');
		
		System.out.println(Funciones.imprimeTablero(tablero));
	}

}
