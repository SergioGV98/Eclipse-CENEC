package clases;

public class Juego extends CosaConNombre{
	
	/** Variables internas **/
	private byte diversion;
	private byte estres;
	
	/** Constructors **/
	public Juego(String nombre, byte diversion, byte estres) {
		super(nombre);
		this.diversion = diversion;
		this.estres = estres;
	}

	/** Getter & Setter **/
	public byte getDiversion() {
		return diversion;
	}

	public void setDiversion(byte diversion) {
		this.diversion = diversion;
	}

	public byte getEstres() {
		return estres;
	}

	public void setEstres(byte estres) {
		this.estres = estres;
	}
	
	

}
