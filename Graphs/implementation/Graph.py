from collections import defaultdict

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
