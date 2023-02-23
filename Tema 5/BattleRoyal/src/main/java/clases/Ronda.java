package clases;

import java.util.Random;

public class Ronda extends ElementoConNombre {

	private Combate combate[];

	/** Constructor **/
	public Ronda(String nombre, Combate[] combate) {
		super(nombre);
		this.combate = combate;
	}

	public Ronda(String nombre, Luchador[] participantes) {
		super(nombre);
		if ((participantes.length & (participantes.length - 1)) == 0) {
			Random r = new Random();
			String participantesCogidos = "";
			this.combate = new Combate[participantes.length / 2];
			for (byte i = 0; i < combate.length; i++) {
				Luchador p1 = null;
				do {
					p1 = participantes[r.nextInt(participantes.length)];
				} while (participantesCogidos.contains(p1.getNombre()));
				participantesCogidos += p1.getNombre() + "|";
				Luchador p2 = null;
				do {
					p2 = participantes[r.nextInt(participantes.length)];
				} while (participantesCogidos.contains(p2.getNombre()));
				participantesCogidos += p2.getNombre() + "|";
				this.combate[i] = new Combate(p1, p2);
			}
		} else {
			System.out.println("Lo siento, si el Nº Participantes, no es potencia de 2, no se puede hacer el torneo.");
		}
	}
	
	public Luchador[] jugar() {
		Luchador[] ganadores = new Luchador[combate.length];
		System.out.println("---------------COMIENZA LA RONDA---------------");
		System.out.println("---------------"+this.getNombre()+"---------------");
		for(byte i = 0; i < this.combate.length; i++) {
			System.out.println(this.getNombre()+ " ("+(i+1+"/"+combate.length+")"));
			ganadores[i] = this.combate[i].combatir();
		}
		return ganadores;
	}

	/** Getter & Setter **/
	public Combate[] getCombate() {
		return combate;
	}

	public void setCombate(Combate[] combate) {
		this.combate = combate;
	}

	
}
