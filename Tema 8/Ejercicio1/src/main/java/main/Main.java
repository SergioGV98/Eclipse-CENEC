package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

import excepciones.ClienteNoExisteException;
import excepciones.ContraseñaInvalidaExcepcion;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cliente cliente;

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
				if(cliente != null) {
					System.out.println("Cliente registrado con exito");
					try(BufferedWriter writer = new BufferedWriter(new FileWriter("./clientes.log", true))){
						String informacion = "Cliente " + cliente.getEmail() + " registrado con exito en: " +
								LocalDateTime.now().toString() + "\n";
						writer.write(informacion);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				break;
			case 2:
				boolean clienteLogueado = false;
				do {
					System.out.println("¡Vamos a logearte en la base de datos de clientes!");
					System.out.println("Dime tu email.");
					email = sc.nextLine();
					System.out.println("Dime tu contraseña.");
					contraseña = sc.nextLine();
					try {
						cliente = new Cliente(email, contraseña);
						clienteLogueado = true;
						try(BufferedWriter writer = new BufferedWriter(new FileWriter("./clientes.log", true))){
							String informacion = "Cliente " + cliente.getEmail() + " logueado con éxito en: " + LocalDateTime.now().toString() + "\n";
							writer.write(informacion);
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (ClienteNoExisteException | ContraseñaInvalidaExcepcion e) {
						e.printStackTrace();
					}
				}while(!clienteLogueado);
				System.out.println("Cliente logado con éxito.");
				break;
			case 3:
				System.out.println("Mostrando el contenido del archivo de log...");
			    try {
			        Scanner scanner = new Scanner(new File("./clientes.log"));
			        while (scanner.hasNextLine()) {
			            System.out.println(scanner.nextLine());
			        }
			        scanner.close();
			    } catch (FileNotFoundException e) {
			        e.printStackTrace();
			    }
				break;
			}
			System.out.println("¿Que vas hacer ahora?");
		
		}while(opcion!=0);
	}
}
