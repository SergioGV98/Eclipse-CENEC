package clases;

import java.util.ArrayList;

import enums.Tematica;

public class Extra extends Seccion{
	
	private ArrayList<Testigo> testigos;

	public Extra(String nombre, Tematica tematica, ArrayList<Invitado> invitados, ArrayList<Testigo> testigos) {
		super(nombre, tematica, invitados);
		this.testigos = testigos;
	}

	public ArrayList<Testigo> getTestigos() {
		return testigos;
	}

	public void setTestigos(ArrayList<Testigo> testigos) {
		this.testigos = testigos;
	}

	@Override
	public String toString() {
		return super.toString() + "Extra [testigos=" + testigos + "]";
	}
	
	public void expulsar(Persona persona) {
		if(persona.getClass() == Invitado.class) {
			for(byte i = 0; i < this.getInvitados().size(); i++) {
				this.getInvitados().remove(i);
			}
		} else if (persona.getClass() == Testigo.class) {
			for(byte i = 0; i < this.testigos.size(); i++) {
				this.testigos.remove(i);
			}
		}
	}


}
