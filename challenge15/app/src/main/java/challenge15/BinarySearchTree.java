package challenge15;

import java.util.Stack;

public class BinarySearchTree extends BinaryTree {

    public boolean isEmpty() {
        return root == null;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value < current.value ? containsRecursive(current.left, value) : containsRecursive(current.right, value);
    }


    public int sumOfOddNumbers(Node root) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            if (current.value % 2 != 0) {
                sum += current.value;
            }

            current = current.right;
        }

        return sum;
    }
}
