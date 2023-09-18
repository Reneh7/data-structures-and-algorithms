# Max-Tree

## Description

The provided code defines two methods in the BinaryTree class called findMaximumValue (without parameter) that checks if the tree is empty or not and
findMaximumValue (with parameter) which will find the maximum node in the tree. 

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge16%20WhiteBoard%20.png)

## Approach & Efficiency

he findMaximumValue method in the BinaryTree class efficiently determines the maximum value within a binary tree using a depth-first traversal approach.
It initializes a variable to the minimum possible value and then traverses the tree, comparing each node's value with the current maximum.
If a greater value is found, it updates the maximum. This method has a time complexity of O(N), where N is the number of nodes,
as it visits each node once, and a space complexity of O(H), where H is the height of the tree. This approach provides an efficient means to identify
zthe maximum value within the binary tree.

## Solution

![Output](../../../../../../assests/challenge%2016%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the BinaryTree class.

