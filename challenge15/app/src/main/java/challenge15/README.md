# Trees

## Description

The provided code  defines a Binary Search Tree (BST) data structure along with its associated methods. The BinarySearchTree class extends the basic
BinaryTree class and includes functions for creating, manipulating, and traversing a BST. It allows users to instantiate an empty tree or one with a root
node, add child nodes to maintain the BST property, and perform three types of depth-first traversals: pre-order, in-order, and post-order. Additionally,
the BinarySearchTree class incorporates a contains method for checking if a specific value exists in the tree. The code ensures that BST operations are
executed correctly, maintaining the integrity of the tree structure and the properties of a Binary Search Tree.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge15%20WhiteBoard%20part1.png)
![WhiteBoard](../../../../../../assests/Challenge15%20WhiteBoard%20part2.png)
![WhiteBoard](../../../../../../assests/Challenge15%20WhiteBoard%20part3.png)

## Approach & Efficiency

The code implements a Binary Search Tree (BST) along with standard methods for adding nodes, traversing the tree (pre-order, in-order, post-order),
and checking for the existence of a value. The efficiency of these operations is influenced by the balance of the tree. For tree instantiation,
it operates in constant time. Adding nodes is most efficient in a balanced tree, with an average time complexity of O(log n) for insertion,
but can degrade to O(n) in the worst case of a degenerate tree. Traversals have a time complexity of O(n) as they visit every node once,
with space complexity influenced by the tree's height (O(h)). The contains method's efficiency depends on tree balance, offering O(log n) in the best-case
scenario and O(n) in the worst case. Overall, the code performs optimally when the tree remains balanced, ensuring logarithmic time complexities for most
operations.

## Solution

![Output](../../../../../../assests/challenge%2015%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the BinaryTree class.

