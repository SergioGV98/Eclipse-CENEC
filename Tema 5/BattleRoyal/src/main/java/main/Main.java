package main;

import clases.Arma;
import clases.Berserk;
import clases.Combate;
import clases.Escudo;
import clases.Guerrero;

public class Main {

	public static void main(String[] args) {
		
		
		/** Escudos **/
		Escudo escudoObjetivo = new Escudo("Escudo objetivo", (byte) 10);
		Escudo escudoConPinchos = new Escudo("Escudo con pinchos", (byte) 25);
		Escudo escudoDeHawkwood = new Escudo("Escudo de Hawkwood", (byte) 34);
		Escudo escudoCaballeroNegro = new Escudo("Escudo Caballero Negro", (byte) 52);
		Escudo granEscudoDelCaballeroDeLothric = new Escudo("Gran escudo del caballero de Lothric", (byte) 65);
		Escudo granEscudoDeGloria = new Escudo("Gran escudo de gloria", (byte) 78);
		Escudo granEscudoDeYhorm = new Escudo("Gran escudo de Yhorm", (byte) 95);
		Escudo granEscudoDeHavel = new Escudo("Gran escudo de Havel", (byte) 128);
		
		
		Guerrero sergio = new Guerrero("Sergio", (byte) 100, laGranGuadañaDeFriede, escudoObjetivo);
		Berserk carlos = new Berserk("Carlos", (byte) 100, latigoConMuescas, espadonDeEnlaceDeFuego);
		
		System.out.println(sergio + "\n");
		System.out.println(carlos);
		
		Combate c1 = new Combate(sergio,carlos);
	}

}
