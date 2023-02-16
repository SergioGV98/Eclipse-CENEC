package main;

import clases.Arma;
import clases.Berserk;
import clases.Combate;
import clases.Escudo;
import clases.Guerrero;

public class Main {

	public static void main(String[] args) {
		
		
		Guerrero sergio = new Guerrero("Sergio", (byte) 100, laGranGuadañaDeFriede, escudoObjetivo);
		Berserk carlos = new Berserk("Carlos", (byte) 100, latigoConMuescas, espadonDeEnlaceDeFuego);
		
		System.out.println(sergio + "\n");
		System.out.println(carlos);
		
		Combate c1 = new Combate(sergio,carlos);
	}

}
