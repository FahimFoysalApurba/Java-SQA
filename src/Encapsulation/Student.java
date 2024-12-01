package Encapsulation;

public class Student {
    // Private data members
    private String name;
    private int age;

    // Constructor to initialize the values
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to read the value of 'name' (only read, no setter)
    public String getName() {
        return name;
    }

    // Getter method to read the value of 'age' (only read, no setter)
    public int getAge() {
        return age;
    }
}
