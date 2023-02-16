package clases;

import java.util.Random;

public class Arma extends ElementoConNombre {

	private byte daño;

	/** Constructor **/
	public Arma(String nombre, byte daño) {
		super(nombre);
		this.daño = daño;
	}

	public Arma() {
		Random r = new Random();
		byte nivelArma = (byte) r.nextInt(3);
		String[] nombresPosibles;
		switch (nivelArma) {
		case 0: // Armas TIER 0
			nombresPosibles = new String[] {
					"Palo",
					"Porra",
					"Daga",
					"Cuchilla de Morion",
					"Cuchillo de bandido",
					"Daga aguamarina",
					"Daga de la criada",
					"Daga de Ghru podrida",
					"Espada Larga",
					"Sable",
					"Espada recta rota",
					"Soldador",
					"Espada recta de púas",
					"Guadaña de mano turbia",
					"Espadas gemelas de San Gotardo"
			};
			this.daño = (byte) r.nextInt(1, 15);
			break;
		case 1: // Armas TIER 1
			nombresPosibles = new String[] {
					"Espada Recta Caballero Anillado",
					"Claymore",
					"Espada recta de la luz del sol",
					"Lanza de caballero anillado",
					"Espadón de asesino de huecos",
					"Espadón de enlace de fuego",
					"Espada Caballero Negro",
					"Flamberge",
					"Espada sagrada de Wolnir",
					"Gran palabra del verdugo",
					"Espada magna de los príncipes gemelos",
					"Espadón de Gael",
					"Hoja de ónice",
					"Espadón de luz de luna",
					"Espadón de Astora"
			};
			this.daño = (byte) r.nextInt(15, 30);
			break;
		case 2: // Armas TIER 2
			nombresPosibles = new String[] {
					"Fume Ultra Greatsword",
					"Espadón de Farron",
					"Espada magna del caballero de la catedral",
					"Grandes espadas emparejadas de caballero anillado",
					"Espadón de Lorian",
					"Espada de luna creciente",
					"Espadas encantadas del bailarín",
					"Espada Tormenta Curva",
					"Cicatriz de demonio",
					"Espada curva de lobo viejo",
					"Onikiri y Ubadachi",
					"Espada del Caos",
					"Hoja deshilachada",
					"Sed de sangre",
					"La gran guadaña de Friede"
			};
			this.daño = (byte) r.nextInt(30, 41);
			break;
		}
	}

	/** Getter & Setter **/

	public byte getDaño() {
		return daño;
	}

	public void setDaño(byte daño) {
		this.daño = daño;
	}

	/** Methods **/
	public String toString() {
		return this.getNombre() + " [Daño=" + daño + "]";
	}

}
