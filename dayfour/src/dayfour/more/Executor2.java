package dayfour.more;

import dayfour.Base;

public class Executor2 {
	
	public static void main(String[] args) {
		
		
		//accessing different package class
		
		Base b1 = new Base();
		
		//private, default, protected and public
		
		b1.methodPublic();
		b1.varPublic=34567;
		b1.methodPublic();
		
	}

}
