# Insert Node Implementation

This folder contains implementations for inserting a node at a specific position in a linked list.

## Description
The program demonstrates:
- Inserting a node at any given position
- Handling edge cases (head insertion, invalid position)
- Maintaining proper links after insertion
- Basic linked list operations

## Algorithm Steps
1. Create new node with given data
2. If position is 1:
   - Make new node point to head
   - Return new node as head
3. Traverse to position-1
4. If position invalid, return head
5. Link new node to next node
6. Link previous node to new node

## Features
- Position-based insertion
- Edge case handling
- Memory efficient
- Clean memory handling

## Directory Structure
```
Insert-Node/
├── cpp/
│   └── InsertNode.cpp
├── java/
│   └── InsertNode.java
├── python/
│   └── InsertNode.py
└── readme.md
```

## Complexity Analysis
- Space Complexity: O(1) - only creates one new node
- Time Complexity:
  - Best Case: O(1) - insertion at head
  - Average/Worst Case: O(n) - insertion at end

**Page Number in Book**: 70

**GitHub Link**: [Open Folder on GitHub](https://github.com/venkys-media/Venky_on_Datastructures/tree/main/LinkedList/Insert-Node)

## QR Code
![QR Code](./URL%20QR%20Code%20(9).png)

## Join Our Communities
- [LinkedIn](https://www.linkedin.com/company/venkysio)
- [Facebook](https://www.facebook.com/venkysio)
- [Instagram](https://www.instagram.com/venkys.io)
- [Twitter](https://twitter.com/iovenkys)
- [Youtube](https://www.youtube.com/@venkysio) 