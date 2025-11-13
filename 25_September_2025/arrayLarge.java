/*
Prg of largest and smallest array  using if and looping statement 
 */
package On2509;

public class arrayLarge { 
    public static void main(String[] args) { 
        int large = 0; 
        int arr[]={10,20,35,45,85,90,32,17,15,2}; 
        System.out.println("array element"); 
        for(int i=0;i<arr.length;i++){ 
            if(arr[i]>large){ 
                large =arr[i]; 
            } 
        } System.out.println(large);    
    } 
} 
