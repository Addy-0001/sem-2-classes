package Week1;

public class TypeCasting {

    public static void main(String[] args) {
        // Explicit Typecasting
        int value = 10; // 4 Bytes 
        double result = value; // 8 Bytes - yay 
        System.out.println("The result is:" + result);

        // Explicit Typecasting
        double num = 10.5;
        int answer = (int)num; 
        System.out.println("Explicit typecasting: "+ answer);
    }
}