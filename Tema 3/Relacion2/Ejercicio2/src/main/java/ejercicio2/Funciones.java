package ejercicio2;

public class Funciones {

	
	public static short cuentaLetras (String texto, char letra) {
		
		short contador = 0;
		
		for(short i=0; i<texto.length(); i++) {
			char comprobador;
			comprobador = texto.charAt(i);
			
			if(comprobador == letra) {
				contador++;
			}
		}
		
		return contador;
	}
	
}
