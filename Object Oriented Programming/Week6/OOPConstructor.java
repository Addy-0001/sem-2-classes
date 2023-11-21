public class OOPConstructor {
    public static void main(String[] args) {
        SimpleConstructor sc = new SimpleConstructor();
        System.out.println(sc.name);
        ParamConstructor pc = new ParamConstructor("Adam", 21);
        System.out.println(pc.name);
        System.out.println(pc.age);

        ParamConstructor pc1 = new ParamConstructor(pc);
        System.out.println(pc1.name);
        System.out.println(pc1.age);

    }
}

class SimpleConstructor {
    String name;

    SimpleConstructor() {
        System.out.println("Constructor Called");
        name = "ram";
    }
}

class ParamConstructor {
    String name;
    int age;

    ParamConstructor(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // Copy Constructor
    ParamConstructor(ParamConstructor pc) {
        this.name = pc.name;
        this.age = pc.age;
    }
}

