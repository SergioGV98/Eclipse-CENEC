package clases;

public class Torneo extends ElementoConNombre {

	private Ronda ronda[];

	/** Constructor **/
	public Torneo(String nombre, Ronda[] ronda) {
		super(nombre);
		this.ronda = ronda;
	}
	
	
}
