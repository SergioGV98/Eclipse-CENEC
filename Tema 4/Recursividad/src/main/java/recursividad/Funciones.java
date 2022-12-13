package recursividad;

import java.util.Scanner;

public class Funciones {

	
	//Funciones recursivas siempre tienen que tener un IF, ELSE
	public static void funcionRecursivaWhile() {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("¿Entiendes la recursividad?");
		
		char respuesta = sc.nextLine().toLowerCase().charAt(0);
		
		if(respuesta == 'n') { //Caso recursivo
			Funciones.funcionRecursivaWhile(); //Para ser recursiva se tiene que llamar a si misma
		} else { //Caso base
			System.out.println("Me alegra oírlo");
		}
	}
	
	public static void funcionRecursivaFor(byte c) {
		
		if(c<5) { //Caso recursivo
			//0-4
			System.out.println(c);
			Funciones.funcionRecursivaFor((byte) (c+1));
			//4-0
			Funciones.funcionRecursivaFor((byte) (c+1));
			System.out.println(c);
		}else { //Caso base
			
		}
		
	}
	
	public static String funcionRecursivaForString(byte c) {
		String ret="";
		if(c<5) { //Caso recursivo
			//0-4
			/*ret+=c+" ";
			ret+=Funciones.funcionRecursivaForString((byte) (c+1));*/
			//4-0
			ret+=Funciones.funcionRecursivaForString((byte) (c+1));
			ret+=c+" ";
		}else { //Caso base
			
		}
		return ret;
	}
	
	public static String ejercicio(byte i, long numero) {
		String ret = "";
		
		if(i<numero/2) { //Caso recursivo
			if(numero%i == 0) {
				ret+= i+" ";
				ret += Funciones.ejercicio((byte)(i+1), numero);
			}
		}else { //Caso base
			
		}
		return ret;
	}
	
}
