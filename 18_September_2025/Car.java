/*
Write a Java prg to create a class 
Car with instance variable model and year. Create three car objects and 
initialize them with different values print the details of each car
 */
package On1809;

public class Car { 
    // Instance variables 
    String model; 
    int year; 

    // Constructor to initialize instance variables 
    Car(String model, int year) { 
        this.model = model; 
        this.year = year; 
    } 

    // Method to display car details 
    void displayDetails() { 
        System.out.println("Car Model: " + model); 
        System.out.println("Year: " + year); 
        System.out.println("-----------------------"); 
    } 

    public static void main(String[] args) { 
        // Create three Car objects with different values 
        Car car1 = new Car("Rolls Royce Cullinan", 2023); 
        Car car2 = new Car("Lamborgini Veneno", 2019); 
        Car car3 = new Car("La Ferrari", 2013); 

        // Print details of each car 
        car1.displayDetails(); 
        car2.displayDetails(); 
        car3.displayDetails(); 
    } 
} 