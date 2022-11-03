package operaciones.logica.sgv;

import java.util.Scanner;

public class OperacionesLogicas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Variables Parte 1
		int n1;
		int n1Original;
		
		//Variables Parte 2
		short añoNacimiento;
		
		//Variables Parte 3
		byte tallaPie;
		short resultado;
		
		//Parte 1 - 1
		System.out.println("Introduce un numero");
		n1 = Integer.parseInt(sc.nextLine());
		n1Original = n1;
		System.out.println("¿El resultado es 2? " +
		((((n1*3)+6)/3-n1Original)==2));
		
		//Parte 2 
		System.out.println("Introduce tu año de nacimiento");
		añoNacimiento = Short.parseShort(sc.nextLine());
		System.out.println("¿Tu año de nacimiento es par o tienes mas de 30 años? " +
		(((añoNacimiento%2) == 0) || ((2022-añoNacimiento) >= 30)));
		
		//Parte 3 
		System.out.println("Introduce tu tallade pie");
		tallaPie = Byte.parseByte(sc.nextLine());
		resultado=(short)((tallaPie*5+50)*20+1022-añoNacimiento);
		System.out.println("Resultado: " + resultado);
		System.out.println("Expresión booleana grande, que devolverá true o false");
		System.out.println((resultado/1000>1 && resultado/10000<1) && (resultado/100==tallaPie) && (resultado%100==(2022-añoNacimiento)));
		
	}

}
