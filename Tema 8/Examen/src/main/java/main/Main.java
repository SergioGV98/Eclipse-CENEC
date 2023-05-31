package main;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.Scanner;

import clases.RecorridoTroll;
import exceptions.NoEsImagenException;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		RecorridoTroll rt = new RecorridoTroll();
		File f = new File("./arbol1DAM");
		rt.recorridoTroll(f);
		
		System.out.println("Dime la ruta a relativa o absoluta a la imagen que vas a trastocar");
		String ruta = sc.nextLine();
		File imagen = new File(ruta);
		
		try {
			rt.trastocarImagen(imagen);
		} catch (NoEsImagenException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
