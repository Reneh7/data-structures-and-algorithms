#  PseudoQueue

## Description

The provided code defines a PseudoQueue, which emulates the functionality of a queue using two stacks.
It implements two main methods: "enqueue" for adding elements and "dequeue" for removing them, maintaining a first-in, first-out (FIFO) order. 
Stack1 is primarily used for enqueuing elements, and stack2 assists in dequeuing, ensuring elements are processed in the correct order.
The code handles both enqueue and dequeue operations efficiently, providing a stack-based solution for queue-like behavior.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge11%20WhiteBoard.png)

## Approach & Efficiency

The code employs two stacks to mimic a queue's behavior efficiently. In the "enqueue" method, elements are initially pushed onto stack1,
while in the "dequeue" method, elements are popped from stack2 if it's not empty; otherwise, elements are moved from stack1 to stack2 to maintain the correct order.
This approach ensures that the PseudoQueue maintains a first-in, first-out (FIFO) order as required for queue operations.
The time complexity for both enqueue and dequeue operations is O(n) in the worst case, where n is the number of elements in the PseudoQueue.
While this is not as efficient as a standard queue, it provides a functional queue-like behavior using two stacks.

## Solution

```java
public class PseudoQueue {
    Stack stack1;
    Stack stack2;
    public PseudoQueue() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }
    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (stack1.isEmpty()) {
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
}
````

![Output](../../../../../../assests/challenge%2011%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the PseudoQueue class.
