#include <iostream>
#include <unordered_map>
#include <list>
#include <queue>
#include <stack>
#include <vector>

class Graph {
public:
    std::unordered_map<int, std::list<int>> adjList;

    // Add an edge between two nodes (undirected graph)
    void addEdge(int src, int dest) {
        adjList[src].push_back(dest);
        adjList[dest].push_back(src);
    }

    // BFS Traversal
    void bfs(int start) {
        std::unordered_map<int, bool> visited;
        std::queue<int> q;

        visited[start] = true;
        q.push(start);

        std::cout << "BFS Traversal: ";
        while (!q.empty()) {
            int node = q.front();
            q.pop();
            std::cout << node << " ";

            for (auto neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.push(neighbor);
                }
            }
        }
        std::cout << std::endl;
    }

    // DFS Traversal
    void dfs(int start) {
        std::unordered_map<int, bool> visited;
        std::stack<int> s;

        visited[start] = true;
        s.push(start);

        std::cout << "DFS Traversal: ";
        while (!s.empty()) {
            int node = s.top();
            s.pop();
            std::cout << node << " ";

            for (auto neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    s.push(neighbor);
                }
            }
        }
        std::cout << std::endl;
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

    // Perform BFS and DFS
    graph.bfs(1);  // Start BFS from node 1
    graph.dfs(1);  // Start DFS from node 1

    return 0;
}
