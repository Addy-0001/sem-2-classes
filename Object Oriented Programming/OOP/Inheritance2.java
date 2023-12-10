public class Inheritance2 {
    public static void main(String[] args) {
        Admin admin = new Admin();
        System.out.println(admin.getAge());
        System.out.println(admin.getSuperAge());
        System.out.println(admin.getAddedage());
        admin.detail();
    }

}

class Person {
    int age = 10;

    void work() {
        System.out.println("Person is working.");
    }
}

class Admin extends Person {
    int age = 30;

    void work() {
        System.out.println("Admin is working");
    }

    public int getAge() {
        return this.age;
    }

    public int getSuperAge() {
        return super.age;
    }

    public int getAddedage() {
        return (super.age + this.age);
    }

    void detail(){
        this.work();
        super.work();
    }
}