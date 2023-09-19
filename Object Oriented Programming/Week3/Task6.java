import java.util.Scanner;

public class Task6 {
    // 6. Write a JAVA program to input any alphabet and check whether it is vowel
    // or consonant.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char UserInput = sc.next().charAt(0);
        sc.close();

        if ((UserInput == 'A') || (UserInput == 'E') || (UserInput == 'I') || (UserInput == 'O') || (UserInput == 'U')
                || (UserInput == 'a') || (UserInput == 'e') || (UserInput == 'i') || (UserInput == 'o')
                || (UserInput == 'u')) {
            System.out.println("The Input Character " + UserInput + " is a vowel.");
        } else {
            System.out.println("The input character " + UserInput + "is a consonant");
        }
    }
}
