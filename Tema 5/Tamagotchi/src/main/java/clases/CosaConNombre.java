package clases;

public class CosaConNombre {

	/** Variables internas **/
	private String nombre;

	/** Constructos **/
	public CosaConNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	/** Getter & Setter **/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Methods **/
	@Override
	public String toString() {
		return "CosaConNombre [nombre=" + nombre + "]";
	}
	
	
}
