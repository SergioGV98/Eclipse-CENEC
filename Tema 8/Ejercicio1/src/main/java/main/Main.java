package main;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cliente cliente;
		Logger logger = Logger.getLogger("clientes");
		FileHandler fileHandler = null;
		try {
			fileHandler = new FileHandler("./clientes.log", true);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		logger.addHandler(fileHandler);

		

		byte opcion;
		do {
			System.out.println("|              MENU              |"
					 + "\n" 
					 + "|       0 - Salir                |"
					 + "\n" 
					 + "|       1 - Registro             |"
					 + "\n" 
					 + "|       2 - Login                |"
					 + "\n" 
					 + "|       3 - Ver Log              |");
			opcion = Byte.parseByte(sc.nextLine());
			switch(opcion) {
			case 1:
				System.out.println("¡Vamos a registrarte en la base de datos de clientes!");
				System.out.println("Dime tu nombre.");
				String nombre = sc.nextLine();
				System.out.println("Dime tu email.");
				String email = sc.nextLine();
				System.out.println("Dime tu contraseña.");
				String contraseña = sc.nextLine();
				System.out.println("Dime tu telefono.");
				int telefono = Integer.parseInt(sc.nextLine());
				
				cliente = new Cliente(nombre, email, contraseña, telefono);
				logger.log(Level.INFO, "Cliente " + cliente.getEmail() + " registrado con éxito en: " + LocalDateTime.now().toString());
				System.out.println("Cliente registrado con exito.");
				break;
			case 2:
				break;
			case 3:
				break;
			}
			System.out.println("¿Que vas hacer ahora?");
		
		}while(opcion!=0);
	}
}
