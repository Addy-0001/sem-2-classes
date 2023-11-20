import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1. Write a JAVA program to find the maximum between three numbers.
        Scanner sc = new Scanner(System.in);

        // input section
        System.out.println("Enter the first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third Number");
        int num3 = sc.nextInt();
        sc.close();
        // End of input section

        // Comparing Numbers
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the greatest");
        } else {
            System.out.println("All numbers are equal");
        }
    }
}
