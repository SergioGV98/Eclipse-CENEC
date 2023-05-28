package interfaces;

import javax.imageio.ImageIO;
import javax.swing.*;

import clases.Capitulo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class AnimeInformacion extends JPanel {
	private Ventana ventana;

	public AnimeInformacion(Ventana v) {
		this.ventana = v;

		ArrayList<String> descripciones = new ArrayList<>(
				Arrays.asList("BlueLock 1", "BlueLock 2", "BlueLock 3", "BlueLock 4", "BlueLock 5", "BlueLock 6",
						"BlueLock 7", "BlueLock 8", "BlueLock 9", "BlueLock 10", "BlueLock 11", "BlueLock 12",
						"BlueLock 13", "BlueLock 14", "BlueLock 15", "BlueLock 16", "BlueLock 17", "BlueLock 18",
						"BlueLock 19", "BlueLock 20", "BlueLock 21", "BlueLock 22", "BlueLock 23", "BlueLock 24"));

		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		JPanel contendorElementos = new JPanel();
		scrollPane.setViewportView(contendorElementos);
		contendorElementos.setLayout(new BoxLayout(contendorElementos, BoxLayout.Y_AXIS));

		// Agregar elementos a la lista
		for (int i = 0; i < 24; i++) {
			Capitulo capitulo = new Capitulo("Capítulo " + (i + 1), (descripciones.get(i)),
					"./imagenes/bluelock" + (i + 1) + ".jpg");

			// Crear un JPanel para cada elemento de la lista
			JPanel elementoLista = new JPanel();
			elementoLista.setLayout(new BorderLayout());

			// Agregar JLabel para la imagen del capítulo
			JLabel imagenLabel = new JLabel();
			ImageIcon imagen = cargarImagen("./imagenes/bluelock" + (i + 1) + ".jpg");
			imagenLabel.setIcon(imagen);
			elementoLista.add(imagenLabel, BorderLayout.CENTER);

			// Agregar JLabel para el título del capítulo
			JLabel tituloLabel = new JLabel(capitulo.getTitulo());
			elementoLista.add(tituloLabel, BorderLayout.PAGE_START);

			// Agregar JLabel para la descripción del capítulo
			JLabel descripcionLabel = new JLabel(capitulo.getDescripcion());
			elementoLista.add(descripcionLabel, BorderLayout.WEST);

			JButton descripcion = new JButton("Ver en detalle");
			descripcion.setPreferredSize(new Dimension(200, 10));
			elementoLista.add(descripcion, BorderLayout.EAST);

			// Agregar el elemento de la lista al contenedor
			contendorElementos.add(elementoLista);

			ImageIcon iconoGrises = convertirImagenGrises(capitulo.getRutaImagen());

			descripcion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					JOptionPane.showMessageDialog(null, new JLabel(capitulo.getDescripcion(), iconoGrises, JLabel.LEFT),
							capitulo.getTitulo(), JOptionPane.PLAIN_MESSAGE);

				}
			});
		}

	}

	public ImageIcon cargarImagen(String ruta) {
		try {
			BufferedImage img = ImageIO.read(new File(ruta));
			Image scaledImg = img.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
			return new ImageIcon(scaledImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ImageIcon convertirImagenGrises(String rutaImagen) {
		try {
			BufferedImage imgOriginal = ImageIO.read(new File(rutaImagen));
			BufferedImage imgGrayscale = new BufferedImage(imgOriginal.getWidth(), imgOriginal.getHeight(),
					BufferedImage.TYPE_BYTE_GRAY);
			Graphics2D g2d = imgGrayscale.createGraphics();
			g2d.drawImage(imgOriginal, 0, 0, null);
			g2d.dispose();

			Image scaledImg = imgGrayscale.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
			return new ImageIcon(scaledImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
