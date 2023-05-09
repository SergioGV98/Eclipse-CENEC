package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PantallaRegistro extends JPanel{
	
	private Ventana ventana;
	private JTextField emailTextField;
	private JPasswordField contraseñaTextField;
	private JTextField nombreTextField;
	private JTextField telefonoTextField;
	
	public PantallaRegistro(Ventana v) {
		this.ventana = v;
		setLayout(null);
		JLabel registroTitle = new JLabel("Registro");
		registroTitle.setForeground(new Color(255, 255, 255));
		registroTitle.setFont(new Font("HYWenHei-85W", Font.BOLD, 29));
		registroTitle.setBounds(217, 46, 195, 47);
		add(registroTitle);
		
		JComboBox comboBoxProvincia = new JComboBox();
		comboBoxProvincia.setModel(new DefaultComboBoxModel(new String[] {"Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla"}));
		comboBoxProvincia.setBounds(458, 140, 92, 22);
		add(comboBoxProvincia);
		
		JLabel titleNombre = new JLabel("Nombre");
		titleNombre.setForeground(new Color(255, 255, 255));
		titleNombre.setFont(new Font("HYWenHei-85W", Font.BOLD, 14));
		titleNombre.setBounds(28, 221, 81, 14);
		add(titleNombre);
		
		JLabel titleEmail = new JLabel("Email");
		titleEmail.setForeground(new Color(255, 255, 255));
		titleEmail.setFont(new Font("HYWenHei-85W", Font.BOLD, 14));
		titleEmail.setBounds(28, 164, 46, 15);
		add(titleEmail);
		
		JLabel titleContraseña = new JLabel("Contraseña");
		titleContraseña.setForeground(new Color(255, 255, 255));
		titleContraseña.setFont(new Font("HYWenHei-85W", Font.BOLD, 14));
		titleContraseña.setBounds(189, 221, 92, 14);
		add(titleContraseña);
		
		JLabel titleTelefono = new JLabel("Telefono");
		titleTelefono.setForeground(new Color(255, 255, 255));
		titleTelefono.setFont(new Font("HYWenHei-85W", Font.BOLD, 14));
		titleTelefono.setBounds(320, 221, 92, 14);
		add(titleTelefono);
		
		JLabel titleProvincia = new JLabel("Provincia");
		titleProvincia.setForeground(new Color(255, 255, 255));
		titleProvincia.setFont(new Font("HYWenHei-85W", Font.BOLD, 14));
		titleProvincia.setBounds(458, 115, 110, 14);
		add(titleProvincia);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(106, 161, 195, 20);
		add(emailTextField);
		emailTextField.setColumns(10);
		
		contraseñaTextField = new JPasswordField();
		contraseñaTextField.setBounds(162, 247, 131, 20);
		add(contraseñaTextField);
		
		nombreTextField = new JTextField();
		nombreTextField.setBounds(10, 247, 122, 20);
		add(nombreTextField);
		nombreTextField.setColumns(10);
		
		telefonoTextField = new JTextField();
		telefonoTextField.setBounds(320, 247, 86, 20);
		add(telefonoTextField);
		telefonoTextField.setColumns(10);
		
		JButton registrarseBoton = new JButton("Registrarse");
		registrarseBoton.setBounds(252, 365, 101, 23);
		add(registrarseBoton);
		
		JLabel backgroundRegistrarse = new JLabel("");
		backgroundRegistrarse.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundRegistrarse.setIcon(new ImageIcon("C:\\Users\\1DAW\\Desktop\\backgroundregistrarse.gif"));
		backgroundRegistrarse.setBounds(0, 0, 602, 401);
		
		JButton btnNewButton = new JButton("<<Volver");
		btnNewButton.setBounds(10, 365, 89, 23);
		add(btnNewButton);
		add(backgroundRegistrarse);
	}
}
