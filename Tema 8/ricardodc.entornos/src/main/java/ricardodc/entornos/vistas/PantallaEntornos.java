package ricardodc.entornos.vistas;

import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class PantallaEntornos extends JPanel {
	private JTextField textCod;
	private JTextField textNombre;
	private JTextField textLocalidad;
	private Ventana ventana;
	final private ButtonGroup buttonGroup = new ButtonGroup();
	public PantallaEntornos(Ventana v) {
		setBackground(new Color(128, 64, 64));
		setForeground(new Color(0, 0, 0));
		
		this.ventana = v;
		setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(0, 0, 64));
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane.setBounds(20, 88, 419, 323);
		add(layeredPane);
		
		JLabel lblNewLabel = new JLabel("DATOS DEL DEPARTAMENTO");
		lblNewLabel.setBounds(146, 11, 147, 35);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código del Departamento");
		lblNewLabel_1.setBounds(10, 91, 147, 14);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Departamento");
		lblNewLabel_2.setBounds(10, 124, 136, 14);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad Departamento");
		lblNewLabel_3.setBounds(10, 156, 136, 14);
		layeredPane.add(lblNewLabel_3);
		
		textCod = new JTextField();
		textCod.setBounds(179, 88, 73, 20);
		layeredPane.add(textCod);
		textCod.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(178, 121, 147, 20);
		layeredPane.add(textNombre);
		textNombre.setColumns(10);
		
		textLocalidad = new JTextField();
		textLocalidad.setBounds(179, 153, 147, 20);
		layeredPane.add(textLocalidad);
		textLocalidad.setColumns(10);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane_1.setBounds(10, 181, 315, 64);
		layeredPane.add(layeredPane_1);
		

		
		final JRadioButton tec = new JRadioButton("Tecnología");
		tec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Has seleccionado Tecnologia");
			}
		});
		tec.setBounds(10, 266, 109, 23);
		layeredPane.add(tec);
		
		final JRadioButton inf = new JRadioButton("Informática");
		inf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Has seleccionado Informática");
			}
		});
		inf.setBounds(10, 291, 109, 23);
		layeredPane.add(inf);
		
		final JCheckBox chkSi = new JCheckBox("Si");
		chkSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chkSi.isSelected()) {
					System.out.println("Has elegido sí");
				}

			}
		});
		chkSi.setBounds(132, 266, 42, 23);
		layeredPane.add(chkSi);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Posición: " + comboBox.getSelectedIndex());
				System.out.println("Contenido: " + comboBox.getSelectedItem());
			}
		});
		
		
		buttonGroup.add(inf);
		buttonGroup.add(tec);

		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Italia", "España", "Francia"}));
		comboBox.setBounds(193, 266, 100, 22);
		layeredPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Limpiar Datos");
	
		btnNewButton.setBounds(84, 422, 105, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insertar Datos");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Se ha puslsado el botón insertar");
				System.out.println("Código tecleado: " + textCod.getText());
				System.out.println("Nombre tecleado: "+ textNombre.getText());
				System.out.println("Localidad tecleada: " + textLocalidad.getText());
				
				
			}
		});
		btnNewButton_1.setBounds(238, 422, 129, 23);
		add(btnNewButton_1);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Se ha puslsado el botón limpiar");
				
				textCod.setText("");
				textNombre.setText("");
				textLocalidad.setText("");
			}
		});
	}
}
