public class Temp {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();

        BB object = new BB();
        System.out.println("The constructor is: ");
        object.CC();
    }
}

class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    public void print() {
        System.out.println("B");
    }
}

class AA {
    public AA() {
        System.out.println("A");
    }

    public void B() {
        System.out.println("B");
    }
}

class BB extends AA {
    public void CC() {
        System.out.println("Child");
    }
}