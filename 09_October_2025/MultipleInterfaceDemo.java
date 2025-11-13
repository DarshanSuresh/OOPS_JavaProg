/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package On0910;

// Renamed interfaces
interface Car02 { 
    void print(); 
} 

interface Bike02 { 
    void show(); 
} 

// Renamed base class
class TransportBase { 
    void type() { 
        System.out.println("This is a transport vehicle"); 
    } 
} 

// Renamed implementing class
class SuperVehicle extends TransportBase implements Car02, Bike02 { 

    @Override
    public void print() { 
        System.out.println("Audi, Lamborghini"); 
    } 

    @Override
    public void show() { 
        System.out.println("Ninja H2R, R15"); 
    } 
} 

// Renamed main class
public class MultipleInterfaceDemo { 
    public static void main(String[] args) { 
        SuperVehicle obj = new SuperVehicle(); 

        obj.type();   // from TransportBase
        obj.print();  // from Car
        obj.show();   // from Bike
    } 
}
