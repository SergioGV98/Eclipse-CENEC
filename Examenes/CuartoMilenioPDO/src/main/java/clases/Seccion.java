package clases;

import java.util.ArrayList;
import enums.Tematica;

public class Seccion extends CosaConNombre{

	private Tematica tematica;
	private ArrayList<Invitado> invitados;
	
	public Seccion(String nombre, Tematica tematica, ArrayList<Invitado> invitados) {
		super(nombre);
		this.tematica = tematica;
		this.invitados = invitados;
	}

	public Tematica getTematica() {
		return tematica;
	}

	public void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}
	
	public ArrayList<Invitado> getInvitados() {
		return invitados;
	}

	public void setInvitados(ArrayList<Invitado> invitados) {
		this.invitados = invitados;
	}

	@Override
	public String toString() {
		return super.toString() + "Seccion [tematica=" + tematica + ", invitados=" + invitados + "]";
	}

	
}
