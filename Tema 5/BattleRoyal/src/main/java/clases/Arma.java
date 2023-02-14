package clases;

public class Arma extends ElementoConNombre{

	private byte daño;

	/** Constructor **/
	public Arma(String nombre, byte daño) {
		super(nombre);
		this.daño = daño;
	}

	/** Methods **/
	public String toString() {
		return this.getNombre() + " [Daño=" + daño + "]";
	}

}
