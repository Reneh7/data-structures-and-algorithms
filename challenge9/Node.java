public class Node {
protected int intValue;
protected String stringValue;
protected Node next;
    public Node(int value)
    {
        this.intValue=value;
        this.stringValue = null;
        this.next=null;
    }

    public Node(String value)
    {
        this.stringValue=value;
        this.intValue = 0;
        this.next=null;
    }

    public int getIntValue() {
        return intValue;
    }

     public String getStringValue() {
        return stringValue;
    }

    public Node getNext() {
        return next;
    } 
}
