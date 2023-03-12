package clases;

import enums.EstadoMaterial;
import enums.TipoCable;

public class Raton extends Perifericos{
	
	private byte botones;

	public Raton(String modelo, String marca, byte añosGarantia, EstadoMaterial estado, boolean reestreno,
			TipoCable conectividad, boolean gaming, byte botones) {
		super(modelo, marca, añosGarantia, estado, reestreno, conectividad, gaming);
		this.botones = botones;
	}

	public byte getBotones() {
		return botones;
	}

	public void setBotones(byte botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return super.toString() + "Raton [botones=" + botones + "]";
	}

}
