package challenge37;

import java.util.*;

public class Graph {

    List<Vertex> vertices;
    List<Edge> edges;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }
    public static Integer businessTrip(HashMap<String, HashMap<String, Integer>> graph, String[] trip) {
        if (trip.length <= 1) {
            return 0;
        }

        int totalCost = 0;

        for (int i = 0; i < trip.length - 1; i++) {
            String currentCity = trip[i];
            String nextCity = trip[i + 1];

            if (graph.containsKey(currentCity) && graph.get(currentCity).containsKey(nextCity)) {
                totalCost += graph.get(currentCity).get(nextCity);
            } else {
                return null;
            }
        }
        return totalCost;
    }

    public List<Vertex> depthFirst(Vertex start) {
        List<Vertex> result = new ArrayList<>();
        Set<Vertex> visited = new HashSet<>();
        depthFirstHelper(start, visited, result);
        return result;
    }

    private void depthFirstHelper(Vertex vertex, Set<Vertex> visited, List<Vertex> result) {
        if (vertex == null || visited.contains(vertex)) {
            return;
        }

        visited.add(vertex);
        result.add(vertex);

        for (Edge edge : edges) {
            if (edge.source.equals(vertex)) {
                depthFirstHelper(edge.destination, visited, result);
            }
        }
    }
}
