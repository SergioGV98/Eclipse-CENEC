package clases;

import interf.ContarNumeroPlazas;

public class Noria extends Atraccion implements ContarNumeroPlazas{

	private short alturaMetros;
	private byte numeroCabina;
	private byte asientosPorCabina;
	
	public Noria(String nombre, float precioFicha, short alturaMetros, byte numeroCabina, byte asientosPorCabina) {
		super(nombre, precioFicha);
		this.alturaMetros = alturaMetros;
		this.numeroCabina = numeroCabina;
		this.asientosPorCabina = asientosPorCabina;
	}
	
	public Noria(String nombre, float precioFicha) {
		super(nombre, precioFicha);
	}

	public short getAlturaMetros() {
		return alturaMetros;
	}

	public void setAlturaMetros(short alturaMetros) {
		this.alturaMetros = alturaMetros;
	}

	public byte getNumeroCabina() {
		return numeroCabina;
	}

	public void setNumeroCabina(byte numeroCabina) {
		this.numeroCabina = numeroCabina;
	}

	public byte getAsientosPorCabina() {
		return asientosPorCabina;
	}

	public void setAsientosPorCabina(byte asientosPorCabina) {
		this.asientosPorCabina = asientosPorCabina;
	}

	@Override
	public String toString() {
		return super.toString() + "Altura metros= " + alturaMetros + " | numeroCabina=" + numeroCabina + " | asientosPorCabina="
				+ asientosPorCabina + " Total de asientos disponibles= " + numeroTotalPlazas();
	}

	@Override
	public byte numeroTotalPlazas() {	
		byte asientosTotales;
		
		asientosTotales = (byte) (getNumeroCabina() * getAsientosPorCabina());
		
		return asientosTotales;
	}
	
	
	
}
