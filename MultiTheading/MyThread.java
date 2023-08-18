package MultiTheading;

public class MyThread {
    public void run() {
        synchronized (this) {
            try {
                System.out.println("Thread is running");
                this.wait(); // Thread waits
                System.out.println("Thread has been notified");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
