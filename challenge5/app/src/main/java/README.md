# Single-Linked-List

## Description

The provided code consists of two main classes, LinkedList and Node, forming a basic singly linked list data structure.
The LinkedList class manages node insertion, value presence checks, and generating a string representation of the list.
The Node class defines individual nodes with a value and a reference to the next node.
The App class demonstrates usage by inserting nodes and checking values.

## Whiteboard Process

![WhiteBoard](../../../../assets/Challenge5%20WhiteBoard.png)

## Approach & Efficiency

The insertion operation is performed at the beginning of the list, yielding an optimal time complexity of O(1).
The includes method iterates through the linked list nodes linearly to determine value presence, resulting in a time complexity of O(n), where n represents the number of nodes in the list.
The to_string method generates a string representation by traversing the list, leading to a linear time complexity proportional to the number of nodes.

## Solution

```java
public class LinkedList {
    private Node head;

    public void insert(int v) {
        Node newNode = new Node(v);
        newNode.next = head;
        head = newNode;
    }

    public boolean includes(int v) {
        Node current = head;
        while (current != null) {
            if (current.value == v) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String to_string() {

        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append("{ ").append(current.value).append(" } -> ");
            current = current.next;
        }
        result.append("NULL");
        return result.toString();
    }
}

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
````

![Output](../../../../assets/challenge%205%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will excute the main function that invoke the LinkedList class.
