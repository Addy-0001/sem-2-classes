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

        // Print the multiplication table of 2
        int mult = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + mult + " = " + (mult * i));
        }

        // Loop from 10 to 1 and print the multiplication table of 3
        mult = 3;
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " x " + mult + " = " + (mult * i));
        }

        // Making an array using nested for loop
        int array[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = j;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[j][i] + "" + array[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("");

        // Task 6 iteration
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 0; i < 6; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j +" = " + i*j);
            }
        }

    }

}
