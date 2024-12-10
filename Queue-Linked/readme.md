# Queue Implementation Using Linked List

This folder contains implementations of Queue data structure using linked list in multiple programming languages.

## Description
The program demonstrates:
- Queue implementation using linked list
- Basic queue operations (enqueue, dequeue)
- Front and rear pointer management
- Dynamic memory allocation

## Algorithm Steps
1. Initialize:
   - Front and rear pointers as null
2. Enqueue:
   - Create new node
   - If queue empty, set front and rear to new node
   - Else link rear to new node and update rear
3. Dequeue:
   - Check for underflow
   - Store front node data
   - Move front to next node
   - Update rear if queue becomes empty
   - Return stored data

## Features
- Dynamic size
- Constant time operations
- No overflow condition
- Memory efficient

## Directory Structure
```
Queue-Linked/
├── cpp/
│   └── QueueLinked.cpp
├── java/
│   └── QueueLinked.java
├── python/
│   └── QueueLinked.py
└── readme.md
```

## Complexity Analysis
- Space Complexity: O(n) - where n is number of nodes
- Time Complexity:
  - Enqueue: O(1)
  - Dequeue: O(1)
  - Front/Rear Access: O(1)

**Page Number in Book**: 102

**GitHub Link**: [Open Folder on GitHub](https://github.com/venkys-media/Venky_on_Datastructures/tree/main/Queue-Linked)

## QR Code
![QR Code](./URL%20QR%20Code%20(15).png)

## Join Our Communities
- [LinkedIn](https://www.linkedin.com/company/venkysio)
- [Facebook](https://www.facebook.com/venkysio)
- [Instagram](https://www.instagram.com/venkys.io)
- [Twitter](https://twitter.com/iovenkys)
- [Youtube](https://www.youtube.com/@CoreCodersNetwork)

