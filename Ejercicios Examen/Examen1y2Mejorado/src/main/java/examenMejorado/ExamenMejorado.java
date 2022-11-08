package examenMejorado;

import java.util.Scanner;

public class ExamenMejorado {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int suscriptores;
		int horas;
		int horasTotales = 0;
		boolean horasComprobador = false;
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
			horas = Integer.parseInt(sc.nextLine());
			horasTotales += horas;
			
			if(horasTotales > 1000) {
				horasComprobador = true;
			}
			
			nCanalesIntroducidos++;
			System.out.println("¿Quieres introducir mas suscriptores (True o False)?");
			otroCanal = Boolean.parseBoolean(sc.nextLine());

		} while (otroCanal == true);
		
		System.out.println("Media suscriptroes: " + suscriptoresTotales / nCanalesIntroducidos);
		System.out.println("Media de horas: " + horasTotales);
		System.out.println(horasComprobador && suscriptoresComprobador);
		
	}
}