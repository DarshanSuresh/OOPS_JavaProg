/*
.method overriding runtime polymorphism - 
Create a class animal with a Method sound(). Then create subclass's dog and cat that override sond(). 
Write a prg to demonstrate runtime polyorphism by calling sound in the references of type animal.
 */
package On1109;

class Animal { 
    void sound() { 
        System.out.println("Animal makes a sound"); 
    } 
} 

class Dog extends Animal { 
    @Override 
    void sound() { 
        System.out.println("Dog barks"); 
    } 
} 

class Cat extends Animal { 
    @Override 
    void sound() { 
        System.out.println("Cat meows"); 
    } 
} 

public class Animalmain { 
    public static void main(String[] args) { 
        Animal animal; 
        animal = new Dog(); 
        animal.sound();  // Output: Dog barks 

        animal = new Cat(); 
        animal.sound();  // Output: Cat meows 

        animal = new Animal(); 
        animal.sound();  // Output: Animal makes a sound 
    } 
} 