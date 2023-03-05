package clases;

import enums.Especies;

public class Tamagotchi extends CosaConNombre {

	private float edad;
	private Especies especies;
	private byte hambre;
	private byte sueño;
	private byte diversion;
	private byte estres;

	public Tamagotchi(String nombre, float edad, Especies especies, byte hambre, byte sueño, byte diversion,
			byte estres) {
		super(nombre);
		this.edad = edad;
		this.especies = especies;
		this.hambre = hambre;
		this.sueño = sueño;
		this.diversion = diversion;
		this.estres = estres;
	}

	public Tamagotchi(String nombre, float edad, Especies especies) {
		super(nombre);
		this.especies = especies;
		this.edad = edad;
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
		this.edad = edad;
	}

	public Especies getEspecies() {
		return especies;
	}

	public void setEspecies(Especies especies) {
		this.especies = especies;
	}

	public byte getHambre() {
		return hambre;
	}

	public void setHambre(byte hambre) {
		if (hambre >= 100) {
			this.hambre = 100;
		} else if (hambre <= 0) {
			this.hambre = 0;
		} else {
			this.hambre = hambre;
		}
	}

	public byte getSueño() {
		return sueño;
	}

	public void setSueño(byte sueño) {
		if (sueño >= 100) {
			this.sueño = 100;
		} else if (sueño <= 0) {
			this.sueño = 0;
		} else {
			this.sueño = sueño;
		}
	}

	public byte getDiversion() {
		return diversion;
	}

	public void setDiversion(byte diversion) {
		if (diversion <= 0) {
			this.diversion = 0;
		} else if (diversion >= 100) {
			this.diversion = 100;
		} else {
			this.diversion = diversion;
		}
	}

	public byte getEstres() {
		return estres;
	}

	public void setEstres(byte estres) {
		if (estres >= 100) {
			this.estres = 100;
		} else if (estres <= 0) {
			this.estres = 0;
		} else {
			this.estres = estres;
		}
	}

	public void comer(Comida comida) {
		this.hambre += comida.getValorEnergetico();
		this.sueño -= comida.getMorriña();
		this.diversion -= 5;
		this.estres += 5;

	}

	public void dormir() {
		this.sueño += 20;
		this.diversion -= 5;
		this.estres += 5;
		this.hambre -= 5;
	}

	public void jugar(Juego juego) {
		this.diversion += juego.getDiversion();
		this.estres -= juego.getEstres();
		this.sueño -= 5;
		this.hambre -= 5;
	}

	public void relajarse() {
		this.estres -= 20;
		this.hambre -= 5;
		this.diversion -= 5;
		this.sueño -= 5;
	}

	public boolean estarVivo() {
		if (hambre <= 0 || sueño <= 0 || diversion <= 0 || estres >= 100 || edad >= 70) {
			return false;
		}
		return true;
	}

	public void crecer() {
		this.edad += 1;
	}

	@Override
	public String toString() {
		return "Tamagotchi " + getNombre() + "\n\tEspecies = " + especies + "\n\tEdad = " + edad + "\n\tHambre = " + hambre
				+ "\n\tSueño = " + sueño + "\n\tDiversion = " + diversion + "\n\tEstres = " + estres;
	}

}
