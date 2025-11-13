/*
Method overloading – 
write a prg with class area that has overloading method findArea() to calculate: 
the area of circle, area of rectangle , area of triangle.
 */
package On1109;

import java.io.DataInputStream; 
import java.io.IOException; 

public class Area { 

    public double findArea(double radius) { 

        return Math.PI * radius * radius; 
    } 

    // Area of rectangle 
    public double findArea(double length, double width) { 
        return length * width; 
    } 

    // Area of triangle 
    public double findArea(double base, double height, boolean isTriangle) { 
        return 0.5 * base * height; 
    } 

    public static void main(String[] args) throws IOException { 
        DataInputStream in = new DataInputStream(System.in); 
        Area area = new Area(); 
 
        System.out.println("Enter radius of the circle:"); 
        double radius = Double.parseDouble(in.readLine()); 
        System.out.println("Area of Circle: " + area.findArea(radius)); 
 
        System.out.println("Enter length and width of the rectangle:"); 
        double length = Double.parseDouble(in.readLine()); 
        double width = Double.parseDouble(in.readLine()); 
        System.out.println("Area of Rectangle: " + area.findArea(length, width)); 
 
        System.out.println("Enter base and height of the triangle:"); 
        double base = Double.parseDouble(in.readLine()); 
        double height = Double.parseDouble(in.readLine()); 
        System.out.println("Area of Triangle: " + area.findArea(base, height, true)); 
    } 
} 
