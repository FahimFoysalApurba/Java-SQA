package Task1_pakage;

public class Task5_LoopStatements {
    int limit;
    int[] numbers;

    // Constructor to initialize data
    public Task5_LoopStatements(int limit, int[] numbers) {
        this.limit = limit;
        this.numbers = numbers;
    }

    // Method to demonstrate Java for loop
    public void forLoop() {
        System.out.println("For loop:");
        for (int i = 1; i <= limit; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    // Method to demonstrate Java for-each loop
    public void forEachLoop() {
        System.out.println("\nFor-each loop:");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }

    // Method to demonstrate Java while loop
    public void whileLoop() {
        System.out.println("\nWhile loop:");
        int count = 1;
        while (count <= limit) {
            System.out.println("Count: " + count);
            count++;
        }
    }

    // Method to demonstrate Java do-while loop
    public void doWhileLoop() {
        System.out.println("\nDo-while loop:");
        int count = 1;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= limit);
    }
}
