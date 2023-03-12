package main;

import java.util.Scanner;

import clases.GrupoDeFurtivos;
import clases.GrupoDeGuardias;
import clases.ResponsableDeCoordinacion;
import enums.Peligrosidad;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		GrupoDeGuardias[] guardias = {new GrupoDeGuardias("Alfa", Peligrosidad.GRAVE),
				new GrupoDeGuardias("Beta", Peligrosidad.MODERADA), new GrupoDeGuardias("Omega", Peligrosidad.LEVE)};
		
		
		ResponsableDeCoordinacion responsable = new ResponsableDeCoordinacion(guardias);
		
		System.out.println("Dime el nombre del grupo de furtivos");
		String nombre = sc.nextLine();
		
		System.out.println("Dime la zona de incidencia");
		byte zona = Byte.parseByte(sc.nextLine());
		
		System.out.println("¿Cual es el nivel de amenaza?" 
				+ "\n\t 1 - GRAVE"
				+ "\n\t 2 - MODERADA"
				+ "\n\t 3 - LEVE");
		byte opcion = Byte.parseByte(sc.nextLine());
		Peligrosidad peligro = null;
		switch(opcion) {
		case 1: // GRAVE
			peligro = Peligrosidad.GRAVE;
			break;
		case 2: // MODERADA
			peligro = Peligrosidad.MODERADA;
			break;
		case 3: // Leve
			peligro = Peligrosidad.LEVE;
			break;
		}
		
		GrupoDeFurtivos furtivos = responsable.avisarGuardias(nombre, zona, peligro);
		
		System.out.println(furtivos);
		
	}

}
