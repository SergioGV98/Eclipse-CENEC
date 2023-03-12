package clases;

import java.util.ArrayList;

public class HabitanteZonaSanitaria extends Persona{

	private short anioNacimiento;
	private boolean genero;
	private ArrayList<Vacuna> dosisInoculadas;
	public HabitanteZonaSanitaria(String nombre, String apellidos, String dni, short anioNacimiento, boolean genero,
			ArrayList<Vacuna> dosisInoculadas) {
		super(nombre, apellidos, dni);
		this.anioNacimiento = anioNacimiento;
		this.genero = genero;
		this.dosisInoculadas = dosisInoculadas;
	}
	public short getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(short anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	public boolean isGenero() {
		return genero;
	}
	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	public ArrayList<Vacuna> getDosisInoculadas() {
		return dosisInoculadas;
	}
	public void setDosisInoculadas(ArrayList<Vacuna> dosisInoculadas) {
		this.dosisInoculadas = dosisInoculadas;
	}
	@Override
	public String toString() {
		return super.toString() + "HabitanteZonaSanitaria [anioNacimiento=" + anioNacimiento + ", genero=" + genero + ", dosisInoculadas="
				+ dosisInoculadas + "]";
	}
	
	
	
}
