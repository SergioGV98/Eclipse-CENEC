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
	
	public Perro(String nombre) {
		super(nombre);
		this.setEdad((byte)1);
	}

	/** Getter & Setter **/
	public byte getPaseo() {
		return paseo;
	}

	public void setPaseo(byte paseo) {
		this.paseo = paseo;
	}
	
	/** Methods **/
	public void pasear() {
		this.paseo += 20;
	}
	
}
