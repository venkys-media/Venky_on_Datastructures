from collections import defaultdict, deque

class Graph:
    def __init__(self):
        self.adjList = defaultdict(list)

    # Add an edge between two nodes (undirected graph)
    def addEdge(self, src, dest):
        self.adjList[src].append(dest)
        self.adjList[dest].append(src)

    # BFS Traversal
    def bfs(self, start):
        visited = set()
        queue = deque([start])
        visited.add(start)

        print("BFS Traversal:", end=" ")
        while queue:
            node = queue.popleft()
            print(node, end=" ")

            for neighbor in self.adjList[node]:
                if neighbor not in visited:
                    visited.add(neighbor)
                    queue.append(neighbor)
        print()

    # DFS Traversal
    def dfs(self, start):
        visited = set()
        stack = [start]
        visited.add(start)

        print("DFS Traversal:", end=" ")
        while stack:
            node = stack.pop()
            print(node, end=" ")

            for neighbor in self.adjList[node]:
                if neighbor not in visited:
                    visited.add(neighbor)
                    stack.append(neighbor)
        print()

if __name__ == "__main__":
    graph = Graph()

    # Adding nodes and edges to the graph
    graph.addEdge(1, 2)
    graph.addEdge(1, 3)
    graph.addEdge(2, 4)
    graph.addEdge(3, 4)
    graph.addEdge(4, 5)

    # Perform BFS and DFS
    graph.bfs(1)  # Start BFS from node 1
    graph.dfs(1)  # Start DFS from node 1
