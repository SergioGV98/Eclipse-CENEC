package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombreBandaMetal = null;
		byte eleccion = 5;
		boolean salir = false;


		while (salir != true && (eleccion != 0 || eleccion != 1 || eleccion != 2)) {
			System.out.println("¿Que quieres hacer?" + "\n\t0 - Salir" + "\n\t1 - Nombre banda de Metal"
					+ "\n\t2 - Metalizar texto");
			eleccion = Byte.parseByte(sc.nextLine());
			
			if(eleccion <0 || eleccion >2) {
				System.out.println("Debes introducir un numero del 0 al 2");
			}
			
			switch (eleccion) {
			case 0:
				salir = true;
				System.out.println("Vamos a terminar el prorama");
				break;
			case 1:
				System.out.println("Dime el nombre para tu banda");
				nombreBandaMetal = sc.nextLine();
				nombreBandaMetal = " " + nombreBandaMetal + " ";
				break;
			case 2:
				if(nombreBandaMetal == null) {
					System.out.println("Debes introducir algo, para poder metalizar el texto.");
					break;
				} else if(nombreBandaMetal != null){
					System.out.println(Funciones.metalizarNombreBanda(nombreBandaMetal));
					break;
				}
			}
		}
	}
}
