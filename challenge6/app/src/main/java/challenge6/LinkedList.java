package challenge6;
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

