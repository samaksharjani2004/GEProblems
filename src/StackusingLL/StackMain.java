package StackusingLL;

public class StackMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Stack Program using LinkedList");

        Stack stack = new Stack();

        // UC-1 : Push
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack after push:");
        stack.display();

        // UC-2 : Peek & Pop till empty
        System.out.println("Peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}

