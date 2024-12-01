package Abstration;

public abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method (has a body)
    public void sleep() {
        System.out.println("This animal sleeps...");
    }
}
