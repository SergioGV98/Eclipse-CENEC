package clases;

public class Arma extends ElementoConNombre{

	private byte daño;

	/** Constructor **/
	public Arma(String nombre, byte daño) {
		super(nombre);
		this.daño = daño;
	}
	
	/** Getter & Setter **/

	public byte getDaño() {
		return daño;
	}

	public void setDaño(byte daño) {
		this.daño = daño;
	}


	/** Methods **/
	public String toString() {
		return this.getNombre() + " [Daño=" + daño + "]";
	}

}
