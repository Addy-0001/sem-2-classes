public class StackImp {
    int[] a;
    int top;
    int size;

    public StackImp(int size) {
        a = new int[size];
        top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return a[top--];
    }

    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        a[++top] = value;
    }

    public int numberOfPendingTask() {
        return top + 1;
    }
}

class Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a * b;
    }
}


class ScientificCalculator extends Calculator {
    @Override
    public int calculate(int a, int b) {
        return (int) Math.pow(a, b);
    }

    @Override
    public double calculate(double a, double b) {
        return Math.sqrt(a * b);
    }

    public int calculate(int a, int b, int c) {
        return a * b * c;
    }

    public double Calculate(double a, double b, double c){
        return (a*b*c);
    }
}