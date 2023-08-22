# Extend a Linked List to allow various insertion methods.

## Description

The provided code consists of two main classes, LinkedList and Node, forming a basic singly linked list data structure.
The LinkedList class supports methods for appending nodes with given values to the end of the list, 
inserting nodes before or after specific target values, and generating a string representation of the linked list.
The Node class defines individual nodes with a value and a reference to the next node.
The App class demonstrates usage by inserting nodes.

## Whiteboard Process
![WhiteBoard](../../../../../../assests/Challenge6%20WhiteBoard%20part1.png)
![WhiteBoard](../../../../../../assests/Challenge6%20WhiteBoard%20part2.png)

## Approach & Efficiency

The provided LinkedList code employs various methods to efficiently manage a singly linked list data structure.
The append method efficiently adds nodes to the end of the list, utilizing a loop to traverse until the last node,
leading to a time complexity of O(n). The insertBefore and insertAfter methods effectively insert nodes before or after specified target values,
with the complexity of O(1) in the case of insertion at the beginning, and O(n) for linear traversal when locating the target.
The to_string method generates a string representation by traversing the list,
resulting in a linear time complexity proportional to the number of nodes.
The overall approach maximizes efficiency through careful balancing of insertion operations and node traversal while considering the position of insertion within the list.

## Solution

```java
public class LinkedList
{
    private Node head;

    public void append( int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void insertBefore(int targetValue, int newValue) {
        Node newNode = new Node(newValue);

        if (head == null || head.value == targetValue) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.value != targetValue) {
            current = current.next;
        }
        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void insertAfter (int targetValue, int newValue) {
        Node newNode = new Node(newValue);
        Node current = head;
        while (current != null && current.value != targetValue) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public String to_string() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}
````

![Output](../../../../../../assests/challenge%206%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will excute the main function that invoke the LinkedList class.
