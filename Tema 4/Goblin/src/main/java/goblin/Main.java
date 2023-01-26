package goblin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char genero = '!';
		String nombreJugador = null;

		// Busco por argumentos el genero o el nombreJugador
		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-g")) {
				genero = args[i + 1].charAt(0);
			}

			if (args[i].equals("-n")) {
				nombreJugador = args[i + 1];
			}
		}
		// Si no encuentro el genero, lo pido por teclado
		if (genero != 'm' && genero != 'f' && genero != 'n') {
			genero = Funciones.pideGenero();
		}
		// Si no encuentro un nombreJugador, lo pido por teclado
		if (nombreJugador == null) {
			System.out.println("Dime el nombre de tu personaje");
			nombreJugador = sc.nextLine();
		}

		byte opcion;
		// Le damos a elegir al usuario entre 3 opciones
		do {
			System.out.println("¿Como vas a querer jugar?" + "\t\n 1 - Jugador en 1D" + "\t\n 2 - Jugador en 2D"
					+ "\t\n 3 - Jugador en 3D");
			opcion = Byte.parseByte(sc.nextLine());
		} while (opcion != 1 && opcion != 2 && opcion != 3);

		switch (opcion) {
		case 1:
			Funciones1D.jugar(nombreJugador, genero);
			break;
		case 2:
			Funciones2D.jugar(nombreJugador, genero);
			break;
		case 3:
			Funciones3D.jugar(nombreJugador, genero);
			break;
		}

		System.out.println(nombreJugador + " " + genero);

	}

}
