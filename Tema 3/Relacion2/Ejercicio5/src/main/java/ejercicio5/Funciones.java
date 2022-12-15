package ejercicio5;

import java.util.Random;

public class Funciones {

	public static String patadizarRefran(String refran) {
		

		if () {
			return null;
		}

		int position = refran.indexOf(",");

		refran = refran.substring(0, position + 1); //Digo que todo el refran empieza desde la posicion 0, hasta la posicion de la , + 1 para incluirla 
		//Todo lo demas se borraria.
		refran = refran + " patada en la entrepierna";
		
		Random r = new Random();
		
		switch(r.nextInt(1,5)) {
		
		case 1:
			refran = "1 " + refran;
			break;
		case 2:
			refran = "2 " + refran;
			break;
		case 3:
			refran = "3 " + refran;
			break;
		case 4:
			refran = "4 " + refran;
			break;
		}
		
	switch(r.nextInt(1,5)) {
		
		case 1:
			refran = refran + " 1";
			break;
		case 2:
			refran = refran + " 2";
			break;
		case 3:
			refran = refran + " 3";
			break;
		case 4:
			refran = refran + " 4";
			break;
		}
		return refran;
	}

}
