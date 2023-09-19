package Week4;

public class Pyramid {
    public static void main(String[] args) {
        int star = 1;
        for (int lineNo = 5; lineNo >= 0; lineNo--) {
            for (int lineGap = 0; lineGap <= lineNo; lineGap++) {
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
