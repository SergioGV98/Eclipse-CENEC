package clases;

public class Torneo extends ElementoConNombre {

	private Ronda ronda[];

	/** Constructor **/
	public Torneo(String nombre, Ronda[] ronda) {
		super(nombre);
		this.ronda = ronda;
	}
	
	public Torneo(String nombre, Luchador[] participantes) {
		super(nombre);
		byte totalParticipantes = (byte) participantes.length;
		byte nRondas = 0;
		
		// Calculo del total de rondas que necesito para el torneo
		while(totalParticipantes != 1){
			nRondas++;
			totalParticipantes/=2;
		}
		
		this.ronda = new Ronda[nRondas];
		this.ronda[0] = new Ronda("1/"+(participantes.length/2)+" de final", participantes);
	}
	
	public Luchador jugar() {
		for(byte i = 0; i < this.ronda.length-1; i++) {
			Luchador[] ganadores = this.ronda[i].jugar();
			this.ronda[i+1] = new Ronda("1/"+(ganadores.length/2) + " de final", ganadores);
		}
		Luchador[] ganador = this.ronda[this.ronda.length-1].jugar();
		return ganador[0];
	}

	/** Getter & Setter **/
	public Ronda[] getRonda() {
		return ronda;
	}

	public void setRonda(Ronda[] ronda) {
		this.ronda = ronda;
	}
	
	
}
