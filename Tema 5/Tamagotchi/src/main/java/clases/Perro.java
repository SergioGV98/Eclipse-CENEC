package clases;

import enums.Especies;

public class Perro extends Tamagotchi{

	/** Variables internas **/
	private byte paseo;

	/** Constructor **/
	public Perro(String nombre, byte edad, Especies especies, byte hambre, byte sueño, byte diversion, byte estres,
			byte paseo) {
		super(nombre, edad, especies, hambre, sueño, diversion, estres);
		this.paseo = paseo;
	}
	
	public Perro(String nombre, byte edad) {
		super(nombre, edad);
		this.setHambre((byte) 50);
		this.setSueño((byte) 50);
		this.setDiversion((byte) 50);
		this.setEstres((byte) 50);
		this.setPaseo((byte) 50);
	}

	/** Getter & Setter **/
	public byte getPaseo() {
		return paseo;
	}

	public void setPaseo(byte paseo) {
		if (paseo >= 100) {
			this.paseo = 100;
		} else if (paseo <= 0) {
			this.paseo = 0;
		} else {
			this.paseo = paseo;
		}
	}
	
	/** Methods **/
	
	@Override
	public String toString() {
		return super.toString() + "\n\tPaseo = " + paseo;
	}
	
	public void pasear() {
		this.paseo += 20;
	}
	
}
