package challenge13;

public class Node {
    String item;
    Node next;

    public Node(String item) {
        this.item = item;
        this.next = null;
    }

    public String getItem() {
        return item;
    }
}
