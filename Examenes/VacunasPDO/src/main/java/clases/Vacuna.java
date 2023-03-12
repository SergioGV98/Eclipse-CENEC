package clases;

import enums.TipoVacuna;

public class Vacuna extends CosaConNombre{

	private byte mesCaducidad;
	private TipoVacuna tipo;
	
	public Vacuna(String nombre, byte mesCaducidad, TipoVacuna tipo) {
		super(nombre);
		this.mesCaducidad = mesCaducidad;
		this.tipo = tipo;
	}

	public byte getMesCaducidad() {
		return mesCaducidad;
	}

	public void setMesCaducidad(byte mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}

	public TipoVacuna getTipo() {
		return tipo;
	}

	public void setTipo(TipoVacuna tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "Vacuna [mesCaducidad=" + mesCaducidad + ", tipo=" + tipo + "]";
	}
	
	
	
}
