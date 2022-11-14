package examenMejorado;

import java.util.Scanner;

public class ExamenMejorado {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int suscriptores;
		int minutos;
		int minutosTotales = 0;
		boolean minutosComprobador = false;
		long suscriptoresTotales = 0;
		boolean suscriptoresComprobador = false;
		byte nCanalesIntroducidos = 0;
		boolean otroCanal = true;

		// Introducir el numero de canales y su informacion.
		do {
			System.out.println("Introduceme los suscriptores");
			suscriptores = Integer.parseInt(sc.nextLine());
			suscriptoresTotales += suscriptores;
			
			if(suscriptores > 1000000) {
				suscriptoresComprobador = true;
			}
			
			System.out.println("Introduceme la duracion media de los videos");
			minutos = Integer.parseInt(sc.nextLine());
			minutosTotales += minutos;
			
			if(minutos > 1000) {
				minutosComprobador = true;
			}
			
			nCanalesIntroducidos++;
			System.out.println("¿Quieres introducir mas suscriptores (True o False)?");
			otroCanal = Boolean.parseBoolean(sc.nextLine());

		} while (otroCanal == true);
		
		System.out.println("Media suscriptroes: " + suscriptoresTotales / nCanalesIntroducidos);
		System.out.println("Media de horas totales: " + (minutosTotales/60f) / nCanalesIntroducidos);
		System.out.println("Comprobador (True o False) " + (minutosComprobador && suscriptoresComprobador));
		
	}
}