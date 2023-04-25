package main;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import utils.DAO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte opcion;
		do {
			System.out.println("¿Que vas a hacer?"
					+ "\n\t0 - Salir"
					+ "\n\t1 - Insertar cliente"
					+ "\n\t2 - Borrar cliente"
					+ "\n\t3 - Modificar cliente"
					+ "\n\t4 - Mostrar cliente");
			opcion = Byte.parseByte(sc.nextLine());
			
			switch(opcion) {
			case 1: // Insertar cliente
				System.out.println("Dime tu nombre");
				String nombre = sc.nextLine();
				System.out.println("Dime tu email");
				String email = sc.nextLine();
				System.out.println("Dime tu contraseña");
				String password = sc.nextLine();
				System.out.println("Dime tu telefono");
				int telefono = Integer.parseInt(sc.nextLine());
				
				try {
					HashMap<String,String> cols = new HashMap<String,String>(); 
					cols.put("email", email);
					cols.put("nombre", nombre);
					cols.put("password", password);
					DAO.insertar("cliente", cols);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2: // Borrar cliente
				System.out.println("Dime el correo del cliente que vas a borrar");
				email = sc.nextLine();
				try {
					HashMap<String,String> colsBorrar = new HashMap<String,String>();
					colsBorrar.put("email", email);
					if(DAO.borrar("cliente",colsBorrar)==0) {
						System.out.println("No se ha podido borrar: El email no existe.");
					} else {
						System.out.println("Borrado con éxito.");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} 
				break;
			case 3: // Modificar cliente
				break;
			case 4: // Mostrar cliente
				
				break;
			}
		}while(opcion != 0);
		
	}
}
