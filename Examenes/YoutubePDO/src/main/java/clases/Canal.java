package clases;

import java.util.ArrayList;

public class Canal extends CosaConNombre{

	private CreadorContenido creadorContenido;
	private ArrayList<Video> videos;

	public Canal(String nombre, CreadorContenido creadorContenido, ArrayList<Video> videos) {
		super(nombre);
		this.creadorContenido = creadorContenido;
		this.videos = videos;
	}

	public Canal(String nombre, CreadorContenido creadorContenido) {
		super(nombre);
		this.creadorContenido = creadorContenido;
		this.videos = new ArrayList<Video>();
	}

	public CreadorContenido getCreadorContenido() {
		return creadorContenido;
	}

	public void setCreadorContenido(CreadorContenido creadorContenido) {
		this.creadorContenido = creadorContenido;
	}

	public ArrayList<Video> getVideos() {
		return videos;
	}

	public void setVideos(ArrayList<Video> videos) {
		this.videos = videos;
	}

	@Override
	public String toString() {
		return super.toString() + "Canal [creadorContenido=" + creadorContenido + ", videos=" + videos + "]";
	}
	
}
