# Linked List Node Input Implementation (Method 1)

This folder contains implementations for creating a linked list by taking user input and adding nodes using a previous pointer.

## Description
The program demonstrates:
- Dynamic creation of linked list nodes
- Taking user input for node data
- Efficient node insertion using previous pointer
- Printing the final linked list

## Algorithm Steps
1. Initialize head and previous as null
2. For each input:
   - Create new node with input data
   - If head is null, set head to new node
   - Else link previous node to new node
   - Update previous to new node

## Features
- Efficient node insertion (O(1))
- Takes number of nodes as input
- Creates nodes dynamically
- Maintains proper links
- Prints the final list

## Directory Structure
```
nodesinput/
├── cpp/
│   └── nodesinput.cpp
├── java/
│   └── Main.java
├── python/
│   └── nodesinput.py
└── readme.md
```

## Complexity Analysis
- Space Complexity: O(n) where n is number of nodes
- Time Complexity:
  - Insertion: O(1) - uses previous pointer
  - Traversal: O(n)

## Key Features
- Uses previous pointer for efficient insertion
- No need to traverse for adding nodes
- Better time complexity than Method 2

**Page Number in Book**: 57

**GitHub Link**: [Open Folder on GitHub](https://github.com/venkys-media/Venky_on_Datastructures/tree/main/LinkedList/nodesinput)

## QR Code
![QR Code](./URL%20QR%20Code%20(6).png)

## Join Our Communities
- [LinkedIn](https://www.linkedin.com/company/venkysio)
- [Facebook](https://www.facebook.com/venkysio)
- [Instagram](https://www.instagram.com/venkys.io)
- [Twitter](https://twitter.com/iovenkys)
- [Youtube](https://www.youtube.com/@CoreCodersNetwork)