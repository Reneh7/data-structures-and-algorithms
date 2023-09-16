package challenge14;

import java.util.ArrayList;

public class Queue {
    Node front;
    Node rear;

    public boolean isEmpty()
    {
        return front==null&& rear==null;
    }

    public void enqueue(String value)
    {
        Node newNode= new Node(value);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
        }
        else {
            rear.next=newNode;
            rear=newNode;
        }
    }

    public String dequeue()
    {
        if(isEmpty()){
            throw new IllegalArgumentException("Queue is empty");
        }
        else {
            String value = front.item;
            front = front.next;
            return value;
        }
    }
    public String DuckDuckGoose(ArrayList<String> players, int k)
    {
        for (String player : players) {
            enqueue(player);
        }
        while (!isEmpty() && front != rear)
        {
            for (int i = 0; i < k - 1; i++) {
            String skippedPlayer = dequeue();
            enqueue(skippedPlayer);
            }
            dequeue();
        }
        return front.item;
    }

}
