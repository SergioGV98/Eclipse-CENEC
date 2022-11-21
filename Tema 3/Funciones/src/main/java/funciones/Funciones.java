package funciones;

import java.util.Random;

public class Funciones {

	public static void funcionVoid() {
		
		System.out.println("Hola desde la funcion Void");
	}

	public static int numeroAleatorio(int minimo, int maximo) {
		Random aleatorio = new Random();
		return aleatorio.nextInt(minimo, maximo);
	}
	
	public static int numeroAleatorio(int maximo) {
		Random aleatorio = new Random();
		return aleatorio.nextInt(maximo);
	}
	
	public static String imprimeTrozo(String trozo, byte nVeces) {
		String ret = "";
		for(byte i=0; i<nVeces; i++) {
			ret+=trozo;
		}
		return ret;
	}
	
	public static String sustituir(String trozo, char sustituto,  byte nVeces) {
		String trozoNew = "";
		for(byte i=0; i<nVeces; i++) {
			trozoNew +=trozo.replaceAll("o", "@");
		}
		return trozoNew;
	}
	
	//Hacer una funcion llamada sustituir que devuelva un String y 
	//por argumentos recibira un string llamado trozo y un char 
	//llamado sustituto, en su ambito la funcion va a a usar la 
	//funcion replace para sustituir todoslos caracter 'o' que
	//encuentre en trozo por el caracter que se le pase como
	//segundo argumento.
	//EJ: Si llami asi: Funciones.sustituir("( o o )", "'@');
	//Se devuelve el string ("(@ @)
}
