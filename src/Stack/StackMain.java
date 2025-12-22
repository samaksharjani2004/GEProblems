package Stack;

public class StackMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Stack Program (Without LinkedList)");

        Stack stack = new Stack(5);

        // UC-1 : Push
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack after push:");
        stack.display();

        // UC-2 : Peek
        System.out.println("Peek: " + stack.peek());

        // UC-2 : Pop till empty
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}

