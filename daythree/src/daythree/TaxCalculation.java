package daythree;

public class TaxCalculation {
	
	
	// Function to calculate the tax
	
		public void cal(Person person) {
			if (person.getAge() > 60 || person.getGender().equalsIgnoreCase("female")) {
				person.setTax(0);
				System.out.println("Tax is not applicable");
			} else {
				if (person.getIncome() <= 1000000) {
					person.setTax(0);
					System.out.println("Tax not applicable");
				} else if (person.getIncome() > 1000000 && person.getIncome() <= 5000000) {
					person.setTax((person.getIncome() - 1000000) * 10 / 100);
					System.out.println("Tax calculated for income between 10L and 50L");
				} else if (person.getIncome() > 5000000 && person.getIncome() <= 8000000) {
					person.setTax((person.getIncome() - 5000000) * 20 / 100 + 400000); // 400000 is tax for 10L-50L slab
					System.out.println("Tax calculated for income between 50L and 80L");
				} else if (person.getIncome() > 8000000) {
					person.setTax((person.getIncome() - 8000000) * 30 / 100 + 1000000); // 1000000 = 10% on 40L + 20% on 30L
					System.out.println("Tax calculated for income above 80L");
				}
			}
		}
	}
	
	
	