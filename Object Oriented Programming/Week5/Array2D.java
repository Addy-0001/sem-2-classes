package Week5;

public class Array2D {
    public static void main(String[] args) {
        int[][] Array = {
                { 1, 2, 3 },
                { 2, 3, 4 },
                { 20, 3, 40 },
                { 100, 200, 300 },
        };

        // Change the third row to 22 33 44
        // Print the third row.
        // Change the 4th row and third comlum to 400
        // Ptiny fourth row and 3rd column

        System.out.println("Processing");

        Array[2][0] = 22;
        Array[2][1] = 23;
        Array[2][2] = 44;

        for (int i = 0; i < 3; i++) {
            System.out.println(Array[2][i]);
        }

        Array[3][2] = 300;

        System.out.println(Array[3][2]);

        // Print the sum of all second row.
        int sum = 0;

        for(int i = 0; i < 3; i++){
            sum += Array[1][i];
        }
        System.out.println(sum);

    }

}
