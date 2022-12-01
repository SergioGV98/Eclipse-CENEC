package tema3;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase principal que contiene el main
 * 
 * @author Sergio García Vico
 *
 */


public class Examen {

	/**
	 * Main que nos pide elegir entre dos opciones, si introducir un numero del 1 al 5
	 * el cual usaremos mas tarde para que el usuario decida con dos opciones 1 o 2, si
	 * introducir los usuarios a mano o generarlos aleatoriamente.
	 * 
	 * @param args sin uso
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte numero = 0;
		byte veces;
		short horasJugadasTotales = 0;
		short minimo = (short) Float.MAX_VALUE;
		
		String datosCompletos = "";
		String jugadorViciado = "";

		do {

			System.out.println("Dime un numero del 1 al 5");
			numero = Byte.parseByte(sc.nextLine());

		} while (numero < 1 || numero > 5);

		veces = numero;

		do {
			System.out.println("Elige una de estas opciones." + "\n\t1 - Generar a las personas aleatoriamente."
					+ "\n\t2 - Introducir los datos de las personas por teclado.");
			numero = Byte.parseByte(sc.nextLine());

		} while (numero < 1 || numero > 2);

		switch (numero) {
		case 1:
			Random r = new Random();
			byte generoRandom;
			String nombreRandom;
			String primerApellidoRandom;
			String segundoApellidoRandom;
			char generoAleatorio = ' ';
			short nacimientoRandom;
			short horasJugadasRandom;
			byte juegosCompletadosAleatorio;
			
			for (byte i = 1; i <= veces; i++) {
				generoRandom = (byte) (r.nextInt(1, 3));
				nacimientoRandom = (short) r.nextInt(1970, 2004);
				horasJugadasRandom = (short) r.nextInt(0, 501);
				juegosCompletadosAleatorio = (byte) r.nextInt(0, 31);
				switch (generoRandom) {
				case 1:
					generoAleatorio = 'm';
					break;
				case 2:
					generoAleatorio = 'f';
					break;
				}
				
				nombreRandom = Funciones.generarNombreAleatorio(generoAleatorio);
				primerApellidoRandom = Funciones.generaApellidoAleatorio();
				segundoApellidoRandom = Funciones.generaApellidoAleatorio();
				
				if(horasJugadasRandom > minimo) {
					minimo = horasJugadasRandom;
					jugadorViciado = Funciones.imprimeDatosPersona(nombreRandom, primerApellidoRandom, segundoApellidoRandom, nacimientoRandom, horasJugadasRandom, juegosCompletadosAleatorio);
				} 
				
				datosCompletos += " " + Funciones.imprimeDatosPersona(nombreRandom, primerApellidoRandom, segundoApellidoRandom, nacimientoRandom, horasJugadasRandom, juegosCompletadosAleatorio);
				
				horasJugadasTotales += horasJugadasRandom;
				
			}
			
			System.out.println(datosCompletos);
			
			System.out.println("Horas totales jugadas por todos los jugadores: " + horasJugadasTotales);
			System.out.println("Jugador mas viciado: " + "\n" + jugadorViciado);
			
			break;

		case 2:
			System.out.println("Vamos a proceder a introducir " + veces + " usuarios.");

			for (byte i = 1; i <= veces; i++) {
				char genero = ' ';
				String nombre;
				String primerApellido;
				String segundoApellido;
				short fechaNacimiento;
				short horasJugadas;
				byte juegosCompletados;

				System.out.println("Usuario " + "(" + i + "/" + veces + ")");

				System.out.println("Introduceme el genero del usuario f (femenino) o m (masculino).");
				genero = sc.nextLine().charAt(0);
				while (genero != 'f' && genero != 'm') {
					System.out.println("Debes ser f (femenino) o m (masculino), en minuscula.");
					genero = sc.nextLine().charAt(0);
				}

				System.out.println("Introduceme el nombre.");
				nombre = sc.nextLine();

				System.out.println("Introduceme el primer apellido.");
				primerApellido = sc.nextLine();

				System.out.println("Introduceme el segundo apellido.");
				segundoApellido = sc.nextLine();

				System.out.println("Introduceme el año de nacimiento.");
				fechaNacimiento = Short.parseShort(sc.nextLine());

				System.out.println("Introduceme el total de las horas jugada a videojuegos este año.");
				horasJugadas = Short.parseShort(sc.nextLine());

				System.out.println("Introduceme el total de videojuegos que has completado este año.");
				juegosCompletados = Byte.parseByte(sc.nextLine());
				
				if(horasJugadas > minimo) {
					minimo = horasJugadas;
					jugadorViciado = Funciones.imprimeDatosPersona(nombre, primerApellido, segundoApellido, fechaNacimiento, horasJugadas, juegosCompletados);
				} 
				
				datosCompletos += "" + Funciones.imprimeDatosPersona(nombre, primerApellido, segundoApellido, fechaNacimiento, horasJugadas, juegosCompletados);
				
				horasJugadasTotales += horasJugadas;
			}
			
			System.out.println(datosCompletos);
			
			System.out.println("Horas totales jugadas por todos los jugadores: " + horasJugadasTotales);
			System.out.println("Jugador mas viciado: " + "\n" + jugadorViciado);
			
			break;
		}

	}

}
