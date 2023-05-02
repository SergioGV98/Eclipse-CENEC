package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import excepciones.ClienteNoExisteException;
import excepciones.ContraseñaInvalidaExcepcion;
import utils.DAO;

public class Cliente {

	private String nombre;
	private String email;
	private int telefono;
	private String password;
	
	public Cliente(String nombre, String email, String contraseña, int telefono) {
		super();
		HashMap<String, Object> insertar = new HashMap<String, Object>();
		insertar.put("email", email);
		insertar.put("password", contraseña);
		insertar.put("telefono", telefono);
		insertar.put("nombre", nombre);
		try {
			DAO.insertar("cliente", insertar);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Cliente(String email, String contraseña) throws ClienteNoExisteException, ContraseñaInvalidaExcepcion {
		LinkedHashSet<String> consulta = new LinkedHashSet<String>();
		consulta.add("email");
		consulta.add("password");
		consulta.add("telefono");
		consulta.add("nombre");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("email", email);
		try {
			ArrayList<Object> informacion = DAO.consultar("cliente", restricciones, consulta);
			System.out.println(informacion);
			if(informacion.isEmpty()) {
				throw new ClienteNoExisteException ("El cliente proporcionado no existe.");
			} else if(!informacion.get(1).equals(contraseña)) {
				throw new ContraseñaInvalidaExcepcion ("La contraseña proporcionada no es valida.");
			} else {
				this.email = email;
				this.password = contraseña;
				this.telefono = (int) informacion.get(2);
				this.nombre = (String) informacion.get(3);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		HashMap<String, Object> actualizar = new HashMap<String, Object>();
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		try {
			actualizar.put("nombre", nombre);
			restricciones.put("email", this.email);
			DAO.actualizar("cliente", actualizar, restricciones);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		HashMap<String, Object> actualizar = new HashMap<String, Object>();
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		try {
			actualizar.put("email", email);
			restricciones.put("email", this.email);
			DAO.actualizar("cliente", actualizar, restricciones);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		HashMap<String, Object> actualizar = new HashMap<String, Object>();
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		try {
			actualizar.put("telefono", telefono);
			restricciones.put("telefono", this.telefono);
			DAO.actualizar("cliente", actualizar, restricciones);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cliente\n" + "Nombre= " + nombre + "\nEmail= " + email + "\nTelefono= " + telefono;
	}
	
	
}
