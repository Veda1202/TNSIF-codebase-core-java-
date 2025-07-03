package dayfour;

public class Base {
	
	//declare default, private, protected and public variables
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	//declare default, protected, public and private methods
	
	void methodDefault()
	{
		System.out.println("default access base class");
		System.out.println("Public cariable :"+ varDefault);
	}
	public void methodPublic()
	{
		System.out.println("Public access base class");
		System.out.println("Public variable :"+ varPublic);
	}
	private void methodPrivate()
	{
		System.out.println("private access base class");
		System.out.println("private variable : "+ varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("protected access base class");
		System.out.println("protected variable : "+ varProtected);
	}

}
