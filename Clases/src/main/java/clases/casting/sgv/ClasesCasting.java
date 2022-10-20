package clases.casting.sgv;

public class ClasesCasting {

	public static void main(String[] args) {
		
		//Variables
		int nInt=70000;
		nInt=nInt+3000;
		//Casting, le prometo que 12 va a caber en nByte(40)
		byte nByte=40;
		nByte=(byte)(nByte+12);
		
		int añoNacimiento=1993;
		short añoNacBueno=(short)añoNacimiento;
		
		float nFloat=nInt/(2000+12)*500;
		int otroInt=(int)nFloat;
		
		char letraInicial='t';
		float numeroCodificado=(float)(letraInicial/3f*1.5f+5);
		System.out.println(numeroCodificado);
		System.out.println((char)((numeroCodificado-5)/1.5f*3));
	}

}
