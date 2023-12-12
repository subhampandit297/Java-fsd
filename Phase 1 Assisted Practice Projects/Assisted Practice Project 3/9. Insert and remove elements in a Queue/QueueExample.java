package dom;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> queue = new LinkedList<>();

        // Enqueueing elements into the queue
        System.out.println("Enqueueing elements into the queue:");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Displaying the queue
        displayQueue(queue);

        // Dequeueing elements from the queue
        System.out.println("\nDequeueing elements from the queue:");
        int dequeuedElement = queue.poll();
        System.out.println("Dequeued Element: " + dequeuedElement);

        // Displaying the queue after dequeue
        displayQueue(queue);
    }

    // Method to display the elements of the queue
    private static void displayQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        for (int element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

