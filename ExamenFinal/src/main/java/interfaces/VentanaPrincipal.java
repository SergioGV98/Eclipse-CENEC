package interfaces;

import java.awt.Dimension;

import javax.swing.JPanel;

public class VentanaPrincipal extends JPanel{
	
	private Ventana ventana;
	
	public VentanaPrincipal(Ventana v) {
		setPreferredSize(new Dimension(800, 600));
		this.ventana = v;
	}

}
