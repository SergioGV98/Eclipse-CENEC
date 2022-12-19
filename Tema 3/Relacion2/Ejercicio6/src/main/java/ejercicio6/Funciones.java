package ejercicio6;

public class Funciones {
	
	
	public static byte descrifrarQuiero(String texto) {
		
		for (byte i = 1; i < 127; i++) {
			String descodificado = "";
			
			for(byte j = 0; j < texto.length(); j++) {
				descodificado += (char) (texto.charAt(j) - i);
			}
			
			if(descodificado.contains("Quiero")) {
				return i;
			}
			
		}

		return -1;
	}
	
	public static String descodificar(String texto) {
		
		texto = texto.replace("-", "a");
		texto = texto.replace("@", "p");
		texto = texto.replace("%", "b");
		
		return texto;
	}
}