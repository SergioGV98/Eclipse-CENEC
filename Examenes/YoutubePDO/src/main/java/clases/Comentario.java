package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Comentario {

	private Usuario usuario;
	private String comentario;
	private LocalDateTime fechaSubida;
	private ArrayList<Comentario> respuestas;
	
	public Comentario(Usuario usuario, String comentario, LocalDateTime fechaSubida, ArrayList<Comentario> respuestas) {
		super();
		this.usuario = usuario;
		this.comentario = comentario;
		this.fechaSubida = fechaSubida;
		this.respuestas = respuestas;
	}
	
	public Comentario(Usuario usuario, String comentario) {
		this.usuario = usuario;
		this.comentario = comentario;
		this.fechaSubida = LocalDateTime.now();
		this.respuestas = new ArrayList<Comentario>();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public LocalDateTime getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(LocalDateTime fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	public ArrayList<Comentario> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Comentario> respuestas) {
		this.respuestas = respuestas;
	}

	@Override
	public String toString() {
		return "Comentario [usuario=" + usuario + ", comentario=" + comentario + ", fechaSubida=" + fechaSubida
				+ ", respuestas=" + respuestas + "]";
	}
	
}
