package tnsif;

public class primitivedatatypesdemo {
	
	public static void main(String[] args) {
		
		//byte takes 1 byte
		//1 byte = 8 bits   //2^8
		//256/2
		//128
		
		byte byteMax=127;
		byte byteMin=-128;
		
		System.out.println("Min range of byte is : "+ byteMin + " Max range of byte is "+ byteMax);
		
		//short ---- 2 byte
		short shortMax= 32767;
		short shortMin= -32768;
		
		System.out.println("Min range of short is : "+ shortMin + " Max range of short is "+ shortMax);
		
		//int ---- 4 byte
		int maxInt=214783647;
		int minInt=-214783648;
		System.out.println("Min range of integer is : "+ maxInt + " Max range of integer is "+ minInt);
		
		//long -- 8 byte
		long maxLong=9223372036854775807L;
		long minLong=-9223372036854775808L;
		System.out.println("Min range of long is : "+ maxLong + " Max range of long is "+ minLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		
		boolean flag=false;
		boolean flag2=true;
		
		
		
	}

}
