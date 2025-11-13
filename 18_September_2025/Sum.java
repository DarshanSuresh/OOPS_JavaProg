/*
Write a java prg with method calculateSum() that declare two 
local variable a and b initializes them with values and prints their sum. 
Show that these variable cannot be accessed outside the method.
 */
package On1809;

public class Sum { 

    public void calculateSum() { 
        int a = 10;
        int b = 20;
        int sum = a + b; 
        System.out.println("Sum of a and b: " + sum); 
    }

    public static void main(String[] args) { 
        Sum S = new Sum(); 
        S.calculateSum(); 
    } 
} 
