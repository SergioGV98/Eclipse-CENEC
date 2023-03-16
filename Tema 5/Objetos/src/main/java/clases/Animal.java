package clases;

import enums.Especie;
import enums.Genero;
import excepciones.NombreConNumerosException;

public class Animal extends SerVivo{

	/** Variables internas **/
	private Especie especie;
	private String raza;
	private Sim dueño;
	
	/** Constructors 
	 * @throws NombreConNumerosException **/
	public Animal(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, Especie especie,
			String raza, Sim dueño) throws NombreConNumerosException {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.especie = especie;
		this.raza = raza;
		this.dueño = dueño;
	}
	
	public Animal(String nombre, Genero genero, Especie especie, String raza, Sim dueño) throws NombreConNumerosException {
		super(nombre, genero);
		this.especie = especie;
		this.raza = raza;
		this.dueño = dueño;
	}

	/** Getter & Setter **/
	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
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
