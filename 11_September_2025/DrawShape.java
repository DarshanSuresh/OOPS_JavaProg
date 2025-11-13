/*
Create a class shape with a method draw(). 
Override draw() in subclass circle and square. 
Write prg to demonstrate how polymorphism works when calling draw () on a shape reference.
 */
package On1109;

class Shape { 
    void draw() { 
        System.out.println("draw a shape."); 
    } 
} 

class Circle extends Shape { 
    void draw() { 
        System.out.println("drawing a circle."); 
    }  
} 

class Square extends Shape { 
    void draw() { 
        System.out.println("drawing a square."); 
    } 
} 

public class DrawShape { 
    public static void main(String[] args) {
        Shape sh = new Shape();  
        sh.draw();

        Shape cr = new Circle();  
        cr.draw(); 

        Shape sq = new Square();  
        sq.draw(); 
    }
}
