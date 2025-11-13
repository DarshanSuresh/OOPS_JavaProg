/*
Write the prg to type casting divide two int but return a floating point result 

Why does the output come in 2.5 ?

Why the difference?
Integer division → truncates decimals, keeps only whole number.
Floating-point division → preserves fractional part.
 */
package On2509;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 5, b = 2;

        int res = a / b;              // integer division
        double result = (double) a / b; // floating-point division

        System.out.println("without type cast " + res);
        System.out.println("with type cast " + result);
    }
}
