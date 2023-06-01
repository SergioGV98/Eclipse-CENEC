package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaImagen extends JPanel {

	private Ventana ventana;

	public VentanaImagen(Ventana v, String ruta) {
		this.ventana = v;
		setLayout(new BorderLayout());

		ImageIcon imagen = cargarImagen(ruta);
		if (imagen != null) {
			JLabel background = new JLabel(imagen);
			background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			add(background, BorderLayout.CENTER);
		}

		JButton negativoImagenButton = new JButton("Ver negativo");
		negativoImagenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ImageIcon imgNegativa = aplicarFiltroNegativo(ruta);
				JPanel panel = new JPanel(new BorderLayout());
				panel.add(new JLabel(imgNegativa), BorderLayout.CENTER);
				JOptionPane.showMessageDialog(null, panel, "Imagen negativo", JOptionPane.PLAIN_MESSAGE);
			}
		});
		negativoImagenButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(negativoImagenButton, BorderLayout.SOUTH);
	}

	public ImageIcon cargarImagen(String ruta) {
		try {
			BufferedImage img = ImageIO.read(new File(ruta));
			int width = img.getWidth();
			int height = img.getHeight();
			setPreferredSize(new Dimension(width, height));
			Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			return new ImageIcon(scaledImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ImageIcon aplicarFiltroNegativo(String rutaImagen) {
		try {
			BufferedImage imgOriginal = ImageIO.read(new File(rutaImagen));

			// Convertir la imagen en escala de grises
			BufferedImage imgGrayscale = new BufferedImage(imgOriginal.getWidth(), imgOriginal.getHeight(),
					BufferedImage.TYPE_BYTE_GRAY);
			Graphics2D g2d = imgGrayscale.createGraphics();
			g2d.drawImage(imgOriginal, 0, 0, null);
			g2d.dispose();

			// Invertir los colores de la imagen en escala de grises para obtener el
			// negativo
			RescaleOp op = new RescaleOp(-1.0f, 255f, null);
			BufferedImage imgNegativa = op.filter(imgGrayscale, null);

			// Escalar la imagen negativa
			Image scaledImg = imgNegativa.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
			return new ImageIcon(scaledImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
