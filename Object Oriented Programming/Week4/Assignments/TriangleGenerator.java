package Week4.Assignments;

import java.util.Scanner;

public class TriangleGenerator {
    public static void main(String[] args) {
        System.out.println("Enter the base length of the triangle");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        input.close();

        for (int i = 0; i <= count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
