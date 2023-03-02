package clases;

import enums.Especies;

public class Tamagotchi extends CosaConNombre{

	/** Variables internas **/
	private byte edad;
	private Especies especies;
	private byte hambre;
	private byte sueño;
	private byte diversion;
	private byte estres;
	
	/** Constructors **/
	public Tamagotchi(String nombre, byte edad, Especies especies, byte hambre, byte sueño, byte diversion, byte estres) {
		super(nombre);
		this.edad = edad;
		this.especies = especies;
		this.setHambre(hambre);
		this.setSueño(sueño);
		this.diversion = diversion;
		this.estres = estres;
	}
	
	public Tamagotchi(String nombre, byte edad) {
		super(nombre);
		this.edad = edad;
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}

	public Tamagotchi(String nombre) {
		super(nombre);
	}

	/** Getter & Setter **/
	public float getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
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
		if (diversion >= 100) {
			this.diversion = 100;
		} else if (diversion <= 0) {
			this.diversion = 0;
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

	/** Methods **/
	@Override
	public String toString() {
		return "\tNombre " + super.getNombre() + "\n\tEdad = " + edad + "\n\tHambre = " + hambre + "\n\tSueño = " + sueño + "\n\tDiversion = " + diversion + "\n\tEstres = " + estres;
	}
	
	public void comer(Comida comida) {
		this.hambre += comida.getValorEnergetico();
		
	}
	
	public void dormir() {
		this.sueño += 20;
	}
	
	public void jugar(Juego juego) {
		this.diversion += juego.getDiversion();
		this.estres -= juego.getEstres();
	}
	
	public void relajarse() {
		this.estres -= 20;
	}
	
	public boolean estarVivo() {
		//Tamagotchi
		if(hambre <= 0 || sueño <= 0 || diversion <= 0 || estres >= 100 || edad >= 70) {
			return false;
		}
		return true;
	}
	
	public void crecer() {
		this.edad += 1;
	}
}
