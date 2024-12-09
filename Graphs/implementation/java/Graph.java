import java.util.*;

/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Graph using Adjacency List
// This program demonstrates basic graph operations using HashMap

// Space complexity: O(V + E) where V is vertices and E is edges
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Add Node     | O(1)      | O(1)         | O(1)       |
//|Add Edge     | O(1)      | O(1)         | O(1)       |
//|Print Graph  | O(V+E)    | O(V+E)       | O(V+E)     |

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

//Sample Input: Edges: (1,2), (1,3), (2,4), (3,4), (4,5)
//Sample Output: Node 1 is connected to: 2 3
//              Node 2 is connected to: 1 4
//              Node 3 is connected to: 1 4
//              Node 4 is connected to: 2 3 5
//              Node 5 is connected to: 4

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
