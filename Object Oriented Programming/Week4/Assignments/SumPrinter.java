package Week4.Assignments;

import java.util.Scanner;

public class SumPrinter {
    public static void main(String[] args) {
        System.out.println("Enter the number and we'll print the sum of the numbers that precede it.");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int sum = 0;  
        for(int i = 1; i <= userInput; i++){
            sum+= i; 
        }
        System.out.println("The total sum of is: " + sum);
        input.close();
    }
}
