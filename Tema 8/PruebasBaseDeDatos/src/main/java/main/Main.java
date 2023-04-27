package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
			case 1: // Insertar 
				System.out.println("Dime tu nombre");
				String nombre = sc.nextLine();
				System.out.println("Dime tu email");
				String email = sc.nextLine();
				System.out.println("Dime tu contraseña");
				String password = sc.nextLine();
				System.out.println("Dime tu telefono");
				int telefono = Integer.parseInt(sc.nextLine());
				
				try {
					HashMap<String,Object> cols = new HashMap<String,Object>(); 
					cols.put("email", email);
					cols.put("nombre", nombre);
					cols.put("password", password);
					cols.put("telefono", telefono);
					DAO.insertar("cliente", cols);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2: // Borrar
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
			case 3: // Modificar 
				break;
			case 4: // Mostrar 
				try {
					System.out.println("Dima la tabla que vas a consultar");
					String tabla = sc.nextLine();
					LinkedHashSet<String> columnasSacar = new LinkedHashSet<String>();
					columnasSacar.add("nombre");
					columnasSacar.add("email");
					columnasSacar.add("password");
					columnasSacar.add("telefono");
					HashMap<String,String> restricciones = new HashMap<String,String>();
					ArrayList<Object> cliente = DAO.consultar(tabla, restricciones, columnasSacar);
					byte j = 0;
					for(byte i = 0; i < cliente.size(); i++) {
						System.out.print(cliente.get(i) + " | ");
						j++;
						if(j == columnasSacar.size()) {
							System.out.println();
							j = 0;
						}
					}
					System.out.println();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
		}while(opcion != 0);
		
	}
}
