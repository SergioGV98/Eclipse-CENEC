package clases;

public class Combate{

	private Luchador luchador1;
	private Luchador luchador2;
	private int turno;
	
	/** Constructor **/
	public Combate(Luchador luchador1, Luchador luchador2) {
		this.luchador1 = luchador1;
		this.luchador2 = luchador2;
		this.turno = 0;
	}
	
	/** Getter & Setter **/
	public Combate(int turno) {
		this.turno = turno;
	}

	public Luchador getLuchador1() {
		return luchador1;
	}

	public Luchador getLuchador2() {
		return luchador2;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	/** Methods **/
	public String toString() {
		return "BERSERKER\n";
	}
	
}
