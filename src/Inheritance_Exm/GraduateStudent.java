package Inheritance_Exm;

// This is an Example of Multilevel Inheritance

public class GraduateStudent extends Student {
    String researchTopic;

    public GraduateStudent(String name, int age, String schoolName, String researchTopic) {
        super(name, age, schoolName);
        this.researchTopic = researchTopic;
    }

    // Method to display graduate student information
    public void displayGraduateStudentInfo() {
        // Call the intermediate class method
        super.displayStudentInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}
