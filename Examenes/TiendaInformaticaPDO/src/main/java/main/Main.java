package main;

import java.util.ArrayList;

import clases.Hardware;
import clases.Monitor;
import clases.Teclado;
import enums.EstadoMaterial;
import enums.Resoluciones;
import enums.TipoCable;
import enums.TipoTeclado;

public class Main {

	public static void main(String[] args) {
		
		TipoCable[] entradasVideo = {TipoCable.HDMI, TipoCable.DVI};
		
		Monitor monitor = new Monitor("ASUS123HGF", "ASUS", (byte) 5, 
				EstadoMaterial.NUEVO, true, (float) 25.6, Resoluciones.CUATROK, entradasVideo);
		
		Teclado teclado = new Teclado("CORSAIR!241", "CORSAIR", (byte) 2, 
				EstadoMaterial.FACHOS_DE_FUNCIONAMIENTO, false, TipoCable.USB_2, true, TipoTeclado.MULTIMEDIA);
		
		ArrayList<Hardware> lol = new ArrayList<Hardware>();
		
		lol.add(teclado);
		lol.add(monitor);
		
		System.out.println(monitor);
		
		System.out.println(teclado);
		
		System.out.println(lol);

	}

}
