package interfaces;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
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
		}
		this.getContentPane().setVisible(true);
	}
}
