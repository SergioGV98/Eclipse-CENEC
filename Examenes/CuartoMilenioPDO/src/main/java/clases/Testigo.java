package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Testigo extends Persona {

	private boolean testigoDirecto;

	public Testigo(String nombre, String apellidos, String profesion, boolean testigoDirecto) {
		super(nombre, apellidos, profesion);
		this.testigoDirecto = testigoDirecto;
	}

	public Testigo() {
		super(nombreAleatorio(), apellidoAleatorio(), profesionAleatoria());
		this.testigoDirecto = new Random().nextBoolean();
	}

	public boolean isTestigoDirecto() {
		return testigoDirecto;
	}

	public void setTestigoDirecto(boolean testigoDirecto) {
		this.testigoDirecto = testigoDirecto;
	}

	@Override
	public String toString() {
		return super.toString() + "Testigo [testigoDirecto=" + testigoDirecto + "]";
	}

	public static String nombreAleatorio() {
		Random r = new Random();
		String ret = "";
		ArrayList<String> nombresMasculino = new ArrayList<String>(Arrays.asList("Juan", "Alberto", "Pedro", "Miguel"));
		ArrayList<String> nombresFemeninos = new ArrayList<String>(Arrays.asList("Maria", "Isabel", "Marta", "Nuria"));
		if (r.nextBoolean()) {
			return ret + nombresMasculino.get(r.nextInt(nombresMasculino.size()));
		} else {
			return ret + nombresFemeninos.get(r.nextInt(nombresFemeninos.size()));
		}
	}

	public static String apellidoAleatorio() {
		Random r = new Random();
		String ret = "";
		ArrayList<String> apellidos = new ArrayList<String>(Arrays.asList("Garcia", "Lothbrook", "Perez", "Nueaz"));
		return ret + apellidos.get(r.nextInt(apellidos.size()));
	}
	
	public static String profesionAleatoria() {
		Random r = new Random();
		String ret = "";
		ArrayList<String> profesion = new ArrayList<String>(Arrays.asList("Programador", "Albañil", "Dentista", "Mago"));
		return ret + profesion.get(r.nextInt(profesion.size()));
	}
	
}
