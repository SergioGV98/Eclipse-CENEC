package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
	
		try {
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/bicicletasdaw", // Conexion a la base de datos
					"root", // Usuario
					"admin" // Contraseña
					);
			Statement smt = conexion.createStatement(); // Permite enviar consultas (Cursor)
			
			// Usar
			smt.executeUpdate("insert into cliente values('sergio', 'sergio@gmail.com', 'sergio1234', 610844376)");
			
			
			smt.close(); // Cerramos la conexion del Statement
			conexion.close(); // Cerramos la conexion a la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
