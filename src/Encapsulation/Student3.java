package Encapsulation;

public class Student3 {
    // Private data members
    private String name;
    private int age;

    // Constructor to initialize values
    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to read the value of 'name' (read & write)
    public String getName() {
        return name;
    }

    // Setter method to modify the value of 'name' (read & write)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to read the value of 'age' (read & write)
    public int getAge() {
        return age;
    }

    // Setter method to modify the value of 'age' (read & write)
    public void setAge(int age) {
        this.age = age;
    }
}
