/*
Exercise 12 - Static 
02) Create a car class with 
- static variable -> totalclass
- instance variable model
- methods show details for () and display output
- create object in main() and display output
 */
package On1610;

public class Car{
    static int totalCars = 0;

    String model;

    public Car(String model) {
        this.model = model;
        totalCars++;
    }

    void showDetails() {
        System.out.println("Car model: " + model);
    }

    static void displayOutput() {
        System.out.println("Total cars created: " + totalCars);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Corolla");
        Car car2 = new Car("Honda Civic");
        Car car3 = new Car("Ford Mustang");

        car1.showDetails();
        car2.showDetails();
        car3.showDetails();

        Car.displayOutput();
    }
}
