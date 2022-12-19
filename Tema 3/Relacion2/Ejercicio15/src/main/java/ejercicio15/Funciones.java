package ejercicio15;

public class Funciones {

	public static String imprimeArray(char array []) {
		
		String ret = "";
		
		for(byte i = 0; i < array.length; i++) {
			ret += array[i] + " ";
		}
		
		return ret;
	}
	
	
}
