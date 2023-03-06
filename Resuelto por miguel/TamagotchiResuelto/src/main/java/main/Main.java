package main;

import java.util.Scanner;

import clases.Comida;
import clases.Gato;
import clases.Juego;
import clases.Perro;
import clases.Tamagotchi;
import enums.Especie;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Tamagotchi tamagotchi = null;
		
		System.out.println("Dime el nombre del tamagotchi");
		String nombre = sc.nextLine();
		byte opcion;
		do {
			System.out.println("Dime la especie del tamagotchi" 
					+ "\n\t 1 - Dragón"
					+ "\n\t 2 - Pollito"
					+ "\n\t 3 - Perro"
					+ "\n\t 4 - Gato");
			opcion = Byte.parseByte(sc.nextLine());
		}while(opcion < 1 || opcion > 4);
		
		switch(opcion) {
		case 1: // Dragon
			tamagotchi = new Tamagotchi(nombre, Especie.DRAGON);
			break;
		case 2: // Pollito
			tamagotchi = new Tamagotchi(nombre, Especie.POLLITO);
			break;
		case 3: // Perro
			tamagotchi = new Perro(nombre);
			break;
		case 4: // Gato
			tamagotchi = new Gato(nombre);
			break;
		}
		
		while(tamagotchi.estaVivo()) {
			
			System.out.println(tamagotchi);
			
			System.out.println("¿Qué quieres hacer?"
					+ "\n\t1 - Comer"
					+ "\n\t2 - Dormir"
					+ "\n\t3 - Jugar"
					+ "\n\t4 - Relajarse"
					+(tamagotchi.getEspecie()==Especie.GATO?"\n\t5 - Causar caos":"")
					+(tamagotchi.getEspecie()==Especie.PERRO?"\n\t5 - Pasear":""));
			
			opcion = Byte.parseByte(sc.nextLine());
			
			switch(opcion) {
			case 1: // Comer
				Comida hamburguesa = new Comida("Hamburguesa",(byte) 7,(byte) 2);
				tamagotchi.comer(hamburguesa);
				break;
			case 2: // Dormir
				tamagotchi.dormir();
				break;
			case 3: // Jugar
				Juego futboll = new Juego("Futboll",(byte) 8,(byte) 8);
				tamagotchi.jugar(futboll);
				break;
			case 4: // Relajarse
				tamagotchi.relajarse();
				break;
			case 5: // Causar caos o Pasear
				if(tamagotchi.getEspecie() == Especie.GATO) {
					((Gato)tamagotchi).causarCaos();
				} else if (tamagotchi.getEspecie() == Especie.PERRO) {
					((Perro)tamagotchi).pasear();
				}
				break;
			default:
				System.out.println("Esa opcion no es válida.");
				break;
			}
			
			System.out.println(tamagotchi);
		}
		
	}

}
