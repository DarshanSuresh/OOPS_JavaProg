package On0611;

class TablePrinter1 {
    void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class ThreadA1 extends Thread {
    TablePrinter1 tp;
    ThreadA1(TablePrinter1 tp) { this.tp = tp; }
    public void run() { tp.printTable(2); }
}

class ThreadB1 extends Thread {
    TablePrinter1 tp;
    ThreadB1(TablePrinter1 tp) { this.tp = tp; }
    public void run() { tp.printTable(3); }
}

public class WithoutSychronize {
    public static void main(String[] args) {
        TablePrinter1 obj = new TablePrinter1();
        ThreadA1 t1 = new ThreadA1(obj);
        ThreadB1 t2 = new ThreadB1(obj);
        t1.start();
        t2.start();
    }
}

