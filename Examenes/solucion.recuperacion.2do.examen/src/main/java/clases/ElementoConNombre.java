package clases;

import excepciones.NombreConNumerosException;
import excepciones.NombreZordInvalidoException;

public abstract class ElementoConNombre {
	private String nombre;

	public ElementoConNombre(String nombre) throws NombreConNumerosException, NombreZordInvalidoException {
		super();
		this.setNombre(nombre);
		;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreConNumerosException, NombreZordInvalidoException {
		String numeros = "0987654321";

		for (short i = 0; i < nombre.length(); i++) {
			if (numeros.contains("" + nombre.charAt(i))) {
				throw new NombreConNumerosException("El nombre " + nombre + " no es valido porque tiene numeros");
			} else {
				this.nombre = nombre;
			}
		}
		if(this.getClass() == Zord.class) {
			if (!nombre.endsWith("zord")) {
				throw new NombreZordInvalidoException("El Zord no tiene un nombre valido.");
			}
		} else {
			this.nombre = nombre;
		}
	}

	@Override
	public String toString() {
		return nombre;
	}

}
