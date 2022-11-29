package ejercicio5;

public class Funciones {

	public static String remplazarTexto(String textoIntroducido) {
		/*
		if (textoIntroducido.contains("una") || textoIntroducido.contains("uno")) {
			textoIntroducido = textoIntroducido.replaceAll("uno", "1");
			textoIntroducido = textoIntroducido.replaceAll("una", "1");
		}
		
		if (textoIntroducido.contains("dos")) {
			textoIntroducido = textoIntroducido.replaceAll("dos", "2");
		}
		
		if (textoIntroducido.contains("tres")) {
			textoIntroducido = textoIntroducido.replaceAll("tres", "3");
		}	
		
		if (textoIntroducido.contains("cuatro")) {
			textoIntroducido = textoIntroducido.replaceAll("cuatro", "4");
		}	
		
		if (textoIntroducido.contains("cinco")) {
			textoIntroducido = textoIntroducido.replaceAll("cinco", "5");
		}	
		
		if (textoIntroducido.contains("seis")) {
			textoIntroducido = textoIntroducido.replaceAll("seis", "6");
		}	
		
		if (textoIntroducido.contains("siete")) {
			textoIntroducido = textoIntroducido.replaceAll("siete", "7");
		}	
		
		if (textoIntroducido.contains("ocho")) {
			textoIntroducido = textoIntroducido.replaceAll("ocho", "8");
		}
		
		if (textoIntroducido.contains("nueve")) {
			textoIntroducido = textoIntroducido.replaceAll("nueve", "9");
		}
		
		if (textoIntroducido.contains("diez")) {
			textoIntroducido = textoIntroducido.replaceAll("diez", "10");
		}
		*/
		textoIntroducido = textoIntroducido.replace(" uno ", "1")
				.replace(" una ", " 1 ")
				.replace(" dos ", " 2 ")
				.replace(" tres ", " 3 ")
				.replace(" cuatro ", " 4 ")
				.replace(" cinco ", " 5 ")
				.replace(" seis ", " 6 ")
				.replace(" siete ", " 7 ")
				.replace(" ocho ", " 8 ")
				.replace(" nueve ", " 9 ")
				.replace(" diez ", " 10 ").trim(); //Lo mismo tambien vale porque es un string y cuenta
		
		//textoIntroducido = textoIntroducido.trim(); //Borra espacios del inicio y del final
		
		return textoIntroducido;
	}
	
	
}
