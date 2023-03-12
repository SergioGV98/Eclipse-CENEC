package clases;

import enums.Peligrosidad;

public class Grupo {

	private String nombreClave;
	private Peligrosidad nivelAmenaza;
	
	public Grupo(String nombreClave, Peligrosidad nivelAmenaza) {
		super();
		this.nombreClave = nombreClave;
		this.nivelAmenaza = nivelAmenaza;
	}

	public String getNombreClave() {
		return nombreClave;
	}

	public void setNombreClave(String nombreClave) {
		this.nombreClave = nombreClave;
	}

	public Peligrosidad getNivelAmenaza() {
		return nivelAmenaza;
	}

	public void setNivelAmenaza(Peligrosidad nivelAmenaza) {
		this.nivelAmenaza = nivelAmenaza;
	}

	@Override
	public String toString() {
		return "Grupo [nombreClave=" + nombreClave + ", nivelAmenaza=" + nivelAmenaza + "]";
	}
	
}
