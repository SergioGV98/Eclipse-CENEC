package clases;

import enums.Especie;
import enums.Genero;

public class Gato extends Animal{

	/** Variables internas **/
	private byte tendenciaAlCaos;

	/** Constructors **/
	public Gato(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, Especie especie,
			String raza, Sim dueño, byte tendenciaAlCaos) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad, especie, raza, dueño);
		this.tendenciaAlCaos = tendenciaAlCaos;
	}
	
	public Gato(String nombre, Genero genero, String raza, Sim dueño) {
		super(nombre, genero, Especie.GATO, raza, dueño);
		this.tendenciaAlCaos = 0;
	}

	/** Getter & Setter **/
	public byte getTendenciaAlCaos() {
		return tendenciaAlCaos;
	}

	public void setTendenciaAlCaos(byte tendenciaAlCaos) {
		this.tendenciaAlCaos = tendenciaAlCaos;
	}
	
	/** Methods **/
	@Override
	public String toString() {
		return super.toString() + "Gato [tendenciaAlCaos=" + tendenciaAlCaos + "]";
	}
	
}
