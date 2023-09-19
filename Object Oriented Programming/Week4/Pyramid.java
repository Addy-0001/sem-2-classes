package Week4;

public class Pyramid {
    public static void main(String[] args) {
        for (int gap = 5; gap >= 0; gap--) {
            System.out.print(" ");
            for (int stars = 1; stars <= 9; stars++) {
                System.out.println("*");
                stars++;
            }
        }
    }
}
