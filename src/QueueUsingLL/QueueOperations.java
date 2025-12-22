package QueueUsingLL;

import java.util.LinkedList;

public class QueueOperations {

    LinkedList<Integer> queue = new LinkedList<>();

    // UC 3: Enqueue elements
    public void enqueue(int data) {
        queue.addLast(data);   // append internally
        System.out.println("Enqueued: " + data);
    }

    // UC 4: Dequeue element from beginning
    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            int removed = queue.removeFirst();
            System.out.println("Dequeued: " + removed);
        }
    }

    // Display Queue
    public void display() {
        System.out.println("Current Queue: " + queue);
    }
}

