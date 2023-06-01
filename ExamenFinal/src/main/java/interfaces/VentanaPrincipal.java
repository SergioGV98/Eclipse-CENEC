package interfaces;

import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal extends JPanel{
	
	private Ventana ventana;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public VentanaPrincipal(Ventana v) {
		setPreferredSize(new Dimension(800, 600));
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 205, 119, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelSeleccionarImagen = new JLabel("Seleccionar imagen");
		labelSeleccionarImagen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_labelSeleccionarImagen = new GridBagConstraints();
		gbc_labelSeleccionarImagen.insets = new Insets(0, 0, 5, 5);
		gbc_labelSeleccionarImagen.gridx = 2;
		gbc_labelSeleccionarImagen.gridy = 1;
		add(labelSeleccionarImagen, gbc_labelSeleccionarImagen);
		
		JButton buttonVerImagen = new JButton("Ver Imagen");
		buttonVerImagen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_buttonVerImagen = new GridBagConstraints();
		gbc_buttonVerImagen.insets = new Insets(0, 0, 5, 5);
		gbc_buttonVerImagen.gridx = 2;
		gbc_buttonVerImagen.gridy = 2;
		add(buttonVerImagen, gbc_buttonVerImagen);
		
		JRadioButton radioButton1 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton1);
		GridBagConstraints gbc_radioButton1 = new GridBagConstraints();
		gbc_radioButton1.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton1.gridx = 1;
		gbc_radioButton1.gridy = 3;
		add(radioButton1, gbc_radioButton1);
		
		JRadioButton radioButton2 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton2);
		GridBagConstraints gbc_radioButton2 = new GridBagConstraints();
		gbc_radioButton2.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton2.gridx = 1;
		gbc_radioButton2.gridy = 4;
		add(radioButton2, gbc_radioButton2);
		
		JRadioButton radioButton3 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton3);
		GridBagConstraints gbc_radioButton3 = new GridBagConstraints();
		gbc_radioButton3.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton3.gridx = 1;
		gbc_radioButton3.gridy = 5;
		add(radioButton3, gbc_radioButton3);
		
		JRadioButton radioButton4 = new JRadioButton("New radio button");
		buttonGroup.add(radioButton4);
		GridBagConstraints gbc_radioButton4 = new GridBagConstraints();
		gbc_radioButton4.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton4.gridx = 1;
		gbc_radioButton4.gridy = 6;
		add(radioButton4, gbc_radioButton4);
		
		buttonVerImagen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!radioButton1.isSelected() && !radioButton2.isSelected() && !radioButton3.isSelected() && !radioButton4.isSelected()) {
					JOptionPane.showMessageDialog(ventana, "Error: Debes elegir una imagen","No imagen seleccionada",JOptionPane.ERROR_MESSAGE);
				} else {
					
				}
			}
		});
		
	}

}
