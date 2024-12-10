# Linked List Reversal Implementation

This folder contains implementations for reversing a singly linked list iteratively.

## Description
The program demonstrates:
- Iterative reversal of linked list
- Maintaining three pointers (prev, current, next)
- Reversing links between nodes
- Printing the list before and after reversal

## Algorithm Steps
1. Initialize three pointers: prev as null, current as head
2. Traverse the list:
   - Store next node
   - Reverse current node's pointer
   - Move prev and current one step forward
3. Update head to prev (last node)

## Features
- In-place reversal (no extra space)
- Handles any list length
- Preserves all nodes
- Prints before and after states

## Directory Structure
```
reverse/
├── cpp/
│   └── reverse.cpp
├── java/
│   └── Main.java
├── python/
│   └── reverse.py
└── readme.md
```

## Complexity Analysis
- Space Complexity: O(1) - only uses three pointers
- Time Complexity: O(n) where n is number of nodes
  - Single traversal required
  - Each node visited exactly once

**Page Number in Book**: 79

**GitHub Link**: [Open Folder on GitHub](https://github.com/venkys-media/Venky_on_Datastructures/tree/main/LinkedList/reverse)

## QR Code
![QR Code](./URL%20QR%20Code%20(10).png)

## Join Our Communities
- [LinkedIn](https://www.linkedin.com/company/venkysio)
- [Facebook](https://www.facebook.com/venkysio)
- [Instagram](https://www.instagram.com/venkys.io)
- [Twitter](https://twitter.com/iovenkys)
- [Youtube](https://www.youtube.com/@CoreCodersNetwork)