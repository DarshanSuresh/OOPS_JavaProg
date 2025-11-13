/*
write a java prg to demostrate multiple inheritance using interfaces. 
*/
package On0910;

interface Car01 { 
    void print(); 
} 
 
interface Bike01 { 
    void show(); 
} 

class Vehicle implements Car01, Bike01 { 
    @Override
    public void print() {
        System.out.println("Audi, Lamborghini"); 
    } 
    @Override
    public void show() { 
        System.out.println("Rolls Royce, Aston Martin"); 
    } 
} 

public class MultipleInheritanceDemo { 
    public static void main(String[] args) { 
        Vehicle obj = new Vehicle(); 
        obj.print(); 
        obj.show(); 
    } 
}
