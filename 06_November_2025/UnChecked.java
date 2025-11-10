/*
Exercise - Unchecked Exception
 */

package On0611;

import java.io.*;

public class UnChecked {
    public static void main(String[] args) {
        // ---------- UNCHECKED EXCEPTIONS ----------
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println("\nAll exceptions handled successfully!");
    }
}
