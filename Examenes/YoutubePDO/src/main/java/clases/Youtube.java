package clases;

import java.util.ArrayList;

public class Youtube {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Canal> canales;
	
	public Youtube(ArrayList<Usuario> usuarios, ArrayList<Canal> canales) {
		super();
		this.usuarios = usuarios;
		this.canales = canales;
	}

	public Youtube() {
		super();
		this.usuarios = new ArrayList<Usuario>();
		this.canales = new ArrayList<Canal>();
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Canal> getCanales() {
		return canales;
	}

	public void setCanales(ArrayList<Canal> canales) {
		this.canales = canales;
	}

	@Override
	public String toString() {
		return "Youtube [usuarios=" + usuarios + ", canales=" + canales + "]";
	}
	
}
