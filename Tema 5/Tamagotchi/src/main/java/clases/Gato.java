package clases;

public class Gato extends Tamagotchi{
	
	/** Variables internas **/
	private byte causarCaos;

	/** Constructors **/
	public Gato(String nombre, byte edad, byte hambre, byte sueño, byte diversion, byte estres, byte causarCaos) {
		super(nombre, edad, hambre, sueño, diversion, estres);
		this.causarCaos = causarCaos;
	}

	/** Getter & Setter **/
	public byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(byte causarCaos) {
		this.causarCaos = causarCaos;
	}
	
	
}
