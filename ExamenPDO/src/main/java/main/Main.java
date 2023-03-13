package main;

import java.util.ArrayList;
import java.util.Arrays;

import clases.Comida;
import clases.Feria;
import clases.Noria;
import clases.PuestoComida;

public class Main {

	public static void main(String[] args) {
		
		Feria sanPedro = new Feria();
		
		Comida palomitasSaladas = new Comida("Palomitas Saladas", (float) 5.95, true);
		Comida palomitasDulces = new Comida("Palomitas Dulces", (float) 8.95, true);
		Comida perritoKetchup = new Comida("Perrito con ketchup", (float) 9.95, true);
		Comida perritoMixto = new Comida("Perrito mixto", (float) 12.95, true);
		ArrayList<Comida> puestoPalomitas = new ArrayList<>(Arrays.asList(palomitasSaladas, palomitasDulces));
		
		ArrayList<Comida> puestoPerritos = new ArrayList<>(Arrays.asList(perritoKetchup, perritoMixto));
		
		PuestoComida palomitas = new PuestoComida("Palomitas", false, puestoPalomitas);
		PuestoComida perritos = new PuestoComida("Perritos Calientes", true, puestoPalomitas);
		
		Noria noriaInfantil = new Noria("Noria infantil",(float) 1.5,(short) 250,(byte) 4,(byte) 4);
		Noria noriaAdulta = new Noria("Noria adulta",(float) 5.5,(short) 1250,(byte) 12,(byte) 4);
		
		TioVivo tioVivoInfantil = new TioVivo();
	}

}
