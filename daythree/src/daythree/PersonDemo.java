package daythree;

import java.util.Scanner;

public class PersonDemo {
	
	public static void main(String[] args) {
		
		//Scanner object to accept user input
		Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter the Person name :");
		name= ob.next();
		System.out.println("Enter the age :");
		int age =ob.nextInt();
		System.out.println("enter gender :");
		String gender = ob.next();
		
		System.out.println("Enter mobile number ");
		long mobileNumber=ob.nextLong();
		System.out.println("Enter income");
		int income =ob.nextInt();
		
		
		//person object and initialized values using setter
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobileNumber(mobileNumber);
		
		//by using getter method i m reading the data
		System.out.println(person.getName() );
		System.out.println(person.getAge() );
		System.out.println(person.getGender() );
		
		
		//display person details using toString() method
		System.out.println(person);
		
		TaxCalculation calc=new TaxCalculation();
		calc.cal(person);
		System.out.println("After Calculation of tax :");
		
	}

}
