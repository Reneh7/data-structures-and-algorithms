package LinkedListChallenge;

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
