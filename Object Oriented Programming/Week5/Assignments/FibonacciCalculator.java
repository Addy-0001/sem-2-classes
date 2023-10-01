package Week5.Assignments;

import java.util.Scanner;

public class FibonacciCalculator {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position of the Fibonacci number: ");
        int n = input.nextInt();

        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is " + result);

        input.close();
    }
}
