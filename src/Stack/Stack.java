package Stack;

public class Stack {

    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    // UC-1 : Push
    public void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    // UC-2 : Peek
    public int peek() {
        if (top == -1)
            throw new RuntimeException("Stack is empty");
        return stack[top];
    }

    // UC-2 : Pop
    public int pop() {
        if (top == -1)
            throw new RuntimeException("Stack is empty");
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " -> ");
        }
        System.out.println("null");
    }
}

