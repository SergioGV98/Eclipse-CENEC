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
    private BufferedImage imagen;

    public VentanaImagen(Ventana v, String ruta) {
        this.ventana = v;
        setLayout(new BorderLayout());

        cargarImagen(ruta);

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

    private void cargarImagen(String ruta) {
        try {
            imagen = ImageIO.read(new File(ruta));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
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

            // Invertir los colores de la imagen en escala de grises para obtener el negativo
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
