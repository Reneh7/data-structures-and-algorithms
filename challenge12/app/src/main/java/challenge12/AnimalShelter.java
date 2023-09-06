package challenge12;

public class AnimalShelter<T> {
    Node<Animal<T>> front;
    Node<Animal<T>> back;

    public boolean isEmpty()
    {
        return (front==null&&back==null);
    }
    public void enqueue(Animal<T> animal)
    {
        if(!animal.species.equals("cat") && !animal.species.equals("dog"))
        {
            System.out.println("invalid Species");
            return;
        }
        if(isEmpty())
        {
            front=back=new Node<>(animal);
        }
        else
        {
            back.next = new Node<>(animal);
            back = back.next;
        }
    }

    public Animal<T> dequeue(String pref) {
        if (isEmpty()) {
            return null;
        }
        if (!pref.equals("cat") && !pref.equals("dog")) {
            return null;
        }

        Node<Animal<T>> current = front;
        Node<Animal<T>> previous = null;

        while (current != null && !current.item.species.equals(pref)) {
            previous = current;
            current = current.next;
        }

        Animal<T> adoptedAnimal = current.item;
        if (previous != null) {
            previous.next = current.next;
        } else {
            front = current.next;
        }

        return adoptedAnimal;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<Animal<T>> current = front;

        while (current != null) {
            sb.append("Name: ").append(current.item.getName()).append(", Species: ").append(current.item.getSpecies()).append("\n");
            current = current.next;
        }

        return sb.toString();
    }

}


