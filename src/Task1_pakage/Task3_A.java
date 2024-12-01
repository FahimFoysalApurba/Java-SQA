package Task1_pakage;

public class Task3_A {

    //Creating fields
    String name;
    int age;
    String occupation;

    //Creating Constructor
    public Task3_A(String n, int a, String occ) {
        this.name = n;
        this.age = a;
        this.occupation = occ;

    }

    //creating methods

    public void display_details(){
        System.out.println("Name: " + this.name+ "\nAge: " + this.age+ "\nOccupation: " + this.occupation);
    }
    public void change_details(String name, int age, String occ){
        this.name = name;
        this.age = age;
        this.occupation = occ;
        System.out.println("Name: " + this.name+ "\nAge: " + this.age+ "\nOccupation: " + this.occupation);


    }



}
