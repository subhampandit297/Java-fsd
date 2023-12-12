package dom;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating two threads that share the same 
        Thread thread1 = new MyThread(counter);
        Thread thread2 = new MyThread(counter);

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}
