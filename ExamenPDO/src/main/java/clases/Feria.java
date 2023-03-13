package clases;

import java.util.ArrayList;

public class Feria {

	private ArrayList<CosaConNombre> puestos;

	public Feria(ArrayList<CosaConNombre> puestos) {
		super();
		this.puestos = puestos;
	}

	public ArrayList<CosaConNombre> getPuestos() {
		return puestos;
	}

	public void setPuestos(ArrayList<CosaConNombre> puestos) {
		this.puestos = puestos;
	}

	@Override
	public String toString() {
		return "Feria [puestos=" + puestos + "]";
	}
	
}
