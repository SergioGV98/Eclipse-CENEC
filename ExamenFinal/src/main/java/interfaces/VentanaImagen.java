package interfaces;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class VentanaImagen extends JPanel{

	private Ventana ventana;
	
	public VentanaImagen(Ventana v, ImageIcon img) {
		setPreferredSize(new Dimension(800, 600));
		this.ventana = v;
		
	}
}
