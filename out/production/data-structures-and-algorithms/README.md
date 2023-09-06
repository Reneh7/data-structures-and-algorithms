# Reverse Array

## Description

 I wrote a function called reverseArray which takes an array as an argument and return the array with its elements in reversed order.

## Whiteboard Process

![WhiteBoard](../assests/Challenge1%20WhiteBoard.png)

## Approach & Efficiency

The approach i took was creating a new array "reversedArray" with the same length as the input array "arr". The code then iterates through the input array, placing its elements in reverse order into the reversedArray. This approach has a time complexity of O(n), where n is the length of the input array, as each element is visited and placed in the reversed array. The space complexity is also O(n), as a new array of the same length as the input array is created to store the reversed elements.

## Solution

```java
public class Main {
    public static void main(String args[]) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] reversedArray = reverseArray(array);
        
        System.out.print("[");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]);
            if (i < reversedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int lastIndex = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            reversedArray[lastIndex - i] = array[i];
        }
        return reversedArray;
    }
}
````

![Output](../assests/challenge%201%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will excute the main function that invoke the reverseArray function.
