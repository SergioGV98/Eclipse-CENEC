package clases;

import java.util.ArrayList;
import java.util.Random;

import enums.Insignias;

public class Usuario extends ElementosConNombre{

	/** Variables internas **/
	private String apellidos;
	private String username;
	private boolean genero;
	private int karma;
	private ArrayList<Insignias> insignias = new ArrayList<Insignias>();
	
	/** Constructors **/
	public Usuario(String nombre, String apellidos, String username, boolean genero, int karma,
			ArrayList<Insignias> insignias) {
		super(nombre);
		this.apellidos = apellidos;
		this.username = username;
		this.genero = genero;
		this.karma = karma;
		this.insignias = insignias;
	}
	
	public Usuario() {
		Random r = new Random();
		this.genero = r.nextBoolean();
		this.setNombre(nombreAleatorio(this.genero));
		this.username = username(this.genero);
		this.karma = 0;
		this.insignias = new ArrayList<Insignias>();
	}
	
	/** Getter & Setter **/
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public int getKarma() {
		return karma;
	}

	public void setKarma(int karma) {
		this.karma = karma;
	}

	public ArrayList<Insignias> getInsignias() {
		return insignias;
	}

	public void setInsignias(ArrayList<Insignias> insignias) {
		this.insignias = insignias;
	}

	/** Methods **/
	@Override
	public String toString() {
		return "\nNombre = " + super.getNombre() + " | Username = " + this.username + " | genero = " + this.genero + " | karma = " + this.karma
				+ " | insignias = " + this.insignias;
	}
	
	protected String nombreAleatorio(boolean genero) {
		Random r = new Random();
		String nombreCompleto = "";
		byte aux;
		
		String [] nombresMasculinos = {"Sergio", "Carlos", "Isamel", "Juanfran", "Dani"};
		String [] nombresFemeninos = {"Lucia", "Isabel", "Alexia", "Virginia", "Rosa"};
		String [] apellidos = {"Garcia", "Valverde", "De Bruyne", "Gomez", "Lorca"};

		if(genero == true) { // Genero masculino
			aux = (byte) r.nextInt(nombresMasculinos.length);
			nombreCompleto += nombresMasculinos[aux] + ", ";
			aux = (byte) r.nextInt(apellidos.length);
			nombreCompleto += apellidos[aux];
		} else { // Genero femenino
			aux = (byte) r.nextInt(nombresFemeninos.length);
			nombreCompleto += nombresFemeninos[aux] + ", ";
			aux = (byte) r.nextInt(apellidos.length);
			nombreCompleto += apellidos[aux];
		}
		
		return nombreCompleto;
	}
	
	protected String username(boolean genero) {
		Random r = new Random();
		String username = "";
		byte aux;
		String [] usernameMasculino = {"Halcon91", "Destructor1998", "Invencible", "HarryPoPotter", "FBI"};
		String [] usernameFemenino = {"Princesita89", "LaReina", "Uwu", "DaenerysTG", "SingingStar"};
		
		if(genero == true) { // Genero masculino
			aux = (byte) r.nextInt(usernameMasculino.length);
			username += usernameMasculino[aux];
		} else { // Genero femenino
			aux = (byte) r.nextInt(usernameFemenino.length);
			username += usernameFemenino[aux];
		}
		
		return username;
	}
	
}
