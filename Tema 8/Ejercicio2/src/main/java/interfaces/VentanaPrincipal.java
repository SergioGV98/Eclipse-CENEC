package interfaces;

import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal extends JPanel {

	private Ventana ventana;
	private JTextField textFieldName;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public VentanaPrincipal(Ventana v) {
		this.ventana = v;
		setSize(new Dimension(1300, 700));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 135, 336, 0, 0, 68, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 43, 22, 0, 61, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		
		BufferedImage imgd = null;
		try {
			imgd = ImageIO.read(new File("./imagenes/bluelock.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ImageIcon icon = new ImageIcon(imgd.getScaledInstance(200, 150, Image.SCALE_SMOOTH));
		
		JLabel labelTitle = new JLabel("Blue Lock");
		GridBagConstraints gbc_labelTitle = new GridBagConstraints();
		gbc_labelTitle.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitle.gridx = 0;
		gbc_labelTitle.gridy = 0;
		add(labelTitle, gbc_labelTitle);
		
		JLabel imagen = new JLabel("");
		GridBagConstraints gbc_imagen = new GridBagConstraints();
		imagen.setIcon(icon);
		gbc_imagen.insets = new Insets(0, 0, 5, 5);
		gbc_imagen.gridx = 0;
		gbc_imagen.gridy = 1;
		add(imagen, gbc_imagen);
		
		JButton buttonEntrar = new JButton("Entrar");
		buttonEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v.cambiarPantalla(AnimeInformacion.class);
			}
		});
		GridBagConstraints gbc_buttonEntrar = new GridBagConstraints();
		gbc_buttonEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_buttonEntrar.gridx = 0;
		gbc_buttonEntrar.gridy = 2;
		add(buttonEntrar, gbc_buttonEntrar);
		
		JLabel lblTextName = new JLabel("Nombre: ");
		lblTextName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblTextName = new GridBagConstraints();
		gbc_lblTextName.anchor = GridBagConstraints.EAST;
		gbc_lblTextName.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextName.gridx = 2;
		gbc_lblTextName.gridy = 4;
		add(lblTextName, gbc_lblTextName);
		
		textFieldName = new JTextField();
		GridBagConstraints gbc_textFieldName = new GridBagConstraints();
		gbc_textFieldName.anchor = GridBagConstraints.WEST;
		gbc_textFieldName.gridwidth = 2;
		gbc_textFieldName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldName.gridx = 3;
		gbc_textFieldName.gridy = 4;
		add(textFieldName, gbc_textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 3;
		gbc_lblGenero.gridy = 5;
		add(lblGenero, gbc_lblGenero);
		
		JRadioButton radioButtonHombre = new JRadioButton("Hombre");
		buttonGroup.add(radioButtonHombre);
		GridBagConstraints gbc_radioButtonHombre = new GridBagConstraints();
		gbc_radioButtonHombre.insets = new Insets(0, 0, 5, 5);
		gbc_radioButtonHombre.gridx = 2;
		gbc_radioButtonHombre.gridy = 6;
		add(radioButtonHombre, gbc_radioButtonHombre);
		
		JRadioButton radioButtonMujer = new JRadioButton("Mujer");
		buttonGroup.add(radioButtonMujer);
		GridBagConstraints gbc_radioButtonMujer = new GridBagConstraints();
		gbc_radioButtonMujer.insets = new Insets(0, 0, 5, 5);
		gbc_radioButtonMujer.gridx = 4;
		gbc_radioButtonMujer.gridy = 6;
		add(radioButtonMujer, gbc_radioButtonMujer);
		
	}

}
