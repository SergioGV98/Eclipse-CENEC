package arrayRepasoNuevas;

public class Funciones {

	/*public static boolean insertarEnArray(String [] arr, byte pos, String valor) {
		
		if(pos<0 || pos >= arr.length) {
			return false;
		}
		arr[pos] = valor;
		return true;
	}*/
	
	//Funciones.intercambiar(palabra,2,5)
	
	public static void intercambiar(char [] arr, byte pos1, byte pos2) {
		
		char aux;
		
		aux = arr [pos1];
		arr [pos1] = arr [pos2];
		arr [pos2] = aux;
		
	}
	
}
