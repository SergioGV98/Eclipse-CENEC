package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import clases.Cliente;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PantallaRegistro extends JPanel {

	private Ventana ventana;
	private JTextField campoEmail;
	private JTextField campoTlf;
	private JTextField textNombre;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public PantallaRegistro(Ventana v) {
		this.ventana = v;
		setBackground(new Color(255, 0, 128));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 98, 82, 0, 87, 76, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 44, 0, 28, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel labelTitulo = new JLabel("BICILETAS DAW");
		labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.gridwidth = 7;
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_labelTitulo.gridx = 0;
		gbc_labelTitulo.gridy = 1;
		add(labelTitulo, gbc_labelTitulo);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);

		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 3;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 3;
		add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);

		campoEmail = new JTextField();
		GridBagConstraints gbc_campoEmail = new GridBagConstraints();
		gbc_campoEmail.gridwidth = 3;
		gbc_campoEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoEmail.insets = new Insets(0, 0, 5, 5);
		gbc_campoEmail.gridx = 2;
		gbc_campoEmail.gridy = 4;
		add(campoEmail, gbc_campoEmail);
		campoEmail.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 3;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 5;
		add(passwordField, gbc_passwordField);

		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 6;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		campoTlf = new JTextField();
		GridBagConstraints gbc_campoTlf = new GridBagConstraints();
		gbc_campoTlf.gridwidth = 3;
		gbc_campoTlf.insets = new Insets(0, 0, 5, 5);
		gbc_campoTlf.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoTlf.gridx = 2;
		gbc_campoTlf.gridy = 6;
		add(campoTlf, gbc_campoTlf);
		campoTlf.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Genero");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 7;
		add(lblNewLabel_3, gbc_lblNewLabel_3);

		JRadioButton radioHombre = new JRadioButton("Hombre");
		buttonGroup.add(radioHombre);
		GridBagConstraints gbc_radioHombre = new GridBagConstraints();
		gbc_radioHombre.insets = new Insets(0, 0, 5, 5);
		gbc_radioHombre.gridx = 1;
		gbc_radioHombre.gridy = 8;
		add(radioHombre, gbc_radioHombre);

		JRadioButton radioMujer = new JRadioButton("Mujer");
		buttonGroup.add(radioMujer);
		GridBagConstraints gbc_radioMujer = new GridBagConstraints();
		gbc_radioMujer.insets = new Insets(0, 0, 5, 5);
		gbc_radioMujer.gridx = 3;
		gbc_radioMujer.gridy = 8;
		add(radioMujer, gbc_radioMujer);

		JRadioButton radioOtros = new JRadioButton("Otros");
		buttonGroup.add(radioOtros);
		GridBagConstraints gbc_radioOtros = new GridBagConstraints();
		gbc_radioOtros.insets = new Insets(0, 0, 5, 5);
		gbc_radioOtros.gridx = 5;
		gbc_radioOtros.gridy = 8;
		add(radioOtros, gbc_radioOtros);

		JButton registrarse = new JButton("Resgistrarse");
		registrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				char[] passwordChars = passwordField.getPassword();
				String passwordString = new String(passwordChars);
				String usuarioTexto = textNombre.getText();
				int telefono = Integer.parseInt(campoTlf.getText());
				String emailTexto = campoEmail.getText();
				
				try {
					new Cliente(usuarioTexto,emailTexto,passwordString,telefono);
					JOptionPane.showMessageDialog(ventana, "Usuario valido");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		registrarse.setBackground(new Color(0, 0, 255));
		registrarse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_registrarse = new GridBagConstraints();
		gbc_registrarse.fill = GridBagConstraints.HORIZONTAL;
		gbc_registrarse.gridwidth = 5;
		gbc_registrarse.insets = new Insets(0, 0, 5, 5);
		gbc_registrarse.gridx = 1;
		gbc_registrarse.gridy = 9;
		add(registrarse, gbc_registrarse);

		JButton limpiarFormulario = new JButton("Limpiar Formulario");
		limpiarFormulario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				campoEmail.setText("");
				textNombre.setText("");
				passwordField.setText("");
				campoTlf.setText("");
			}
		});
		limpiarFormulario.setBackground(new Color(255, 255, 255));
		limpiarFormulario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_limpiarFormulario = new GridBagConstraints();
		gbc_limpiarFormulario.fill = GridBagConstraints.HORIZONTAL;
		gbc_limpiarFormulario.gridwidth = 5;
		gbc_limpiarFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_limpiarFormulario.gridx = 1;
		gbc_limpiarFormulario.gridy = 10;
		add(limpiarFormulario, gbc_limpiarFormulario);

		JButton volver = new JButton("Cancelar");
		volver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarPantalla(PantallaLogin.class);
			}
		});
		volver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_volver = new GridBagConstraints();
		gbc_volver.fill = GridBagConstraints.HORIZONTAL;
		gbc_volver.gridwidth = 5;
		gbc_volver.insets = new Insets(0, 0, 5, 5);
		gbc_volver.gridx = 1;
		gbc_volver.gridy = 11;
		add(volver, gbc_volver);
	}

}
