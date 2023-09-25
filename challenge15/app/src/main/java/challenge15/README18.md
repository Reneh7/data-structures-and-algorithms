# Fizz-Buzz-FizzBuzz

## Description

The provided code defines two methods in the BinaryTree class called fizzBuzzTree and transformValue If the value is divisible by 3, replace the value with
“Fizz” ,If the value is divisible by 5, replace the value with “Buzz” ,If the value is divisible by 3 and 5, replace the value with “FizzBuzz” and if the
value is not divisible by 3 or 5, simply turn the number into a String.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge18%20WhiteBoard%20.png)

## Approach & Efficiency

The provided code efficiently transforms a k-ary tree into a FizzBuzz tree. It does so in O(N) time complexity, where N represents the number of nodes in
the tree, as it traverses each node once and applies the FizzBuzz transformation with constant time operations. The space complexity is O(N) in the worst
case due to the recursive call stack during tree traversal and the space required to store the transformed tree. This code effectively applies the FizzBuzz
logic to each node's value, making it divisible by 3, 5, or both, resulting in a modified tree structure where values are either "Fizz," "Buzz," "FizzBuzz,
" or an integer string.

## Solution

![Output](../../../../../../assests/challenge%2018%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the BinaryTree class.

