
//Task 1: Creating package under src
import Task1_pakage.*;


public class Main {
    public static void main(String[] args) {

        //Task 2: Creating a separate class for Ternary Operator
        Task2_Ternary_Operator t = new Task2_Ternary_Operator();
        t.Ternary_operator();
        System.out.println("\n");


        //Task 3: Creating A class in Java can contain: Fields, Method, Constructors, main method, create one more Object
        Task3_A T=new Task3_A("Foysal", 26, "Unemployed");
        T.display_details();
        T.change_details("Arnob", 21, "Medical Student");
        System.out.println("\n");


        //Task 4: Create a class for Decision-Making statements, Simple if statement, if-else statement, if-else-if ladder, Nested if-statement, Switch Statement
        Task4_DecisionMaking D=new Task4_DecisionMaking(3, 5);
        D.simpleIfStatement();
        D.ifElseStatement();
        D.ifElseIfLadder();
        D.nestedIfStatement();
        D.switchStatement();
        System.out.println("\n");


        //Task 5: Create a class for Loop Statements for loop, Java for loop, Java for-each loop, while loop, do-while loop
        int limit=10;
        int[] numbers = {10, 20, 30, 40, 50};
        Task5_LoopStatements L=new Task5_LoopStatements(limit, numbers);
        L.whileLoop();
        L.doWhileLoop();
        L.forLoop();
        L.forEachLoop();
        System.out.println("\n");


        //Task 6: Create a class for Jump Statements: Java break statement,Java continue statement
        Task6_JumpStatements J=new Task6_JumpStatements(10);
        J.demonstrateBreak();
        J.demonstrateContinue();



    }
}