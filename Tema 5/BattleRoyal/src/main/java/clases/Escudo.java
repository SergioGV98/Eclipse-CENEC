package clases;

import java.util.Random;

public class Escudo extends ElementoConNombre {

	private byte proteccion;

	/** Constructor **/
	public Escudo(String nombre, byte proteccion) {
		super(nombre);
		this.proteccion = proteccion;
	}

	public Escudo() {
		Random r = new Random();
		byte nivelEscudo = (byte) r.nextInt(3);
		String[] nombresPosibles = null;
		switch (nivelEscudo) {
		case 0: // Escudo TIER 1
			nombresPosibles = new String[] { "Escudo de cuero", "Escudo de cuero pequeño", "Escudo de flor sagrada",
					"Escudo de halcón dorado", "Escudo de halcón dorado", "Escudo del este", "Escudo de Llewellyn",
					"Escudo de tablas", "Escudo objetivo", "Escudo pequeño", "Escudo podrido de Ghru",
					"Escudo redondo caduceo", "Escudo redondo de guerrero", "Escudo redondo de hierro",
					"Escudo rojo y blanco bendito" };
			this.proteccion = (byte) r.nextInt(1, 20);
			break;
		case 1: // Escudo TIER 2
			nombresPosibles = new String[] { "Escudo emblema de hierba", "Escudo Caballero Lothric",
					"Escudo Caballero Negro", "Escudo con emblema", "Escudo con emblema de dragón", "Escudo con púas",
					"Escudo de águila de plata", "Escudo de araña", "Escudo de Caballero",
					"Escudo de Caballero Plateado", "Escudo de Caballero Pontífice", "Escudo de Carthus",
					"Escudo de emblema árbol espiritual", "Escudo del ala dorada", "Escudo Dios de la Guerra" };
			this.proteccion = (byte) r.nextInt(20, 40);
			break;
		case 2: // Escudo TIER 3
			nombresPosibles = new String[] { "Escudo Dios de la Guerra", "Escudo de hierro negro",
					"Escudo de la lamentación", "Escudo grande de gloria", "Escudo grande de gloria",
					"Gran escudo dragones gemelos", "Gran escudo caballero de la Catedral",
					"Gran escudo Caballero Lothric", "Gran escudo de Caballero Lobo", "Gran escudo de Havel",
					"Gran escudo de Havel", "Gran escudo de piedra", "Escudo Reinos sin sol", "Escudo perforador",
					"Parma de piedra" };
			this.proteccion = (byte) r.nextInt(40, 61);
			break;
		}
		this.setNombre(nombresPosibles[r.nextInt(nombresPosibles.length)]);

	}

	/** Getter & Setter **/
	public byte getProteccion() {
		return proteccion;
	}

	public void setProteccion(byte proteccion) {
		this.proteccion = proteccion;
	}

	/** Methods **/
	public String toString() {
		return this.getNombre() + " [Protección=" + this.getProteccion() + "]";
	}

}
