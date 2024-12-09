# Binary Tree Traversal Implementation

This folder contains implementations for different traversal methods of a binary tree.

## Description
The program demonstrates:
- Binary tree node creation and linking
- Different traversal techniques:
  - Depth First Search (DFS)
    - In-order traversal
    - Pre-order traversal
    - Post-order traversal
  - Breadth First Search (BFS)
    - Level order traversal
- BST insertion for testing

## Algorithm Steps
1. DFS Traversals:
   - In-order (Left, Root, Right):
     - Traverse left subtree
     - Visit root node
     - Traverse right subtree
   - Pre-order (Root, Left, Right):
     - Visit root node
     - Traverse left subtree
     - Traverse right subtree
   - Post-order (Left, Right, Root):
     - Traverse left subtree
     - Traverse right subtree
     - Visit root node
2. BFS Traversal:
   - Use queue to store nodes
   - Process nodes level by level
   - Print each level from left to right

## Features
- Multiple traversal methods
- Queue-based BFS implementation
- Recursive DFS implementation
- BST-based insertion

## Directory Structure
```
Binary-Tree-Traversal/
├── cpp/
│   ├── BFS.cpp
│   └── Traversal.cpp
├── java/
│   ├── BFS.java
│   └── Traversal.java
├── python/
│   ├── BFS.py
│   └── Traversal.py
└── readme.md
```

## Complexity Analysis
- Space Complexity:
  - DFS: O(h) where h is height of tree
  - BFS: O(w) where w is maximum width of tree
- Time Complexity:
  - All traversals: O(n) where n is number of nodes
  - Insertion: O(h)

**Page Number in Book**: 118

**GitHub Link**: [Open Folder on GitHub](https://github.com/venkys-media/Venky_on_Datastructures/tree/main/Binary-Tree/Binary-Tree-Traversal)

## QR Code
![QR Code](./URL%20QR%20Code%20(20).png)

## Join Our Communities
- [LinkedIn](https://www.linkedin.com/company/venkysio)
- [Facebook](https://www.facebook.com/venkysio)
- [Instagram](https://www.instagram.com/venkys.io)
- [Twitter](https://twitter.com/iovenkys)
- [Youtube](https://www.youtube.com/@CoreCodersNetwork) 