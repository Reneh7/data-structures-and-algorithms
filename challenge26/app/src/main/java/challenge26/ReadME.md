# Insertion Sort

## What is insertion sort?

Insertion Sort is a simple sorting algorithm that works by dividing an array into two parts: a sorted part and an unsorted part. It repeatedly takes an element from the unsorted part and inserts it into its correct position within the sorted part, growing the sorted portion with each iteration.

## Pseudocode
````
Start

for(i=1 to the length of the array)
{
Declare variable key= the first index in the array
Declare variable  j= i - 1

While j >= 0 and array[j] > key
{
Move array[j] to array[j + 1]
Decrement j
}

    // Place key at the correct position
    Set array[j + 1] = key
}
end
````
## Tracing the code

| Array (Initial)         | Key | j   | Sorted Array      |
|-------------------------|-----|-----|-------------------|
| [8, 4, 23, 42, 16, 15]  |     |     | []                |
| [4, 8, 23, 42, 16, 15]  | 4   | 0   | [4]               |
| [4, 8, 23, 42, 16, 15]  | 23  | 2   | [4,8,23]          | 
| [4, 8, 23, 42, 16, 15]  | 42  | 3   | [4,8,23,42]       |
| [4, 8, 16, 23, 42, 15]  | 16  | 2   | [4,8,16,23,42]    |
| [4, 8, 15, 16, 23, 42]  | 15  | 1   | [4,8,15,16,23,42] |

- Initially, the sorted portion is empty (represented as []), and the unsorted portion is the entire array.
- In the first iteration, the key is 4. It's compared to the element before it, which is 8. Since 8 is greater than 4, they are swapped, and the sorted portion now contains [4].
- In the second iteration, the key is 23. It's compared to 8 and 4. Since 8 is less than 23, it remains in place. The sorted portion now contains [4, 8, 23].
- This process continues, and in each iteration, the key is compared to elements in the sorted portion, and if it's smaller, elements are shifted to make space for the key. This process repeats until the entire array is sorted.

## Efficiency (Big O) 

- Time Complexity: o(n^2) we had to go through each element n times.
- Place Complexity=o(1) No additional space is being created.