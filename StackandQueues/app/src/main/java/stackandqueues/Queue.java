package stackandqueues;

public class Queue {
    Node front;
    Node back;

    public boolean isEmpty()
    {
        return (front==null&& back==null);
    }

    public void enQueue(int value)
    {
        Node newNode=new Node(value);
        if (isEmpty())
        {
            front=back=newNode;
        }else {
            back.next = newNode;
            back=newNode;
        }
    }

    public int deQueue()
    {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot return deQueue.");
        }else {
            Node current=front;
            front = front.next;
            current.next = null;
            return current.item;
        }
    }

    public int peek()
    {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot return peek.");
        }
        return front.item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queue: ");
        Node current = front;
        while (current != null) {
            sb.append(current.item).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

}
