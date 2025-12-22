package LinkedList;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /* UC-1 / UC-2 : Add at head */
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /* UC-3 : Append at end */
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    /* UC-4 & UC-8 : Insert after a key */
    public void insertAfter(int key, int data) {
        Node temp = head;

        while (temp != null && temp.data != key)
            temp = temp.next;

        if (temp != null) {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    /* UC-5 : Delete first */
    public void pop() {
        if (head != null)
            head = head.next;
    }

    /* UC-6 : Delete last */
    public void popLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    /* UC-7 : Search */
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    /* UC-9 : Delete by key */
    public void delete(int key) {
        if (head == null)
            return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    /* UC-9 : Size */
    public int size() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /* UC-10 : Sorted Insert */
    public void addSorted(int data) {
        Node newNode = new Node(data);

        if (head == null || head.data >= data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data < data)
            temp = temp.next;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    /* Display */
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
