package BST;

public class BinarySearchTree<T extends Comparable<T>> {

    // Node class
    class Node {
        T key;
        Node left, right;

        Node(T key) {
            this.key = key;
            left = right = null;
        }
    }

    Node root;
    int size = 0;

    // UC 1: Add node to BST
    public void add(T key) {
        root = addRecursively(root, key);
    }

    private Node addRecursively(Node current, T key) {
        if (current == null) {
            size++;
            return new Node(key);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = addRecursively(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = addRecursively(current.right, key);
        }

        return current;
    }

    // UC 2: Size of Binary Tree
    public int size() {
        return size;
    }

    // UC 3: Search in Binary Tree
    public boolean search(T key) {
        return searchRecursively(root, key);
    }

    private boolean searchRecursively(Node current, T key) {
        if (current == null) {
            return false;
        }

        if (key.compareTo(current.key) == 0) {
            return true;
        }

        if (key.compareTo(current.key) < 0) {
            return searchRecursively(current.left, key);
        } else {
            return searchRecursively(current.right, key);
        }
    }
}

