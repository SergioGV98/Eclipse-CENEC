package interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.Capitulo;

public class ElementoLista extends JPanel {

	private Capitulo capitulo;
	private Ventana ventana;

	public ElementoLista(Capitulo capitulo, Ventana v) {
		this.ventana = v;
		this.capitulo = capitulo;
		setLayout(new BorderLayout());

		JLabel labelTitulo = new JLabel(capitulo.getTitulo());
		add(labelTitulo, BorderLayout.NORTH);

		JLabel labelImagen = new JLabel();
		ImageIcon icono = new ImageIcon(capitulo.getRutaImagen());
		labelImagen.setIcon(icono);
		add(labelImagen, BorderLayout.CENTER);

		JButton btnVerDetalle = new JButton("Ver en detalle");
		btnVerDetalle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentanaDetalle();
			}
		});
		add(btnVerDetalle, BorderLayout.SOUTH);

	}

	private void mostrarVentanaDetalle() {
		VentanaDetalle ventanaDetalle = new VentanaDetalle(ventana, capitulo);
		ventanaDetalle.setVisible(true);
	}
}
