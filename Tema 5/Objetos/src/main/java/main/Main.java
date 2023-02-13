package main;

import java.util.Scanner;

import clases.Gato;
import clases.Perro;
import clases.Sim;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Sim rodoberto = new Sim("Rodoberto", "Alarcon", 'h'); 
		
		Sim mariPepis = new Sim("MariPepis", "Garcia", 'm');

		Perro sputnik = new Perro("Sputnik", 'm', "PerroRata", rodoberto);
		
		Gato yuki = new Gato("Yuki", 'm', mariPepis);
		
		Gato asuna = new Gato("Asuna", 'm', mariPepis);
		
		rodoberto.setPerros(new Perro[] {sputnik});
		mariPepis.setGatos(new Gato[] {yuki, asuna});
		
		System.out.println(rodoberto);
		System.out.println(mariPepis);
		System.out.println(sputnik);
		rodoberto.setHambre((byte) -120);
		System.out.println(rodoberto.getHambre());
		
	}

}
