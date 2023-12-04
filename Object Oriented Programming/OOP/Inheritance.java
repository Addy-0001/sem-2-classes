public class Inheritance {
    public static void main(String[] args) {

    }
}

class Person{
    String name = "Person"; 
    void display(){
        System.out.println("Default Name : " + this.name);
    }
}

class Male extends Person{
    int life = 60; 
    void live(){
        System.out.println("Lives: " + this.life);
    }
}

class Female extends Person{
    int life = 70; 
    void live(){
        System.out.println("Lives: " + this.life);
    }
}
