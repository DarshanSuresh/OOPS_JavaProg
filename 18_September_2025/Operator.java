/*
Write a prg that check if a number is divisible by both 2 and 3 . 
Implement the logic using : 
&&(logical AND) 
&(bitwise AND) 
Compare the output and explain the difference in execution(short vs circuit vs full evaluation) 
 */
package On1809;

public class Operator { 
    public static void main(String[] args) { 
        
        int num = 4;  
        if ((num % 2 == 0) && isDivisibleBy3(num)) 
            System.out.println("Using logical &&: Divisible by 2 and 3"); 
        else 
            System.out.println("Using logical &&: Not divisible by both"); 

        if ((num % 2 == 0) & isDivisibleBy3(num)) 
            System.out.println("Using bitwise &: Divisible by 2 and 3"); 

        else 
            System.out.println("Using bitwise &: Not divisible by both"); 

    } 

    static boolean isDivisibleBy3(int n) { 
        System.out.println("Checking divisibility by 3..."); 
        return n % 3 == 0; 
    } 
} 
