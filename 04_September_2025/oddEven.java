
package On0409;
import java.io.DataInputStream; 
import java.io.IOException; 

public class oddEven { 
    public static void main(String[] args)throws IOException { 
        DataInputStream dataInputStream = new DataInputStream(System.in); 
        
        int number; 
        System.out.print("Please enter an integer: "); 
        String input = dataInputStream.readLine(); 
        number = Integer.parseInt(input); 
        
        if (number % 2 == 0) { 
            System.out.println(number + " is an even number."); 

        } else { 
            System.out.println(number + " is an odd number."); 
        } 
    } 
} 
