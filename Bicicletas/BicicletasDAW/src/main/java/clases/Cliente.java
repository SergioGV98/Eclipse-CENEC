package clases;

import java.util.HashSet;
import java.util.Iterator;

public class Cliente {
	
	private String nombre;
	private String email;
	private String password;
	private int telefono;
	private HashSet<Bicicleta> bicicletas;
	
	public Cliente(String nombre, String email, String password, int telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.bicicletas = new HashSet<Bicicleta>();
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

	public HashSet<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(HashSet<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}

	@Override
	public String toString() {
		String ret = "Cliente [nombre=" + nombre + ", email=" + email + ", password=" + password + ", telefono=" + telefono
		+ ", bicicletas=" ;
		Iterator<Bicicleta> it = bicicletas.iterator();
		Bicicleta bicicletas = null;
		while(it.hasNext()) {
			bicicletas = (Bicicleta) it.next();
			ret += " " + bicicletas;
		} 
		return ret;
	}
	
	
	
}
