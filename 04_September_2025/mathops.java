package On0409;

import java.io.DataInputStream; 
import java.io.IOException; 

public class mathops { 
    public static void main(String[] args) throws IOException { 

        DataInputStream dataInputStream = new DataInputStream(System.in); 

        int number1, number2;
        System.out.print("Please enter the first integer: "); 
        String input1 = dataInputStream.readLine(); 
        number1 = Integer.parseInt(input1); 

        System.out.print("Please enter the second integer: "); 
        String input2 = dataInputStream.readLine(); 
        number2 = Integer.parseInt(input2); 

        int sum = number1 + number2; 
        int difference = number1 - number2; 
        int product = number1 * number2; 
        double quotient = (double) number1 / number2;

        System.out.println("\nResults:"); 
        System.out.println("Sum: " + sum); 
        System.out.println("Difference: " + difference); 
        System.out.println("Product: " + product); 
        System.out.println("Quotient: " + quotient);  
    } 
} 