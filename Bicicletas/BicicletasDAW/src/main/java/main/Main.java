package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import clases.Bicicleta;
import clases.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Paco", "paco@gmail.com", "paco1234", 610844378);
		Cliente cliente2 = new Cliente("Juan", "juan@gmail.com", "juanjuan1234", 610145021);
	
		Bicicleta bicicleta1 = new Bicicleta("GTX 1", "R1-2", cliente1);
		Bicicleta bicicleta2 = new Bicicleta("RTA", "LA4-2", cliente1);
		Bicicleta bicicleta3 = new Bicicleta("ROLEXP", "PA24-2", cliente2);
		
		cliente1.getBicicletas().add(bicicleta1);
		cliente1.getBicicletas().add(bicicleta2);
		cliente2.getBicicletas().add(bicicleta3);
	
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		HashSet<Bicicleta> bicicletas = new HashSet<Bicicleta>();
		bicicletas.addAll(Arrays.asList(bicicleta1, bicicleta2, bicicleta3));
		Iterator<Bicicleta> it = bicicletas.iterator();
		
		while(it.hasNext()) {
			Bicicleta bici = it.next(); 
			if(cliente1.getBicicletas().contains(bici)) {
				System.out.println(bici);
			}
		} 
	
	}

}
