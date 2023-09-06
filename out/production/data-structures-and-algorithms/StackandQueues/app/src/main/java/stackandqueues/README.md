# StackAndQueue

## Description

The Stack class represents a Last-In-First-Out (LIFO) data structure, where elements are added and removed from the same end,
called the "top." It supports three main operations: push, which adds an element to the top of the stack, pop,
which removes and returns the top element, and peek, which returns the top element without removing it. The Queue class, on the other hand,
represents a First-In-First-Out (FIFO) data structure, where elements are added at one end (the "back") and removed from the other end (the "front"). It also supports three primary operations: enQueue, which adds an element to the back of the queue, deQueue, which removes and returns the front element, and peek, which returns the front element without removing it.v

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge10%20WhiteBoard%20part1.png)
![WhiteBoard](../../../../../../assests/Challenge10%20WhiteBoard%20part2.png)
![WhiteBoard](../../../../../../assests/Challenge10%20WhiteBoard%20part3.png)
![WhiteBoard](../../../../../../assests/Challenge10%20WhiteBoard%20part4.png)

## Approach & Efficiency

Both the stack and queue implementations follow a linked list approach, where each element is represented as a node with a reference to the next
node. In the Stack and queue classes, push, pop,peek,isEmpty operations have O(1) time complexity and the space complexity for both structures is O(n)
as it depends on the number of elements stored in the data structure, where 'n' is the number of elements.

## Solution

```java
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
}

public class Queue {
    Node front;
    Node back;

    public boolean isEmpty() {
        return (front == null && back == null);
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot return deQueue.");
        } else {
            Node current = front;
            front = front.next;
            current.next = null;
            return current.item;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot return peek.");
        }
        return front.item;
    }
}
````

![Output](../../../../../../assests/challenge%2010%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will excute the main function that invoke the Stack class and Queue class.
