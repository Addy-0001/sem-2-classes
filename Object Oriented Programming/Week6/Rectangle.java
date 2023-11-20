public class Rectangle {
    public static void main(String[] args) {
        RectangleAtrrs r1 = new RectangleAtrrs(); 
        r1.length = 500; 
        r1.breadth = 500; 

        r1.printArea();
    }
}

class RectangleAtrrs{ 
    int length; 
    int breadth; 
    
    void printArea(){
        System.out.println("The area of the rectangle is: " + (length * breadth ) + " sq. kms.");
    }
}