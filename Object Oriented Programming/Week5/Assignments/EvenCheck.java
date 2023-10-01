package Week5.Assignments; 
import java.util.Scanner;

public class EvenCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isEven = isEven(num);

        if (isEven) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is not even.");
        }

        input.close();
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
