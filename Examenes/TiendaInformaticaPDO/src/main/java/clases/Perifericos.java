package clases;

import enums.EstadoMaterial;
import enums.TipoCable;

public class Perifericos extends Hardware{
	
	private TipoCable conectividad;
	private boolean gaming;
	
	public Perifericos(String modelo, String marca, byte añosGarantia, EstadoMaterial estado, boolean reestreno,
			TipoCable conectividad, boolean gaming) {
		super(modelo, marca, añosGarantia, estado, reestreno);
		this.setConectividad(conectividad);
		this.gaming = gaming;
	}

	public TipoCable getConectividad() {
		return conectividad;
	}

	public void setConectividad(TipoCable conectividad) {
		this.conectividad = conectividad;
		if(conectividad != TipoCable.USB_2 && conectividad != TipoCable.USB_3 && conectividad != TipoCable.USB_C && conectividad != TipoCable.WIRELESS) {
			System.out.println("Lo siento no has puesto un cable adecuado");
			this.conectividad = null;
		} else {
			this.conectividad = conectividad;
		}
	}

	public boolean isGaming() {
		return gaming;
	}

	public void setGaming(boolean gaming) {
		this.gaming = gaming;
	}

	@Override
	public String toString() {
		return super.toString() + "Perifericos [conectividad=" + conectividad + ", gaming=" + gaming + "]";
	}
	
	

}
