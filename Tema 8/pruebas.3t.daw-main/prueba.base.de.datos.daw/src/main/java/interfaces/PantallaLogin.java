package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.SwingConstants;

import clases.Cliente;
import excepciones.ClienteNoExisteException;
import excepciones.ContraseñaInvalidaException;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PantallaLogin extends PanelMadre {
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;
	private Ventana ventana;

	

	public PantallaLogin(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JButton botonLogin = new JButton("Iniciar Sesión");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario = campoUsuario.getText();
				String contraseña = new String(campoContraseña.getPassword());
				System.out.println(usuario + " : " + contraseña);
				try {
					ventana.clienteLogado = new Cliente(usuario, contraseña);
					JOptionPane.showMessageDialog(ventana, "Bienvenid@, " + ventana.clienteLogado.getNombre(),
							"Inicio de sesión exitoso", JOptionPane.INFORMATION_MESSAGE);
					ventana.cambiarAPantalla(PantallaListado.class);

				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Login fallido", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (ClienteNoExisteException e1) {
					JOptionPane.showMessageDialog(ventana, "El cliente no existe", "Login fallido",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (ContraseñaInvalidaException e1) {
					JOptionPane.showMessageDialog(ventana, "La contraseña no es correcta", "Login fallido",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		botonLogin.setToolTipText("Pínchame para iniciar sesión");
		botonLogin.setForeground(new Color(0, 64, 0));
		botonLogin.setFont(new Font("Arial", Font.BOLD, 18));
		botonLogin.setBackground(new Color(70, 193, 91));
		botonLogin.setBounds(374, 269, 192, 93);
		add(botonLogin);

		JButton botonRegistro = new JButton("Regístrate");
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaRegistro.class);
			}
		});
		botonRegistro.setToolTipText("Pínchame para ir a registrarte");
		botonRegistro.setForeground(new Color(255, 255, 255));
		botonRegistro.setFont(new Font("Arial", Font.BOLD, 18));
		botonRegistro.setBackground(new Color(0, 64, 128));
		botonRegistro.setBounds(182, 269, 192, 93);
		add(botonRegistro);

		campoUsuario = new JTextField();
		campoUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		campoUsuario.setFont(new Font("Arial", Font.ITALIC, 25));
		campoUsuario.setBounds(37, 68, 529, 61);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		JLabel etiquetaUsuario = new JLabel("Correo Electrónico");
		etiquetaUsuario.setFont(new Font("SansSerif", Font.PLAIN, 26));
		etiquetaUsuario.setBounds(36, 37, 224, 39);
		add(etiquetaUsuario);

		campoContraseña = new JPasswordField();
		campoContraseña.setFont(new Font("Arial", Font.ITALIC, 25));
		campoContraseña.setBounds(37, 179, 529, 61);
		add(campoContraseña);

		JLabel etiquetaContraseña = new JLabel("Contraseña");
		etiquetaContraseña.setFont(new Font("SansSerif", Font.PLAIN, 26));
		etiquetaContraseña.setBounds(37, 140, 224, 39);
		add(etiquetaContraseña);

		JLabel labelImagen = new JLabel("");
		try {

			BufferedImage imagen = ImageIO.read(new File(".\\imagenes\\resultado.jpg"));
			Image enIcono = imagen.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
			labelImagen.setIcon(new ImageIcon(enIcono));

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		labelImagen.setBounds(37, 267, 135, 95);
		add(labelImagen);
	}
}
