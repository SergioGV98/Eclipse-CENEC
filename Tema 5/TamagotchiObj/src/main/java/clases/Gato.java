package clases;

import enums.Especies;

public class Gato extends Tamagotchi{

	private byte causarCaos;

	public Gato(String nombre, float edad, Especies especies, byte hambre, byte sueño, byte diversion, byte estres,
			byte causarCaos) {
		super(nombre, edad, especies, hambre, sueño, diversion, estres);
		this.causarCaos = causarCaos;
	}
	
	public Gato(String nombre, float edad, Especies especies) {
		super(nombre, edad, especies);
		this.causarCaos = 50;
	}

	public byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(byte causarCaos) {
		if (causarCaos <= 0) {
			this.causarCaos = 0;
		} else if (causarCaos >= 100) {
			this.causarCaos = 100;
		} else {
			this.causarCaos = causarCaos;
		}
	}
	
	public void causarCaos() {
		this.setCausarCaos((byte) (this.getCausarCaos()-20));
		this.setSueño((byte) (this.getSueño()-5));
		this.setHambre((byte) (this.getHambre()-5));
		this.setEstres((byte) (this.getEstres()+5));
		this.setDiversion((byte) (this.getDiversion()-5));
	}

	public boolean estarVivo() {
		if (this.getHambre() <= 0 || this.getSueño() <= 0 || this.getDiversion() <= 0 || this.getEstres() >= 100 || this.causarCaos >= 100 || this.getEdad() >= 70) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Tamagotchi " + getNombre() + "\n\tEspecies = " + getEspecies() + "\n\tEdad = " + getEdad() + "\n\tHambre = " + getHambre()
				+ "\n\tSueño = " + getSueño() + "\n\tDiversion = " + getDiversion() + "\n\tEstres = " + getEstres() + "\n\tCaos = " + this.causarCaos;
	}
	
	
	
}
