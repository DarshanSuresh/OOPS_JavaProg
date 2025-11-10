
package On0611;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running by extending Thread class.");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Starts the thread
    }
}
