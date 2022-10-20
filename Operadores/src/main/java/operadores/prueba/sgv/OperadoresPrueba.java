package operadores.prueba.sgv;

import java.util.Scanner;

public class OperadoresPrueba {

	public static void main(String[] args) {
		
		//Variables
		int edad;
		boolean estado;
		boolean resultado;
		short gananciasAnuales=12000;
		short nHijos=10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Me pueden dar una subvencion?"+
		(gananciasAnuales<15000 || gananciasAnuales<=24000 && nHijos>2));
		/*System.out.println("Dime tu edad");	
		edad = Byte.parseByte(sc.nextLine());*/
		/*resultado=edad>=18;
		System.out.println("¿Eres mayor de edad? " + resultado);
	    boolean tiene18=edad==18;
	    System.out.println("¿Tiene justo 18?" + tiene18);
		boolean notiene18=edad!=18;
		System.out.println("¿Tiene una edad distinta a 18?" + notiene18);*/
		
		/*boolean prejubilado=false;
		System.out.println("¿Tiene edad de trabajar? " +
		(edad>17 && edad<=65 && !prejubilado));
		System.out.println("¿Me he jubilado ya?" +
		(prejubilado==true || edad>65));
		System.out.println("¿Me he jubilado ya? " +
		!(prejubilado!=true&&edad<=65));
		System.out.println("¿Puedo no ir a trabajar? " +
		((!(edad<18 && edad>=65)) || prejubilado));*/
		
		
		
		
		
		/*System.out.println("¿Estas vivo?");
		estado = Boolean.parseBoolean(sc.nextLine());
		edad++; //Suma 1 PostIncremento primero te devuelve el valor y luego le suma el 1
		edad--; //Resta 1 PostDrecremento
		++edad; //Suma 1 PreIncremento primero suma el 1 y luego te devuelve el valor
		--edad; //Resta 1 PreDecremento  
		System.out.println("El año que viene tendras " + edad + " años");
		System.out.println("Lo contrario de lo que me has dicho es: " + (!estado));  //Le cambia el signo al booleano True o False (Solo booleanos)
		//System.out.println(~edad); //Te pone todos los 1 a 0 o todos los 0 a 1
		edad=edad<<1;//Desplazas los bit uno a la izquierda lo mismo que multiplicar x2 o a la derecha que es dividir entre 2 (Solo Enteros)
		System.out.println("Edad ahora " + edad); */
	}

}
