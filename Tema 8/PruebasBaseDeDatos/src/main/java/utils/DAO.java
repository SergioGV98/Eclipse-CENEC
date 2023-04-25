package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class DAO {

	private static Connection conexion;
	
	private static Statement conectar() {
		try {
			conexion = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/bicicletasdaw", // Conexion a la base de datos
					"root", // Usuario
					"admin" // Contraseña
					);
			return conexion.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static void desconectar(Statement s) {
		try {
			s.close();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static int insertar(String tabla, HashMap<String, String> columnas) throws SQLException {
		Statement smt = conectar();
		String consulta = "insert into " + tabla + " (";
		Iterator <String> it = columnas.keySet().iterator();
		while(it.hasNext()) {
			consulta += it.next() +",";
		}
		consulta = consulta.substring(0, consulta.length()-1);
		consulta += ") values (";
		it = columnas.values().iterator();
		while(it.hasNext()) {
			consulta += "'" + it.next() + "',";
		}
		consulta = consulta.substring(0, consulta.length()-1);
		consulta+=")";
		System.out.println(consulta);
		int ret = smt.executeUpdate(consulta);
		desconectar(smt);
		return ret;
	}
	
	public static int borrar (String tabla, HashMap<String, String> columnas) throws SQLException {
		Statement smt = conectar();
		String consulta = "delete from " + tabla + " where ";
		Iterator it = columnas.entrySet().iterator();
		while(it.hasNext()) {
			Entry actual = (Entry) it.next();
			consulta += actual.getKey() + "='" + actual.getValue() +"' and ";
		}
		consulta = consulta.substring(0, consulta.length()-5);
		System.out.println(consulta);
		int ret = smt.executeUpdate(consulta);
		desconectar(smt);
		return ret;
	}
	
}
