package clases;

public abstract class Luchador extends ElementoConNombre {

	private byte vida;
	private Arma arma;

	/** Constructor **/
	public Luchador(String nombre, byte vida, Arma arma) {
		super(nombre);
		this.setVida(vida);
		this.arma = arma;
	}

	/** Getter & Setter **/
	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		if (vida > 100) {
			System.out.println("No se puede poner una vida mayor a 100");
		} else if (vida < 0) {
			vida = 0;
		} else {
			this.vida = vida;
		}
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	/** Methods **/
	public String toString() {
		String ret = super.toString() + " - " + this.vida + "/100\n";
		for(byte i = 0; i < this.getNombre().length()+7; i++) {
			ret+="-";
		}
		ret+=(this.vida<10?"-":vida<100?"--":"---");
		ret+="\nArma mano izquierda: "+this.arma;
		
		return ret;
	}

}
