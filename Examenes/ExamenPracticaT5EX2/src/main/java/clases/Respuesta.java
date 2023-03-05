package clases;

import java.util.ArrayList;

import enums.Insignias;

public class Respuesta extends ElementosConNombre{
	
	/** Variables internas **/
	private String contenido;
	private ArrayList<Respuesta> respuesta = new ArrayList<Respuesta>();
	private int karma;
	private ArrayList<Insignias> insignias = new ArrayList<Insignias>();
	
	/** Constructors **/
	public Respuesta(String nombre, String contenido, ArrayList<Respuesta> respuesta, int karma,
			ArrayList<Insignias> insignias) {
		super(nombre);
		this.contenido = contenido;
		this.respuesta = respuesta;
		this.karma = karma;
		this.insignias = insignias;
	}
	
	/** Getter & Setter **/
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public ArrayList<Respuesta> getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(ArrayList<Respuesta> respuesta) {
		this.respuesta = respuesta;
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
		return "Respuesta [contenido=" + contenido + ", respuesta=" + respuesta + ", karma=" + karma + ", insignias="
				+ insignias + "]";
	}
	
	
	
}
