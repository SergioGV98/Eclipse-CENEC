package clases;

import enums.Especie;

public class Tamagotchi extends CosaConNombre {

	private byte edad;
	private Especie especie;
	private byte hambre;
	private byte sueño;
	private byte diversion;
	private byte estres;

	public Tamagotchi(String nombre, Especie especie) {
		super(nombre);
		this.especie = especie;
		this.edad = 0;
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}

	public Especie getEspecie() {
		return especie;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + this.especie + " (" + this.edad + " años)"
				+ "\n-------------------------------------------\n\t" + "Hambre: " + this.hambre + "\n\t" + "Sueño: "
				+ this.sueño + "\n\t" + "Diversion: " + this.diversion + "\n\t" + "Estres: " + this.estres + "\n\t";
	}

	public boolean estaVivo() {

		return hambre > 0 && sueño > 0 && diversion > 0 && estres < 100 & edad < 30;
	}

	protected void decrementoEstadisticas() {
		this.hambre -= 5;
		this.sueño -= 5;
		this.diversion -= 5;
		this.estres += 5;
		this.edad++;

		if (this.estres > 100) {
			this.estres = 100;
		}

		if (this.sueño < 0) {
			this.sueño = 0;
		}
	}

	public void relajarse() {
		this.estres -= 25;
		this.decrementoEstadisticas();

		if (this.estres < 0) {
			this.estres = 0;
		}
	}

	public void dormir() {
		this.sueño += 25;
		this.decrementoEstadisticas();

		if (this.sueño > 100) {
			this.sueño = 100;
		}
	}

	public void jugar(Juego j) {
		this.diversion += j.getDiversion();
		this.estres -= j.getDiversion();
		this.diversion += 5;
		this.estres -= 5;
		this.decrementoEstadisticas();

		if (this.diversion > 100) {
			this.diversion = 100;
		}

		if (this.estres < 0) {
			this.estres = 0;
		}
	}

	public void comer(Comida c) {
		this.hambre += c.getValorEnergetico();
		this.estres -= c.getMorriña();
		this.hambre += 5;
		this.estres -= 5;
		this.decrementoEstadisticas();

		if (this.hambre > 100) {
			this.hambre = 100;
		}

		if (this.estres < 0) {
			this.estres = 0;
		}

	}

}
