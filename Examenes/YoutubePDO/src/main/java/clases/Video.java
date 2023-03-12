package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

import enums.Tematica;

public class Video extends CosaConNombre{

	private String descripcion;
	private String urlVideo;
	private ArrayList<Comentario> comentarios;
	private LocalDateTime fechaSubida;
	private Tematica tematica;
	
	public Video(String nombre, String descripcion, String urlVideo,
			ArrayList<Comentario> comentarios, LocalDateTime fechaSubida, Tematica tematica) {
		super(nombre);
		this.descripcion = descripcion;
		this.urlVideo = urlVideo;
		this.comentarios = comentarios;
		this.fechaSubida = fechaSubida;
		this.tematica = tematica;
	}
	
	public Video(String alias, String email, String nombre, String descripcion, String urlVideo, Tematica tematica) {
		this.comentarios = new ArrayList<Comentario>();
		this.fechaSubida = LocalDateTime.now();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public LocalDateTime getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(LocalDateTime fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	public Tematica getTematica() {
		return tematica;
	}

	public void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return super.toString() + "Video [descripcion=" + descripcion + ", urlVideo=" + urlVideo + ", comentarios=" + comentarios
				+ ", fechaSubida=" + fechaSubida + ", tematica=" + tematica + "]";
	}
	
	
	
}
