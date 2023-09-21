package Week4.Assignments;

public class MilesKms {
    public static void main(String[] args) {
        int miles = 1;
        System.out.println("Miles\tKilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.println(miles + "\t" + miles * 1.609);
            miles++;
        }
    }
}
 