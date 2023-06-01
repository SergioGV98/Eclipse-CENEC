package interfaces;

import java.awt.Dimension;

import javax.swing.JPanel;

public class VentanaImagen extends JPanel{

	private Ventana ventana;
	
	public VentanaImagen(Ventana v) {
		setPreferredSize(new Dimension(800, 600));
		this.ventana = v;
		
	}
}
