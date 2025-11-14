package mainapp;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println(c);
        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: " + c.perimeter());

        System.out.println("\n" + r);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
