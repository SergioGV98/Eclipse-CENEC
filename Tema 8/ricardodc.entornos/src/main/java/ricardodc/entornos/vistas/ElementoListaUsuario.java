package ricardodc.entornos.vistas;

import javax.swing.JPanel;

import clases.Cliente;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;

public class ElementoListaUsuario extends JPanel{
	
	Ventana v;
	Cliente c;
	
	public ElementoListaUsuario(Ventana ventana,Cliente cliente) {
		
		this.v = ventana;
		this.c = cliente;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{38, 0, 0, 94, 0, 0};
		gridBagLayout.rowHeights = new int[]{36, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel labelEmail = new JLabel(""+c.getEmail());
		GridBagConstraints gbc_labelEmail = new GridBagConstraints();
		gbc_labelEmail.insets = new Insets(0, 0, 0, 5);
		gbc_labelEmail.gridx = 1;
		gbc_labelEmail.gridy = 1;
		add(labelEmail, gbc_labelEmail);
	
	}
	
	
	

}
