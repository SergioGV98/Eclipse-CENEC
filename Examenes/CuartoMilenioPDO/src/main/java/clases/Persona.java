package clases;

public class Persona extends CosaConNombre{
	
	private String apellidos;
	private String profesion;
	
	public Persona(String nombre, String apellidos, String profesion) {
		super(nombre);
		this.apellidos = apellidos;
		this.profesion = profesion;
	}
	
	public Persona() {
		
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	@Override
	public String toString() {
		return super.toString() + "Informacion [apellidos=" + apellidos + ", profesion=" + profesion + "]";
	}
	
}
