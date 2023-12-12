package dom;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producer = new Thread(() -> sharedResource.printNumbers(), "Thread-1");
        Thread consumer = new Thread(() -> sharedResource.printNumbers(), "Thread-2");

        producer.start();
        consumer.start();
    }
}
