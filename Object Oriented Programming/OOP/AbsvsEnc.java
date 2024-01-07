public class AbsvsEnc {
    public static void main(String[] args) {
        Grandparent g1 = new Grandparent();
        System.out.println(g1.gender);

        Parent p1 = new Parent();
        System.out.println(p1.setandgetGender("Male"));

        Child1 c1 = new Child1();
        System.out.println(c1.setandgetGender("Female"));

        Child2 c2 = new Child2();
        System.out.println(c2.setandgetGender("None "));
    }
}


class Grandparent{
    // gender = OldMan
    String gender;
}


class Parent extends Grandparent{
    // gender = Male
    public String setandgetGender(String gender){
        super.gender = "OldMan";
        System.out.println(super.gender);
        this.gender = gender;
        return this.gender; 
    }
}

class Child1 extends Parent{}

class Child2 extends Parent{}