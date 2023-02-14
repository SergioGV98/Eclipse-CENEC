package clases;

public class Escudo extends ElementoConNombre{

	private byte proteccion;
	
	/** Constructor **/
	public Escudo(String nombre, byte proteccion) {
		super(nombre);
		this.proteccion = proteccion;
	}

	
}
