public class UserTask {
    public static void main(String[] args) {

        Normal n1 = new Normal();
    }
}

class User {
    User() {
        System.out.println("No Information");
    }

    User(String Name) {
        System.out.println("Name: " + Name);
    }
}

class Normal extends User {
    Normal() {
        super("Adamya");
    }
}
