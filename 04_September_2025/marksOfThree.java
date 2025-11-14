package On0409;

import java.io.DataInputStream; 
import java.io.IOException; 

public class marksOfThree { 
    public static void main(String[] args) throws IOException { 
        
        DataInputStream dataInputStream = new DataInputStream(System.in); 

        int mark1, mark2, mark3; 
        System.out.print("Please enter the marks for Subject 1: "); 
        String input1 = dataInputStream.readLine(); 
        mark1 = Integer.parseInt(input1); 

        System.out.print("Please enter the marks for Subject 2: "); 
        String input2 = dataInputStream.readLine(); 
        mark2 = Integer.parseInt(input2); 

        System.out.print("Please enter the marks for Subject 3: "); 
        String input3 = dataInputStream.readLine(); 
        mark3 = Integer.parseInt(input3); 
        int totalMarks = mark1 + mark2 + mark3; 
        double averageMarks = (double) totalMarks / 3; 

        System.out.println("\n--- Marks Report ---"); 
        System.out.println("Total Marks: " + totalMarks); 
        System.out.println("Average Marks: " + String.format("%.2f", averageMarks)); 
    } 
} 
