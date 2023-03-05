package clases;

import enums.Especies;

public class Perro extends Tamagotchi{

	private byte paseo;

	public Perro(String nombre, float edad, Especies especies, byte hambre, byte sueño, byte diversion, byte estres,
			byte paseo) {
		super(nombre, edad, especies, hambre, sueño, diversion, estres);
		this.paseo = paseo;
	}
	
	public Perro(String nombre, float edad, Especies especies) {
		super(nombre, edad, especies);
		this.paseo = 50;
	}

	public byte getPaseo() {
		return paseo;
	}

	public void setPaseo(byte paseo) {
		if (paseo <= 0) {
			this.paseo = 0;
		} else if (paseo >= 100) {
			this.paseo = 100;
		} else {
			this.paseo = paseo;
		}
	}
	
	public void pasear() {
		this.setPaseo((byte) (this.getPaseo()-20));
		this.setSueño((byte) (this.getSueño()-5));
		this.setHambre((byte) (this.getHambre()-5));
		this.setEstres((byte) (this.getEstres()+5));
		this.setDiversion((byte) (this.getDiversion()-5));
	}
	
	public boolean estarVivo() {
		if (this.getHambre() <= 0 || this.getSueño() <= 0 || this.getDiversion() <= 0 || this.getEstres() >= 100 || this.paseo >= 100 || this.getEdad() >= 70) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Tamagotchi " + getNombre() + "\n\tEspecies = " + getEspecies() + "\n\tEdad = " + getEdad() + "\n\tHambre = " + getHambre()
				+ "\n\tSueño = " + getSueño() + "\n\tDiversion = " + getDiversion() + "\n\tEstres = " + getEstres() + "\n\tPaseo = " + this.paseo;
	}
	
	
	
}
