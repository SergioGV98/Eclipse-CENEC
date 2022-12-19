package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		String pass=s.nextLine();
		String contraseña="la contraseña es: "+pass;
		pass=null;
		String contraseñaEncontrada = contraseña;
		System.out.println(contraseñaEncontrada);


	}

}
