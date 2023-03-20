package clases;

import java.util.Arrays;

import enums.Genero;
import excepciones.ApellidosConNumerosException;
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
	 * @throws NombreConNumerosException 
	 * @throws ApellidosConNumerosException **/
	public Sim(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String apellido,
			Sim madre, Sim padre, Animal[] mascotas) throws NombreConNumerosException, ApellidosConNumerosException {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.setApellido(apellido);
		this.madre = madre;
		this.padre = padre;
		this.mascotas = mascotas;
	}
	
	public Sim(String nombre, String apellido, Genero genero) throws NombreConNumerosException, ApellidosConNumerosException {
		super(nombre, genero);
		this.setApellido(apellido);
	}

	/** Getter & Setter **/
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws ApellidosConNumerosException {
		String numeros="0987654321";
		for(short i = 0; i < apellido.length(); i++) {
			if(numeros.contains("" + apellido.charAt(i))) {
				throw new ApellidosConNumerosException("El apellido " + apellido + " no es valido porque tiene numeros");
			}
		}
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
		return super.toString() + "Sim [apellido=" + apellido + ", madre=" + madre + ", padre=" + padre + ", mascotas="
				+ Arrays.toString(mascotas) + "]";
	}
	
}
