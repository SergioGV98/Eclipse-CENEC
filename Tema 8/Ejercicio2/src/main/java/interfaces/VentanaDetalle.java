package interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import clases.Capitulo;

public class VentanaDetalle extends JPanel{

	private Capitulo capitulo;
	private Ventana ventana;

	public VentanaDetalle(Ventana v, Capitulo capitulo) {
		this.ventana = v;
		this.capitulo = capitulo;
		setSize(new Dimension(600, 600));

		JPanel panelContenido = new JPanel();
		panelContenido.setLayout(new BorderLayout());

		JLabel labelTitulo = new JLabel(capitulo.getTitulo());
		panelContenido.add(labelTitulo, BorderLayout.NORTH);

		JLabel labelImagen = new JLabel();
		ImageIcon icono = new ImageIcon(capitulo.getRutaImagen());
		labelImagen.setIcon(icono);
		panelContenido.add(labelImagen, BorderLayout.CENTER);

		JTextArea textAreaDescripcion = new JTextArea(capitulo.getDescripcion());
		textAreaDescripcion.setEditable(false);
		panelContenido.add(new JScrollPane(textAreaDescripcion), BorderLayout.SOUTH);

	}
	
}
