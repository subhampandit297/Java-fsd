package dom;

class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                // Simulate some work
                Thread.sleep(1000);

                // Using wait and notify to pause and resume execution
                if (Thread.currentThread().getName().equals("Thread-1")) {
                    notify(); // Notify waiting thread to continue
                    wait();  // Release the lock and wait for notification
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify(); // Notify the waiting thread to exit
    }
}