package clases;

import java.util.ArrayList;

import interf.ContarNumeroPlazas;

public class TioVivo extends Atraccion implements ContarNumeroPlazas{

	private ArrayList<CosaMontable> sillas;

	public TioVivo(String nombre, float precioFicha, ArrayList<CosaMontable> sillas) {
		super(nombre, precioFicha);
		this.sillas = sillas;
	}

	public ArrayList<CosaMontable> getSillas() {
		return sillas;
	}

	public void setSillas(ArrayList<CosaMontable> sillas) {
		this.sillas = sillas;
	}

	@Override
	public String toString() {
		return super.toString() + "TioVivo [sillas=" + sillas + "]" + "Plazas totales= " + numeroTotalPlazas();
	}

	@Override
	public byte numeroTotalPlazas() {
		byte plazasTotales = 0;
		
		for(byte i = 0; i < sillas.size(); i++) {
			plazasTotales += sillas.get(i).getEdadMinima();
		}
		
		return plazasTotales;
	}
	
	
	
}
