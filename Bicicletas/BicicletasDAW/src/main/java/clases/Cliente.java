package clases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Cliente {
	
	private String nombre;
	private String email;
	private String password;
	private int telefono;
	private TreeSet<Bicicleta> bicicletas;
	
	public Cliente(String nombre, String email, String password, int telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.bicicletas = new TreeSet<Bicicleta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public TreeSet<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(TreeSet<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}

	@Override
	public String toString() {
		String ret = "Cliente " + nombre + "\n\tEmail=" + email + "\n\tPassword=" + password + "\n\tTelefono=" + telefono
		+ "\n\tBicicletas=";
		Iterator<Bicicleta> it = bicicletas.iterator();
		Bicicleta bicicletas = null;
		while(it.hasNext()) {
			bicicletas = (Bicicleta) it.next();
			ret += " " + bicicletas + "\n";
		} 
		return ret;
	}
	
	
	
}
