/*
Java prg to demonstrate constructor overloading by intializing an employee details in multiple ways.
 */
package On0910;
class Employee { 

    int id; 
    String name; 
    double salary; 

    // Constructor 1: default 
    Employee() { 
        id = 10; 
        name = "Darshan Suresh"; 
        salary = 100000.0; 
        System.out.println("Default constructor called"); 
    } 

    Employee(int i, String n) { 
        id = i; 
        name = n; 
        salary = 102000.0; 
        System.out.println("Constructor with id and name called"); 
    } 

    Employee(int i, String n, double s) { 
        id = i; 
        name = n; 
        salary = s; 
        System.out.println("Constructor with id, name and salary called"); 
    } 

    void display() { 
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary); 
    } 
}

public class ConstructorOverloadingDemo { 
    public static void main(String[] args) { 
        Employee e1 = new Employee(); 
        e1.display(); 
        System.out.println(); 
        Employee e2 = new Employee(7, "Ms Dhoni"); 
        
        e2.display(); 
        System.out.println(); 
        Employee e3 = new Employee(18, "Virat Kohli", 105000.0); 

        e3.display(); 
    } 
}