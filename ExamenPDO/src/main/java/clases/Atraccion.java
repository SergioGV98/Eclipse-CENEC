package clases;

import interf.VenderFicha;

public class Atraccion extends CosaConNombre implements VenderFicha{
	
	private float precioFicha;
	private float beneficio;

	public Atraccion(String nombre, float precioFicha) {
		super(nombre);
		this.precioFicha = precioFicha;
	}
	
	public Atraccion() {
		
	}

	public float getPrecioFicha() {
		return precioFicha;
	}

	public void setPrecioFicha(float precioFicha) {
		this.precioFicha = precioFicha;
	}

	@Override
	public String toString() {
		return super.toString() + "Atraccion [precioFicha=" + precioFicha + "]" + " Beneficio= " + beneficio;
	}

	@Override
	public void VenderFicha() {
		this.beneficio += this.precioFicha;
		
	}
	
}
