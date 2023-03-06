package clases;

import enums.Especie;

public class Gato extends Tamagotchi {

	private byte causarCaos;

	public Gato(String nombre) {
		super(nombre, Especie.GATO);
		this.causarCaos = 50;
	}

	public void setCausarCaos(byte causarCaos) {
		if(causarCaos < 0) {
			this.causarCaos = 0;
		} else if (causarCaos > 100) {
			this.causarCaos = 100;
		} else {
			this.causarCaos = causarCaos;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Causar caos: " + this.causarCaos + "\n\t";
	}

	@Override
	public boolean estaVivo() {
		return super.estaVivo() && this.causarCaos > 0;
	}

	@Override
	protected void decrementoEstadisticas() {
		super.decrementoEstadisticas();
		this.setCausarCaos((byte) (this.causarCaos - 5));
	}

	public void causarCaos() {
		this.setCausarCaos((byte) (this.causarCaos+25));
		super.decrementoEstadisticas();
	}
}
