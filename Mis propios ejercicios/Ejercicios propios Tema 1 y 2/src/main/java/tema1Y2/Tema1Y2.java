package tema1Y2;

import java.util.Scanner;

public class Tema1Y2 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		/* Ejercicio 1
		 * Programa que lea una cantidad de grados centígrados y la pase a grados
		 * Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a
		 * fahrenheit es: F = 32 + ( 9 * C / 5) y al resultado incrementalo en 1.
		 */
		
		byte gradosCentigrado;
		float gradosFahrenheit;
		
		System.out.println("Dime una cantidad de grados centigrados (Lo normal ronda de -30 a 104)");
		gradosCentigrado = Byte.parseByte(sc.nextLine());
		
		gradosFahrenheit = 32 + 9*gradosCentigrado/5f;
		
		System.out.println("La conversion de Grados Centigrados a Grados Fahrenheit es " +gradosFahrenheit);
		System.out.println("La conversion de Grados Centigrados a Grados Fahrenheit incrementado +1 " + ++gradosFahrenheit);
		
		/* Ejercicio 2
		 *  Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		 */
		
		short velocidadKM;
		float velocidadMS;
		
		System.out.println("Dime una velocidad realista entre (1-300) para pasartela a m/s");
		velocidadKM = Short.parseShort(sc.nextLine());
		
		velocidadMS = (velocidadKM*1000)/3600f;
		
		System.out.println("La velocidad " + velocidadKM + " Km/h" + " pasada a m/s es " +velocidadMS + " m/s");
		
		/* Ejercicio 3
		 *  Programa que muestre el resto de una division por pantalla y muestre True o False si 
		 *  el resto es 0 (Caso True) y False en caso de no ser 0.
		 */
		
		byte numeroDivisible;
		byte resto;
		
		System.out.println("Dime un numero (0-127)");
		numeroDivisible = Byte.parseByte(sc.nextLine());
		
		resto = (byte) (numeroDivisible%2);
		
		System.out.println("El resto es " + resto);
		
		System.out.println("¿El resto es 0 (==)? " + (resto==0));
		System.out.println("¿El resto es no distinto de 0 (!=)? " + (resto!=0));
		
		/* Ejercicio 4
		 *  Programa que le introduzcas dos numeros no mayores de 32.000 y te los compare si es mayor o menor.
		 *  Ademas luego comprueba si es true o false con un tercer numero siguiendo este ejemplo
		 *  (n1 + n2 > n3) y  (n3<n2) o (n1+n2!=n3)
		 */
		
		short n1;
		short n2;
		short n3;
		
	   System.out.println("Introduce N1 ");
	   n1 = Short.parseShort(sc.nextLine());
	   System.out.println("Introduce N2 ");
	   n2 = Short.parseShort(sc.nextLine());
	   System.out.println("Introduce N3 ");
	   n3 = Short.parseShort(sc.nextLine());
	   
	   
	   System.out.println("Comprobacion de True o False: " + ((n1+n2 > n3) && (n3<n2) || (n1+n2 != n3)));
	   
		/* Ejercicio 5
		 *  Crea 2 variables que solo puedan almacenar un valor T o F e inicializalas y comparalas de varias maneras.
		 */
	   
	   boolean z = true;
	   boolean x = false;
	   boolean y;
	   
	   System.out.println("¿Z toma el valor F? " + (z==false) + " ,toma el valor True");
	   System.out.println("¿Z es distinta de X? " + (z!=x));
	   System.out.println("¿X es igual que Z? " + (z==x));
	   
	   System.out.println("Introduceme True or False en Y ");
	   y = Boolean.parseBoolean(sc.nextLine());
	   System.out.println("Y toma el valor de " + y);
	   
	   System.out.println("¿Es Y igual a Z?" + (y==z));
	   System.out.println("¿Es Y igual a X?" + (y==x));
	   
	   System.out.println("Expresion definitiva totalmente inventada: " +
	   ((y!=z) || (z==x) && (z!=y)));
	}

}
