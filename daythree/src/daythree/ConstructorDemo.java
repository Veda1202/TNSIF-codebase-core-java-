package daythree;

import java.util.Scanner;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		String city;
		
		
		System.out.println("Enter Customer Id");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City");
		city=sc.nextLine();
		
		System.out.println(" ");
		
		Customer c1=new Customer();  //default
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		System.out.println(c1);
		
		}
		
	}


