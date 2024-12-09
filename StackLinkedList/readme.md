# Stack Implementation Using Linked List

This folder contains implementations of Stack data structure using linked list in multiple programming languages.

## Description
The program demonstrates:
- Stack implementation using linked list
- Basic stack operations (push, pop, peek)
- Dynamic memory allocation/deallocation
- LIFO (Last In First Out) principle

## Algorithm Steps
1. Initialize:
   - Root (top) pointer as null
2. Push Operation:
   - Create new node
   - Set new node's next to root
   - Update root to new node
3. Pop Operation:
   - Check for underflow
   - Store root's data
   - Move root to next node
   - Free old node
   - Return stored data
4. Peek Operation:
   - Return root's data without removing

## Features
- Dynamic size implementation
- Constant time operations
- No overflow condition
- Memory efficient for variable size

## Directory Structure
```
StackLinkedList/
├── cpp/
│   └── stack-Linked.cpp
├── java/
│   └── StackLinked.java
├── python/
│   └── stackLinked.py
└── readme.md
```

## Complexity Analysis
- Space Complexity: O(n) where n is number of elements
- Time Complexity:
  - Push: O(1)
  - Pop: O(1)
  - Peek: O(1)

**Page Number in Book**: 92

**GitHub Link**: [Open Folder on GitHub](https://github.com/venkys-media/Venky_on_Datastructures/tree/main/StackLinkedList)

## QR Code
![QR Code](./URL%20QR%20Code%20(14).png)

## Join Our Communities
- [LinkedIn](https://www.linkedin.com/company/venkysio)
- [Facebook](https://www.facebook.com/venkysio)
- [Instagram](https://www.instagram.com/venkys.io)
- [Twitter](https://twitter.com/iovenkys)
- [Youtube](https://www.youtube.com/@CoreCodersNetwork)
