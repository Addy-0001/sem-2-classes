public class Overriding {
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}

class Parent {
    int a;

    Parent() {
        System.out.println("Running from parent Constructor" + a);
    }
}

class Child extends Parent {
    
    int a = 5;
    
    Child() {
        System.out.println("Running from Child Constructor: Child Object Value: " + this.a + " Parent Object Value: " + super.a);
    }
}
