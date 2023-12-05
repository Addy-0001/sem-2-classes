public class InheritanceConstructor {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
    }
}

class Parent {
    int a = 1;

    Parent() {
        System.out.println("Running from parent Constructor");
    }

    Parent(int a) {
        System.out.println("Running from parent Constructor" + a);
    }
}

class Child extends Parent {
    Child() {
        super(10);
        super.a = 2;
        System.out.println("Running from Child Constructor");
    }
}
