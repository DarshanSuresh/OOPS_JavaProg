/*
Write a java prg to create a class university with a static variable universityName 
create multiple student objects and print their unviersity name change 
the university name once and show the change reflects for all objects  
 */
package On1809;
import java.io.DataInputStream;
import java.io.IOException;

public class University {

    static String universityName;
    String studentName;

    University(String studentName) {
        this.studentName = studentName;
    }

    void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("University Name: " + universityName);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Enter University Name: ");
        universityName = dis.readLine();

        System.out.print("Enter number of students: ");
        int count = Integer.parseInt(dis.readLine());

        University[] students = new University[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = dis.readLine();
            students[i] = new University(name);
        }

        System.out.println("\n--- Student Details ---");
        for (University student : students) {
            student.displayInfo();
        }

        System.out.print("Enter new University Name to change: ");
        universityName = dis.readLine();

        System.out.println("\n--- After Changing University Name ---");
        for (University student : students) {
            student.displayInfo();
        }
    }
}
