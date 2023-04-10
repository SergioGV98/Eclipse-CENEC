package clases;

import enums.Color;
import excepciones.NombreConNumerosException;
import excepciones.NombreZordInvalidoException;

public class Zord extends ElementoConColor{

	public Zord(String nombre, Color color) throws NombreConNumerosException, NombreZordInvalidoException {
		super(nombre, color);
	}

	@Override
	public String toString() {
		return this.getNombre()+" ("+super.toString()+")";
	}

	
	
}
