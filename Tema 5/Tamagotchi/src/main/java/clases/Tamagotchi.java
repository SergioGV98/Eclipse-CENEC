package clases;

public class Tamagotchi extends CosaConNombre{

	/** Variables internas **/
	private float edad;
	private byte hambre;
	private byte sueño;
	private byte diversion;
	private byte estres;
	
	/** Constructors **/
	public Tamagotchi(String nombre, float edad, byte hambre, byte sueño, byte diversion, byte estres) {
		super(nombre);
		this.edad = edad;
		this.hambre = hambre;
		this.sueño = sueño;
		this.diversion = diversion;
		this.estres = estres;
	}
	
	public Tamagotchi(String nombre, byte hambre, byte sueño, byte diversion, byte estres) {
		super(nombre);
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}

	/** Getter & Setter **/
	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
		this.edad = edad;
	}

	public byte getHambre() {
		return hambre;
	}

	public void setHambre(byte hambre) {
		this.hambre = hambre;
	}

	public byte getSueño() {
		return sueño;
	}

	public void setSueño(byte sueño) {
		this.sueño = sueño;
	}

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
