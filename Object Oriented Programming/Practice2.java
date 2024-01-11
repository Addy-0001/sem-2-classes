// Making a scientific calculator in java

public class Practice2 {
    public static void main(String[] args) {

    }
}

class BaseCalculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

class AdvancedCalculator extends BaseCalculator {
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b, double c) {
        return a * b * c;
    }

}