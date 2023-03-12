package main;

import java.util.ArrayList;

import clases.Canal;
import clases.CreadorContenido;
import clases.Usuario;
import clases.Youtube;

public class Main {

	public static void main(String[] args) {
		
		Usuario sergioUs = new Usuario("SergioGV", "sergio@gmail.com");
		CreadorContenido sergio = new CreadorContenido("SergioGV", "sergio@gmail.com", "cuentaBancariaSERGIO");
		Canal sergioCanal = new Canal("SergioGV98", sergio);
		
		Youtube youtube = new Youtube();
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Canal> canales = new ArrayList<Canal>();
		canales.add(sergioCanal);
		usuarios.add(sergioUs);
		youtube.setUsuarios(usuarios);
		youtube.setCanales(canales);
		
		System.out.println(youtube);
	}

}
