package Inheritance_Exm;


// This is an example of single inheritance
//Student is child 1 of Person
//Here we draw the Example of Single inheritance

public class Student extends Person{

    String schoolName;

    public Student(String name, int age, String schoolName) {
        // Call the parent class constructor
        super(name, age);
        this.schoolName = schoolName;
    }

    public void displayStudentInfo() {
        // Call the parent class method
        super.displayInfo();
        System.out.println("School Name: " + schoolName);
    }
}
