package clases;

import enums.Especie;

public class Perro extends Tamagotchi{
	
	private byte paseo;

	public Perro(String nombre) {
		super(nombre, Especie.PERRO);
		this.paseo = 50;
	}
	
	public void setPaseo(byte paseo) {
		if(paseo < 0) {
			this.paseo = 0;
		} else if (paseo > 100) {
			this.paseo = 100;
		} else {
			this.paseo = paseo;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Paseo: " + this.paseo + "\n\t";
	}

	@Override
	public boolean estaVivo() {
		return super.estaVivo() && this.paseo < 0;
	}

	@Override
	protected void decrementoEstadisticas() {
		super.decrementoEstadisticas(); 
		this.setPaseo((byte) (this.paseo - 5));
	}
	
	public void pasear() {
		this.setPaseo((byte) (this.paseo+25));
		super.decrementoEstadisticas(); 
		}
	
}
