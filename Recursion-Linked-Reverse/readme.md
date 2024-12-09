# Recursive Linked List Reversal Implementation

This folder contains implementations for reversing a linked list using recursion.

## Description
The program demonstrates:
- Recursive approach to reverse a linked list
- Stack frame utilization in recursion
- Pointer/reference manipulation
- Memory management in different languages

## Algorithm Steps
1. Base case:
   - If list is empty or has one node, return head
2. Recursive case:
   - Make recursive call on rest of list
   - Adjust pointers:
     - Make next node point to current
     - Set current's next to null
   - Return new head

## Features
- Recursive implementation
- In-place reversal
- Memory efficient
- Clean stack unwinding

## Directory Structure
```
Recursion-Linked-Reverse/
├── cpp/
│   └── LinkedReverse.cpp
├── java/
│   └── LinkedReverse.java
├── python/
│   └── LinkedReverse.py
└── readme.md
```

## Complexity Analysis
- Space Complexity: O(n) - recursive stack frames
- Time Complexity: O(n) - visits each node once

**Page Number in Book**: 112

**GitHub Link**: [Open Folder on GitHub](https://github.com/venkys-media/Venky_on_Datastructures/tree/main/Recursion-Linked-Reverse)

## QR Code
![QR Code](./URL%20QR%20Code%20(17).png)

## Join Our Communities
- [LinkedIn](https://www.linkedin.com/company/venkysio)
- [Facebook](https://www.facebook.com/venkysio)
- [Instagram](https://www.instagram.com/venkys.io)
- [Twitter](https://twitter.com/iovenkys)
- [Youtube](https://www.youtube.com/@venkysio)
