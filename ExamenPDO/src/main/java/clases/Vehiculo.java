package clases;

import enums.TematicaVehiculo;

public class Vehiculo extends CosaMontable{
	
	private boolean tieneBocinas;
	private TematicaVehiculo tematica;
	
	public Vehiculo(byte edadMinima, byte numeroPlazas, boolean tieneBocinas, TematicaVehiculo tematica) {
		super(edadMinima, numeroPlazas);
		this.tieneBocinas = tieneBocinas;
		this.tematica = tematica;
	}

	public boolean isTieneBocinas() {
		return tieneBocinas;
	}

	public void setTieneBocinas(boolean tieneBocinas) {
		this.tieneBocinas = tieneBocinas;
	}

	public TematicaVehiculo getTematica() {
		return tematica;
	}

	public void setTematica(TematicaVehiculo tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return super.toString() + " | Tiene Bocinas=" + tieneBocinas + " | Tematica=" + tematica;
	}
	
	

}
