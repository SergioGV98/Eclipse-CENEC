package pruebas;

import java.util.Random;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String codificado="";
		
		String texto = sc.nextLine();
		
		codificado = "";
		Random rnd = new Random();
		char randomChar = (char) ('a');
		for (short i = 0; i < texto.length(); i++) {
			codificado+=(char)(texto.charAt(i)+8);
			codificado+=(char)(texto.charAt(i)+randomChar);
		}
		System.out.println(codificado);
	}

}
