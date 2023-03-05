package clases;

import java.util.ArrayList;

public class Greeddit {

	/** Variables internas **/
	private ArrayList<Canal> canales = new ArrayList<Canal>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	/** Constructors **/
	public Greeddit(ArrayList<Canal> canales, ArrayList<Usuario> usuarios) {
		super();
		this.canales = canales;
		this.usuarios = usuarios;
	}
	
	public Greeddit(ArrayList<Canal> canales) {
		this.usuarios = new ArrayList<Usuario>();
		for(byte i = 0; i < 4; i++) {
			this.usuarios.add(new Usuario());
		}
	}
	

	/** Getter & Setter **/
	public ArrayList<Canal> getCanales() {
		return canales;
	}

	public void setCanales(ArrayList<Canal> canales) {
		this.canales = canales;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/** Methods **/
	@Override
	public String toString() {
		String aux = "";
		for(byte i = 0; i < this.canales.size(); i++) {
			aux += this.canales.get(i);
		}
		return "Canales=" + aux + ", usuarios=" + usuarios;
	}
	

	
	

}
