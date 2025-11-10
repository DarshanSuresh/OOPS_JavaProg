
package On0611;

class TablePrinter {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class ThreadA extends Thread {
    TablePrinter tp;
    ThreadA(TablePrinter tp) { this.tp = tp; }
    public void run() { tp.printTable(2); }
}

class ThreadB extends Thread {
    TablePrinter tp;
    ThreadB(TablePrinter tp) { this.tp = tp; }
    public void run() { tp.printTable(3); }
}

public class WithSychronize {
    public static void main(String[] args) {
        TablePrinter obj = new TablePrinter();
        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);
        t1.start();
        t2.start();
    }
}
