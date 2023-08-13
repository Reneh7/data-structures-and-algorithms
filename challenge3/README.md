# array-binary-search

## Description

 I wrote a function  called BinarySearch which takes in 2 parameters: a sorted array and the search key and return the the index of the array’s element that is equal to the value of the search key, or -1 if the element is not in the array.

## Whiteboard Process

![WhiteBoard Part1](../assests/Challenge3%20WhiteBoard%20part1.png)
![WhiteBoard Par2](../assests/Challenge3%20WhiteBoard%20part2.png)

## Approach & Efficiency

The BinarySearch class contains a main method showcasing the BinarySearch function's capability to locate the index of a specified value in a sorted array using a binary search algorithm. The function initializes low to 0 and high to the last index, then iteratively adjusts the search range by calculating the midpoint mid. If array[mid] matches the search key k, the function returns mid. Otherwise, it narrows the search by adjusting low or high based on the comparison of array[mid] and k. This process continues until the range is exhausted, at which point the function returns -1 to indicate the absence of k. The algorithm operates in O(log n) time complexity due to its halving of the search space, while using O(1) space for index variables and temporaries, ensuring efficient performance for large arrays.

## Solution

```java
public class arrayBinarySearch 
{
    public static void main(String[] args)
    {
       int[] array= {-131, -82, 0, 27, 42, 68, 179};
       int k=42;
       System.out.println(BinarySearch(array,k));
       
    }

    public static int BinarySearch(int[] array, int k)
    {
        int high=array.length-1;
        int low=0;
       
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == k) {
                return mid; 
            }
            if (array[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return -1;

    }
}

````

![Output](../assests/challenge%203%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will excute the main function that invoke the BinarySearch function.
