public class OOPFirst{
    public static void main(String[] args) {
        Dog beagle = new Dog();
        beagle.breed = "beagle"; 
        beagle.name = "flappy"; 
        beagle.age = 5; 
        beagle.color = "Brown"; 

        System.out.println(beagle.breed);
        System.out.println(beagle.age);
        System.out.println(beagle.color);
        System.out.println(beagle.name);

        Dog g2 = new Dog(); 
        g2.breed = "Pug";
        g2.name = "Mike";
        g2.age = 5; 
        g2.PrintBreedAndName();
        g2.DogInTenYears();
    }

}

class Dog{
    String breed; 
    String name; 
    int age; 
    String color;
    // More Attribute

    void PrintBreedAndName(){
        System.out.println(breed + " " + name);
    }

    void DogInTenYears(){
        System.out.println("The dog will be " + (age + 10) + " years old in 10 years");
    }
}