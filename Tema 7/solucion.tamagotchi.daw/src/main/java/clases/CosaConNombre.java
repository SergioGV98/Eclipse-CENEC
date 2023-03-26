package clases;

import excepciones.NombreSinNumeroExcepcion;

public abstract class CosaConNombre {
	private String nombre;

	public CosaConNombre(String nombre) throws NombreSinNumeroExcepcion {
		super();
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreSinNumeroExcepcion {
		String numeros = "1234567890";
		
		for(byte i = 0; i < nombre.length(); i++) {
			if(numeros.contains("" + nombre.charAt(i))) {
				throw new NombreSinNumeroExcepcion ("El nombre no puede contener numeros");
			}
		}
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
	
}
