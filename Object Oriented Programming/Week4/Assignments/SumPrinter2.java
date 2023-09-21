package Week4.Assignments;

import java.util.Scanner;

public class SumPrinter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        do {
            int sum = 0;
            System.out.println("Enter the number and we'll print the sum of the numbers that precede it.");
            int userInput = input.nextInt();
            for (int i = 1; i <= userInput; i++) {
                sum += i;
            }
            System.out.println("The sum of 1 to " + userInput + " is: " + sum);
            System.out.println("Input 1 to redo, any other number to exit");
            choice = input.nextInt();
        } while (choice == 1);
        input.close();
    }
}
