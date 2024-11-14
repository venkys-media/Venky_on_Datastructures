#include <iostream>
#include <unordered_map>
#include <list>

class Graph {
public:
    std::unordered_map<int, std::list<int>> adjList;

    // Add a node (Ensures the node is added even if it has no edges)
    void addNode(int node) {
        if (adjList.find(node) == adjList.end()) {
            adjList[node] = std::list<int>();  // Initialize an empty list for the node
        }
    }

    // Add an edge between two nodes (undirected graph)
    void addEdge(int src, int dest) {
        addNode(src);  // Ensure the source node exists
        addNode(dest); // Ensure the destination node exists
        adjList[src].push_back(dest);
        adjList[dest].push_back(src);
    }

    // Print the adjacency list representation of the graph
    void printGraph() {
        for (const auto& node : adjList) {
            std::cout << "Node " << node.first << " is connected to: ";
            for (const auto& neighbor : node.second) {
                std::cout << neighbor << " ";
            }
            std::cout << std::endl;
        }
    }
};

int main() {
    Graph graph;

    // Adding nodes and edges to the graph
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 4);
    graph.addEdge(3, 4);
    graph.addEdge(4, 5);

    // Print the graph's adjacency list
    graph.printGraph();

    return 0;
}
