/*
Write a java prg to demostrate the use of a default constructor that initializes an object with default values . 
Expected output is show how default constructor is automatically called when an object is created. 
Print default values intialized by the constructor,use implicit and explict 
*/
package On0910;

class Student {
    String name;
    int age;

    Student() {
        name = "Darshan Suresh";
        age = 22;
        System.out.println("Default Constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Implicit Call to Default Constructor");
        new Student().display();

        System.out.println("\nExplicit Call to Default Constructor");
        Student s1 = new Student();
        s1.display();
    }
}
