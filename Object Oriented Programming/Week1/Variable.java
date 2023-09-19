package Week1;

public class Variable {
    int var = 9; //Instance Variable
    static int data = 10; // Static Variable

    void display() {
        int val = 5;
        System.out.println("Local Variable: " + val);
    }

    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.display(); //Creating Object 
        int sum = 1000;
        System.out.println(sum);
        System.out.println("Instance Variable: " + obj.var); // Calling instance variable using object
        System.out.println("Static Variable: " + data); // 

        int x = 100;
        System.out.println("Instance Variable: " + x);
    }
}