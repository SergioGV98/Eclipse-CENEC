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
	
	/** Getter & Setter **/
	public Combate(String nombre, int turno) {
		super(nombre);
		this.turno = 0;
	}

	public String getLuchador1() {
		return luchador1;
	}

	public void setLuchador1(String luchador1) {
		this.luchador1 = luchador1;
	}

	public String getLuchador2() {
		return luchador2;
	}

	public void setLuchador2(String luchador2) {
		this.luchador2 = luchador2;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	
}
