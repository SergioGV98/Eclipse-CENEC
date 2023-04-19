package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Dime tu email");
		String email = sc.nextLine();
		System.out.println("Dime tu contraseña");
		String password = sc.nextLine();
		System.out.println("Dime tu telefono");
		int telefono = Integer.parseInt(sc.nextLine());
		
		try {
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/bicicletasdaw", // Conexion a la base de datos
					"root", // Usuario
					"admin" // Contraseña
					);
			Statement smt = conexion.createStatement(); // Permite enviar consultas (Cursor)
			
			// Usar
			String consulta = "insert into cliente values('"+nombre+"', '"+email+"', '"+password+"', "+telefono+")";
			System.out.println(consulta);
			smt.executeUpdate(consulta);
			
			smt.close(); // Cerramos la conexion del Statement
			conexion.close(); // Cerramos la conexion a la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
