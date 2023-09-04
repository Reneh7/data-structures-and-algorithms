package challenge11;

public class PseudoQueue {
    Stack stack1;
    Stack stack2;


    public PseudoQueue() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }
    public boolean isEmpty()
    {
        return stack1== null && stack2==null;
    }
    public void enqueue(int value)
    {
        while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
        }
        if(stack1.isEmpty())
        {
            stack1.push(value);
        }
        while (!stack2.isEmpty()) {
              stack1.push(stack2.pop());
       }
    }

   public int dequeue() {
    if (isEmpty()) {
        throw new IllegalArgumentException("Queue is empty");
    }

    if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
    return stack2.pop();
}




    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Queue: ");
        Stack tempStack = new Stack();

        while (!stack2.isEmpty()) {
            tempStack.push(stack2.pop());
        }

        while (!tempStack.isEmpty()) {
            int item = tempStack.pop();
            result.append(item).append(" ");
            stack2.push(item);
        }

        while (!stack1.isEmpty()) {
            tempStack.push(stack1.pop());
        }

        while (!tempStack.isEmpty()) {
            int item = tempStack.pop();
            result.append(item).append(" ");
            stack2.push(item);
        }
        return result.toString();
    }

}

