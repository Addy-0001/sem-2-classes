package Exam;

public class Inheritance {
    public static void main(String[] args) {
        Child newChild = new Child(); 
        newChild.getName(); 
        Child newChild2 = new Child("Adamya", "Neupane");
        newChild2.getName(); 
        System.out.println(newChild2.Childstatus);
        
    }
}

class Parent {
    protected String first_name;
    private String last_name;

    public String getName() {
        return first_name + " " + last_name;
    }

    Parent(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    Parent(){
        System.out.println("Default Parent Constructor");
    }
}


class Child extends Parent {
    boolean Childstatus = true;

    Child(){
        System.out.println("Default Child Constructor");
    }

    Child(String first_name, String last_name){
        this.first_name = first_name; 
        System.out.println("Child Constructor, Multiple Arguments");
        System.out.println(super.first_name);
    }


}