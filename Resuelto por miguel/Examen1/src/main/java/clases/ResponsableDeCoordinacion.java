package clases;

import java.util.Arrays;

import enums.Peligrosidad;

public class ResponsableDeCoordinacion {

	GrupoDeGuardias GrupoDeGuardias[];
	
	public ResponsableDeCoordinacion(GrupoDeGuardias[] grupoDeGuardias) {
		super();
		this.GrupoDeGuardias = grupoDeGuardias;
	}

	public GrupoDeGuardias[] getGrupoDeGuardias() {
		return GrupoDeGuardias;
	}

	public void setGrupoDeGuardias(GrupoDeGuardias[] grupoDeGuardias) {
		this.GrupoDeGuardias = grupoDeGuardias;
	}

	@Override
	public String toString() {
		return super.toString() + "ResponsableDeCoordinacion [GrupoDeGuardias=" + Arrays.toString(GrupoDeGuardias) + "]";
	}
	
	public GrupoDeFurtivos avisarGuardias(String nombreClaveFurtivos, int zonaAvistamientoFurtivos, Peligrosidad nivelAmenaza) {
		
		for(byte i = 0; i < this.GrupoDeGuardias.length; i++) {
			if(GrupoDeGuardias[i].getNivelAmenaza() == nivelAmenaza) {
				GrupoDeFurtivos grupoFurtivo = new GrupoDeFurtivos(nombreClaveFurtivos, nivelAmenaza, (byte) zonaAvistamientoFurtivos, this.GrupoDeGuardias[i]);
				return grupoFurtivo;
			}
		}
		
		return null;
		
	}
	
}
