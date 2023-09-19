package Week4;

public class Pyramid {
    public static void main(String[] args) {
        int star = 1;
        for (int gap = 5; gap >= 0; gap--) {
            for (int lineGap = 0; lineGap <= gap; lineGap++) {
                System.out.print(" ");
            }
            for (int lineStar = 1; lineStar <= star; lineStar++) {
                System.out.print("*");
            }
            star = star + 2; 
            System.out.println("");
        }
    }
}
