// Create a Java program that takes two numbers and an operator (+, -, *, /) as
// inputs and performs the corresponding arithmetic operation using a switch
// case statement.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number");
        int num2 = sc.nextInt();
        System.out.println("Choose the Operaror - +, -, * or /");
        char operator = sc.next().charAt(0);
        sc.close();

        switch (operator) {
            case '+':
                System.out.println("The result is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The result is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The result is: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("The result is: " + (num1 / num2));
                } else {
                    System.out.println("Zero Division Error");
                }
                break;
            default:
                System.out.println("Invalid Operator, please try again.");
                break;
        }
    }
}