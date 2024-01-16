package Exam; 


public class Encapsulation {
    public static void main(String[] args) {
        Area rectangle = new Area(10, 5);
        System.out.println(rectangle.getArea());
    }
}



class Area{
    private int length, breadth; 

    Area(int length, int breadth){
        this.length = length; 
        this.breadth = breadth; 
    }

    public int getArea(){
        return this.length * this.breadth; 
    }
}