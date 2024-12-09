/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Graph Traversal
// This program demonstrates BFS and DFS traversal algorithms

// Space complexity: O(V) where V is number of vertices
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|BFS          | O(V+E)    | O(V+E)       | O(V+E)     |
//|DFS          | O(V+E)    | O(V+E)       | O(V+E)     |

#include <iostream>
#include <unordered_map>
#include <list>
#include <queue>
#include <stack>
#include <vector>

class Graph
{
public:
    std::unordered_map<int, std::list<int>> adjList; // Adjacency list representation

    // Add an edge between two nodes (undirected graph)
    void addEdge(int src, int dest)
    {
        adjList[src].push_back(dest); // Add edge src -> dest
        adjList[dest].push_back(src); // Add edge dest -> src
    }

    // BFS Traversal implementation
    void bfs(int start)
    {
        std::unordered_map<int, bool> visited; // Track visited nodes
        std::queue<int> q;                     // Queue for BFS

        visited[start] = true; // Mark start as visited
        q.push(start);         // Add start to queue

        std::cout << "BFS Traversal: ";
        while (!q.empty())
        {
            int node = q.front(); // Get next node from queue
            q.pop();
            std::cout << node << " ";

            // Process all unvisited neighbors
            for (auto neighbor : adjList[node])
            {
                if (!visited[neighbor])
                {
                    visited[neighbor] = true;
                    q.push(neighbor);
                }
            }
        }
        std::cout << std::endl;
    }

    // DFS Traversal implementation
    void dfs(int start)
    {
        std::unordered_map<int, bool> visited; // Track visited nodes
        std::stack<int> s;                     // Stack for DFS

        visited[start] = true; // Mark start as visited
        s.push(start);         // Add start to stack

        std::cout << "DFS Traversal: ";
        while (!s.empty())
        {
            int node = s.top(); // Get next node from stack
            s.pop();
            std::cout << node << " ";

            // Process all unvisited neighbors
            for (auto neighbor : adjList[node])
            {
                if (!visited[neighbor])
                {
                    visited[neighbor] = true;
                    s.push(neighbor);
                }
            }
        }
        std::cout << std::endl;
    }
};

// Main function to demonstrate graph traversals
int main()
{
    Graph graph;

    // Adding nodes and edges to create a sample graph
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 4);
    graph.addEdge(3, 4);
    graph.addEdge(4, 5);

    // Perform BFS and DFS traversals
    graph.bfs(1); // Start BFS from node 1
    graph.dfs(1); // Start DFS from node 1

    return 0;
}

// Sample Input: Graph with edges: (1,2), (1,3), (2,4), (3,4), (4,5)
// Sample Output: BFS Traversal: 1 2 3 4 5
//               DFS Traversal: 1 3 4 5 2

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork