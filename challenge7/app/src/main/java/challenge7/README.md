# linked-list-kth

## Description

kthNumber method is a method within a LinkedList class.This method is designed to retrieve the value of a node situated at a specified position from the end of the linked list.
The algorithm employs a two-pointer approach, utilizing a "slow" and a "fast" pointer, both initially set to the list's head.
The "fast" pointer is moved ahead by k + 1 steps, and if it reaches the end of the list, it signifies that k exceeds the list's length. 
In this case, an exception is raised. Subsequently, while advancing both pointers, the method locates the desired node k positions from the end.
Finally, the value of this node is returned, ensuring accurate retrieval while considering various edge cases and input validations.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge7%20WhiteBoard.png)

## Approach & Efficiency

The approach to efficiently retrieve the value of a node at a specific position k from the end of the linked list involves utilizing two pointers,
a "slow" and a "fast" pointer. The "fast" pointer is initially advanced by k + 1 steps to create a gap between the two pointers.
Then, both pointers are moved in tandem until the "fast" pointer reaches the end of the list. At this point,
the "slow" pointer will be positioned at the desired node. This approach achieves a linear runtime complexity of O(n)

## Solution

```java
public class LinkedList
{
    public int kthNumber(int k) {
        if (k < 0 || head == null) {
            throw new IllegalArgumentException("Invalid k value or empty list");
        }

        Node slow = head;
        Node fast = head;
        for (int i = 0; i <= k; i++) {
            if (fast == null) {
                throw new IllegalArgumentException("k is greater than or equals the list length");
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.value;
    }
}
````

![Output](../../../../../../assests/challenge%207%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will excute the main function that invoke the LinkedList class.
