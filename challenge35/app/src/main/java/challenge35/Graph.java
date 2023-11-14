package challenge35;

import java.util.*;

public class Graph {
    private Map<Vertex, List<Edge>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public Vertex addVertex(int value) {
        Vertex vertex = new Vertex(value);
        adjacencyList.put(vertex, new ArrayList<>());
        return vertex;
    }

    public void addEdge(Vertex source, Vertex destination, int weight) {
        if (!adjacencyList.containsKey(source) || !adjacencyList.containsKey(destination)) {
            throw new IllegalArgumentException("Both vertices should already be in the Graph.");
        }

        Edge edge = new Edge(source, destination, weight);
        adjacencyList.get(source).add(edge);
    }

    public Collection<Vertex> getVertices() {
        return adjacencyList.keySet();
    }
    public Collection<Edge> getNeighbors(Vertex vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            return Collections.emptyList();
        }
        return adjacencyList.get(vertex);
    }
    public int size() {
        return adjacencyList.size();
    }
}
