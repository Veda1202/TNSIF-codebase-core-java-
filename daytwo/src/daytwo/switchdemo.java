package daytwo;

public class switchdemo {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		int userInput=7;
		
		switch(userInput)
		{
		
		case 1: System.out.println("Current Recharge details");
		break;
		
		case 2: System.out.println("Current Recharge expiry");
		break;
		
		case 3: System.out.println("New Offers");
		break;
		
		case 4: System.out.println(" Talk to our customer support person ");
		break;
		
		default : 
			System.out.println(userInput + " is not a valid input given by you");
		}
	}

}

