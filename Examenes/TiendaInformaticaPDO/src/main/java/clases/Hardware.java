package clases;

import enums.EstadoMaterial;

public class Hardware {

	private String modelo;
	private String marca;
	private byte añosGarantia;
	private EstadoMaterial estado;
	private boolean reestreno;
	
	public Hardware(String modelo, String marca, byte añosGarantia, EstadoMaterial estado, boolean reestreno) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.añosGarantia = añosGarantia;
		this.estado = estado;
		this.reestreno = reestreno;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public byte getAñosGarantia() {
		return añosGarantia;
	}

	public void setAñosGarantia(byte añosGarantia) {
		this.añosGarantia = añosGarantia;
	}

	public EstadoMaterial getEstado() {
		return estado;
	}

	public void setEstado(EstadoMaterial estado) {
		this.estado = estado;
	}

	public boolean isReestreno() {
		return reestreno;
	}

	public void setReestreno(boolean reestreno) {
		this.reestreno = reestreno;
	}

	@Override
	public String toString() {
		return "Hardware [modelo=" + modelo + ", marca=" + marca + ", añosGarantia=" + añosGarantia + ", estado="
				+ estado + ", reestreno=" + reestreno + "]";
	}
	
	
	
}
