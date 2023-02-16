package clases;

public class Escudo extends ElementoConNombre{

	private byte proteccion;
	
	/** Constructor **/
	public Escudo(String nombre, byte proteccion) {
		super(nombre);
		this.proteccion = proteccion;
	}
	
	/** Getter & Setter **/
	public byte getProteccion() {
		return proteccion;
	}

	public void setProteccion(byte proteccion) {
		this.proteccion = proteccion;
	}
	
	/** Methods **/
	public String toString() {
		return this.getNombre() + " [Escudo=" + this.getProteccion() + "]";
	}

}
