package daysix;

public class MyClass {
	
	//default constructor
	public MyClass(int section) {
		super();
		this.section = section;
	}

	private int section;  //non static variable or instance variable
	
	private static int srNo;  //static or class variable
	
	//static block
	static
	{
		System.out.println("-----Within Static block-----");
		srNo=1000;
		// section=101;
	}
	
	{
		System.out.println("-----Within Default constructor-----");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method
	static void display()
	{
		//System.out.println("Section :"+ section);
		
		System.out.println("Serial no:"+srNo);
	}
}
