public class Task2 {
    public static void main(String[] args) {
        HRManager manager1 = new HRManager();

        manager1.work();
        manager1.getSalary();
    }
}

class Employee {
    String type = "Generic";

    public void work() {
        System.out.println("The employee does " + this.type + "work");
    }

    public void getSalary() {
        System.out.println("The salary is 45000");
    }
}

class HRManager extends Employee {
    public void work() {
        System.out.println("This employee does HR work");
    }
}
