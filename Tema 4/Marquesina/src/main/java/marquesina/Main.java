package marquesina;

public class Main {

	public static void main(String[] args) {

		String texto = "Mira como mola esto, una marquesina!";

		char[] marquesina = new char[10];

		for (byte i = 0; i < texto.length(); i++) {
			for(byte j = 0; j < marquesina.length-1; j++) {
				System.out.print(marquesina[j]=marquesina[j+1]);
				marquesina[marquesina.length-1]=texto.charAt(i);
			}
			System.out.println();
		}
		
	}

}
