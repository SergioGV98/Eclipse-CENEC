package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte puntuacion = 0;
		byte respuesta = 0;

		System.out.println("¿Eres de playa o de montaña?");
		System.out.println("\n\t1 - Playa" + "\n\t2 - Montaña" + "\n\t3 - Ninguno");
		do {
			respuesta = Byte.parseByte(sc.nextLine());
			switch (respuesta) {
			case 1:
				System.out.println("Me gusta la playa");
				puntuacion += 10;
				break;
			case 2:
				System.out.println("Me gusta la montaña");
				puntuacion += 5;
				break;
			case 3:
				System.out.println("No me gusta ninguno");
				puntuacion += 0;
				break;
			}

		} while (respuesta != 1 && respuesta != 2 && respuesta != 3);

		System.out.println("¿Eres de pajaros o de peces");
		System.out.println("\n\t1 - Peces" + "\n\t2 - Pajaros" + "\n\t3 - Ninguno");

		do {
			respuesta = Byte.parseByte(sc.nextLine());
			switch (respuesta) {
			case 1:
				System.out.println("Me gusta los peces");
				puntuacion += 10;
				break;
			case 2:
				System.out.println("Me gusta los pajaros");
				puntuacion += 5;
				break;
			case 3:
				System.out.println("No me gusta ninguno");
				puntuacion += 0;
				break;
			}

		} while (respuesta != 1 && respuesta != 2 && respuesta != 3);

		System.out.println("¿Te gusta bañarte en la playa o prefieres acampar");
		System.out.println("\n\t1 - Bañarme" + "\n\t2 - Acampar" + "\n\t3 - Ninguno");

		do {
			respuesta = Byte.parseByte(sc.nextLine());
			switch (respuesta) {
			case 1:
				System.out.println("Me gusta bañarme en la playa");
				puntuacion += 10;
				break;
			case 2:
				System.out.println("Me gusta acampar en la montaña");
				puntuacion += 5;
				break;
			case 3:
				System.out.println("No me gusta ninguno");
				puntuacion += 0;
				break;
			}

		} while (respuesta != 1 && respuesta != 2 && respuesta != 3);

		if(puntuacion >15 && puntuacion <= 30) {
			System.out.println("Prefieres el mar");
		}
		if(puntuacion > 5 && puntuacion < 15) {
			System.out.println("Prefieres la montaña");
		} 
		if(puntuacion < 5) {
			System.out.println("Prefieres ninguno");
		}
	}
}
