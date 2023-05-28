package interfaces;

import javax.swing.JFrame;

import clases.Capitulo;

public class Ventana extends JFrame{
	
	private Capitulo capitulo;

	public Ventana() {
		this.setTitle("Ejercicio 2");
		this.setSize(1300, 700);
		this.setContentPane(new VentanaPrincipal(this));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void cambiarPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(Ventana.class)) {
			this.setContentPane(new VentanaPrincipal(this));
		} else if (clase.equals(AnimeInformacion.class)) {
			this.setContentPane(new AnimeInformacion(this));
		}  
		this.getContentPane().setVisible(true);
	}
	
	public void cambiarPantalla(Class<?> clase, Capitulo capitulo) {
		this.getContentPane().setVisible(false);
		if (clase.equals(Ventana.class)) {
			this.setContentPane(new VentanaPrincipal(this));
		} else if (clase.equals(AnimeInformacion.class)) {
			this.setContentPane(new AnimeInformacion(this));
		}  else if (clase.equals(VentanaDetalle.class)) {
			this.setContentPane(new VentanaDetalle(this, capitulo));
		}
		this.getContentPane().setVisible(true);
	}
	
}
