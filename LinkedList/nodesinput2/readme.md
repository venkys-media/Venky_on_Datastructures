# Linked List Node Input Implementation (Method 2)

This folder contains implementations for creating a linked list by taking user input and adding nodes at the end by traversing.

## Description
The program demonstrates:
- Dynamic creation of linked list nodes
- Taking user input for node data
- Traversing to the end to add new nodes
- Printing the final linked list

## Algorithm Steps
1. Initialize head as null
2. For each input:
   - Create new node with input data
   - If head is null, set head to new node
   - Else traverse to end and link new node
   - No need to maintain previous pointer

## Features
- Simple traversal-based insertion
- Takes number of nodes as input
- Creates nodes dynamically
- Maintains proper links
- Prints the final list

## Directory Structure
```
nodesinput2/
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
  - Insertion: O(n) - needs to traverse to end
  - Traversal: O(n)

## Key Differences from Method 1
- Adds nodes by traversing to the end
- No need to maintain previous pointer
- Higher time complexity for insertion

**Page Number in Book**: 60

**GitHub Link**: [Open Folder on GitHub](https://github.com/venkys-media/Venky_on_Datastructures/tree/main/LinkedList/nodesinput2)

## QR Code
![QR Code](./URL%20QR%20Code%20(7).png)

## Join Our Communities
- [LinkedIn](https://www.linkedin.com/company/venkysio)
- [Facebook](https://www.facebook.com/venkysio)
- [Instagram](https://www.instagram.com/venkys.io)
- [Twitter](https://twitter.com/iovenkys)
- [Youtube](https://www.youtube.com/@CoreCodersNetwork)