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
		boolean animalVivo;
		
		/** General Tamagotchi **/
		System.out.println("¿Como quieres que se llame tu Tamagotchi?");
		nombre = sc.nextLine();
		System.out.println("¿Dime la edad de tu Tamagotchi?");
		edad = Byte.parseByte(sc.nextLine());
		
		System.out.println("Si el Tamagotchi llega a 70 años, morira automaticamente. (Al final de cada turno, crecera un año | Equivale a lo 30 turnos pero mas chulo)" + "\n");
		System.out.println("Si el Animal llega a 25 años, morira automaticamente. (Al final de cada turno, crecera un año)" + "\n");
		Tamagotchi tamagotchi = new Tamagotchi(nombre, edad);
		
		/** Animal del Tamagotchi **/
		Comida comidaAnimal = new Comida("Pienso basico", (byte) 20);
		Juego juegoBasico = new Juego("Jugar con una pelota", (byte) 20, (byte) 20);
		System.out.println("¿Quieres que tu tamagochi tenga algun animal (Solo el PERRO y el GATO son animales jugables)?"
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
			animalVivo = true;
			break;
		case 2:
			especie = Especies.PERRO;
			System.out.println("Dime el nombre del perro");
			nombreAnimal = sc.nextLine();
			animalVivo = true;
			break;
		case 3:
			especie = Especies.DRAGON;
			animalVivo = true;
			break;
		case 4:
			especie = Especies.POLLITO;
			animalVivo = true;
			break;
		default:
			animalVivo = false;
			System.out.println("Sin animal");
		};
		
		Gato gato = new Gato(nombreAnimal, (byte) 1);
		Perro perro = new Perro(nombreAnimal, (byte) 1);
		
		System.out.println("-------------TAMAGOTCHI-------------\n"+tamagotchi);
		
		/** Empieza el juegp **/
		
		while(tamagotchi.estarVivo() == true) {
			System.out.println("¿Que quieres hacer este turno?"
					+ "\n\t 1 - Comer"
					+ "\n\t 2 - Dormir"
					+ "\n\t 3 - Jugar (Sirve para reduccir el estres y subir la diversion)"
					+ "\n\t 4 - Relajarse");
			byte opciones = Byte.parseByte(sc.nextLine());
			switch(opciones) {
			case 1:
				System.out.println("¿Que quieres comer?");
				String nombreComida = sc.nextLine();
				System.out.println("¿Cuanto va a saciarte la comida? (0-50)");
				byte comidaSaciar = Byte.parseByte(sc.nextLine());
				while(comidaSaciar < 0 || comidaSaciar > 50) {
					System.out.println("¿Cuanto va a saciar la comida? (0-50)");
					comidaSaciar = Byte.parseByte(sc.nextLine());
				}
				Comida comida = new Comida(nombreComida, comidaSaciar);
				System.out.println("¡Has disfrutado mucho comiendo " + comida.getNombre() + "!");
				tamagotchi.comer(comida);
				break;
			case 2:
				tamagotchi.dormir();
				break;
			case 3:
				System.out.println("¿Que juego va a jugar?");
				String nombreJuego = sc.nextLine();
				System.out.println("¿Cuanta diversion va a generar el juego? (0-50)");
				byte diversionJuego = Byte.parseByte(sc.nextLine());
				while(diversionJuego < 0 || diversionJuego > 50) {
					System.out.println("¿Cuanta diversion va a generar el juego? (0-50)");
					diversionJuego = Byte.parseByte(sc.nextLine());
				}
				System.out.println("¿Cuanto estres va a reducir el juego? (0-50)");
				byte estresReduccion = Byte.parseByte(sc.nextLine());
				while(estresReduccion < 0 || estresReduccion > 50) {
					System.out.println("¿Cuanto estres va a reducir el juego? (0-50)");
					estresReduccion = Byte.parseByte(sc.nextLine());
				}
				Juego juego = new Juego(nombreJuego, diversionJuego, estresReduccion);
				System.out.println("¡Has disfrutado mucho jugando " + juego.getNombre() + "!");
				tamagotchi.jugar(juego);
				break;
			case 4:
				tamagotchi.relajarse();
			}
			
			// Mascota
			if(animalVivo == true) {
				System.out.println("¿Que deberia hacer tu animal?"
						+ "\n\t 1 - Alimentar al animal"
						+ "\n\t 2 - Mandar a dormir al animal"
						+ "\n\t 3 - Jugar con el animal (Sirve para reduccir el estres y subir la diversion)"
						+ "\n\t 4 - Dejar que tu gato haga el caos (Reduce estres y reduce caos)"
						+ "\n\t 5 - Pasear a tu perro");
				opciones = Byte.parseByte(sc.nextLine());
				switch(opciones) {
				case 1: // ALIMENTAR ANIMAL
					if(especie == Especies.GATO) {
						gato.comer(comidaAnimal);
					} else if (especie == Especies.PERRO) {
						perro.comer(comidaAnimal);
					}
					System.out.println("¡Has dado de comer " + comidaAnimal.getNombre() + " a tu mascota!");
					break;
				case 2: // DORMIR ANIMAL
					if(especie == Especies.GATO) {
						gato.dormir();
					} else if (especie == Especies.PERRO) {
						perro.dormir();
					}
					break;
				case 3: // JUGAR CON EL ANIMAL
					if(especie == Especies.GATO) {
						gato.jugar(juegoBasico);
					} else if (especie == Especies.PERRO) {
						perro.jugar(juegoBasico);
					}
					System.out.println("¡Vas a " + juegoBasico.getNombre() + " con tu mascota!");
					break;
				case 4: // DEJAR QUE TU GATO HAGA EL CAOS
					if(especie == Especies.GATO && animalVivo == true) {
						gato.causarCaos();
						gato.relajarse();
					} else {
						System.out.println("No tienes un gato.");
					}
					break;
				case 5:
					if(especie == Especies.PERRO && animalVivo == true) {
						perro.pasear();
					} else {
						System.out.println("No tienes un perro.");
					}
					break;
				}
			} 
				
			if(especie == Especies.GATO && (gato.getEdad() >= 25 || gato.getHambre() <= 0 || gato.getSueño() <= 0 || gato.getDiversion() <= 0 || gato.getEstres() >= 100 || gato.getCausarCaos() >= 100)) {
				System.out.println("Tu gato "+ gato.getNombre() + " ha muerto");
				animalVivo = false;
			}
			if(especie == Especies.PERRO && (perro.getEdad() >= 25 || perro.getHambre() <= 0 || perro.getSueño() <= 0 || perro.getDiversion() <= 0 || perro.getEstres() >= 100 || perro.getPaseo() <= 0)) {
				System.out.println("Tu perro "+ perro.getNombre() + " ha muerto");
				animalVivo = false;
			}
 
		/** Tamagotchi reducciones **/
		tamagotchi.setHambre((byte) (tamagotchi.getHambre()-5));
		tamagotchi.setSueño((byte) (tamagotchi.getSueño()-5));
		tamagotchi.setDiversion((byte) (tamagotchi.getDiversion()-5));
		tamagotchi.setEstres((byte) (tamagotchi.getEstres()+5));
		tamagotchi.crecer();
		/** Animal reducciones **/
		if (especie == Especies.GATO && animalVivo == true) {
			gato.setHambre((byte) (gato.getHambre()-5));
			gato.setSueño((byte) (gato.getSueño()-5));
			gato.setDiversion((byte) (gato.getDiversion()-5));
			gato.setEstres((byte) (gato.getEstres()+5));
			gato.setCausarCaos((byte) (gato.getCausarCaos()+5));
			gato.crecer();
		}
		if (especie == Especies.PERRO && animalVivo == true) {
			perro.setHambre((byte) (perro.getHambre()-5));
			perro.setSueño((byte) (perro.getSueño()-5));
			perro.setDiversion((byte) (perro.getDiversion()-5));
			perro.setEstres((byte) (perro.getEstres()+5));
			perro.setPaseo((byte) (perro.getPaseo()+5));
			perro.crecer();
		}
		
		System.out.println("-------------TAMAGOTCHI-------------\n"+tamagotchi+"\n");
		if(animalVivo == true && especie == Especies.GATO) {
			System.out.println("-------------ANIMAL-------------\n"+gato+"\n");
		} else if (animalVivo == true && especie == Especies.PERRO) {
			System.out.println("-------------ANIMAL-------------\n"+perro+"\n");
		}
	}

	System.out.println(tamagotchi.getNombre() + " a muerto con edad de " + tamagotchi.getEdad());

	}

}
