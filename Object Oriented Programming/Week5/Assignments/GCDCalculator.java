package Week5.Assignments;

import java.util.Scanner;

public class GCDCalculator {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + result);

        input.close();
    }
}
