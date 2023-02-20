package clases;

import java.util.Random;

public final class Guerrero extends Luchador {

	private Escudo escudo;

	/** Constructor **/
	public Guerrero(String nombre, byte vida, Arma arma, Escudo escudo) {
		super(nombre, vida, arma);
		this.escudo = escudo;
	}

	public Guerrero(String nombre) {
		super(nombre);
		this.escudo = new Escudo();
	}

	/** Getter & Setter **/
	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	/** Methods **/
	public String toString() {
		return "GUERRERO\n" + super.toString() + "\nEscudo: " + this.escudo;
	}

	protected byte defender() {
		Random r = new Random();
		byte dañoBloqueado = (byte) r.nextInt(escudo.getProteccion());
		Luchador.esperaCorta();
		System.out.println(this.getNombre() + " se defiende con su " + this.escudo.getNombre() + ", y bloquea "
				+ dañoBloqueado + " de daño.");
		return dañoBloqueado;
	}

}
