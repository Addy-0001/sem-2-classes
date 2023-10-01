package Week5.Assignments;

import java.util.Scanner;

public class FactorialCalculator {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);

        input.close();
    }
}
