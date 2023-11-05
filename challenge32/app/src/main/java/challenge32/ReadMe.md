# tree-intersection

A function called TreeIntersection that finds the common values in 2 binary trees.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge32%20WhiteBoard.png)

## Approach & Efficiency

The TreeIntersection function involves using two recursive tree traversal functions. The first function populates a HashSet with values from the first tree,
while the second function traverses the second tree and checks for values already present in the HashSet. Common values found during this process are added
to a result HashSet, which is then returned. The efficiency of this code is O(N) in the worst case, where N is the total number of nodes across both trees.
Both tree traversal operations have a time complexity of O(N), and the HashSet lookups are generally O(1). Therefore, the overall time complexity is linear
with respect to the number of nodes in the trees. The space complexity is also O(N) due to the space used by the two HashSet data structures for storing
values.
## Solution

![Output](../../../../../../assests/challenge%2032%20output.png)
After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the TreeIntersection class.
