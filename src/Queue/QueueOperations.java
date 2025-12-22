package Queue;

public class QueueOperations {

    int[] queue;
    int front;
    int rear;
    int size;

    // Constructor
    public QueueOperations(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    // UC 3: Enqueue
    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear++;
        queue[rear] = data;
        System.out.println("Enqueued: " + data);
    }

    // UC 4: Dequeue from beginning
    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        int removed = queue[front];
        front++;
        System.out.println("Dequeued: " + removed);
    }

    // Display Queue
    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Current Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
