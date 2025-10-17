/*
Exercise 12 - Static 
01) Write Java Program with a static count that increase each time an object is created. Display the total objects created in main?
 */
package On1610;

public class Static_Count {
    
    static int count = 0;

    public Static_Count() {
        count++;
    }

    public static void main(String[] args) {
        
        Static_Count obj1 = new Static_Count();
        Static_Count obj2 = new Static_Count();
        Static_Count obj3 = new Static_Count();
        
        System.out.println("Total objects created: " + Static_Count.count);
    }
}
