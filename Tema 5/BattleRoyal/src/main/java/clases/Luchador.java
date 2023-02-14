package clases;

public class Luchador extends ElementoConNombre{

	private byte vida;
	private Arma arma;
	
	/** Constructor **/
	public Luchador(String nombre, byte vida, Arma arma) {
		super(nombre);
		this.vida = vida;
		this.arma = arma;
	}
	
	
	
}
