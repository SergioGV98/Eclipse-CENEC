package interfaces;

import clases.GrupoFurtivo;
import enums.Peligrosidad;

public interface AvisarGuardia {

	public GrupoFurtivo avisarGuardias(String nombreClaveFurtivos, int zonaAvistamientoFurtivos, Peligrosidad nivelAmenaza);
	

}
