package clases;

import java.util.ArrayList;
import enums.Insignias;

public class Post extends ElementosConNombre{

	/** Variables internas **/
	
	private Usuario usuario;
	private String contenido;
	private ArrayList<Respuesta> respuestas = new ArrayList<Respuesta>();
	private int karma;
	private ArrayList<Insignias> insignias = new ArrayList<Insignias>();
	
	/** Constructors **/
	public Post(String nombre, Usuario usuario, String contenido, ArrayList<Respuesta> respuestas, int karma,
			ArrayList<Insignias> insignias) {
		super(nombre);
		this.usuario = usuario;
		this.contenido = contenido;
		this.respuestas = respuestas;
		this.karma = karma;
		this.insignias = insignias;
	}
	
	/** Getter & Setter **/
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public int getKarma() {
		return karma;
	}

	public void setKarma(int karma) {
		this.karma = karma;
	}

	public ArrayList<Insignias> getInsignias() {
		return insignias;
	}

	public void setInsignias(ArrayList<Insignias> insignias) {
		this.insignias = insignias;
	}

	/** Methods **/
	@Override
	public String toString() {
		return "Post usuario=" + usuario + ", contenido=" + contenido + ", respuestas=" + respuestas + ", karma="
				+ karma + ", insignias=" + insignias ;
	}
	

	
	
}
