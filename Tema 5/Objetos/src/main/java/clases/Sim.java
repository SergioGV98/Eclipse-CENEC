package clases;

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
	public String nombre;
	/** El apellido familiar de nuestro sim **/
	public String apellido;
	/** El genero puede valer solo h (hombre) o m (mujer) **/
	public char genero;
	/** El nivel de hambre entre 0 y 100 de un sim. 1000 es que esta saciado y 0 que se esta muriendo de hambre **/
	public byte hambre;
	/** El nivel de sueño entre 0 y 100 de un sim. 100 es completamente descansado y 0 se muere de sueño **/
	public byte sueño;
	/** El nivel de aburrimiento entre 0 y 100 de un sim. 100 esta muy divertido y 0 se muere de aburrimiento **/
	public byte aburrimiento;
	/** El nivel de suciedad entre 0 y 100 de un sim. 100 es que esta limpisimo y 0 se muere de suciedad **/
	public byte suciedad; 
	/** La madre biologica del Sim **/
	public Sim madre;
	/** El padre biologico del Sim **/
	public Sim padre;
	/** Array de los perros que tiene este sim **/
	public Perro[] perros;
	/** Array de los gatos que tiene este sim **/
	public Gato[] gatos;
	
	
	
	
	// Metodos: Lo que un sim sabe hacer
	
	/** Metodo que nos devuelve toda la informacion del Sim **/
	public String toString() {
		return this.nombre + " " + this.apellido + " ("+(genero == 'h'?"Hombre":"Mujer")+")"+
				"\n\t Hambre: " + this.hambre + "\n\t Sueño: " + this.sueño + "\n\t Aburrimiento: " +
				this.aburrimiento + "\n\t Suciedad: " + this.suciedad + "\n";
	}
	
	
	
	/** Meotodo que le resta hambre a un Sim **/
	public void comer() {
		this.hambre -= 20; 
	}

}
