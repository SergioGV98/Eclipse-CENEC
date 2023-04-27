package main;

import java.util.HashMap;
import java.util.Scanner;

import utils.DAO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un email");
		String email = sc.nextLine();
		System.out.println("Dime la contraseña");
		String password = sc.nextLine();
		
		HashMap<String, Object> valoresBusqueda = new HashMap<String, Object>();
		valoresBusqueda.put("email", email);
		valoresBusqueda.put("password", password);
		
		HashMap<String, Object> busqueda = new HashMap<String, Object>();
		busqueda.put("email", email);
	}
}
