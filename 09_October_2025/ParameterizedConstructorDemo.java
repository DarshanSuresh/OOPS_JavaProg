/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package On0910;

class Car { 

    String brand; 
    String model; 

    Car(String b, String m) { 
        brand = b; 
        model = m; 
        System.out.println("Parameterized constructor called."); 
    } 

    void display() { 
        System.out.println("Brand: " + brand); 
        System.out.println("Model: " + model); 
    } 
}

public class ParameterizedConstructorDemo { 
    public static void main(String[] args) { 
        Car car1 = new Car("Toyota", "Camry"); 
        Car car2 = new Car("Honda", "Civic"); 

        System.out.println("\nCar 1 Details:"); 
        car1.display(); 

        System.out.println("\nCar 2 Details:"); 
        car2.display(); 
    } 
} 
