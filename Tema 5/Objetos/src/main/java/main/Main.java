package main;

import java.util.Scanner;

import clases.Animal;
import clases.Gato;
import clases.Sim;
import enums.Especie;
import enums.Genero;
import excepciones.NombreConNumerosException;

public class Main {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dime los apellidos");
	String apellidos = sc.nextLine();
	byte opcionGenero;
	do {
		System.out.println("Dime su genero 1 - MASCULINO | 2 - FEMENINO | 3 - NEUTRO");
		opcionGenero = Byte.parseByte(sc.nextLine());
	}while(opcionGenero < 1 || opcionGenero > 3);
	Genero genero;
	
	switch(opcionGenero) {
	case 1:
		genero = Genero.MASCULINO;
		break;
	case 2:
		genero = Genero.FEMENINO;
		break;
	default:
		genero = Genero.NEUTRO;
	}
	Sim miSim = null;
	boolean nombreOk = false;
	do {
		try {
			System.out.println("Dime el nombre del SIM");
			String nombre = sc.nextLine();
			miSim = new Sim(nombre, apellidos, genero);
			nombreOk = true;
		} catch(NombreConNumerosException e) {
			System.err.println(e.getMessage());
		}
	}while(!nombreOk);
	
		
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
			nombreOk = false;
			do {
				try {
					System.out.println("Dime su nuevo nombre");
					miSim.setNombre(sc.nextLine());
					nombreOk = true;
				} catch (NombreConNumerosException e) {
					System.err.println(e.getMessage());
				}
			}while (!nombreOk);
			break;
		case 3:
			System.out.println("Dime su nuevo apellido");
			miSim.setApellido(sc.nextLine());
			break;
		case 4:
			do {
				System.out.println("Dime su genero 1 - MASCULINO | 2 - FEMENINO | 3 - NEUTRO");
				opcionGenero = Byte.parseByte(sc.nextLine());
			}while(opcionGenero < 1 || opcionGenero > 3);
			switch(opcionGenero) {
			case 1:
				genero = Genero.MASCULINO;
				break;
			case 2:
				genero = Genero.FEMENINO;
				break;
			default:
				genero = Genero.NEUTRO;
			}
			miSim.setGenero(genero);
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
			byte opcionEspecie;
			do {
				System.out.println("Dime la especie 1 - Gato 2 - Perro 3 - Pavo Real");
				opcionEspecie = Byte.parseByte(sc.nextLine());
			}while(opcionEspecie < 1 || opcionEspecie > 3);
			System.out.println("Dime la especie 1 - Gato 2 - Perro 3 - Pavo Real");
			Especie especie;
			switch(opcionEspecie) {
			case 1:
				especie = Especie.GATO;
				break;
			case 2:
				especie = Especie.PERRO;
				break;
			default:
				especie = Especie.PAVO_REAL;
			}
			System.out.println("Dime la raza");
			String raza = sc.nextLine();
			System.out.println("Dime el nombre");
			String nombreMascota = sc.nextLine();
			byte opcionGeneroAnimal;
			do {
				System.out.println("Dime el genero del animal 1 - MASCULINO | 2 - FEMENINO | 3 - NEUTRO");
				opcionGeneroAnimal = Byte.parseByte(sc.nextLine());
			}while(opcionGeneroAnimal < 1 || opcionGeneroAnimal > 3);
			Genero generoMascota;
			
			switch(opcionGenero) {
			case 1:
				generoMascota = Genero.MASCULINO;
				break;
			case 2:
				generoMascota = Genero.FEMENINO;
				break;
			default:
				generoMascota = Genero.NEUTRO;
			}
			
			if(especie == Especie.GATO) {
				miSim.getMascotas()[0] = new Gato(nombreMascota, generoMascota, raza, miSim);
			} else {
				miSim.getMascotas()[0] = new Animal(nombreMascota, generoMascota, especie, raza, miSim);
			}
			break;
		}
	}while(opcion != 0);
	
	
	
	
	
	
	}
}
