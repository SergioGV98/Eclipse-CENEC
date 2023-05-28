package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;


import utils.DAO;

public class Cliente {
	private String email;
	private String nombre;
	private int telefono;

	public Cliente(String email, String nombre, int telefono, String contrasena) throws SQLException {
		super();
		HashMap<String, Object> row = new HashMap<String, Object>();
		row.put("password", contrasena);
		row.put("nombre", this.nombre = nombre);
		row.put("telefono", this.telefono = telefono);
		row.put("email", this.email = email);
		DAO.insertar("cliente", row);
	}

	public Cliente(String email, String contrasena) throws ClienteNoExisteException, SQLException, ContrasenaInvalidaException {
		
		super();
		
		LinkedHashSet<String> row = new LinkedHashSet<String>();
		
		row.add("nombre");
		row.add("telefono");
		row.add("email");
		row.add("password");
		
		HashMap<String, Object> restricciones = new HashMap<>();
		
		restricciones.put("email", email);
		
		ArrayList<Object> select = DAO.select("cliente", row, restricciones);
		
		if (select.isEmpty()) {
			
			throw new ClienteNoExisteException("No existe el cliente");
			
		} else if (!select.get(3).equals(contrasena)) {
			
			throw new ContrasenaInvalidaException("La contrasena es invalida");
			
		} else {
			
			this.nombre = (String) select.get(0);
			this.telefono = (int) select.get(1);
			this.email = (String) select.get(2);
			
		}
	}

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) throws SQLException {
		HashMap<String, Object> datosAModificar = new HashMap<>();
		HashMap<String, Object> restricciones = new HashMap<>();
		restricciones.put("email", this.email);
		datosAModificar.put("email", email);
		
		if (DAO.actualizar("cliente", datosAModificar, restricciones) == 1) {
			
			this.email = email;
			
		}
	}

	public String getNombre() {
		return nombre;
		
	}

	public void setNombre(String nombre) throws SQLException {
		HashMap<String, Object> datosAModificar = new HashMap<>();
		HashMap<String, Object> restricciones = new HashMap<>();
		restricciones.put("email", this.email);
		datosAModificar.put("name", nombre);
		if (DAO.actualizar("cliente", datosAModificar, restricciones) == 1) {
			this.nombre = nombre;
		}

	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) throws SQLException {
		
		HashMap<String, Object> datosAModificar = new HashMap<>();
		HashMap<String, Object> restricciones = new HashMap<>();
		
		restricciones.put("email", this.email);
		datosAModificar.put("phone", telefono);
		
		if (DAO.actualizar("cliente", datosAModificar, restricciones) == 1) {
			
			this.telefono = telefono;
			
		}
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}

}
