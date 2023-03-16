package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		
		try {
			byte numero = Byte.parseByte(sc.nextLine());
			System.out.println("El numero que me has dado era " + numero);
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Me tenias que haber dicho un numero");
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Descansamos");
	}

}
