package args;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Tamaño de args: " + args.length);

		for(byte i= 0; i<args.length;i++) {
			System.out.println(i+" : "+args[i]);
		}
	}

}
