public class Main {
 public static void main(String[] args) 
 {
    LinkedList myList = new LinkedList();
    myList.append(3);
    myList.append(2);
    myList.append(1);
   
   //===============================
   // myList.append("a");
   // myList.append("b");
   // myList.append("c");

    System.out.println("Original Linked List:");
    System.out.println(myList); 
     
    myList.reverse();
    System.out.println("Reversed Linked List:" );
    System.out.println(myList); 
 }
    
}
