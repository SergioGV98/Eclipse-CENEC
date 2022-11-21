package tamagotchi;

import java.util.Random;

public class Muerte {

	public static void muerte(byte razaElegida, byte turnos, String nombre) {
		
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(1, 5);
		
		
		System.out.println("  ________________________");
		System.out.println("|\\________________________\\");
		System.out.println("| |	     D.E.P         |");
		if(razaElegida == 1) {
			System.out.println("| |    " + nombre + " el Perro" + "     |");
		}
		if(razaElegida == 2) {
			System.out.println("| |    " + nombre + " el Gato" + "      |");
		}
		if(razaElegida == 3) {
			System.out.println("| |  " + nombre + " el Hipopótamo" + "  |");
		}
		if(razaElegida == 4) {
			System.out.println("| |    " + nombre + " el Carpincho" + " |");
		}
		
		if(numero == 1) {
			System.out.println("| |  " + "Se ha morido" + "         |");
		}
		if(numero == 2) {
			System.out.println("| |  " + "Dimitió de existir" + "    |");
		}
		if(numero == 3) {
			System.out.println("| |  " + "La ha espichado" + "  |");
		}
		if(numero == 4) {
			System.out.println("| |" + "Viaja hacia las estrellas" + "|");
		}
		
		System.out.println("| |     Vivio " + turnos + " turnos" + "     |");
		System.out.println("| |                        |");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
