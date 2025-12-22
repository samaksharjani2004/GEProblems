package Queue;

public class QueueMain {

    public static void main(String[] args) {

        System.out.println("Queue Implementation Without LinkedList");

        QueueOperations queue = new QueueOperations(5);

        // UC 3: Enqueue 56 -> 30 -> 70
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        queue.display();

        // UC 4: Dequeue from beginning
        queue.dequeue();

        queue.display();
    }
}

