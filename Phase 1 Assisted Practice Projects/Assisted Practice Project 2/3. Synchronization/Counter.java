package dom;

class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + ": Count = " + count);
            try {
                Thread.sleep(500); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
