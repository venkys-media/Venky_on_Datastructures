from collections import defaultdict

# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Graph using Adjacency List
# This program demonstrates basic graph operations using defaultdict

# Space complexity: O(V + E) where V is vertices and E is edges
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Add Node     | O(1)      | O(1)         | O(1)       |
#|Add Edge     | O(1)      | O(1)         | O(1)       |
#|Print Graph  | O(V+E)    | O(V+E)       | O(V+E)     |

class Graph:
    def __init__(self):
        self.adjList = defaultdict(list)

    # Add a node (Ensures the node is added even if it has no edges)
    def addNode(self, node):
        self.adjList[node]  # Ensure the node is in the graph

    # Add an edge between two nodes (undirected graph)
    def addEdge(self, src, dest):
        self.addNode(src)  # Ensure the source node exists
        self.addNode(dest) # Ensure the destination node exists
        self.adjList[src].append(dest)
        self.adjList[dest].append(src)

    # Print the adjacency list representation of the graph
    def printGraph(self):
        for node, neighbors in self.adjList.items():
            print(f"Node {node} is connected to:", ' '.join(map(str, neighbors)))

if __name__ == "__main__":
    graph = Graph()

    # Adding nodes and edges to the graph
    graph.addEdge(1, 2)
    graph.addEdge(1, 3)
    graph.addEdge(2, 4)
    graph.addEdge(3, 4)
    graph.addEdge(4, 5)

    # Print the graph's adjacency list
    graph.printGraph()

    # Join our communities
    # Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
    # Follow us on Facebook - https://www.facebook.com/venkysio
    # Follow us on Instagram - https://www.instagram.com/venkys.io
    # Follow us on Twitter - https://twitter.com/iovenkys
    # Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
