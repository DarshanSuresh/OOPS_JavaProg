/*
Exercise  - Checked Exception
 */

package On0611;

import java.io.*;

public class Checked {
    public static void main(String[] args) {
        // ---------- CHECKED EXCEPTIONS ----------        
        try {
            FileReader fr = new FileReader("nofile.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        try {
            throw new IOException("Manual IO Error");
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            Class.forName("UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("\nAll exceptions handled successfully!");
    }
}
