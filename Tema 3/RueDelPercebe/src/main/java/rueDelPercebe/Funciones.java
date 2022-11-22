package rueDelPercebe;

public class Funciones {

	public static String pintarAltura(String dibujo, byte nVeces) {
		String ret = "";
		for(byte i=0; i<nVeces; i++) {
			ret+=dibujo;
		}
		return ret;
	}
	
	
}
