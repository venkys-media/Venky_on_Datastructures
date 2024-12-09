
/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Graph Traversal
// This program demonstrates BFS and DFS traversal algorithms

// Space complexity: O(V) where V is number of vertices
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|BFS          | O(V+E)    | O(V+E)       | O(V+E)     |
//|DFS          | O(V+E)    | O(V+E)       | O(V+E)     |

import java.util.*;

// Graph class to represent the graph and perform traversals


class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();  // Adjacency list representation

    // Add an edge between two nodes (undirected graph)
    public void addEdge(int src, int dest) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // BFS Traversal implementation
    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();    // Queue for BFS
        Set<Integer> visited = new HashSet<>();       // Track visited nodes

        visited.add(start);                           // Mark start as visited
        queue.offer(start);                           // Add start to queue

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int node = queue.poll();                  // Get next node from queue
            System.out.print(node + " ");

            // Process all unvisited neighbors
            for (int neighbor : adjList.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    // DFS Traversal implementation
    public void dfs(int start) {
        Stack<Integer> stack = new Stack<>();         // Stack for DFS
        Set<Integer> visited = new HashSet<>();       // Track visited nodes

        visited.add(start);                           // Mark start as visited
        stack.push(start);                            // Add start to stack

        System.out.print("DFS Traversal: ");
        while (!stack.isEmpty()) {
            int node = stack.pop();                   // Get next node from stack
            System.out.print(node + " ");

            // Process all unvisited neighbors
            for (int neighbor : adjList.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Main method to demonstrate graph traversals
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Adding nodes and edges to create a sample graph
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        // Perform BFS and DFS traversals
        graph.bfs(1);  // Start BFS from node 1
        graph.dfs(1);  // Start DFS from node 1
    }
}

//Sample Input: Graph with edges: (1,2), (1,3), (2,4), (3,4), (4,5)
//Sample Output: BFS Traversal: 1 2 3 4 5
//              DFS Traversal: 1 3 4 5 2

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork