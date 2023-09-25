package Week5;

public class Classwork {
    public static void main(String[] args) {
        int array1[] = { 20, 40, 50 };
        int sum = 0;

        for (int i = 0; i < array1.length - 1; i++) {
            sum += array1[i];
        }

        System.out.println(sum);

        // Loop through the below array
        int[] array5 = {10, 40, 50, 60, 70, 100};
        int sum1 = 0; 
        for (int i = 0; i < array5.length; i++){
            sum1 += array5[i];
        }
        System.out.println(sum1);
    }
}
