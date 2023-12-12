public class ClassTask {
    public static void main(String[] args) {

    }
}

abstract class Person {
    int age = 10;
    String emp = "";

    abstract void Walk();

    abstract int getAge(int age);

    abstract boolean employment(String emp);
}

class Male extends Person {
    @Override
    boolean employment(String emp) {
        if(emp == "CEO"){
            return true;
        }
        return false;
    }
}

class Female extends Person{
    @Override
    boolean employment(String emp) {
        if (emp == "HR"){
            return true;
        }
        return false;
    }

    

}