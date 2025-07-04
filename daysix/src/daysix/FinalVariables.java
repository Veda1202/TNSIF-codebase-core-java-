package daysix;

public class FinalVariables {
	
	//final int a;  //final instance variable must be initialized
	
	final int x=100;
	
	//declare a static blank final variable
	final static int y;
	
	final static int z=10;
	
	//instance method
	void change()
	{
		//a=20;
//		x=30;   final variables cannot be changed
//		z=50;  or reassign
		
	}

	@Override
	public String toString() {
		return "FinalVariables [x=" + x + ", y=" + y+"]";
	}
	
	//declare a static block
	static
	{
		y=20;
		//z=80;  once initialized cant be reassigned
		System.out.println("value of ");
	}
	
	

}
