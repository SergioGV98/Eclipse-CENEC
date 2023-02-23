package clases;

public class Animal extends SerVivo{

	/** Variables internas **/
	private String especie;
	private String raza;
	private Sim dueño;
	
	/** Constructors **/
	public Animal(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String especie,
			String raza, Sim dueño) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.especie = especie;
		this.raza = raza;
		this.dueño = dueño;
	}
	
	public Animal(String nombre, char genero, String especie, String raza, Sim dueño) {
		super(nombre, genero);
		this.especie = especie;
		this.raza = raza;
		this.dueño = dueño;
	}

	/** Getter & Setter **/
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Sim getDueño() {
		return dueño;
	}

	public void setDueño(Sim dueño) {
		this.dueño = dueño;
	}

	/** Methods **/
	@Override
	public String toString() {
		return super.toString() + "Animal [especie=" + especie + ", raza=" + raza + ", dueño=" + dueño.getNombre() + ", " +dueño.getApellido() + "]";
	}
	
}
