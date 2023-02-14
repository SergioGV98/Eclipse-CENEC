package clases;

public class Combate extends ElementoConNombre{

	private String luchador1;
	private String luchador2;
	private int turno;
	
	/** Constructor **/
	public Combate(String nombre, String luchador1, String luchador2) {
		super(nombre);
		this.luchador1 = luchador1;
		this.luchador2 = luchador2;
	}
	
	public Combate(String nombre, int turno) {
		super(nombre);
		this.turno = 0;
	}
	
	
	
}
