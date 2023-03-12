package clases;

import java.util.ArrayList;

public class CreadorContenido extends Cuenta{

	private ArrayList<Canal> canales;
	private String cuentaBancaria;
	
	public CreadorContenido(String alias, String email, ArrayList<Canal> canales, String cuentaBancaria) {
		super(alias, email);
		this.canales = canales;
		this.cuentaBancaria = cuentaBancaria;
	}
	
	public CreadorContenido(String alias, String email, String cuentaBancaria) {
		super(alias, email);
		this.cuentaBancaria = cuentaBancaria;
		this.canales = new ArrayList<Canal>();
	}

	public ArrayList<Canal> getCanales() {
		return canales;
	}

	public void setCanales(ArrayList<Canal> canales) {
		this.canales = canales;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	@Override
	public String toString() {
		return super.toString() + "CreadorContenido [canales=" + canales + ", cuentaBancaria=" + cuentaBancaria + "]";
	}
	
}
