
package On0611;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface.");
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
