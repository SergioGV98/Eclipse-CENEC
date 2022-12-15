package ejercicio4;

public class Funciones {

	
	public static short loQueQueda(String original, String subString) {
		
		short contador = 0;
		
		if(original.contains(subString)) {
			
			for(short numero = (short) ((short) original.lastIndexOf(subString)+subString.length()); numero < original.length(); numero++) {
				contador++;
			}
			
		} else {
			return -1;
		}
		
		return contador;
	}
	
}
