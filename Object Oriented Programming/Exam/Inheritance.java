package Exam;

public class Inheritance {
    public static void main(String[] args) {
        Child newChild = new Child(); 
        newChild.getName(); 
    }
}

class Parent {
    private String first_name;
    private String last_name;

    public String getName() {
        return first_name + " " + last_name;
    }

    Parent(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
}

class Child extends Parent {
    Child (){
        System.out.println("Child Constructor");
    }
}