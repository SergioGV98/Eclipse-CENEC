package ejercicio11;

public class Funciones {

	public static String mayorString(String text1, String text2, String text3, String text4) {
		
		String cadenaLarga = "";
		
		if((text1.length() > text2.length()) && (text1.length() > text3.length()) && (text1.length() > text4.length())) {
			
			cadenaLarga = text1;
			
		}
		
		if((text2.length() > text1.length()) && (text2.length() > text3.length()) && (text2.length() > text4.length())) {
			
			cadenaLarga = text2;
			
		}
		
		if((text3.length() > text1.length()) && (text3.length() > text2.length()) && (text3.length() > text4.length())) {
			
			cadenaLarga = text3;
			
		}
		
		if((text4.length() > text1.length()) && (text4.length() > text2.length()) && (text4.length() > text3.length())) {
			
			cadenaLarga = text4;
			
		}
		
		return cadenaLarga;
	}
	
	
	
}
