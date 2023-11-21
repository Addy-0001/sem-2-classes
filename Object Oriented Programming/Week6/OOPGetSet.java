public class OOPGetSet {
    public static void main(String[] args) {
        Person adamya = new Person();
        adamya.setName("Adamya");
        adamya.setage(21);

        System.out.println(adamya.getName());
        System.out.println(adamya.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}