import Abstration.*;
import Encapsulation.Student1;
import Encapsulation.Student3;
import Inheritance_Exm.Employee;
import Inheritance_Exm.GraduateStudent;
import Inheritance_Exm.Person;
import Inheritance_Exm.Student;
import polymorphism.PostGraduateStudent;
import polymorphism.UndergraduateStudent;
import polymorphism.University;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        //------------A.Inheritance---------------

           //1. Single inheritance
        Person p=new Person("Foysal", 26);
        p.displayInfo();
        Student s=new Student("Arnob", 23, "Chittagong Medical College");
        //this is child 1
        s.displayStudentInfo();
        s.displayInfo();
        Person s1=new Student("Fahim",24, "Anjuman");
        s1.displayInfo(); // only can access the elements of Person(Parent Calss)

          //2. Multilevel Inheritance
        GraduateStudent gs=new GraduateStudent("Foysal Apurba", 26, "North South University", "Granular Computing-based Deep Learning");
        gs.displayGraduateStudentInfo();
        gs.displayStudentInfo();
        gs.displayInfo();

           //3.Hierarchical Inheritance
        Employee e1= new Employee("Hridoy", 19, "ROBI");
        //this is the child 2
        e1.displayEmployeeInfo();
        //--------------B.Polymorphism---------------
          //1. Method Overloading
        University university = new University();
        // Using overloaded methods
        System.out.println("Undergraduate Tuition: " + university.calculateTuition(10000));
        System.out.println("Postgraduate Tuition: " + university.calculateTuition(10000, 5000));
        System.out.println("International Student Tuition: " + university.calculateTuition(10000, 2000, 5000));

           //2.Method Overriding (Must extend a parent class)
        polymorphism.Person p2=new UndergraduateStudent();
        p2.displayDetails();  // Calls UndergraduateStudent's displayDetails method

        polymorphism.Person p3= new PostGraduateStudent();
        p3.displayDetails();  // Calls PostgraduateStudent's displayDetails method


        //C. Encapsulation
           //Read only (getter())
        Encapsulation.Student student=new Encapsulation.Student("Foysal", 28);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

           //Write only (Setter())
        Student3 student3 = new Student3("Alice", 20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
           // Modifying data using setters
        student3.setName("Charlie");
        student3.setAge(21);
          // After modification
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());


        //D. Abstraction

          //Abstract class
        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound();        // Calls Dog's implementation
        myDog.sleep();

           //interface
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PaypalPayment();

        // Make payments
        creditCardPayment.makePayment(100.0); // Calls CreditCard's makePayment
        payPalPayment.makePayment(200.0);    // Calls PayPal's makePayment












    }
}