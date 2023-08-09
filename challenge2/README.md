# array-insert-shift  

## Description

 I wrote a function called insertShiftArray which takes an arraya and a number as an arguments and return the number as the middle index inside the array.

## Whiteboard Process

![WhiteBoard](../assests/Challenge1%20WhiteBoard.png)

## Approach & Efficiency

The provided Shift class includes a main method that showcases the insertShiftArray function, demonstrating its ability to insert a given value into an array at its middle index. The insertShiftArray function calculates the middle index of the input array and creates a new array with one additional element. It then copies the elements from the original array into the new array up to the middle index, inserts the specified value, and copies the remaining elements. This process results in an array with the new value inserted at the desired position. The function runs in O(n) time complexity due to the element copying, and its space complexity is also O(n) due to the creation of the new array.

## Solution

```java
public class Shift
{
    public static void main(String args[])
    {
        int[] originalArray = {1, 2, 3, 4};
        int newValue = 6;
        System.out.println(Arrays.toString(insertShiftArray(originalArray, newValue)));
    }


    public static int[] insertShiftArray(int[] array, int n)
   {
        int mid=array.length/2;
        int newSize = array.length + 1;
        int[] newArray = new int[newSize];
        for(int i=0; i<mid; i++)
        { 
                newArray[i] = array[i];
        }
        newArray[mid] = n;
        for (int i = mid + 1; i < newSize; i++) 
        {
            newArray[i] = array[i - 1];
        }
        return newArray;
   }
}
````

![Output](../assests/Challenge2%20WhiteBoard.png)

After compiling, run the Java program using the java command followed by the class name and it will excute the main function that invoke the insertShiftArray function.
