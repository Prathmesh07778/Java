package Asgnpract.Inheritance;

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Color  : " + color);
    }
}

public class INH6_Rectangle extends Shape {
    double length;
    double breadth;

    INH6_Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }

    void showDetails() {
        showColor();
        System.out.println("Length : " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area   : " + calculateArea());
    }

    public static void main(String[] args) {
        INH6_Rectangle rect = new INH6_Rectangle("Blue", 10, 5);
        rect.showDetails();
    }
}