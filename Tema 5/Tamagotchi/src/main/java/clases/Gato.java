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
	public Gato(String nombre) {
		super(nombre);
		this.setEdad((byte)1);
	}

	/** Getter & Setter **/
	public byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(byte causarCaos) {
		this.causarCaos = causarCaos;
	}
	
	/** Methods **/
	
	@Override
	public String toString() {
		return "Gato [causarCaos=" + causarCaos + "]";
	}
	
	public void causarCaos() {
		this.causarCaos += 20;
	}
	
}
