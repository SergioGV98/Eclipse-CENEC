package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Variables
		byte limiteInferior = 0;
		byte limiteSuperior = 0;
		byte intervaloAbierto = 0;
		byte numero = -1;
		byte numerosOut = 0;
		boolean numeroRepetido = false;
		
		do {
			
			System.out.println("Dime el limite Inferior");
			limiteInferior = Byte.parseByte(sc.nextLine());
			
			System.out.println("Dime el limite Superior");
			limiteSuperior = Byte.parseByte(sc.nextLine());
			
			
			if(limiteInferior > limiteSuperior) {
				System.out.println("El limite Inferior no puede ser mayor que el Superior");
			}
			
		}while(limiteInferior > limiteSuperior);
		

		while(numero != 0) {
			System.out.println("Dime un numero, si me dices 0 saldre del programa");
			numero = Byte.parseByte(sc.nextLine());
			intervaloAbierto += numero;
			
			if(numero > limiteSuperior && numero != 0) {
				numerosOut++;
			}
			
			if(numero < limiteInferior && numero != 0) {
				numerosOut++;
			}
			
			if(numero == limiteSuperior) {
				numeroRepetido = true;
			}
			
			if(numero == limiteInferior) {
				numeroRepetido = true;
			}
		}
		
		
		
		System.out.println("Intervalo abierto " + intervaloAbierto);
		System.out.println("Numeros fuera del intervalo Superior e Inferior " + numerosOut);
		System.out.println("¿Has introducido algun numero igual al limite Inferior o Superior " + (numeroRepetido));
		
	}

}
