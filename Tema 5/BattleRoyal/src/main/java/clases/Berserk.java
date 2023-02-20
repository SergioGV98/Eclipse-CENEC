package clases;

import java.util.Random;

public final class Berserk extends Luchador {

	private Arma segundaArma;

	/** Constructor **/
	public Berserk(String nombre, byte vida, Arma arma, Arma segundaArma) {
		super(nombre, vida, arma);
		this.segundaArma = segundaArma;
	}

	public Berserk(String nombre) {
		super(nombre);
		this.segundaArma = new Arma();
	}

	/** Getter & Setter **/
	public Arma getSegundaArma() {
		return segundaArma;
	}

	public void setSegundaArma(Arma segundaArma) {
		this.segundaArma = segundaArma;
	}

	/** Methods **/
	public String toString() {
		return "BERSERKER\n" + super.toString() + "\nArma mano derecha: " + this.segundaArma;
	}

	@Override
	protected byte atacar() {
		Random r = new Random();
		byte dañoArma1 = super.atacar();
		byte dañoRealizado = (byte) r.nextInt(this.segundaArma.getDaño());
		Luchador.esperaCorta();
		System.out.println(this.getNombre() + " ataca con su " + this.segundaArma.getNombre() + ", y hace "
				+ dañoRealizado + " de daño.");
		return (byte) (dañoArma1 + dañoRealizado);
	}

}
