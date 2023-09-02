package stackandqueues;
public class Stack {
    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            top = newNode;
            newNode.next = null;
        } else {
            newNode.next = top;
            top = newNode;
        }

    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        } else {
            Node current = top;
            top = top.next;
            current.next = null;
            return current.item;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot return peek.");
        }
        return top.item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: ");
        Node current = top;
        while (current != null) {
            sb.append(current.item).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}
