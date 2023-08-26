package challenge8;

public class LinkedList {
    Node head;

    public void append(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
    }

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
