package clases;

import java.util.ArrayList;

import enums.Insignia;

public class Respuesta extends Publicacion{

	public Respuesta(String nombre, int karma, ArrayList<Insignia> insignias, String contenido,
			ArrayList<Respuesta> respuestas) {
		super(nombre, karma, insignias, contenido, respuestas);
	}
	
}
