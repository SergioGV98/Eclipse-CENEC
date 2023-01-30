package amongUs;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char teclaIzda = 'a';
		char teclaDcha = 'd';
		short turnoStun = 0;
		boolean estaMuerto = false;

		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-teclaIzda")) {
				teclaIzda = args[i + 1].toLowerCase().charAt(0);
			}
			if (args[i].equals("-teclaDcha")) {
				teclaDcha = args[i + 1].toLowerCase().charAt(0);
			}
		}

		System.out.println("AAAAA Que viene el Amongus AAAAA");
		byte tamaño;
		do {
			System.out.println("Dime tamaño del tablero ( 5 - 15)");
			tamaño = Byte.parseByte(sc.nextLine());
		} while (tamaño < 5 || tamaño > 15);

		// Pido el nº de muertes objetivo
		System.out.println("¿Cuantas personas quieres matar?");
		byte muertesObjetivo = Byte.parseByte(sc.nextLine());
		byte contadorMuertes = 0;

		// Generamos el tablero y la calavera inicial
		String[] tablero = Funciones.generaTablero(tamaño);
		// El segundo tablero tumbas, va a servir para colocar las tumbas
		// en las posiciones en las que se vayan produciendo las muertes.
		String[] tumbas = Funciones.generaTablero(tamaño);
		byte posCalavera = Funciones.colocarElemento(tablero, 'M');
		byte posHumano = Funciones.colocarElemento(tablero, 'H');
		System.out.println(Funciones.imprimeTablero(tablero, tumbas));
		short contadorTurnos;

		// Bucle del juego
		for (contadorTurnos = 0; muertesObjetivo > contadorMuertes; contadorTurnos++) {
			Random r = new Random();
			// 1 - Obtener las entradas
			byte direccionMovimiento = 0;
			System.out
					.println("¿A dónde quieres moverte? (Izquierda - " + teclaIzda + " / Derecha - " + teclaDcha + ")");
			char direccion = sc.nextLine().charAt(0);
			if (direccion == teclaIzda) {
				if (posCalavera != 0) {
					direccionMovimiento = -1;
				} else {
					direccionMovimiento = (byte) (tablero.length - 1);
				}
			} else if (direccion == teclaDcha) {
				if (posCalavera != tablero.length - 1) {
					direccionMovimiento = 1;
				} else {
					direccionMovimiento = (byte) (posCalavera * -1);
				}
			}
			// 1.1 - Direccion para los humanos automatica
			// 2 - Calcular las consecuencias
			// 2.1 - La clavera se mueve
			tablero[posCalavera] = "_";
			posCalavera += direccionMovimiento;
			tablero[posCalavera] = "M";
			// 2.2 - Si nuestro PJ pilla al humano, lo matamos
			if (posCalavera == posHumano) {
				contadorMuertes++;
				estaMuerto = true;
				tumbas[posCalavera] = "T";
				if (contadorMuertes < muertesObjetivo) {
					posHumano = Funciones.colocarElemento(tablero, 'H');
				}
			}
			// 2.3 - Movimiento aleatorio del humano y movimiento de huida
			byte numero = (byte) r.nextInt(0, 2);
			if (estaMuerto == false) {
				if (turnoStun != contadorTurnos) {
					if (muertesObjetivo / 2 >= contadorMuertes) {
						if (numero == 0) {
							if (posHumano == 0) {
								tablero[posHumano] = "_";
								posHumano = (byte) (tablero.length - 1);
								tablero[posHumano] = "H";
							} else {
								tablero[posHumano] = "_";
								posHumano = (byte) (posHumano - 1);
								tablero[posHumano] = "H";
							}
						} else {
							if (posHumano == tablero.length - 1) {
								tablero[posHumano] = "_";
								posHumano = 0;
								tablero[posHumano] = "H";
							} else {
								tablero[posHumano] = "_";
								posHumano = (byte) (posHumano + 1);
								tablero[posHumano] = "H";
							}
						}

					} else {
						// Caso en el que el humano huye de nosotros
						if (direccion == teclaIzda) {
							if (posHumano == 0) {
								// Caso extremo izquierda
								tablero[posHumano] = "_";
								posHumano = (byte) (tablero.length - 1);
								tablero[posHumano] = "H";
							} else {
								tablero[posHumano] = "_";
								posHumano = (byte) (posHumano - 1);
								tablero[posHumano] = "H";
							}
						}
						if (direccion == teclaDcha) {
							if (posHumano == tablero.length - 1) {
								// Caso extremo derecha
								tablero[posHumano] = "_";
								posHumano = 0;
								tablero[posHumano] = "H";
							} else {
								tablero[posHumano] = "_";
								posHumano = (byte) (posHumano + 1);
								tablero[posHumano] = "H";
							}
						}

					}
					if (posCalavera == posHumano) {
						tablero[posHumano] = "M";
						contadorMuertes++;
						tumbas[posCalavera] = "T";
						if (contadorMuertes < muertesObjetivo) {
							posHumano = Funciones.colocarElemento(tablero, 'H');
						}
					}
					if (tumbas[posHumano].equals("T")) {
						turnoStun = (short) (contadorTurnos + 1);
					}
				}
			} else {
				estaMuerto = true;
			}
			// 3 - Imprimir la siguiente imagen
			System.out.println("\n\nMuertes: " + contadorMuertes + "/" + muertesObjetivo);
			System.out.println("Llevas " + contadorTurnos + " turnos.");
			System.out.println(Funciones.imprimeTablero(tablero, tumbas));
		}

		// Imprime nuestras estadisticas
		contadorTurnos = (short) (contadorTurnos - 1);
		System.out.println("Has tardado " + contadorTurnos + " turnos.");

	}

}
