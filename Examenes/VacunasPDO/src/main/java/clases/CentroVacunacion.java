package clases;

import java.util.ArrayList;
import java.util.Random;

public class CentroVacunacion extends CosaConNombre{

	private String direccionCentro;
	private String telefono;
	private ArrayList<Vacuna> vacunas;
	private ArrayList<PersonalMedico> personalMedico;
	private ArrayList<HabitanteZonaSanitaria> vacunados;
	private ArrayList<HabitanteZonaSanitaria> noVacunados;
	
	public CentroVacunacion(String nombre, String direccionCentro, String telefono, ArrayList<Vacuna> vacunas,
			ArrayList<PersonalMedico> personalMedico, ArrayList<HabitanteZonaSanitaria> vacunados,
			ArrayList<HabitanteZonaSanitaria> noVacunados) {
		super(nombre);
		this.direccionCentro = direccionCentro;
		this.telefono = telefono;
		this.vacunas = vacunas;
		this.personalMedico = personalMedico;
		this.vacunados = vacunados;
		this.noVacunados = noVacunados;
	}

	public String getDireccionCentro() {
		return direccionCentro;
	}

	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Vacuna> getVacunas() {
		return vacunas;
	}

	public void setVacunas(ArrayList<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	public ArrayList<PersonalMedico> getPersonalMedico() {
		return personalMedico;
	}

	public void setPersonalMedico(ArrayList<PersonalMedico> personalMedico) {
		this.personalMedico = personalMedico;
	}

	public ArrayList<HabitanteZonaSanitaria> getVacunados() {
		return vacunados;
	}

	public void setVacunados(ArrayList<HabitanteZonaSanitaria> vacunados) {
		this.vacunados = vacunados;
	}

	public ArrayList<HabitanteZonaSanitaria> getNoVacunados() {
		return noVacunados;
	}

	public void setNoVacunados(ArrayList<HabitanteZonaSanitaria> noVacunados) {
		this.noVacunados = noVacunados;
	}

	@Override
	public String toString() {
		return super.toString() + "CentroVacunacion [direccionCentro=" + direccionCentro + ", telefono=" + telefono + ", vacunas="
				+ vacunas.size() + ", personalMedico=" + personalMedico.size() + ", vacunados=" + vacunados.size() + ", noVacunados="
				+ noVacunados.size() + "]";
	}
	
	public boolean vacunar(Vacuna vacuna) {
		
		for(byte i = 0; i < noVacunados.size(); i++) {
			if(noVacunados.get(i).getDosisInoculadas().size() >= 2) {
				return false;
			} else {
				noVacunados.get(i).getDosisInoculadas().add(vacuna);
				return true;
			}
		}
		// No llega
		return true;
	}
	
	public String administrarVacuna() {
		Random r = new Random();
		
		HabitanteZonaSanitaria aleatorio =  noVacunados.get(r.nextInt(noVacunados.size()));
		Vacuna vacuna = vacunas.get(r.nextInt(vacunas.size()));
		PersonalMedico personalMedico = this.personalMedico.get(r.nextInt(this.personalMedico.size()));
		
		if(this.vacunar(vacuna)) {
			this.vacunas.remove(vacuna);
			return "El/la trabajador/a de " + personalMedico.getPuesto() + " (" 
					+ personalMedico.getNombre() + ", " + personalMedico.getApellidos() + ")" 
					+ " ha vacunado a " + aleatorio.getNombre() + ", " + aleatorio.getApellidos() 
					+ " con DNI " + aleatorio.getDni() + " con la vacuna " + vacuna.getNombre();
		} else {
			return aleatorio.getNombre() + ", " + aleatorio.getApellidos() + " ya estaba totalmente vacunado/a. No necesita otra dosis";
		}
		
	}
}
