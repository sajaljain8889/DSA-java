package MultiTheading;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.run();

        synchronized (thread) {
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
                thread.notify(); // Notify the waiting thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
