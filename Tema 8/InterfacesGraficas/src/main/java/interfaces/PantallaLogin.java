package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaLogin extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private Ventana ventana;
	public PantallaLogin(Ventana v) {
		this.ventana=v;
		setBackground(new Color(255, 128, 128));
		setLayout(null);
		
		JButton botonLogin = new JButton("Iniciar Sesion");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario=textField.getText();
				String contraseña=new String (passwordField.getPassword());
				System.out.println(usuario+" : "+contraseña);
			}
		});
		botonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonLogin.setBounds(128, 347, 142, 36);
		add(botonLogin);
		
		textField = new JTextField();
		textField.setBounds(128, 160, 351, 33);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 266, 344, 33);
		add(passwordField);
		
		JLabel titulo = new JLabel("Bicicletas DAW");
		titulo.setForeground(new Color(0, 0, 255));
		titulo.setFont(new Font("Freestyle Script", Font.BOLD, 55));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(98, 51, 475, 63);
		add(titulo);
		
		JLabel usuarioText = new JLabel("Usuario");
		usuarioText.setForeground(new Color(0, 0, 255));
		usuarioText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		usuarioText.setHorizontalAlignment(SwingConstants.CENTER);
		usuarioText.setBounds(24, 158, 80, 36);
		add(usuarioText);
		
		JLabel contraseñaText = new JLabel("Contraseña");
		contraseñaText.setForeground(new Color(0, 0, 255));
		contraseñaText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contraseñaText.setBounds(24, 261, 98, 36);
		add(contraseñaText);
		
		JLabel lblNewLabel_3 = new JLabel("¿Olvidaste su Usuario?");
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setBounds(237, 394, 132, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("¿Olvidaste su Contraseña?");
		lblNewLabel_3_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_3_1.setBounds(230, 413, 139, 14);
		add(lblNewLabel_3_1);
		
		JButton botonRegistro = new JButton("Registrarse");
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaRegistro.class);
			}
		});
		botonRegistro.setBorder(new LineBorder(new Color(0, 0, 0)));
		botonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRegistro.setToolTipText("Pincha Aquí!");
		botonRegistro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonRegistro.setBounds(330, 347, 132, 36);
		add(botonRegistro);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bubac\\Desktop\\beneficios-bicicleta-bienestar-XxXx80.jpg"));
		lblNewLabel.setBounds(0, 0, 602, 500);
		add(lblNewLabel);
		
	}
}
