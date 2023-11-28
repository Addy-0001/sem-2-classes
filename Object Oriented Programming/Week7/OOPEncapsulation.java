package Week7;

public class OOPEncapsulation {
    public static void main(String[] args) {
        Area rectangle = new Area(5, 5);
        rectangle.setLength(5);
        rectangle.setBreadth(10);

    }
}

class Area {
    private int length;
    private int breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int calculateArea() {
        int area = this.length * this.breadth;
        return area;
    }
}
