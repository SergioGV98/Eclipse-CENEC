package clases;

public class Perro extends Tamagotchi{

	/** Variables internas **/
	private byte paseo;

	/** Constructor **/
	public Perro(String nombre, byte edad, byte hambre, byte sueño, byte diversion, byte estres, byte paseo) {
		super(nombre, edad, hambre, sueño, diversion, estres);
		this.paseo = paseo;
	}

	/** Getter & Setter **/
	public byte getPaseo() {
		return paseo;
	}

	public void setPaseo(byte paseo) {
		this.paseo = paseo;
	}
	
	
}
