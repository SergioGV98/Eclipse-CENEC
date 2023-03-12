package clases;

import enums.EstadoMaterial;
import enums.TipoCable;
import enums.TipoTeclado;

public class Teclado extends Perifericos{

	private TipoTeclado tipo;

	public Teclado(String modelo, String marca, byte añosGarantia, EstadoMaterial estado, boolean reestreno,
			TipoCable conectividad, boolean gaming, TipoTeclado tipo) {
		super(modelo, marca, añosGarantia, estado, reestreno, conectividad, gaming);
		this.tipo = tipo;
	}

	public TipoTeclado getTipo() {
		return tipo;
	}

	public void setTipo(TipoTeclado tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "Teclado [tipo=" + tipo + "]";
	}
	
}
