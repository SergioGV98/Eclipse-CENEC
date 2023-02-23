package main;

import java.util.Scanner;

import clases.Animal;
import clases.Gato;
import clases.Sim;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dime el nombre del SIM");
	String nombre = sc.nextLine();
	System.out.println("Dime los apellidos");
	String apellidos = sc.nextLine();
	System.out.println("Dime su genero (h/m)");
	char genero = sc.nextLine().charAt(0);
	
	Sim miSim = new Sim(nombre, apellidos, genero);
		
	byte opcion;
	
	do {
		System.out.println("¿Que quieres hacer con tu sim?" 
				+ "\0 - Salir"
				+ "\n\t1 - Imprimir"
				+ "\n\t2 - Cambiar nombre"
				+ "\n\t3 - Cambiar apellidos"
				+ "\n\t4 - Cambiar genero"
				+ "\n\t5 - Comer"
				+ "\n\t6 - Dormir"
				+ "\n\t7 - Jugar"
				+ "\n\t8 - Ducharse"
				+ "\n\t9 - Crear mascota");
		opcion = Byte.parseByte(sc.nextLine());
		
		switch(opcion) {
		case 1:
			System.out.println(miSim);
			break;
		case 2:
			System.out.println("Dime su nuevo nombre");
			miSim.setNombre(sc.nextLine());
			break;
		case 3:
			System.out.println("Dime su nuevo apellido");
			miSim.setApellido(sc.nextLine());
			break;
		case 4:
			System.out.println("Dime su nuevo genero");
			miSim.setGenero(sc.nextLine().charAt(0));
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			miSim.setMascotas(new Animal[1]);
			System.out.println("Dime la especie");
			String especie = sc.nextLine();
			System.out.println("Dime la raza");
			String raza = sc.nextLine();
			System.out.println("Dime el nombre");
			String nombreMascota = sc.nextLine();
			System.out.println("Dime el genero");
			char generoMascota = sc.nextLine().charAt(0);
			if(especie.equals("Gato")) {
				miSim.getMascotas()[0] = new Gato(nombreMascota, generoMascota, raza, miSim);
			} else {
				miSim.getMascotas()[0] = new Animal(nombreMascota, generoMascota, especie, raza, miSim);
			}
			break;
		}
	}while(opcion != 0);
	
	}

}
