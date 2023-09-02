package stackandqueues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackAndQueueTest {

    @Test
    public void testPushOneElement() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void testPushingMultiElement() {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(1);
        int poppedValue = stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(1, poppedValue);
    }

    @Test
    public void TestPeekingTheNextItemOnTheStack() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }


    @Test
    public void TestCallingPopOnEmptyStackRaisesAnException() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }

    @Test
    public void TestSuccessfullyInstantiatingAnEmptyStack() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testEnqueueOneElement() {
        Queue queue = new Queue();
        queue.enQueue(1);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testEnqueueMultipleElements() {
        Queue queue = new Queue();
        queue.enQueue(2);
        queue.enQueue(3);
        assertEquals(2, queue.peek());
    }

    @Test
    public void testDequeue() {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        assertEquals(1, queue.deQueue());
    }

    @Test
    public void testQueuePeek() {
        Queue queue = new Queue();
        queue.enQueue(1);
        int peekedValue = queue.peek();
        assertFalse(queue.isEmpty());
        assertEquals(1, peekedValue);
    }

    @Test
    public void testPeekOnEmptyQueue() {
        Queue queue = new Queue();
        assertThrows(IllegalStateException.class, () -> queue.peek());
    }

    @Test
    public void testDequeueOnEmptyQueue() {
        Queue queue = new Queue();
        assertThrows(IllegalStateException.class, () -> queue.deQueue());
    }

    @Test
    public void testSuccessfullyInstantiatingAnEmptyQueue() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

}
