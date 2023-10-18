# Challenge27

## What is Merging Sort?

it is an algorithm that follows the divide and conquer strategy to sort an array or list of elements. It works by repeatedly dividing the unsorted list into two halves until each half contains only one element (which is considered sorted). Then, it merges the two halves back together, repeatedly comparing elements from each half and selecting the smaller one until the entire list is sorted. This process continues recursively until the entire list is sorted.

## Pseudocode
````
MergeSort(arr):
    
    mid = length of arr / 2
    left = create an array of the first half of arr
    right = create an array of the second half of arr

    MergeSort(left)
    MergeSort(right)

    Merge(arr, left, right)

Merge(arr, left, right):
    i = 0  
    j = 0  
    k = 0  

    while i < length of left and j < length of right:
        if left[i] < right[j]:
            arr[k] = left[i]
            i++
        else:
            arr[k] = right[j]
            j++
        k++
    
  
    while i < length of left:
        arr[k] = left[i]
        i++
        k++
    
    while j < length of right:
        arr[k] = right[j]
        j++
        k++

````

## Trace the Code

| Step | Array                      | Explanation                                           |
|------|----------------------------|-------------------------------------------------------|
| 1    | [8, 4, 23, 42, 16, 15]     | Initial array                                         |
| 2    | [8, 4, 23]                 | Split the left half: [8, 4, 23]                       |
| 3    | [42, 16, 15]               | Split the right half: [42, 16, 15]                    |
| 4    | [8]                        | Split the left half: [8]                              |
| 5    | [4, 23]                    | Split the right half: [4, 23]                         |
| 6    | [42]                       | Split the left half: [42]                             |
| 7    | [16, 15]                   | Split the right half: [16, 15]                        |
| 8    | [4]                        | Split the left half: [4]                              |
| 9    | [23]                       | Split the right half: [23]                            |
| 10   | [8, 4]                     | Merge left: [4, 8]                                    |
| 11   | [16, 15]                   | Merge right: [15, 16]                                 |
| 12   | [42]                       | Merge left: [42]                                      |
| 13   | [4, 8, 23]                 | Merge left: [4, 8, 23]                                |
| 14   | [15, 16, 42]               | Merge right: [15, 16, 42]                             |
| 15   | [4, 8, 15, 16, 23, 42]     | Merge all: [4, 8, 15, 16, 23, 42]                     |


## Efficiency (Big O)

- Time Complexity: O(n log n), where "n" is the number of elements in the array.
- Place Complexity: O(n), as it requires additional memory to store the two halves of the array during the sorting process. 