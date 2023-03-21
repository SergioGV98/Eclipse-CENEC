package clases;

import excepciones.NombreSinNumeroExcepcion;

public class Comida extends CosaConNombre{
	private byte valorEnergetico;
	private byte morriña;
	
	public Comida(String nombre, byte valorEnergetico, byte morriña) throws NombreSinNumeroExcepcion {
		super(nombre);
		this.valorEnergetico = valorEnergetico;
		this.morriña = morriña;
	}

	public byte getValorEnergetico() {
		return valorEnergetico;
	}

	public byte getMorriña() {
		return morriña;
	}

	@Override
	public String toString() {
		return super.toString()+" [valorEnergetico=" + valorEnergetico + ", morriña=" + morriña + "]";
	}
	
	
	
	
	
}
