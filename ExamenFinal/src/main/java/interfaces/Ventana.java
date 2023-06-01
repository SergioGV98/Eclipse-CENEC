package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	ImageIcon imagen;
	
	public Ventana() {
		this.setTitle("Examen de programacion DAW");
		this.setSize(800, 600);
		this.setContentPane(new VentanaPrincipal(this));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void cambiarPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(VentanaPrincipal.class)) {
			this.setContentPane(new VentanaPrincipal(this));
		} else if (clase.equals(VentanaImagen.class)) {
			this.setContentPane(new VentanaImagen(this),imagen);
		}
		this.getContentPane().setVisible(true);
	}
}
