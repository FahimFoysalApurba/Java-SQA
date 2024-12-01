package Task1_pakage;

public class Task4_DecisionMaking {
     int number;
     int day;

    // Constructor to initialize the values
    public Task4_DecisionMaking(int number, int day) {
        this.number = number;
        this.day = day;
    }

    // Method for Simple if statement
    public void simpleIfStatement() {
        if (number > 0) {
            System.out.println("The number is positive.");
        }
    }

    // Method for if-else statement
    public void ifElseStatement() {
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    // Method for if-else-if ladder
    public void ifElseIfLadder() {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // Method for Nested if statement
    public void nestedIfStatement() {
        if (number != 0) {
            if (number > 0) {
                System.out.println("The number is positive and non-zero.");
            }
        }
    }

    // Method for Switch statement
    public void switchStatement() {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }
}
