package clases;

import enums.Especies;

public class Gato extends Tamagotchi{
	
	/** Variables internas **/
	private byte causarCaos;

	/** Constructors **/	
	public Gato(String nombre, byte edad, Especies especies, byte hambre, byte sueño, byte diversion, byte estres,
			byte causarCaos) {
		super(nombre, edad, especies, hambre, sueño, diversion, estres);
		this.causarCaos = causarCaos;
	}
	public Gato(String nombre, byte edad) {
		super(nombre, edad);
		this.setHambre((byte) 50);
		this.setSueño((byte)50);
		this.setDiversion((byte) 50);
		this.setEstres((byte) 50);
		this.setCausarCaos((byte) 50);
	}

	/** Getter & Setter **/
	public byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(byte causarCaos) {
		if (causarCaos > 100) {
			this.causarCaos = 100;
		} else if (causarCaos < 0) {
			this.causarCaos = 0;
		} else {
			this.causarCaos = causarCaos;
		}
	}
	
	/** Methods **/
	
	@Override
	public String toString() {
		return super.toString() + "\n\tCausar caos = " + causarCaos;
	}
	
	public void causarCaos() {
		this.causarCaos -= 20;
	}
	
}
