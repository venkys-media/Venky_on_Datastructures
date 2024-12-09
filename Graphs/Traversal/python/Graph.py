# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Graph Traversal
# This program demonstrates BFS and DFS traversal algorithms

# Space complexity: O(V) where V is number of vertices
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|BFS          | O(V+E)    | O(V+E)       | O(V+E)     |
#|DFS          | O(V+E)    | O(V+E)       | O(V+E)     |

from collections import defaultdict, deque

class Graph:
    def __init__(self):
        self.adjList = defaultdict(list)  # Adjacency list representation

    # Add an edge between two nodes (undirected graph)
    def addEdge(self, src, dest):
        self.adjList[src].append(dest)    # Add edge src -> dest
        self.adjList[dest].append(src)    # Add edge dest -> src

    # BFS Traversal implementation
    def bfs(self, start):
        visited = set()                   # Track visited nodes
        queue = deque([start])           # Queue for BFS
        visited.add(start)               # Mark start as visited

        print("BFS Traversal:", end=" ")
        while queue:
            node = queue.popleft()       # Get next node from queue
            print(node, end=" ")

            # Process all unvisited neighbors
            for neighbor in self.adjList[node]:
                if neighbor not in visited:
                    visited.add(neighbor)
                    queue.append(neighbor)
        print()

    # DFS Traversal implementation
    def dfs(self, start):
        visited = set()                   # Track visited nodes
        stack = [start]                  # Stack for DFS
        visited.add(start)               # Mark start as visited

        print("DFS Traversal:", end=" ")
        while stack:
            node = stack.pop()           # Get next node from stack
            print(node, end=" ")

            # Process all unvisited neighbors
            for neighbor in self.adjList[node]:
                if neighbor not in visited:
                    visited.add(neighbor)
                    stack.append(neighbor)
        print()

# Main function to demonstrate graph traversals
if __name__ == "__main__":
    graph = Graph()

    # Adding nodes and edges to create a sample graph
    graph.addEdge(1, 2)
    graph.addEdge(1, 3)
    graph.addEdge(2, 4)
    graph.addEdge(3, 4)
    graph.addEdge(4, 5)

    # Perform BFS and DFS traversals
    graph.bfs(1)  # Start BFS from node 1
    graph.dfs(1)  # Start DFS from node 1

#Sample Input: Graph with edges: (1,2), (1,3), (2,4), (3,4), (4,5)
#Sample Output: BFS Traversal: 1 2 3 4 5
#              DFS Traversal: 1 3 4 5 2

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork