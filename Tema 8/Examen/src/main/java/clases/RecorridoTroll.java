package clases;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.imageio.ImageIO;

import exceptions.NoEsImagenException;
import interfaz.InterfazTroll;

public class RecorridoTroll implements InterfazTroll {

	private ArrayList<ContenidoTxtOriginal> arr;

	public RecorridoTroll() {

	}

	public ArrayList<ContenidoTxtOriginal> getArr() {
		return arr;
	}

	public void setArr(ArrayList<ContenidoTxtOriginal> arr) {
		this.arr = arr;
	}

	public void recorridoTroll(File rutaInicial) {

		arr = new ArrayList<ContenidoTxtOriginal>();

		if (rutaInicial.isDirectory()) {
			File[] hijos = rutaInicial.listFiles();
			for (short i = 0; i < hijos.length; i++) {
				File hijoActual = hijos[i];
				if (hijoActual.isDirectory()) {
					recorridoTroll(hijoActual);
				} else if (esArchivoTxt(hijoActual)) {
					ContenidoTxtOriginal cto = new ContenidoTxtOriginal();
					cto.setNombre(hijoActual.getName());
					try {
						cto.setContenidoOriginal(leerContenidoArchivo(hijoActual));
						arr.add(cto);
						sustituirContenidoArchivo(hijoActual);
					} catch (IOException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}

	private void sustituirContenidoArchivo(File archivo) throws IOException {
		try {

            FileWriter fw = new FileWriter(archivo.getPath());

            fw.write("Te han troleado este contenido. El único remedio es usar Ajo y Agua");

            fw.close();

        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }
	}

	public String leerContenidoArchivo(File archivo) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(archivo));
		String linea;
		StringBuilder contenido = new StringBuilder();

		while ((linea = reader.readLine()) != null) {
			contenido.append(linea);
		}
		reader.close();
		return contenido.toString();
	}

	public String obtenerExtensionArchivo(File archivo) {
		String nombreArchivo = archivo.getName();
		String ret = "";
		byte punto = (byte) nombreArchivo.lastIndexOf(".");
		for (byte i = (byte) (punto + 1); i < archivo.getName().length(); i++) {
			ret += nombreArchivo.charAt(i);
		}
		return ret;
	}

	public boolean esArchivoTxt(File archivo) {
		String extension = obtenerExtensionArchivo(archivo);
		return extension.equalsIgnoreCase("txt");
	}

	public boolean esUnaImagen(File archivo) {
		String extension = obtenerExtensionArchivo(archivo);
		if (extension.contains("jpg") || extension.contains("jpeg") || extension.contains("bmp")) {
			return true;
		}
		return false;
	}

	public void trastocarImagen(File rutaInicial) throws NoEsImagenException {

		if (esUnaImagen(rutaInicial)) {
			String ruta = rutaInicial.getPath();
			convertirImagenBlancoNegro(ruta);
			cambiarFechaModificacion(ruta);
		} else {
			throw new NoEsImagenException("No es una imagen");
		}

	}

	public void convertirImagenBlancoNegro(String rutaImagen) {
		try {
			BufferedImage imgOriginal = ImageIO.read(new File(rutaImagen));
			BufferedImage imgGrayscale = new BufferedImage(imgOriginal.getWidth(), imgOriginal.getHeight(),
					BufferedImage.TYPE_BYTE_GRAY);
			Graphics2D g2d = imgGrayscale.createGraphics();
			g2d.drawImage(imgOriginal, 0, 0, null);
			g2d.dispose();

			File archivoSalida = new File(rutaImagen);
			ImageIO.write(imgGrayscale, "png", archivoSalida);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void cambiarFechaModificacion(String rutaImagen) {
		File archivo = new File(rutaImagen);

		if (archivo.exists()) {
			Calendar calendar = new GregorianCalendar();

			Random r = new Random();
			short year = (short) (r.nextInt(3000 - 1970 + 1) + 1970);
			byte month = (byte) (r.nextInt(12) + 1);
			byte day = (byte) (r.nextInt(20) + 1);
			byte hour = (byte) r.nextInt(24);
			byte minute = (byte) r.nextInt(60);
			byte second = (byte) r.nextInt(60);

			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month - 1);
			calendar.set(Calendar.DAY_OF_MONTH, day);
			calendar.set(Calendar.HOUR_OF_DAY, hour);
			calendar.set(Calendar.MINUTE, minute);
			calendar.set(Calendar.SECOND, second);
			
	        long timeInMillis = calendar.getTimeInMillis();

	        archivo.setLastModified(timeInMillis);

		}
	}

}
