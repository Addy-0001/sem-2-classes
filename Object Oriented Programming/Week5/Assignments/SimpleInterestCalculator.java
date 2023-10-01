package Week5.Assignments;

public class SimpleInterestCalculator {
    public static void calculateSimpleInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100.0;
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        double time = 2;
        calculateSimpleInterest(principal, rate, time);
    }
}
