package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaLogin extends JPanel{
	
	private JTextField campoUsuario;
	private JPasswordField contraseñaCampo;
	private JLabel titleText;
	private JLabel usuarioText;
	private JLabel contraseñaText;
	private Ventana ventana;
	
	public PantallaLogin(Ventana v) {
		this.ventana = v;
		setBackground(new Color(0, 128, 128));
		setLayout(null);
		
		campoUsuario = new JTextField();
		campoUsuario.setToolTipText("");
		campoUsuario.setBounds(201, 181, 214, 20);
		add(campoUsuario);
		campoUsuario.setColumns(10);
		
		contraseñaCampo = new JPasswordField();
		contraseñaCampo.setBounds(201, 227, 214, 20);
		add(contraseñaCampo);
		
		JButton botonLogin = new JButton("Iniciar sesion");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario = campoUsuario.getText();
				String contraseña = new String (contraseñaCampo.getPassword());
				System.out.println(usuario + " : " + contraseña);
			}
		});
		botonLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonLogin.setBackground(Color.WHITE);
		botonLogin.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		botonLogin.setForeground(new Color(0, 0, 0));
		botonLogin.setBounds(308, 270, 112, 23);
		add(botonLogin);
		
		JButton registrarse = new JButton("Registrarse");
		registrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaRegistro.class);
			}
		});
		registrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registrarse.setBounds(186, 270, 112, 23);
		add(registrarse);
		
		titleText = new JLabel("Bicicletas DAW");
		titleText.setForeground(Color.ORANGE);
		titleText.setFont(new Font("Doctor Glitch", Font.BOLD, 40));
		titleText.setBounds(103, 96, 401, 49);
		add(titleText);
		
		usuarioText = new JLabel("Usuario");
		usuarioText.setFont(new Font("Tahoma", Font.BOLD, 11));
		usuarioText.setForeground(new Color(255, 255, 255));
		usuarioText.setBounds(145, 184, 46, 14);
		add(usuarioText);
		
		contraseñaText = new JLabel("Contraseña");
		contraseñaText.setFont(new Font("Tahoma", Font.BOLD, 11));
		contraseñaText.setForeground(new Color(255, 255, 255));
		contraseñaText.setBounds(128, 230, 73, 14);
		add(contraseñaText);
		
		JLabel autorText = new JLabel("Sergio García Vico");
		autorText.setFont(new Font("Doctor Glitch", Font.PLAIN, 13));
		autorText.setForeground(new Color(255, 255, 255));
		autorText.setBounds(423, 394, 171, 20);
		add(autorText);
		
		JLabel background = new JLabel("");
		background.setForeground(new Color(255, 255, 255));
		background.setHorizontalAlignment(SwingConstants.CENTER);
		background.setIcon(new ImageIcon("C:\\Users\\1DAW\\Desktop\\background.jpg"));
		background.setBounds(0, 0, 604, 500);
		
		
		JLabel recordarContraseña = new JLabel("¿Has olvidado tu contraseña?");
		recordarContraseña.setFont(new Font("Tahoma", Font.BOLD, 13));
		recordarContraseña.setBackground(new Color(0, 0, 255));
		recordarContraseña.setForeground(new Color(0, 255, 64));
		recordarContraseña.setToolTipText("");
		recordarContraseña.setBounds(209, 304, 193, 23);
		add(recordarContraseña);
		add(background);
	}
}
