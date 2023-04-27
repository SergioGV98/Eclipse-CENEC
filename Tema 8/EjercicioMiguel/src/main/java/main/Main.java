package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

import utils.DAO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un email");
		String email = sc.nextLine();
		System.out.println("Dime la contraseña");
		String password = sc.nextLine();
		
		ArrayList<Object> informacion = null;
		LinkedHashSet<String> consulta = new LinkedHashSet<String>();
		consulta.add("nombre");
		consulta.add("email");
		consulta.add("telefono");
		
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("email", email);
		restricciones.put("password", password);
		try {
			informacion = DAO.consultar("cliente", restricciones, consulta);
			while(informacion.isEmpty()) {
				System.out.println("Dime un email");
				email = sc.nextLine();
				restricciones.put("email", email);
				System.out.println("Dime la contraseña");
				password = sc.nextLine();
				restricciones.put("password", password);
				informacion = DAO.consultar("cliente", restricciones, consulta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Cliente cliente = new Cliente(informacion.get(0).toString(), informacion.get(1).toString(), informacion.get(2).toString());
        System.out.println("¡Login correcto!");
        System.out.println(cliente.toString());
	}
}
