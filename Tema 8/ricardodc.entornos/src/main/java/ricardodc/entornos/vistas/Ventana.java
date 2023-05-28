package ricardodc.entornos.vistas;

import javax.swing.JFrame;

import clases.Cliente;

import java.awt.GridBagLayout;

import javax.imageio.ImageIO;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Ventana extends JFrame {
	
	protected Cliente clientelogeado;
	

	
	public Ventana() {
		this.setSize(600, 500);
		this.setTitle("Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{44, 0, 0};
		gridBagLayout.rowHeights = new int[]{36, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JButton btnNewButton = new JButton("Registro");
	
	
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		this.setContentPane(new PantallaLogin(this));
		this.setVisible(true);
	}

	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		}
		if (clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		if (clase.equals(PantallaEntornos.class)) {
			this.setContentPane(new PantallaEntornos(this));
		}
		if (clase.equals(PantallaListado.class)) {
			this.setContentPane(new PantallaListado(this));
		}
		this.getContentPane().setVisible(true);
	}
}
