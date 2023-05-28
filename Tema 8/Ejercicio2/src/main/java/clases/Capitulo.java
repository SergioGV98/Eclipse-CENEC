package clases;

public class Capitulo {
	
	private String titulo;
	private String descripcion;
	private String rutaImagen;
	
	public Capitulo(String titulo, String descripcion, String rutaImagen) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.rutaImagen = rutaImagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}
}
