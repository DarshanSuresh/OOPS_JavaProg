
package On1112;

public class Main extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("First amount: " + amount);
    amount++;
    System.out.println("Second amount: " + amount);
  }

  public void run() {
    amount++;
  }
}