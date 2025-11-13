/*
Write a prg to input 10 int into array 
and(declare with dynamic array and convert it into array list and use for enchanced)and 
print only the even number (using if and for loop). 
 */
package On2509;

public class arrayEven { 
    public static void main(String[] args) { 
        int arr[]={10,20,35,45,85,90,32,17,15,2}; 

        System.out.println("Array element"); 
        for(int i=0;i<arr.length;i++){ 
            if(arr[i]%2==0){ 
                System.out.println(arr[i]);
          } 
      } 
    } 
} 