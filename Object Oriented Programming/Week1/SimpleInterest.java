package Week1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        int p, t;
        float r;
        float SI;
        // Take input for p and t
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your principal amount: ");
        p = scan.nextInt();
        System.out.println("Enter the time period: ");
        t = scan.nextInt();
        System.out.println("Enter the total rate: ");
        r = scan.nextFloat();

        SI = p + (p * t * r) / 100;
        System.out.println("SI = " + SI);
        scan.close();
    }
}
