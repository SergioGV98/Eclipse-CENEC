package clases;

public class Gato {

	// Variables internas: Todo lo que el gato es
	
	/** El nombre almacena el nombre del gato **/
	private String nombre;
	/** El genero puede valer solo h (hombre) o m (mujer) **/
	private char genero;
	/** El nivel de hambre entre 0 y 100 de un gato. 1000 es que esta saciado y 0 que se esta muriendo de hambre **/
	private byte hambre;
	/** El nivel de sueño entre 0 y 100 de un gato. 100 es completamente descansado y 0 se muere de sueño **/
	private byte sueño;
	/** El nivel de aburrimiento entre 0 y 100 de un gato. 100 esta muy divertido y 0 se muere de aburrimiento **/
	private byte aburrimiento;
	/** El nivel de suciedad entre 0 y 100 de un gato. 100 es que esta limpisimo y 0 se muere de suciedad **/
	private byte suciedad;
	/** El nivel de tendenciaAlCaos entre 0 y 100 de un gato. 100 es que esta tranquilo y 0 esta loco **/
	private byte tendenciaAlCaos;
	/** ¿De quien es dueño del gato? **/
	private Sim dueño;
		
	public Gato(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad,
			byte tendenciaAlCaos, Sim dueño) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.hambre = hambre;
		this.sueño = sueño;
		this.aburrimiento = aburrimiento;
		this.suciedad = suciedad;
		this.tendenciaAlCaos = tendenciaAlCaos;
		this.dueño = dueño;
	}
	
	public Gato(String nombre, char genero, Sim dueño) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.hambre = 0;
		this.sueño = 0;
		this.aburrimiento = 0;
		this.suciedad = 0;
		this.tendenciaAlCaos = 0;
		this.dueño = dueño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
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

	public byte getAburrimiento() {
		return aburrimiento;
	}

	public void setAburrimiento(byte aburrimiento) {
		this.aburrimiento = aburrimiento;
	}

	public byte getSuciedad() {
		return suciedad;
	}

	public void setSuciedad(byte suciedad) {
		this.suciedad = suciedad;
	}

	public byte getTendenciaAlCaos() {
		return tendenciaAlCaos;
	}

	public void setTendenciaAlCaos(byte tendenciaAlCaos) {
		this.tendenciaAlCaos = tendenciaAlCaos;
	}

	public Sim getDueño() {
		return dueño;
	}

	public void setDueño(Sim dueño) {
		this.dueño = dueño;
	}

	public String toString() {
		return this.nombre + " "  + " ("+(genero == 'h'?"Gato":"Gata")+")"+ "\n\t Tendencia al caos: " + this.tendenciaAlCaos +
				"\n\t Hambre: " + this.hambre + "\n\t Sueño: " + this.sueño + "\n\t Aburrimiento: " +
				this.aburrimiento + "\n\t Suciedad: " + this.suciedad + "\n";
	}
	
}
