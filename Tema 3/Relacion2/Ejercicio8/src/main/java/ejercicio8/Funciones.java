package ejercicio8;

public class Funciones {

	public static String cifrado(String texto, byte cifrado, byte i) {
		String codificado = "";

		if (i < texto.length()) { // Caso recursivo
			codificado += (char) (texto.charAt(i) + cifrado);
			codificado += Funciones.cifrado(texto, cifrado, (byte) (i+1));
			
		} else {
			
		}
		return codificado;
	}

}
