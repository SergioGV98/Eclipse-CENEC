package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter escritor = new FileWriter("./prueba.txt", true);
			escritor.write("Hola mundo" + "\n");
			escritor.flush();
			escritor.close();
			
			BufferedReader lector = new BufferedReader(new FileReader("./prueba.txt"));
			String linea = lector.readLine();
			String texto="";
			while(linea!=null) {
				texto += linea + "\n";
				linea = lector.readLine();
			}
			lector.close();
			System.out.println(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
