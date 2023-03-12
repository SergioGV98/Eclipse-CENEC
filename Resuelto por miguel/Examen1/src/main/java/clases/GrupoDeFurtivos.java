package clases;

import enums.Peligrosidad;

public class GrupoDeFurtivos extends Grupo {
	
	private byte zonaAvistamiento;
	private GrupoDeGuardias guardiasAsignados;
	
	public GrupoDeFurtivos(String nombreClave, Peligrosidad nivelAmenaza, byte zonaAvistamiento,
			GrupoDeGuardias guardiasAsignados) {
		super(nombreClave, nivelAmenaza);
		this.zonaAvistamiento = zonaAvistamiento;
		this.guardiasAsignados = guardiasAsignados;
	}

	public byte getZonaAvistamiento() {
		return zonaAvistamiento;
	}

	public void setZonaAvistamiento(byte zonaAvistamiento) {
		this.zonaAvistamiento = zonaAvistamiento;
	}

	public GrupoDeGuardias getGuardiasAsignados() {
		return guardiasAsignados;
	}

	public void setGuardiasAsignados(GrupoDeGuardias guardiasAsignados) {
		this.guardiasAsignados = guardiasAsignados;
	}

	@Override
	public String toString() {
		return super.toString() + "GrupoDeFurtivos [zonaAvistamiento=" + zonaAvistamiento + ", guardiasAsignados=" + guardiasAsignados
				+ "]";
	}

}
