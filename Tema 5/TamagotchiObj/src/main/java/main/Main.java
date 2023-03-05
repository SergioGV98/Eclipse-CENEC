package main;

import java.util.Scanner;

import clases.Comida;
import clases.Gato;
import clases.Juego;
import clases.Perro;
import clases.Tamagotchi;
import enums.Especies;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Comida arroz = new Comida("Arroz", (byte) 10, (byte) 0);
		Comida pollo = new Comida("Pollo", (byte) 15, (byte) 5);
		Comida sushi = new Comida("Sushi", (byte) 20, (byte) 10);
		
		Juego lol = new Juego("League of Legends", (byte) 10, (byte) 30);
		Juego valorant = new Juego("Valorant", (byte) 20, (byte) 20);
		Juego programar = new Juego("Programar", (byte) 30, (byte) 10);
		
		Especies especie = null;
		Tamagotchi tamagotchi = null;

		System.out.println("¿De que Especie te gustaria que fuese tu Tamagotchi?" 
				+ "\n\t 1 - Perro" 
				+ "\n\t 2 - Gato" 
				+ "\n\t 3 - Dragon"
				+ "\n\t 4 - Pollito");
		
		byte opcion = Byte.parseByte(sc.nextLine());
		
		System.out.println("¿Como se llama tu Tamagotchi?");
		String nombre = sc.nextLine();
		
		System.out.println("¿Que edad quieres que tenga tu Tamagotchi (1 - 20)?");
		float edad = Float.parseFloat(sc.nextLine());
		while(edad < 1 || edad > 20) {
			System.out.println("Introduce una edad correcta (1 - 20)");
			edad = Float.parseFloat(sc.nextLine());
		}
		
		tamagotchi = new Tamagotchi(nombre, edad, especie);
		
		switch(opcion) {
		case 1: // Perro
			especie = Especies.PERRO;
			tamagotchi = new Perro(nombre, edad, especie);
			tamagotchi = (Perro) tamagotchi;
			break;
		case 2: // Gato
			especie = Especies.GATO;
			tamagotchi = new Gato(nombre, edad, especie);
			tamagotchi = (Gato) tamagotchi;
			break;
		case 3: // Dragon
			especie = Especies.DRAGON;
			tamagotchi = new Tamagotchi(nombre, edad, especie);
			tamagotchi = (Tamagotchi) tamagotchi;
			break;
		default: // Pollito
			especie = Especies.POLLITO;
			tamagotchi = new Tamagotchi(nombre, edad, especie);
			tamagotchi = (Tamagotchi) tamagotchi;
			break;
		}
		
		
		while(tamagotchi.estarVivo()) {
			
			System.out.println("¿Que quieres hacer?"
					+ "\n\t 1 - Comer (Reduce el hambre, pero sube el sueño)"
					+ "\n\t 2 - Dormir (Reduce el cansancio)"
					+ "\n\t 3 - Jugar (Sirve para reduccir el estres y subir la diversion)"
					+ "\n\t 4 - Relajarse (Sirve para reduccir el estres)"
					+ "\n\t 5 - Generar caos (Reduce las ganas de hacer el caos)"
					+ "\n\t 6 - Pasear (Reduce las ganas de pasear)");
			byte eleccion = Byte.parseByte(sc.nextLine());
			while(eleccion < 1 || eleccion > 6) {
				System.out.println("Introduce un numero correcto (1 - 6)");
				eleccion = Byte.parseByte(sc.nextLine());
			}
			
			switch(eleccion) {
			case 1: // Comer
				System.out.println("¿Que te gustaria comer?" 
						+ "\n\t 1 - " + arroz.getNombre() + "(Valor energetico " + arroz.getValorEnergetico() + ") " + "(Morriña " + arroz.getMorriña() + ")"
						+ "\n\t 2 - " + pollo.getNombre() + "(Valor energetico " + pollo.getValorEnergetico() + ") " + "(Morriña " + pollo.getMorriña() + ")"
						+ "\n\t 3 - " + sushi.getNombre() +  "(Valor energetico " + sushi.getValorEnergetico() + ") " + "(Morriña " + sushi.getMorriña() + ")");
				byte eleccionComida = Byte.parseByte(sc.nextLine());
				while(eleccionComida < 1 || eleccionComida > 3) {
					System.out.println("Introduce el numero correcto (1 - 3)");
					eleccionComida = Byte.parseByte(sc.nextLine());
				}
				switch(eleccionComida) {
				case 1: // Arroz
					tamagotchi.comer(arroz);
					System.out.println("¡Que rico estaba el " + arroz.getNombre() +"!");
					break;
				case 2: // Pollo
					tamagotchi.comer(pollo);
					System.out.println("¡Que rico estaba el " + pollo.getNombre() +"!");
					break;
				default: // Sushi
					tamagotchi.comer(sushi);
					System.out.println("¡Que rico estaba el " + sushi.getNombre() +"!");
					break;
				}
				break;
			case 2: // Dormir
				tamagotchi.dormir();
				System.out.println("¡Que bien he dormido!");
				break;
			case 3: // Jugar
				System.out.println("¿Que actividad te gustaria hacer?" 
						+ "\n\t 1 - " + lol.getNombre() + "(Diversion " + lol.getDiversion() + ") " + "(Estres " + lol.getEstres() + ")"
						+ "\n\t 2 - " + valorant.getNombre() + "(Diversion " + valorant.getDiversion() + ") " + "(Estres " + valorant.getEstres() + ")"
						+ "\n\t 3 - " + programar.getNombre() +  "(Diversion " + programar.getDiversion() + ") " + "(Estres " + programar.getEstres() + ")");
				byte eleccionJuego = Byte.parseByte(sc.nextLine());
				while(eleccionJuego < 1 || eleccionJuego > 3) {
					System.out.println("Introduce el numero correcto (1 - 3)");
					eleccionJuego = Byte.parseByte(sc.nextLine());
				}
				switch(eleccionJuego) {
				case 1: // League of legends
					tamagotchi.jugar(lol);
					System.out.println("¡Hasta los huevos del " + lol.getNombre() +"!");
					break;
				case 2: // Valorant
					System.out.println("Bastante facil el " + valorant.getNombre());
					tamagotchi.jugar(valorant);
					break;
				default: // Programar
					System.out.println(programar.getNombre() +" es la unica forma con la que transciendo.");
					tamagotchi.jugar(programar);
					break;
				}
				break;
			case 4: // Relajarse
				tamagotchi.relajarse();
				System.out.println("¡Hoy no voy a hacer el huevo!");
				break;
			case 5: // Generar caos
				if(especie == Especies.GATO) {
					((Gato) tamagotchi).causarCaos();
				} else {
					System.out.println("¡No eres un gato, no puedes hacer el caos!");
				}
				break;
			default: // Pasear
				if(especie == Especies.PERRO) {
					((Perro) tamagotchi).pasear();
				} else {
					System.out.println("¡No eres un gato, no puedes hacer el caos!");
				}
				break;
			}
				
			tamagotchi.setEstres(tamagotchi.getEstres());
			tamagotchi.setHambre(tamagotchi.getHambre());
			tamagotchi.setDiversion(tamagotchi.getDiversion());
			tamagotchi.setSueño(tamagotchi.getSueño());
			tamagotchi.crecer();
			
			if(especie == Especies.PERRO) {
				((Perro) tamagotchi).setPaseo((byte) ((byte) ((Perro) tamagotchi).getPaseo()+5));
			} else if (especie == Especies.GATO) {
				((Gato) tamagotchi).setCausarCaos((byte) (((Gato) tamagotchi).getCausarCaos()+5));
			}
			
			System.out.println(tamagotchi);
		
		}

	}

}
