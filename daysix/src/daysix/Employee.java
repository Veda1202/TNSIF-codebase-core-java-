package daysix;

public class Employee {
	
	// Declare instance variables.
    private String name;
    private int id;

    // Declare static companyName variable
    static String companyname = "TNSIF";

    // Two-parameter constructor
    public Employee(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", Company= " + companyname + "]";
    }

	
	

}
