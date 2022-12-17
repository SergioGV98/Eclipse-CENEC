package ejercicio7;

public class Funciones {

	public static String cifrado(String texto, byte cifrado) {

		String codificado = "";
		
		for (byte i = 0; i < texto.length(); i++) {

			codificado += (char) (texto.charAt(i) + cifrado);
			
		}

		return codificado;
	}

}
