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
		
		String nombre;
		String nombreAnimal = "";
		Especies especie = null;
		byte edad;
		
		System.out.println("¿Como quieres que se llame tu Tamagotchi?");
		nombre = sc.nextLine();
		System.out.println("¿Dime la edad de tu Tamagotchi?");
		edad = Byte.parseByte(sc.nextLine());
		
		System.out.println("Si el Tamagotchi llega a 70 años, morira automaticamente." + "\n");
		Tamagotchi tamagotchi = new Tamagotchi(nombre, edad);

		
		System.out.println("¿Quieres que tu Tamagotchi tenga algun animal?");
		System.out.println("¿Que animal quieres que tenga?"
				+ "\n\t 1 - GATO"
				+ "\n\t 2 - PERRO"
				+ "\n\t 3 - DRAGON"
				+ "\n\t 4 - POLLITO"
				+ "\n\t 5 - Sin animal");
		byte opcionComprarAnimal = Byte.parseByte(sc.nextLine());
		switch(opcionComprarAnimal) {
		case 1:
			especie = Especies.GATO;
			System.out.println("Dime el nombre del gato");
			nombreAnimal = sc.nextLine();
			break;
		case 2:
			especie = Especies.PERRO;
			System.out.println("Dime el nombre del perro");
			nombreAnimal = sc.nextLine();
			break;
		case 3:
			especie = Especies.DRAGON;
			break;
		case 4:
			especie = Especies.POLLITO;
			break;
		default:
			System.out.println("Sin animal");
		};
		
		Gato gato = new Gato(nombreAnimal);
		Perro perro = new Perro(nombreAnimal);
		
		System.out.println(tamagotchi);
		
		while(tamagotchi.estarVivo() == true) {
			System.out.println("¿Que quieres hacer este turno?"
					+ "\n\t 1 - Dar de comer a " + tamagotchi.getNombre()
					+ "\n\t 2 - Obligar a dormir a " + tamagotchi.getNombre()
					+ "\n\t 3 - Obligar a jugar a " + tamagotchi.getNombre()
					+ "\n\t 4 - Dejar que tu gato haga el caos"
					+ "\n\t 5 - Pasear a tu perro");
			byte opciones = Byte.parseByte(sc.nextLine());
			switch(opciones) {
			case 1:
				System.out.println("¿Que quieres darle de comer?");
				String nombreComida = sc.nextLine();
				System.out.println("¿Cuanto va a saciar la comida? (0-50)");
				byte comidaSaciar = Byte.parseByte(sc.nextLine());
				while(comidaSaciar < 0 || comidaSaciar > 50) {
					System.out.println("¿Cuanto va a saciar la comida? (0-50)");
					comidaSaciar = Byte.parseByte(sc.nextLine());
				}
				Comida comida = new Comida(nombreComida, comidaSaciar);
				tamagotchi.comer(comida);
				break;
			case 2:
				tamagotchi.dormir();
				break;
			case 3:
				System.out.println("¿Que juego va a jugar?");
				String nombreJuego = sc.nextLine();
				System.out.println("¿Cuanta diversion va a dar el juego? (0-50)");
				byte diversionJuego = Byte.parseByte(sc.nextLine());
				while(diversionJuego < 0 || diversionJuego > 50) {
					System.out.println("¿Cuanta diversion va a dar el juego? (0-50)");
					diversionJuego = Byte.parseByte(sc.nextLine());
				}
				System.out.println("¿Cuanto estres va a reducir el juego? (0-50)");
				byte estresReduccion = Byte.parseByte(sc.nextLine());
				while(estresReduccion < 0 || estresReduccion > 50) {
					System.out.println("¿Cuanto estres va a reducir el juego? (0-50)");
					estresReduccion = Byte.parseByte(sc.nextLine());
				}
				Juego juego = new Juego(nombreJuego, diversionJuego, estresReduccion);
				tamagotchi.jugar(juego);
				break;
			case 4:
				if(especie == Especies.GATO) {
					gato.causarCaos();
					System.out.println("Nombre: " + gato.getNombre() + "\nCaos: " + gato.getCausarCaos() + "\n");
				} else {
					System.out.println("No tienes un gato.");
				}
				break;
			case 5:
				if(especie == Especies.PERRO) {
					perro.pasear();
					System.out.println("Nombre: " + perro.getNombre() + "\nPaseo: " + perro.getPaseo() + "\n");
				} else {
					System.out.println("No tienes un perro.");
				}
				break;
			}
		tamagotchi.setHambre((byte) (tamagotchi.getHambre()-5));
		tamagotchi.setSueño((byte) (tamagotchi.getSueño()-5));
		tamagotchi.setDiversion((byte) (tamagotchi.getDiversion()-5));
		tamagotchi.setEstres((byte) (tamagotchi.getEstres()+5));
		tamagotchi.crecer();
		
		System.out.println(tamagotchi + "\n");
		}
		
		System.out.println(tamagotchi.getNombre() + " a muerto.");

	}

}
