package clases;

public class CosaMontable {

	private byte edadMinima;
	private byte numeroPlazas;
	
	public CosaMontable(byte edadMinima, byte numeroPlazas) {
		super();
		this.edadMinima = edadMinima;
		this.numeroPlazas = numeroPlazas;
	}

	public byte getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(byte edadMinima) {
		this.edadMinima = edadMinima;
	}

	public byte getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(byte numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		return super.toString() + "CosaMontable [edadMinima=" + edadMinima + ", numeroPlazas=" + numeroPlazas + "]";
	}
	
	
}
