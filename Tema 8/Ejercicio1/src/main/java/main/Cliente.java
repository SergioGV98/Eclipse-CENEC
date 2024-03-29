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

	public Cliente(String nombre, String email, String contraseña, int telefono) throws SQLException {
		super();
		HashMap<String, Object> insertar = new HashMap<String, Object>();
		insertar.put("nombre", this.nombre = nombre);
		insertar.put("email", this.email = email);
		insertar.put("password", contraseña);
		insertar.put("telefono", this.telefono = telefono);
		DAO.insertar("cliente", insertar);

	}

	public Cliente(String nombre, String email, int telefono) throws SQLException {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public Cliente(String email, String contraseña)
			throws ClienteNoExisteException, ContraseñaInvalidaExcepcion, SQLException {
		LinkedHashSet<String> consulta = new LinkedHashSet<String>();
		consulta.add("nombre");
		consulta.add("email");
		consulta.add("password");
		consulta.add("telefono");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("email", email);
		ArrayList<Object> informacion = DAO.consultar("cliente", restricciones, consulta);
		System.out.println(informacion);
		if (informacion.isEmpty()) {
			throw new ClienteNoExisteException("El cliente proporcionado no existe.");
		} else if (!informacion.get(2).equals(contraseña)) {
			throw new ContraseñaInvalidaExcepcion("La contraseña proporcionada no es valida.");
		} else {
			this.email = email;
			this.telefono = (int) informacion.get(3);
			this.nombre = (String) informacion.get(0);
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws SQLException {
		HashMap<String, Object> actualizar = new HashMap<String, Object>();
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		actualizar.put("nombre", nombre);
		restricciones.put("email", this.email);
		if (DAO.actualizar("cliente", actualizar, restricciones) == 1) {
			this.nombre = nombre;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws SQLException {
		HashMap<String, Object> actualizar = new HashMap<String, Object>();
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		actualizar.put("email", email);
		restricciones.put("email", this.email);
		if (DAO.actualizar("cliente", actualizar, restricciones) == 1) {
			this.email = email;
		}
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) throws SQLException {
		HashMap<String, Object> actualizar = new HashMap<String, Object>();
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		actualizar.put("telefono", telefono);
		restricciones.put("email", this.email);
		if (DAO.actualizar("cliente", actualizar, restricciones) == 1) {
			this.telefono = telefono;
		}
	}


	public static ArrayList<Cliente> getTodos() throws SQLException {
		ArrayList<Cliente> clientes = new ArrayList<>();
		LinkedHashSet<String> consulta = new LinkedHashSet<String>();
		Cliente cliente = null;

		consulta.add("nombre");
		consulta.add("email");
		consulta.add("telefono");
		HashMap<String, Object> restricciones = new HashMap<>();

		ArrayList<Object> resultados = DAO.consultar("cliente", restricciones, consulta);

		for (int i = 0; i < resultados.size(); i += 3) {
			String email = (String) resultados.get(i);
			String nombre = (String) resultados.get(i + 1);
			int telefono = (Integer) resultados.get(i + 2);
			cliente = new Cliente(email, nombre, telefono);
			clientes.add(cliente);
		}

		return clientes;
	}
	
	@Override
	public String toString() {
		return "\nCliente = "  + nombre + " | Email= " + email + " | Telefono= " + telefono; 
	}

}
