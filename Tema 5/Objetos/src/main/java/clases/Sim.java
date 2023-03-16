package clases;

import java.util.Arrays;

import enums.Genero;
import excepciones.NombreConNumerosException;

/**
 * Clase que modela un sim, con todas sus caracteristicas para poder jugar al
 * juego los sims.
 * 
 * @author Sergio García Vico
 *
 */

public class Sim extends SerVivo{

	/** Variables internas **/
	private String apellido;
	private Sim madre;
	private Sim padre;
	private Animal[] mascotas;
	
	/** Constructors 
	 * @throws NombreConNumerosException **/
	public Sim(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String apellido,
			Sim madre, Sim padre, Animal[] mascotas) throws NombreConNumerosException {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.apellido = apellido;
		this.madre = madre;
		this.padre = padre;
		this.mascotas = mascotas;
	}
	
	public Sim(String nombre, String apellido, Genero genero) throws NombreConNumerosException {
		super(nombre, genero);
		this.apellido = apellido;
	}

	/** Getter & Setter **/
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Sim getMadre() {
		return madre;
	}

	public void setMadre(Sim madre) {
		this.madre = madre;
	}

	public Sim getPadre() {
		return padre;
	}

	public void setPadre(Sim padre) {
		this.padre = padre;
	}

	public Animal[] getMascotas() {
		return mascotas;
	}

	public void setMascotas(Animal[] mascotas) {
		this.mascotas = mascotas;
	}

	/** Methods **/
	@Override
	public String toString() {
		return "Sim [apellido=" + apellido + ", madre=" + madre + ", padre=" + padre + ", mascotas="
				+ Arrays.toString(mascotas) + "]";
	}
	
}
