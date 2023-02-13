package clases;

import java.util.Arrays;

/**
 * Clase que modela un sim, con todas sus caracteristicas para poder jugar al
 * juego los sims.
 * 
 * @author Sergio García Vico
 *
 */

public class Sim {

	// Variables internas: Todo lo que el sim es
	
	/** El nombre almacena el nombre del sim **/
	private String nombre;
	/** El apellido familiar de nuestro sim **/
	private String apellido;
	/** El genero puede valer solo h (hombre) o m (mujer) **/
	private char genero;
	/** El nivel de hambre entre 0 y 100 de un sim. 1000 es que esta saciado y 0 que se esta muriendo de hambre **/
	private byte hambre;
	/** El nivel de sueño entre 0 y 100 de un sim. 100 es completamente descansado y 0 se muere de sueño **/
	private byte sueño;
	/** El nivel de aburrimiento entre 0 y 100 de un sim. 100 esta muy divertido y 0 se muere de aburrimiento **/
	private byte aburrimiento;
	/** El nivel de suciedad entre 0 y 100 de un sim. 100 es que esta limpisimo y 0 se muere de suciedad **/
	private byte suciedad; 
	/** La madre biologica del Sim **/
	private Sim madre;
	/** El padre biologico del Sim **/
	private Sim padre;
	/** Array de los perros que tiene este sim **/
	private Perro[] perros;
	/** Array de los gatos que tiene este sim **/
	private Gato[] gatos;
	
	//Constructores
	public Sim(String nombre, String apellido, char genero, byte hambre, byte sueño, 
			byte aburrimiento, byte suciedad, Sim madre, Sim padre, Perro[] perros, Gato[] gatos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.hambre = hambre;
		this.sueño = sueño;
		this.aburrimiento = aburrimiento;
		this.suciedad = suciedad;
		this.madre = madre;
		this.padre = padre;
		this.perros = perros;
		this.gatos = gatos;
	}
	
	public Sim(String nombre, String apellido, char genero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.hambre = 0;
		this.sueño = 0;
		this.aburrimiento = 0;
		this.suciedad = 0;
		this.madre = null;
		this.padre = null;
		this.perros = null;
		this.gatos = null;
	}
	
	//Getters Sirve para poder imprimir la variable interna desde otras clases, pero sin que se pueda modificar
	//el hambre
	
	//Setters sirven para poder modificar las variables internas desde otros sitios que no sea
	//la propia clase
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
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

	public Perro[] getPerros() {
		return perros;
	}

	public void setPerros(Perro[] perros) {
		this.perros = perros;
	}

	public Gato[] getGatos() {
		return gatos;
	}

	public void setGatos(Gato[] gatos) {
		this.gatos = gatos;
	}

	public byte getHambre() {
		return this.hambre;
	}
	
	//Esta protegido para que el hambre no se pueda pasar de 0 a 100 el hambre
	public void setHambre(byte hambre) {
		if(hambre >= 0 && hambre <= 100) {
			this.hambre = hambre;
		} else {
			System.out.println("No se puede poner el valor " +hambre + 
					" al hambre de " + this.nombre);
		}
	}
	
	/** Metodo que nos devuelve toda la informacion del Sim **/
	public String toString() {
		String aux = this.nombre + " " + this.apellido + " ("+(genero == 'h'?"Hombre":"Mujer")+")"+
				"\n\t Hambre: " + this.hambre + "\n\t Sueño: " + this.sueño + "\n\t Aburrimiento: " +
				this.aburrimiento + "\n\t Suciedad: " + this.suciedad + "\n\t Animales: ";
		
		if(perros!=null) {
			for(byte i = 0; i < perros.length; i++) {
				aux += this.perros[i].getNombre();
			}
		}
		if(gatos!=null) {
			for(byte i = 0; i < gatos.length; i++) {
				aux += this.gatos[i].getNombre() + (gatos.length > 1  ?", ":"");
			}
			// aux += Arrays.toString(this.gatos); Te imprime todo el array
		}
		return aux;
	}
	
	
	
	/** Meotodo que le resta hambre a un Sim **/
	public void comer() {
		this.hambre -= 20; 
	}

}
