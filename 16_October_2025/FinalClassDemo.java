/*
Exercise 13 - protected member variables
03) Demonstrate a final method inside a final class - try to inherit the class - record the type of error, if the program projects one?
 */
package On1610;

final class FinalClass {
    final void display() {
        System.out.println("Inside final class and final method.");
    }
}

// Uncommenting this will cause a compilation error
// class AttemptedChild extends FinalClass { }
 
public class FinalClassDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
