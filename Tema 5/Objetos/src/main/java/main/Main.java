package main;

import java.util.Scanner;

import clases.Gato;
import clases.Perro;
import clases.Sim;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Sim rodoberto = new Sim(); // Se le puede llamar instancia o objeto
		rodoberto.nombre = "Rodoberto";
		rodoberto.apellido = "Alarcon";
		rodoberto.genero = 'h';
		rodoberto.hambre = 0;
		rodoberto.aburrimiento = 0;
		rodoberto.sueño = 0;
		rodoberto.suciedad = 0;
		rodoberto.perros = new Perro[2];
		
		rodoberto.comer();
		
		Sim mariPepis = new Sim();
		mariPepis.nombre = "mariPepis";
		mariPepis.apellido = "Garcia";
		mariPepis.genero = 'm';
		mariPepis.hambre = 0;
		mariPepis.aburrimiento = 0;
		mariPepis.sueño = 0;
		mariPepis.suciedad = 0;
		mariPepis.padre = rodoberto;
		mariPepis.gatos = new Gato[2];
		
		mariPepis.comer();
		
		rodoberto.perros[0] = new Perro();
		rodoberto.perros[0].nombre = "Sputnik";
		rodoberto.perros[0].genero = 'h';
		rodoberto.perros[0].dueño = rodoberto;
		
		mariPepis.gatos[0] = new Gato();
		mariPepis.gatos[0].nombre = "Yuki";
		mariPepis.gatos[0].dueño = mariPepis;
		
		mariPepis.gatos[1] = new Gato();
		mariPepis.gatos[1].nombre = "Yuka";
		mariPepis.gatos[1].dueño = mariPepis;
			
		
		System.out.println(mariPepis + " mi padre es " + mariPepis.padre.nombre + " y el perro llamado " + rodoberto.perros[0].nombre + " es de " + rodoberto.perros[0].dueño.nombre);
		/*
		for(byte i = 0; i < mariPepis.gatos.length; i++) {
			System.out.println("Los animales de " + mariPepis.nombre + " son " + mariPepis.gatos[i].nombre);
		}*/
		
		System.out.println("Los animales de " + mariPepis.nombre + " son " + mariPepis.gatos[0].nombre + " y " + mariPepis.gatos[1].nombre);
	}

}
