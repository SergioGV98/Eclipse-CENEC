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

	/** Getter & Setter **/
	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	
}
