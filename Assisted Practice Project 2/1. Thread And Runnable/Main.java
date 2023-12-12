package dom;

public class Main {
    public static void main(String[] args) {
        // Creating and starting a thread by extending the 'Thread' class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Creating and starting a thread by implementing the 'Runnable' interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}

