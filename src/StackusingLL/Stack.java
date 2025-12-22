package StackusingLL;

public class Stack {

    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    // UC-1 : Push (uses add method of LinkedList)
    public void push(int data) {
        list.add(data);   // add at head
    }

    // UC-2 : Peek
    public int peek() {
        if (list.head == null)
            throw new RuntimeException("Stack is empty");
        return list.head.data;
    }

    // UC-2 : Pop
    public int pop() {
        if (list.head == null)
            throw new RuntimeException("Stack is empty");

        int data = list.head.data;
        list.pop();      // remove head
        return data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}
