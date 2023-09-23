package Week4;

import java.util.Scanner;

public class Method {
    static int addNumber() {
        return 1 + 1;
    }

    static void printValue() {
        System.out.println("I am printing from the method");
        System.out.println("I have no return type");
    }

    static int addUserInput(int a, int b) {
        return a + b;
    }

    // Write a function that takes p t r and claculete the simple interest. Store
    // returned interest and print it.
    static float calculator(int p, int t, float r) {
        float output = (p * t * r) / 100;
        return output;
    }

    static void userInput() {
        System.out.println("Enter the P: ");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        System.out.println("Enter the Time: ");
        int t = input.nextInt();
        System.out.println("Enter the interest in percentage: ");
        float r = input.nextFloat();
        input.close();
        calculator(p, t, r);
    }

    public static void main(String[] args) {
        int returnInt = addNumber();
        System.out.println(returnInt);
    }

}
