import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    // Add a node (Ensure the node is added even if it has no edges)
    public void addNode(int node) {
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    // Add an edge between two nodes (undirected graph)
    public void addEdge(int src, int dest) {
        addNode(src);  // Ensure the source node exists
        addNode(dest); // Ensure the destination node exists
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // Print the adjacency list representation of the graph
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.print("Node " + entry.getKey() + " is connected to: ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Adding nodes and edges to the graph
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        // Print the graph's adjacency list
        graph.printGraph();
    }
}
