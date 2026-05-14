class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void areaRectangle() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Square extends Rectangle {

    Square(int side) {
        super(side, side); // square has equal sides
    }

    void areaSquare() {
        int area = length * length;
        System.out.println("Area of Square: " + area);
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {
        Square sq = new Square(5);

        sq.display();        // from Shape
        sq.areaRectangle(); // from Rectangle
        sq.areaSquare();    // from Square
    }
}