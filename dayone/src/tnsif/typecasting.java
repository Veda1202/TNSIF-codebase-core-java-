package tnsif;

public class typecasting {
	
	public static void main(String[] args) {
		
		
		//widning  //implicit type type casting
		
		byte b=10;
		int i=b;
		System.out.println(i);
		
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		
		//narrowing  // explicit type casting
		
		double f1=10.52f;
		
		
		long ll=(long) f1;
		
		System.out.println(ll);
		
		long l2=9552254559L;
		
		int i12=(int)12;
		System.out.println(i12);
		
		short a=130;
		
		byte b1=(byte) a;
		System.out.println(b1);
		
		//byte -128 to 127
		//130-128=2
		
		
	}

}
