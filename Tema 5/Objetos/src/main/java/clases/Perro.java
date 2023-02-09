package clases;

public class Perro {

	// Variables internas: Todo lo que el perro es
	
	/** El nombre almacena el nombre del perro **/
	public String nombre;
	/** El genero puede valer solo h (hombre) o m (mujer) **/
	public char genero;
	/** El nivel de hambre entre 0 y 100 de un perro. 1000 es que esta saciado y 0 que se esta muriendo de hambre **/
	public byte hambre;
	/** El nivel de sueño entre 0 y 100 de un perro. 100 es completamente descansado y 0 se muere de sueño **/
	public byte sueño;
	/** El nivel de aburrimiento entre 0 y 100 de un perro. 100 esta muy divertido y 0 se muere de aburrimiento **/
	public byte aburrimiento;
	/** El nivel de suciedad entre 0 y 100 de un perro. 100 es que esta limpisimo y 0 se muere de suciedad **/
	public byte suciedad;
	/** ¿De quien es dueño del perro? **/
	public Sim dueño;
	
}
