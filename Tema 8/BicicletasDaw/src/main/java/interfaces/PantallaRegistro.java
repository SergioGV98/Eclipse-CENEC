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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaRegistro extends JPanel{
	
	private Ventana ventana;
	private JTextField textField;
	private JTextField textEmail;
	private JPasswordField passwordField;
	private JTextField textTelefono;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public PantallaRegistro(Ventana v) {
		setBackground(new Color(128, 255, 255));
		setForeground(new Color(0, 0, 0));
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{49, 79, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTitle = new JLabel("Registrarse BicicletasDAW");
		lblTitle.setFont(new Font("HYWenHei-85W", Font.PLAIN, 35));
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.gridwidth = 4;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 0);
		gbc_lblTitle.gridx = 0;
		gbc_lblTitle.gridy = 1;
		add(lblTitle, gbc_lblTitle);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("HYWenHei-85W", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		textField.setFont(new Font("HYWenHei-85W", Font.PLAIN, 11));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("HYWenHei-85W", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 4;
		add(lblEmail, gbc_lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("HYWenHei-85W", Font.PLAIN, 11));
		textEmail.setColumns(10);
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.anchor = GridBagConstraints.WEST;
		gbc_textEmail.gridwidth = 2;
		gbc_textEmail.insets = new Insets(0, 0, 5, 0);
		gbc_textEmail.gridx = 2;
		gbc_textEmail.gridy = 4;
		add(textEmail, gbc_textEmail);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("HYWenHei-85W", Font.PLAIN, 20));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.WEST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 5;
		add(lblContrasea, gbc_lblContrasea);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.anchor = GridBagConstraints.WEST;
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 5;
		add(passwordField, gbc_passwordField);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("HYWenHei-85W", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 6;
		add(lblTelefono, gbc_lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setFont(new Font("HYWenHei-85W", Font.PLAIN, 11));
		textTelefono.setColumns(10);
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.anchor = GridBagConstraints.WEST;
		gbc_textTelefono.gridwidth = 2;
		gbc_textTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_textTelefono.gridx = 2;
		gbc_textTelefono.gridy = 6;
		add(textTelefono, gbc_textTelefono);
		
		JLabel lblNewLabel = new JLabel("Genero");
		lblNewLabel.setFont(new Font("HYWenHei-85W", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 7;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnHombre);
		GridBagConstraints gbc_rdbtnHombre = new GridBagConstraints();
		gbc_rdbtnHombre.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnHombre.gridx = 1;
		gbc_rdbtnHombre.gridy = 8;
		add(rdbtnHombre, gbc_rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		GridBagConstraints gbc_rdbtnMujer = new GridBagConstraints();
		gbc_rdbtnMujer.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMujer.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMujer.gridx = 2;
		gbc_rdbtnMujer.gridy = 8;
		add(rdbtnMujer, gbc_rdbtnMujer);
		
		JRadioButton rdbtnOtro = new JRadioButton("Otro");
		buttonGroup.add(rdbtnOtro);
		GridBagConstraints gbc_rdbtnOtro = new GridBagConstraints();
		gbc_rdbtnOtro.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnOtro.gridx = 3;
		gbc_rdbtnOtro.gridy = 8;
		add(rdbtnOtro, gbc_rdbtnOtro);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.gridwidth = 3;
		gbc_btnRegistrarse.insets = new Insets(0, 0, 5, 0);
		gbc_btnRegistrarse.gridx = 1;
		gbc_btnRegistrarse.gridy = 9;
		add(btnRegistrarse, gbc_btnRegistrarse);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLogin.class);
			}
		});
		
		JButton btnNewButton = new JButton("Limpiar formulario");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 11;
		add(btnNewButton, gbc_btnNewButton);
		GridBagConstraints gbc_btnAtras = new GridBagConstraints();
		gbc_btnAtras.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtras.gridx = 2;
		gbc_btnAtras.gridy = 11;
		add(btnAtras, gbc_btnAtras);
	}
}
