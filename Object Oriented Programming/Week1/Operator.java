package Week1;

public class Operator {
    int num1 = 123;
    int num2 = 111;

    public static void main(String[] args) {
        Operator opt = new Operator();
        System.out.println("Sum: " + (opt.num1 + opt.num2));

        // Relational Operator
        System.out.println(opt.num1 > opt.num2);
        System.out.println(opt.num1 < opt.num2);
        System.out.println(opt.num1 == opt.num2);

        // Termary Operator (?:)
        int age = 17; 
        String eligibility = (age>=18)?"You are eligible to vote":"You're not eligible to vote"; 
        System.out.println(eligibility);

    }
}
