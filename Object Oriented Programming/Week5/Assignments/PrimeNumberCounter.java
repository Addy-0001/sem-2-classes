package Week5.Assignments;

import java.util.Scanner;

public class PrimeNumberCounter {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeLessThan(int n) {
        System.out.println("Prime numbers less than " + n + ":");
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int countPrimesLessThan(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        printPrimeLessThan(num);

        int primeCount = countPrimesLessThan(num);
        System.out.println("Total prime numbers less than " + num + ": " + primeCount);

        input.close();
    }
}
