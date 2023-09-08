#  validate brackets

## Description

The provided code defines a method called validateBrackets responsible for checking the balance of brackets within a given string.
The method scans through the characters in the input string, identifying opening brackets
('{', '[', or '(') and verifying that they are correctly matched with corresponding closing brackets (']', '}', or ')'). 
It employs a stack-based approach to track the brackets' order and balance. If at any point an unmatched closing bracket or a closing bracket without
a preceding opening bracket is encountered, the method returns false, indicating an imbalance. Conversely, if all brackets are correctly matched and
balanced, it returns true. This code effectively ensures the proper nesting and pairing of brackets within the provided string.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge13%20WhiteBoard.png)

## Approach & Efficiency

The provided code efficiently validates the balance of brackets within a given string using a stack-based approach.
It scans through the input string character by character, pushing opening brackets 
('{', '[', or '(') onto the stack and popping matching closing brackets (']', '}', or ')') from the stack when encountered.
The code ensures that brackets are correctly nested by checking that each closing bracket has a corresponding opening bracket in the stack. 
If a mismatch is found at any point, the code returns false, indicating unbalanced brackets. Overall, this approach has a time complexity of O(n),
where n is the length of the input string, and a space complexity of O(n) in the worst case due to the stack's storage requirements.

## Solution

![Output](../../../../../../assests/challenge%2013%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the BalancedParentheses class.
