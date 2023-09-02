public class LinkedList {
    private Node head;

    public void append(int value)
    {
         Node newNode=new Node(value);
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

    public void append(String value)
    {
         Node newNode=new Node(value);
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

    public void reverse()
    {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next; 
            current.next = prev;     
            prev = current;          
            current = nextNode;      
        }
        head = prev; 
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
    
        sb.append("head->");
        while (current != null) 
        {
            sb.append("{").append(current.getIntValue() != 0 ? current.getIntValue() : current.getStringValue()).append("}").append("->");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}
    

