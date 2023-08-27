package challenge8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testZipLists() {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(5);

        LinkedList list2 = new LinkedList();
        list2.append(2);
        list2.append(4);
        list2.append(6);

        Node zippedListHead = LinkedList.zipLists(list1.head, list2.head);
        
        assertEquals(1, zippedListHead.value);
        assertEquals(2, zippedListHead.next.value);
        assertEquals(3, zippedListHead.next.next.value);
        assertEquals(4, zippedListHead.next.next.next.value);
        assertEquals(5, zippedListHead.next.next.next.next.value);
        assertEquals(6, zippedListHead.next.next.next.next.next.value);
        assertNull(zippedListHead.next.next.next.next.next.next);
    }

    @Test
    public void testZipListsWithUnequalLengths() {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);

        LinkedList list2 = new LinkedList();
        list2.append(2);
        list2.append(4);
        list2.append(6);

        Node zippedListHead = LinkedList.zipLists(list1.head, list2.head);

        assertEquals(1, zippedListHead.value);
        assertEquals(2, zippedListHead.next.value);
        assertEquals(3, zippedListHead.next.next.value);
        assertEquals(4, zippedListHead.next.next.next.value);
        assertEquals(6, zippedListHead.next.next.next.next.value);
        assertNull(zippedListHead.next.next.next.next.next);
    }

    @Test
    public void testZipListsWithEmptyLists() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        Node zippedListHead = LinkedList.zipLists(list1.head, list2.head);

        assertNull(zippedListHead);
    }
}
