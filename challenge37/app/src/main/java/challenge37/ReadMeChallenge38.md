# graph-depth-first

a function called depthFirst that returns the collection of nodes in their pre-order depth-first traversal order

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge38%20WhiteBoard%20.png)

## Approach & Efficiency

The approach involves starting the traversal from a specified vertex, marking visited vertices to avoid infinite
loops, and recursively visiting adjacent vertices. The algorithm is implemented using the depthFirst and
depthFirstHelper methods in the Graph class. The efficiency of the code depends on the number of vertices and
edges in the graph. In the worst case, where every vertex and edge needs to be explored, the time complexity
is O(V + E), where V is the number of vertices and E is the number of edges in the graph. The space complexity
is O(V) due to the use of a HashSet to track visited vertices.

## Solution

![Output](../../../../../../assests/challenge%2038%20output.png)

After compiling, run the Java program using the java command followed by the class name ,and it will execute the main function that invoke the Graph class.
