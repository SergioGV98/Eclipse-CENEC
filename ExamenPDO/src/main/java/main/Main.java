package main;

import java.util.ArrayList;
import java.util.Arrays;

import clases.Atraccion;
import clases.Caballo;
import clases.Comida;
import clases.CosaConNombre;
import clases.CosaMontable;
import clases.Feria;
import clases.Noria;
import clases.PuestoComida;
import clases.TioVivo;
import clases.Vehiculo;
import enums.TematicaVehiculo;

public class Main {

	public static void main(String[] args) {
		
		Comida palomitasSaladas = new Comida("Palomitas Saladas", (float) 5.95, true);
		Comida palomitasDulces = new Comida("Palomitas Dulces", (float) 8.95, true);
		Comida perritoKetchup = new Comida("Perrito con ketchup", (float) 9.95, true);
		Comida perritoMixto = new Comida("Perrito mixto", (float) 12.95, true);
		ArrayList<Comida> puestoPalomitas = new ArrayList<>(Arrays.asList(palomitasSaladas, palomitasDulces));
		
		ArrayList<Comida> puestoPerritos = new ArrayList<>(Arrays.asList(perritoKetchup, perritoMixto));
		
		PuestoComida palomitas = new PuestoComida("Palomitas", false, puestoPalomitas);
		PuestoComida perritos = new PuestoComida("Perritos Calientes", true, puestoPerritos);
		
		Noria noriaInfantil = new Noria("Noria infantil",(float) 1.5,(short) 250,(byte) 4,(byte) 4);
		Noria noriaAdulta = new Noria("Noria adulta",(float) 5.5,(short) 1250,(byte) 12,(byte) 4);
		
		CosaMontable caballo1 = new Caballo((byte) 10,(byte) 2);
		CosaMontable caballo2 = new Caballo((byte) 10,(byte) 2);
		CosaMontable caballo3 = new Caballo((byte) 10,(byte) 4);
		CosaMontable coche1 = new Vehiculo((byte) 10,(byte) 4, true, TematicaVehiculo.AMBULANCIA);
		CosaMontable coche2 = new Vehiculo((byte) 10,(byte) 8, true, TematicaVehiculo.COCHE_BOMBERO);
		
		ArrayList<CosaMontable> asientosInfantiles = new ArrayList<>(Arrays.asList(caballo1, caballo2, caballo3, coche1, coche2));;
		TioVivo tioVivoInfantil = new TioVivo("Tio vivo infantil",(float) 1.5, asientosInfantiles);
		
		CosaMontable caballoAdulto1 = new Caballo((byte) 10,(byte) 4);
		CosaMontable caballoAdulto2 = new Caballo((byte) 10,(byte) 4);
		CosaMontable caballoAdulto3 = new Caballo((byte) 10,(byte) 6);
		CosaMontable cocheAdulto1 = new Vehiculo((byte) 10,(byte) 4, true, TematicaVehiculo.COCHE_BATMAN);
		CosaMontable cocheAdulto2 = new Vehiculo((byte) 10,(byte) 8, true, TematicaVehiculo.COCHE_BOMBERO);
		
		ArrayList<CosaMontable> asientosAdultos = new ArrayList<>(Arrays.asList(caballoAdulto1, caballoAdulto2, caballoAdulto3, cocheAdulto1, cocheAdulto2));
		TioVivo tioVivoAdulto = new TioVivo("Tio vivo adulto",(float) 4.5, asientosAdultos);
		
		ArrayList<CosaConNombre> feriaPuestos = new ArrayList<>(Arrays.asList(palomitas, perritos, noriaInfantil, noriaAdulta, tioVivoInfantil,tioVivoAdulto));
		Feria sanPedro = new Feria(feriaPuestos);
		
		Atraccion ventaTicketsInfantil = new TioVivo("Ticket Tio Vivo infantil",(float) 1.5);
		Atraccion ventaTicketsAdulta = new Noria("Ticket Noria adulta",(float) 5.5);
		ventaTicketsInfantil.VenderFicha();
		ventaTicketsAdulta.VenderFicha();
		System.out.println(sanPedro);
	}

}
