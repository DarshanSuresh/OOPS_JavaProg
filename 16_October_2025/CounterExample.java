/*
Exercise 12 - Static 
05) Write a Java program that 
- Uses a static counter to count objects 
- Has an instance variable name 
- has a method that declares a local variable
- print everything in main().
 */

package On1610;

class CounterExample {
    static int count = 0;
    String name;

    CounterExample(String name) {
        this.name = name;
        count++;
    }

    void showLocalVariable() {
        int localVar = 10;
        System.out.println("Local variable value: " + localVar);
    }

    public static void main(String[] args) {
        CounterExample obj1 = new CounterExample("Object One");
        CounterExample obj2 = new CounterExample("Object Two");
        CounterExample obj3 = new CounterExample("Object Three");

        obj1.showLocalVariable();
        obj2.showLocalVariable();

        System.out.println("Total objects created: " + CounterExample.count);
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);
    }
}
