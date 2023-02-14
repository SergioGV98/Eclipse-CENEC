package clases;

public class ElementoConNombre {

	private String nombre;
	
	/** Constructor **/
	public ElementoConNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Getter & Setter **/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/** Methods**/
	public String toString() {
		return nombre;
	}
	
	
}
