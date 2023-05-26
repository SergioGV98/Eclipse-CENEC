package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import interfaces.Ventana;

public class Main {

	public static void main(String[] args) {
		 Ventana v = new Ventana();
		/*
		 * try { BufferedImage imagen = new
		 * BufferedImage(600,500,BufferedImage.TYPE_INT_RGB); float contadorRojo = 0;
		 * float contadorVerde = 0; float contadorAzul = 0; for(short i = 0; i <
		 * imagen.getWidth(); i++) { for(short j = 0; j < imagen.getHeight(); j++) {
		 * String colorEscogido = String.format("%02X", (int)contadorRojo);
		 * colorEscogido += String.format("%02X", (int)contadorVerde); colorEscogido +=
		 * String.format("%02X", (int)contadorAzul); imagen.setRGB(i, j,
		 * Integer.parseInt(colorEscogido,16)); contadorVerde =
		 * (contadorVerde+(255f/imagen.getHeight()))%255; contadorRojo =
		 * (contadorRojo+(255f/imagen.getHeight()))%255; } } ImageIO.write(imagen,
		 * "JPG", new File("./miImagen.jpg")); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */

		/*BufferedImage imagen;
		try {
			imagen = ImageIO.read(new File("./fotoclase.jpg"));
			for (short i = 0; i < imagen.getWidth(); i++) {
				for (short j = 0; j < imagen.getHeight(); j++) {
					imagen.setRGB(i, j, ~imagen.getRGB(i, j)&Integer.parseInt("FF0000",16));
				}
			}
			ImageIO.write(imagen, "jpg", new File("./imagenes/resultado.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
