package clases;

import java.util.ArrayList;

public class Canal extends ElementosConNombre{

	/** Variables internas **/
	private String descripcion;
	private ArrayList<String> reglas = new ArrayList<String>();
	private ArrayList<Post> post = new ArrayList<Post>();
	
	/** Constructors **/
	public Canal(String nombre, String descripcion, ArrayList<String> reglas, ArrayList<Post> post) {
		super(nombre);
		this.descripcion = descripcion;
		this.reglas = reglas;
		this.post = post;
	}
	
	public Canal(String nombre, String descripcion) {
		super(nombre);
		this.descripcion = descripcion;
	}

	/** Getter & Setter **/
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<String> getReglas() {
		return reglas;
	}

	public void setReglas(ArrayList<String> reglas) {
		this.reglas = reglas;
	}

	public ArrayList<Post> getPost() {
		return post;
	}

	public void setPost(ArrayList<Post> post) {
		this.post = post;
	}

	/** Methods **/
	@Override
	public String toString() {
		return "Canal = "+ super.toString() + " | Descripcion = " + this.descripcion + " | reglas = " + this.reglas + " | post = " + post;
	}
	
	
	
}
