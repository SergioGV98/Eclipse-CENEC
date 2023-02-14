package clases;

public class Berserk extends Luchador {
	
	private Arma segundaArma;
	
	
	/** Constructor **/
	public Berserk(String nombre, byte vida, Arma arma, Arma segundaArma) {
		super(nombre, vida, arma);
		this.segundaArma = segundaArma;
	}

	/** Getter & Setter **/
	public Arma getSegundaArma() {
		return segundaArma;
	}

	public void setSegundaArma(Arma segundaArma) {
		this.segundaArma = segundaArma;
	}
	
	

}
