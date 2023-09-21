package Week4.Assignments;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        // Write a program that asks your name and prints “Hello your name” five times.
        // Use a loop.
        Scanner input = new Scanner(System.in); 
        String name = input.nextLine();
        input.close();
        for(int i = 0; i<5; i++){
            System.out.println("Hello, " + name);
        }
    }
}
