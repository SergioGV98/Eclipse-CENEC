package clases;

public class Gato {

	// Variables internas: Todo lo que el gato es
	
	/** El nombre almacena el nombre del gato **/
	public String nombre;
	/** El genero puede valer solo h (hombre) o m (mujer) **/
	public char genero;
	/** El nivel de hambre entre 0 y 100 de un gato. 1000 es que esta saciado y 0 que se esta muriendo de hambre **/
	public byte hambre;
	/** El nivel de sueño entre 0 y 100 de un gato. 100 es completamente descansado y 0 se muere de sueño **/
	public byte sueño;
	/** El nivel de aburrimiento entre 0 y 100 de un gato. 100 esta muy divertido y 0 se muere de aburrimiento **/
	public byte aburrimiento;
	/** El nivel de suciedad entre 0 y 100 de un gato. 100 es que esta limpisimo y 0 se muere de suciedad **/
	public byte suciedad;
	/** El nivel de tendenciaAlCaos entre 0 y 100 de un gato. 100 es que esta tranquilo y 0 esta loco **/
	public byte tendenciaAlCaos;
	/** ¿De quien es dueño del gato? **/
	public Sim dueño;
		
	
}
