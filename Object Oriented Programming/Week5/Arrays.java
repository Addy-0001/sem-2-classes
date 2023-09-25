package Week5;

public class Arrays {
    public static void main(String[] args) {
        int[] name = new int[30];
        for (int i = 0; i < 30; i++) {
            name[i] = i;
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(name[i]);
        }
    }
}