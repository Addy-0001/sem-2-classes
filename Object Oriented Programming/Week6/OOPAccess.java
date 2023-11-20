public class OOPAccess {
    public static void main(String[] args) {
        PrivateClass example = new PrivateClass();

        example.displayData();
        example.setAge();
        example.setName();
        example.displayData();

    }
}

class PrivateClass {
    private int age;
    private String name;

    public void setName() {
        name = "Adamya";
    }

    public void setAge() {
        age = 21;
    }

    public void displayData() {
        System.out.println(name + " " + age);
    }
}