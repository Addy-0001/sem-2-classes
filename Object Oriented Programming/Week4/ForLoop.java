package Week4;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
        for (int j = 20; j >= 10; j--) {
            System.out.println(j);
        }

        for (int k = 0; k <= 10; k++) {
            if (k > 5) {
                System.out.println("Greater Than 5");
            } else {
                System.out.println("Less than 5");
            }
        }

        // Loop till 10 and check if odd or even
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        int mult = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + mult + " = " + (mult * i));
        }
    }
}
