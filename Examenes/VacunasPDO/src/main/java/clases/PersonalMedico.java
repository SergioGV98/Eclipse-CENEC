package clases;

import enums.TipoPersonalMedico;

public class PersonalMedico extends Persona{
	
	private TipoPersonalMedico puesto;

	public PersonalMedico(String nombre, String apellidos, String dni, TipoPersonalMedico puesto) {
		super(nombre, apellidos, dni);
		this.puesto = puesto;
	}

	public TipoPersonalMedico getPuesto() {
		return puesto;
	}

	public void setPuesto(TipoPersonalMedico puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return super.toString() + "PersonalMedico [puesto=" + puesto + "]";
	}

	
	
}
