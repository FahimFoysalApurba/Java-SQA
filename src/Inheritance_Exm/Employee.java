package Inheritance_Exm;

// this is child 2 of Person Employee, so this is the example of Hierarchical inheritance
//Multiple child classes inherit from a single parent class.

public class Employee extends Person{
    String companyName;

    public Employee(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public void displayEmployeeInfo() {
        super.displayInfo();
        System.out.println("Company Name: " + companyName);
    }
}
