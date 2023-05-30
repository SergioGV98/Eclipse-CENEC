package clases;

import java.io.File;
import java.util.ArrayList;

import exceptions.NoEsImagenException;
import interfaz.InterfazTroll;

public class RecorridoTroll implements InterfazTroll{
	
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
		if(rutaInicial.isDirectory()) {
			File[] archivos = rutaInicial.listFiles();
			if(archivos != null) {
				for(File archivo : archivos) {
					if(archivo.isDirectory()) {
						recorridoTroll(archivo);
					} else if (archivo.isFile() && esArchivoTxt(archivo)) {
						String contenidoOriginal = "";
						ContenidoTxtOriginal a = new ContenidoTxtOriginal();
						a.setNombre(archivo.getName());
						contenidoOriginal = archivo.getName();
					}
				} 
			}
		}
	}
	
	public String obtenerExtensionArchivo(File archivo) {
		String nombreArchivo = archivo.getName();
		String ret = "";
		byte punto = (byte) nombreArchivo.lastIndexOf(".");
		for(byte i = punto; i < archivo.length(); i++) {
			ret += nombreArchivo.charAt(i);
		}
		return ret;
	}
	
	public boolean esArchivoTxt (File archivo) {
		String extension = obtenerExtensionArchivo(archivo);
		return extension.equalsIgnoreCase("txt");
	}

	public void trastocarImagen(File rutaInicial) throws NoEsImagenException {
		
		
	}
	
}
