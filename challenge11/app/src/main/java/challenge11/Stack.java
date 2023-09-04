package challenge11;

public class Stack {
    Node top;
    public boolean isEmpty()
    {
        return top==null;
    }

    public void push(int value)
    {
        Node newNode= new Node(value);
        if(isEmpty())
        {
            top=newNode;
            newNode.next=null;
        }else
        {
            newNode.next = top;
            top=newNode;
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException("Stack is empty");
        }else
        {
            Node current = top;
            top = top.next;
            current.next = null;
            return current.item;
        }
    }
    public int peek()
    {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
       return top.item;
    }
}
