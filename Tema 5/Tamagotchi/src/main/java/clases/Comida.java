package clases;

public class Comida extends CosaConNombre{

	/** Variables internas **/
	private byte valorEnergetico;
	private byte morriña;
	
	/** Constructors **/
	public Comida(String nombre, byte valorEnergetico, byte morriña) {
		super(nombre);
		this.valorEnergetico = valorEnergetico;
		this.morriña = morriña;
	}

	/** Getter & Setter **/
	public byte getValorEnergetico() {
		return valorEnergetico;
	}

	public void setValorEnergetico(byte valorEnergetico) {
		this.valorEnergetico = valorEnergetico;
	}

	public byte getMorriña() {
		return morriña;
	}

	public void setMorriña(byte morriña) {
		this.morriña = morriña;
	}
	
	
}
