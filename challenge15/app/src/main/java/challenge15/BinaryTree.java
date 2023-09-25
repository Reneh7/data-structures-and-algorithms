package challenge15;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public List<Integer> preOrder() {
        List<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }

    private void preOrderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.value);
            preOrderTraversal(node.left, result);
            preOrderTraversal(node.right, result);
        }
    }

    public List<Integer> inOrder() {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    private void inOrderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            inOrderTraversal(node.left, result);
            result.add(node.value);
            inOrderTraversal(node.right, result);
        }
    }

    public List<Integer> postOrder() {
        List<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }

    private void postOrderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            postOrderTraversal(node.left, result);
            postOrderTraversal(node.right, result);
            result.add(node.value);
        }
    }

    public int findMaximumValue() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty.");
        }

        return findMaximumValue(root);
    }

    private int findMaximumValue(Node currentNode) {
        int maxValue = currentNode.value;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        if (currentNode.left != null) {
            leftMax = findMaximumValue(currentNode.left);
        }

        if (currentNode.right != null) {
            rightMax = findMaximumValue(currentNode.right);
        }
        return Math.max(Math.max(maxValue, leftMax), rightMax);
    }
    public List<Integer> breadthFirst() {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.value);

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }
        return result;
    }

    public FizzBuzzNode fizzBuzzTree(FizzBuzzNode root) {
        if (root == null) return null;

        FizzBuzzNode newRoot = new FizzBuzzNode(transformValue(root.val));

        for (FizzBuzzNode child : root.children) {
            newRoot.children.add(fizzBuzzTree(child));
        }
        return newRoot;
    }

    private String transformValue(String val) {
        int num = Integer.parseInt(val);

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}


