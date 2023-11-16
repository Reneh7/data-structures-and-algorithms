# graph-breadth-first

A function called graph-breadth-first that returns a collection of nodes in the order they were visited.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge36%20WhiteBoard.png)

## Approach & Efficiency

The approach for the provided Java code implementing breadth-first search in a graph involves utilizing a queue and a set to traverse the graph starting
from a specified vertex. The algorithm begins by enqueueing the initial vertex, marking it as visited, and iteratively dequeuing vertices, printing them,
and enqueueing their unvisited neighbors until the queue is empty. The efficiency of this approach is O(V + E), where V is the number of vertices and E
is the number of edges, as each vertex and edge is visited once. The adjacency list representation is employed, enabling efficient retrieval of neighbors
for each vertex. The space complexity is O(V) due to the storage of visited vertices in a set and the queue, making it a practical solution for exploring
graphs.

## Solution

![Output](../../../../../../assests/challenge%2036%20output.png)
After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the Graph class.
