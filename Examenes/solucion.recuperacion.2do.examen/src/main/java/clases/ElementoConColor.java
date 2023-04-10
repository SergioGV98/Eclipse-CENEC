package clases;

import enums.Color;
import excepciones.NombreConNumerosException;
import excepciones.NombreZordInvalidoException;

public abstract class ElementoConColor extends ElementoConNombre{
	private Color color;

	public ElementoConColor(String nombre, Color color) throws NombreConNumerosException, NombreZordInvalidoException {
		super(nombre);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return this.color.toString();
	}


	
	
}
