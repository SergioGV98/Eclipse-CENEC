package matrices;

public class Matrices {

	public static void main(String[] args) {

		byte[][] matriz = new byte[3][3];
		byte[][] matriz2 = {{5,3,22},
							{4,44,1}};
		
		for(byte i = 0; i < matriz2.length; i++) {
			for(byte j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Imprime al reves la matriz
		for(byte i = 0; i < matriz2.length; i++) {
			for(byte j = (byte) (matriz2[i].length-1); j >= 0; j--) {
				System.out.print(matriz2[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
