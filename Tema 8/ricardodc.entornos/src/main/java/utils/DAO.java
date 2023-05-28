package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public abstract class DAO {
	private static Connection conexion;

	private static Statement conexion() {

		try {
			
			BufferedReader lector = new BufferedReader(new FileReader("bdconfig.ini"));
			String ip = lector.readLine();
			int puerto = Integer.parseInt(lector.readLine());
			String nombreBD = lector.readLine();
			String user = lector.readLine();
			String password = lector.readLine();
			lector.close();
			conexion = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + puerto + "/" + nombreBD, user,
					password);
			return conexion.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			return null;
			
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
			
		}
	}

	private static void desconexion(Statement s) {
		try {
			
			s.close();
			conexion.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public static int insertar(String tabla, HashMap<String, Object> columnas) throws SQLException {
		
		Statement smt = conexion();
		String insert = "insert into " + tabla + " (";
		Iterator it = columnas.keySet().iterator();
		
		while (it.hasNext()) {
			
			insert += (String) it.next() + ",";
			
		}
		
		insert = insert.substring(0, insert.length() - 1);
		insert += ") values (";
		
		it = columnas.values().iterator();
		while (it.hasNext()) {
			Object elemento = it.next();
			if (elemento.getClass() != String.class && elemento.getClass() != Character.class) {
				insert += elemento + ",";
			} else {
				insert += "'" + (String) elemento + "',";
			}
		}
		insert = insert.substring(0, insert.length() - 1);
		insert += ")";
		if (Config.verboseMode) {
			
			System.out.println(insert);
		}
		
		int ret = smt.executeUpdate(insert);
		desconexion(smt);
		return ret;
		
	}

	public static int borrar(String tabla, HashMap<String, Object> columnas) throws SQLException {
		Statement smt = conexion();
		String consulta = "delete from " + tabla + " where ";
		Iterator it = columnas.entrySet().iterator();
		
		while (it.hasNext()) {
			
			Entry actual = (Entry) it.next();
			
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				consulta += (String) actual.getKey() + "=" + (String) actual.getValue() + " and ";
			} else {
				consulta += (String) actual.getKey() + "='" + (String) actual.getValue() + "' and ";
			}
		}
		
		consulta = consulta.substring(0, consulta.length() - 5);
		if (Config.verboseMode) {
			System.out.println(consulta);
		}
		int ret = smt.executeUpdate(consulta);
		desconexion(smt);
		return ret;
	}

	public static ArrayList<Object> select(String tabla, LinkedHashSet<String> columnasSelect,HashMap<String, Object> restricciones) throws SQLException {
		
		Statement smt = conexion();
		String query = "select ";
		Iterator ith = columnasSelect.iterator();
		
		while (ith.hasNext()) {
			
			query += (String) ith.next() + ",";
			
		}
		
		query = query.substring(0, query.length() - 1) + " from " + tabla + (restricciones.size() > 0 ? " where " : "");
	
		Iterator itm = restricciones.entrySet().iterator();
		while (itm.hasNext()) {
			Entry actual = (Entry) itm.next();
			
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				query += (String) actual.getKey() + "=" + (String) actual.getValue() + " and ";
			} else {
				query += (String) actual.getKey() + "='" + (String) actual.getValue() + "' and ";
			}
		}
		
		if (restricciones.size() > 0) {
			query = query.substring(0, query.length() - 5);
		}
		if (Config.verboseMode) {
			System.out.println(query);
		}
		
		ResultSet cursor = smt.executeQuery(query);
		
		ArrayList<Object> fila = new ArrayList<Object>();
		
		while (cursor.next()) {
			
			
			Iterator hsCols = columnasSelect.iterator();
			while (hsCols.hasNext()) {
				String nombreCol = (String) hsCols.next();
				try {
					
					fila.add(cursor.getInt(cursor.findColumn(nombreCol)));
					
				} catch (NumberFormatException | SQLException e) {
					
					fila.add(cursor.getString(cursor.findColumn(nombreCol)));
					
				}
			}

		}
		
		desconexion(smt);
		return fila;
	}

	public static int actualizar(String tabla, HashMap<String, Object> datosAModificar,HashMap<String, Object> restricciones) throws SQLException {
		
		String query = "update " + tabla + " set ";
		Iterator itm = datosAModificar.entrySet().iterator();
		
		while (itm.hasNext()) {
			
			Entry actual = (Entry) itm.next();
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				
				query += actual.getKey() + " = " + actual.getValue() + ",";
				
			} else {
				
				query += actual.getKey() + " = '" + actual.getValue() + "',";
			}
		}
		
		query = query.substring(0, query.length() - 1) + " where ";
		Iterator itr = restricciones.entrySet().iterator();
		
		while (itr.hasNext()) {
			
			Entry actual = (Entry) itr.next();
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				query += actual.getKey() + " = " + actual.getValue() + " and ";
			} else {
				query += actual.getKey() + " = '" + actual.getValue() + "' and ";
			}
		}
		query = query.substring(0, query.length() - 5);

		Statement smt = conexion();
		
		if (Config.verboseMode) {
			
			System.out.println(query);
		}
		
		int ret = smt.executeUpdate(query);
		desconexion(smt);

		return ret;
	}

}
