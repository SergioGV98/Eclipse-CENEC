package clases;

import java.util.ArrayList;

public class Programa extends CosaConNombre{
	
	private ArrayList<Seccion> seccion;

	public Programa(String nombre, ArrayList<Seccion> seccion) {
		super(nombre);
		this.seccion = seccion;
	}

	public ArrayList<Seccion> getSeccion() {
		return seccion;
	}

	public void setSeccion(ArrayList<Seccion> seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return super.toString() + "Programa [seccion=" + seccion + "]";
	}
}
