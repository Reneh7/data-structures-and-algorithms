# zipLists

## Description

zipLists method is a method within a LinkedList class.This method is designed to take two separate lists and blend them together into a new list.
The method starts by creating a new list and getting ready to add things to it. Then, it looks at the first items in both lists and adds one to the new list.
Finally, the method presents this new list as a harmonious combination of the original lists

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge8%20WhiteBoard.png)

## Approach & Efficiency

The zipLists method follows a direct approach by utilizing two pointers to iteratively merge two input linked lists into a new zipped linked list.
The algorithm involves alternatingly appending nodes from each list to the result list, ensuring an alternating pattern. With linear time complexity,
as it traverses both input lists once, and constant space complexity, due to minimal extra memory requirements,
the method efficiently creates the merged linked list while preserving the original order of elements.

## Solution

```java
public class LinkedList
{
    public static Node zipLists(Node list1, Node list2) {
        Node result = new Node(0);
        Node current = result;

        while (list1 != null || list2 != null) {
            if (list1 != null) {
                current.next = list1;
                list1 = list1.next;
                current = current.next;
            }

            if (list2 != null) {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }

        return result.next;
    }
}
````

![Output](../../../../../../assests/challenge%208%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will excute the main function that invoke the LinkedList class.
