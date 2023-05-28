package ricardodc.entornos.main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import ricardodc.entornos.vistas.PantallaEntornos;
import ricardodc.entornos.vistas.Ventana;

public class Main extends JFrame {
	
	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		try {
			BufferedImage imgb = ImageIO.read(new File("fotoclase.jpg"));
			g.drawImage(imgb, 0, 0,this.getWidth(),this.getHeight(),new Color(0,0,0),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public static BufferedImage mascaraNegativa(BufferedImage img) {
		
		BufferedImage imgMascara = img;
		
		for (int i = 0; i < img.getWidth(); i++) {

			for (int j = 0; j < img.getHeight(); j++) {
				
				

				imgMascara.setRGB(i, j,  ~img.getRGB(i, j));

			}

		}
	
	
	return imgMascara;
}



	public static BufferedImage mascara(BufferedImage img, int color) {
	
		BufferedImage imgMascara = img;
		
	
		
		for (int i = 0; i < img.getWidth(); i++) {

			for (int j = 0; j < img.getHeight(); j++) {
				
				

				imgMascara.setRGB(i, j, (color & img.getRGB(i, j)));

			}

		}
		return imgMascara;
	}

	public static void main(String[] args) {
		

		
			Ventana v = new Ventana();
			
			
		
			try {
			/*	
				BufferedImage img = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
				float contadorR = 0;
				float contadorG = 0;
				float contadorB = 0;

				for (int i = 0; i < img.getWidth(); i++) {

					for (int j = 0; j < img.getHeight(); j++) {
						String colorE =String.format("%02X", (int)contadorR);
						colorE += String.format("%02X", (int)contadorG);
						colorE += String.format("%02X", (int)contadorB);
						img.setRGB(i, j, Integer.parseInt(colorE,16));
						contadorR = (contadorR+(255f/img.getHeight()))%255;
						
					}
					contadorG = contadorG+(255f/img.getHeight())%255;

				}
				
				showImage(img);
				
				ImageIO.write(img, "JPG", new File("./img.jpg"));*/
				
				
				BufferedImage imgd = ImageIO.read(new File("./fotoclase.jpg"));
				ImageIO.write(imgd,"jpg",new File("./modificado.jpg"));
				
				/*

				for (int i = 0; i < imgd.getWidth(); i++) {

					for (int j = 0; j < imgd.getHeight(); j++) {
						
						imgd.setRGB(i, j, ~imgd.getRGB(i, j));
				
					}
		

				}
				
*/
				
				
				
			//	imgd = mascara(imgd, Integer.parseInt("d96f62", 16));
				imgd = mascaraNegativa(imgd);
				Image icono = imgd.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				
				//showImage(imgd);
				
				ImageIO.write(imgd, "JPG", new File("modificado.jpg"));
				
				
				

				JFrame jf = new JFrame();
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				jf.getContentPane().add(new JLabel(new ImageIcon(icono)));
				jf.getContentPane().setBackground(Color.black);
				jf.pack();
				jf.setIconImage(new ImageIcon("fotoclase.jpg").getImage());
				jf.setVisible(true);
				
				// TODO Auto-generated method stub
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
	}

}
