/*
Exercise - UserDefined Exception
 */

package On0611;

import java.io.*;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class UserDefined {
    public static void main(String[] args) {
        // ---------- USER DEFINED EXCEPTION ----------
        try {
            throw new MyException("This is my custom exception");
        } catch (MyException e) {
            System.out.println("User Defined Exception → " + e.getMessage());
        }

        System.out.println("\nAll exceptions handled successfully!");
    }
}
