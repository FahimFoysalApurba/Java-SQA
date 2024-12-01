package Task1_pakage;

public class Task6_JumpStatements {
    int limit;

    // Constructor to initialize the limit
    public Task6_JumpStatements(int limit) {
        this.limit = limit;
    }

    // Method to demonstrate the Java break statement
    public void demonstrateBreak() {
        System.out.println("Break statement:");
        for (int i = 1; i <= limit; i++) {
            if (i == 4) {
                System.out.println("Break at iteration: " + i);
                break; // Exits the loop when i equals 4
            }
            System.out.println("Iteration: " + i);
        }
    }

    // Method to demonstrate the Java continue statement
    public void demonstrateContinue() {
        System.out.println("\ncontinue statement:");
        for (int i = 1; i <= limit; i++) {
            if (i == 4) {
                System.out.println("Continue at iteration: " + i);
                continue; // Skips the rest of the loop when i equals 4
            }
            System.out.println("Iteration: " + i);
        }
    }
}
