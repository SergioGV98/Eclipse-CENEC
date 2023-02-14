package clases;

public class Ronda extends ElementoConNombre{

	private Combate combate[];
	
	/** Constructor **/
	public Ronda(String nombre, Combate[] combate) {
		super(nombre);
		this.combate = combate;
	}
	
}
