/*
Exercise 12 - Static 
03) Write a Java program to demonstraate all the string handling inbuilt methods?
 */
package On1610;

public class String_Handling {
    public static void main(String[] args) {
        String s = "  hello Java  ";
        System.out.println("Length: " + s.length());
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Trim: '" + s.trim() + "'");
        System.out.println("Substring (4, 6): " + s.substring(4, 6));
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("Char at 1: " + s.charAt(1));
        System.out.println("Contains 'Java'? " + s.contains("Java"));
        System.out.println("Starts with 'he'? " + s.startsWith("he"));
        System.out.println("Ends with 'va'? " + s.endsWith("va"));
        System.out.println("Index of 'a': " + s.indexOf('a'));
        System.out.println("Replace 'a' with 'x': " + s.replace('a', 'x'));
    }
}
