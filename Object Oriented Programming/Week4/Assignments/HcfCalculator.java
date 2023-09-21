package Week4.Assignments;

import java.util.Scanner;

public class HcfCalculator {
    // 7. Write a program to calculate the HCF of Two given numbers.
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();
        int hcf = 0;
        if (num1 > num2) {
            int higher = num1;
            for (int i = 1; i <= higher; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
                }
            }
            System.out.println("The hcf of " + num1 + " and " + num2 + " is " + hcf);
        } else if (num1 < num2) {
            int higher = num2;
            for (int i = 1; i <= higher; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    hcf = i;
                }
            }
            System.out.println("The hcf of " + num1 + " and " + num2 + " is " + hcf);
        } else {
            System.out.println("The HCF is: " + num1);
        }
    }
}
