package clases;

public class Persona extends CosaConNombre{

	private String apellidos;
	private String dni;
	
	public Persona(String nombre, String apellidos, String dni) {
		super(nombre);
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return super.toString() + "Persona [apellidos=" + apellidos + ", dni=" + dni + "]";
	}
	
	
	
}
