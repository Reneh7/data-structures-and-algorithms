# tree-breadth-first

## Description

The provided code defines a method in the BinaryTree class called breadthFirst that list of all values in the tree, in the order they were encountered.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge17%20WhiteBoard%20.png)

## Approach & Efficiency

The breadth-first traversal algorithm operates by systematically exploring the nodes of a binary tree level by level, starting from the root.
It employs a queue data structure to ensure that nodes at the same level are processed before moving on to the next level. This approach guarantees that
all nodes are visited exactly once, making the time complexity O(N), where N represents the number of nodes in the tree. However, the space complexity can
vary depending on the tree's shape, with a worst-case space complexity of O(N) for completely unbalanced trees and O(2^h) for balanced trees, where h is
the tree's height.

## Solution

![Output](../../../../../../assests/challenge%2017%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the BinaryTree class.

