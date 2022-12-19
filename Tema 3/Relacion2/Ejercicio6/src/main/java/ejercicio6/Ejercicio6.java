package ejercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		System.out.println(Funciones.descrifrarQuiero("Vznjwt%fuwtgfw%jxyf%fxnlsfyzwf"));
		System.out.println(Funciones.descodificar("Vznjwt%fuwtgfw%jxyf%fxnlsfyzwf"));
		System.out.println(Funciones.descrifrarQuiero("Vznjwtbfuwtgfwbjxyfbfxnlsfyzwf"));

		String[] nombres = {"carlos", "sergio"};
		
		for(byte i = 0; i< nombres.length; i++) {
			String actual = nombres[i].toUpperCase().charAt(0) + nombres[i].substring(1);
			System.out.println(actual);
		}
		
	}

}
