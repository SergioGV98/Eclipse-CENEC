package clases;

import enums.Tematica;

public class Invitado extends Persona{
	
	private Tematica especialidad;

	public Invitado(String nombre, String apellidos, String profesion, Tematica especialidad) {
		super(nombre, apellidos, profesion);
		this.especialidad = especialidad;
	}

	public Tematica getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Tematica especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString() + "Invitado [especialidad=" + especialidad + "]";
	}
	
}
