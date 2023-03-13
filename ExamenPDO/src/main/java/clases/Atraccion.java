package clases;

public class Atraccion extends CosaConNombre {
	
	private float precioFicha;

	public Atraccion(String nombre, float precioFicha) {
		super(nombre);
		this.precioFicha = precioFicha;
	}

	public float getPrecioFicha() {
		return precioFicha;
	}

	public void setPrecioFicha(float precioFicha) {
		this.precioFicha = precioFicha;
	}

	@Override
	public String toString() {
		return super.toString() + "Atraccion [precioFicha=" + precioFicha + "]";
	}
	
}
