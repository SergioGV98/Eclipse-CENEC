package clases;

public class Guerrero extends Luchador{

	private Escudo escudo;

	/** Constructor **/
	public Guerrero(String nombre, byte vida, Arma arma, Escudo escudo) {
		super(nombre, vida, arma);
		this.escudo = escudo;
	}
	
	
}
