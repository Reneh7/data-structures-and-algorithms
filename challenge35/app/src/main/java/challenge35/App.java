/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge35;

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex vertexA = graph.addVertex(1);
        Vertex vertexB = graph.addVertex(2);
        Vertex vertexC = graph.addVertex(3);

        graph.addEdge(vertexA, vertexB, 5);
        graph.addEdge(vertexA, vertexC, 3);

        System.out.println("Vertices: " + graph.getVertices());
        System.out.println("Neighbors of vertexA: " + graph.getNeighbors(vertexA));
        System.out.println("Graph Size: " + graph.size());

        Vertex startVertex = vertexA;
        graph.breadthFirst(startVertex);
    }
}
