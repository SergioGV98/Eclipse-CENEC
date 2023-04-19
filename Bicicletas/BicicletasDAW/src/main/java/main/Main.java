package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

import clases.Bicicleta;
import clases.Cliente;

public class Main {

	public static void main(String[] args) {

		/*Cliente cliente1 = new Cliente("Paco", "paco@gmail.com", "paco1234", 610844378);
		Cliente cliente2 = new Cliente("Juan", "juan@gmail.com", "juanjuan1234", 610145021);
		Cliente cliente3 = new Cliente("Teresa", "teresa@gmail.com", "teresa1234", 610142021);
		Cliente cliente4 = new Cliente("Miguel", "miguel@gmail.com", "miguel1234", 610141021);
		Cliente cliente5 = new Cliente("Antonio", "antonio@gmail.com", "antonio1234", 610149021);

		HashMap<String, Cliente> porEmail = new HashMap<String, Cliente>();
		HashMap<Integer, Cliente> porTelefono = new HashMap<Integer, Cliente>();

		porEmail.put(cliente1.getEmail(), cliente1);
		porTelefono.put(cliente1.getTelefono(), cliente1);
		porEmail.put(cliente2.getEmail(), cliente2);
		porTelefono.put(cliente2.getTelefono(), cliente2);
		porEmail.put(cliente3.getEmail(), cliente3);
		porTelefono.put(cliente3.getTelefono(), cliente3);
		porEmail.put(cliente4.getEmail(), cliente4);
		porTelefono.put(cliente4.getTelefono(), cliente4);
		porEmail.put(cliente5.getEmail(), cliente5);
		porTelefono.put(cliente5.getTelefono(), cliente5);

		Cliente personaEncontrada = porEmail.get("juan@gmail.com");
		porTelefono.remove(cliente3.getTelefono());

		Bicicleta bicicleta1 = new Bicicleta("GTX 1", "R1-2", cliente1);
		Bicicleta bicicleta2 = new Bicicleta("RTA", "LA4-2", cliente1);
		Bicicleta bicicleta3 = new Bicicleta("RTA", "PA24-2", cliente2);

		cliente1.getBicicletas().add(bicicleta1);
		cliente1.getBicicletas().add(bicicleta2);
		cliente2.getBicicletas().add(bicicleta3);

		System.out.println(cliente1);
		System.out.println(cliente2);

		System.out.println("---------------------------------------------------------------");

		TreeSet<Bicicleta> bicicletas = new TreeSet<Bicicleta>();
		bicicletas.addAll(Arrays.asList(bicicleta1, bicicleta2, bicicleta3));
		Iterator<Bicicleta> it = bicicletas.iterator();

		while (it.hasNext()) {
			Bicicleta bici = it.next();
			if (cliente1.getBicicletas().contains(bici)) {
				System.out.println(bici);
			}
		}

		System.out.println("---------------------------------------------------------------");
		System.out.println(personaEncontrada);
		System.out.println("---------------------------------------------------------------");
*/
		/*
		 * Iterator<Integer>i = porTelefono.keySet().iterator();
		 * 
		 * while(i.hasNext()) { 
		 * int actual = i.next(); 
		 * System.out.println(telActual);
		 * }
		 */

		/*Iterator<Cliente> i = porTelefono.values().iterator();

		while (i.hasNext()) {
			Cliente actual = i.next();
			System.out.println(actual);
		}*/
		
		/*Iterator i = porEmail.entrySet().iterator();

		while (i.hasNext()) {
			Entry actual = (Entry) i.next();
			String clave = (String) actual.getKey();
			Cliente valor = (Cliente)actual.getValue();
			System.out.println(clave + " : " + valor);
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
		Cliente cliente = null;
		
		boolean salir = false;
		do {
			System.out.println("-------------------------------------\n" 
					  +"|                MENU               |\n"
					  +"|0 - Salir                          |\n"
					  +"|1 - Crear cliente                  |\n" 
					  +"|2 - Modificar nombre de un cliente |\n"
					  +"|3 - Modificar email de un cliente  |\n"
					  +"|4 - Imprimir un cliente            |\n"			
					  +"-------------------------------------");
			byte opcion = Byte.parseByte(sc.nextLine());
			switch(opcion) {
			case 0: // Salir
				salir = true;
				break;
			case 1: // Crear cliente
				System.out.println("Dime el nombre del cliente");
				String nombre = sc.nextLine();
				System.out.println("Dime el email del cliente");
				String email = sc.nextLine();
				System.out.println("Dime el telefono del cliente");
				int telefono = Integer.parseInt(sc.nextLine());
				System.out.println("Dime la contraseña del cliente");
				String password = sc.nextLine();
				clientes.put(email, new Cliente(nombre, email, password, telefono));
				break;
			case 2: // Modificar nombre de un cliente
				System.out.println("Dime el email del cliente que vas a modificar");
				String emailBusqueda = sc.nextLine();
				if(clientes.containsKey(emailBusqueda)) {
					System.out.println("Dime el nombre nuevo para el cliente");
					String nombreNuevo = sc.nextLine();
					clientes.get(emailBusqueda).setNombre(nombreNuevo);
				} else {
					System.out.println("No he encontrado al cliente que buscas");
				}
				break;
			case 3: // Modificar email de un cliente
				System.out.println("Dime el email del cliente que vas a modificar");
				emailBusqueda = sc.nextLine();
				if(clientes.containsKey(emailBusqueda)) {
					System.out.println("Dime el nuevo correo electronico");
					String nuevoEmail = sc.nextLine();
					cliente = clientes.get(emailBusqueda);
					cliente.setEmail(nuevoEmail);
					clientes.remove(emailBusqueda);
					clientes.put(cliente.getEmail(), cliente);
					
				} else {
					System.out.println("No he encontrado al cliente que buscas");
				}
				break;
			case 4: // Imprimir un cliente
				System.out.println("Dime el email del cliente que vas a monstrar la informacion");
				emailBusqueda = sc.nextLine();
				if(clientes.containsKey(emailBusqueda)) {
					System.out.println(clientes.get(emailBusqueda));
				} else {
					System.out.println("Email no encontrado");
				}
				break;
			}
		}while(!salir);
	}

}
