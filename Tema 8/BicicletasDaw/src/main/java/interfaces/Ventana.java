package interfaces;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana() {
		this.setSize(600,500);
		this.setResizable(false);
		this.setContentPane(new PantallaLogin(this));
		this.setTitle("BicicletasDAW");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if(clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		} else if(clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		this.getContentPane().setVisible(true);
	}
}
