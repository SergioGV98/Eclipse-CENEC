package main;

public class Main {

	public static void main(String[] args) {

		/*String rutaInicial = "D:\\Estudios\\Eclipse\\Tema 8\\Examen\\arbol1DAM";
		RecorridoTroll rc = new RecorridoTroll();*/
		
		
		/*File archivo = new File("./noExisto.txt"); //Define una ruta
		
		System.out.println("Existe el archivo: " + archivo.exists()); // Comprueba si exise el archivo
		
		try {
			System.out.println("Pude crear el archivo: " + archivo.createNewFile()); // Crea un archivo con la extension de la ruta definida arriba
			System.out.println("Ruta absoluta: " + archivo.getAbsolutePath()); // Obtienes la ruta absoluta del archivo
			System.out.println("Nombre: " + archivo.getName()); // Obtienes el nombre del archivo con la extension
			System.out.println("Carpeta madre: " + archivo.getParent()); // Obtienes la ruta de la carpeta madre | Solo si la ruta definida es absoluta si no devuelve null o .
			System.out.println("¿Es un directorio? " + archivo.isDirectory()); // Obtienes un true o false si la ruta es un directorio
			System.out.println("Tamaño del disco duro: " + archivo.getTotalSpace()); // Obtienes el tamaño del disco duro donde se encuentra el archivo
			System.out.println("Tamaño libre del disco duro: " + archivo.getFreeSpace()); // Obtienes el espacio libre del disco duro donde se encuentra el archivo
			System.out.println("Tamaño del archivo (bytes): " + archivo.length()); // Obtienes el tamaño del achivo en bytes
			System.out.println("Fecha de modificacion: " + archivo.lastModified()); // Obtienes la ultima fecha de modificacion
			LocalDateTime ultimaMod = LocalDateTime.ofEpochSecond(archivo.lastModified()/1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.now()));
			System.out.println("Fecha de ultima modificacion: " + ultimaMod);
			//System.out.println("¿Pude borrarlo: " + archivo.delete()); // Borra el archivo
		} catch (IOException e) {
			e.printStackTrace();
		}*/

	}

	/*public static void recorridoRecursivo(File carpeta) {
	if(carpeta.isDirectory()) {
		File [] hijos = carpeta.listFiles();
		for(short i = 0; i < hijos.length; i++) {
			File hijoActual = hijos[i];
			if(hijoActual.isDirectory()) {
				recorridoRecursivo(hijoActual);
			} else {
				System.out.println(hijoActual.getAbsolutePath() + " : " + hijoActual.length() + " : " + LocalDateTime.ofEpochSecond(hijoActual.lastModified()/1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.now())));
			}
		}
	}
} */
}
