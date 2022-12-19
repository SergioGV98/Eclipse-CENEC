package ejercicio12;

public class Funciones {

	public static String cuentaVocales(String texto, short i) {
		
		String ret = "";
		
		if(i<texto.length()) {
			if(texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
				ret += texto.charAt(i);
			}
			ret += Funciones.cuentaVocales(texto, (short) (i+1));
		}
		return ret;
	}
}
