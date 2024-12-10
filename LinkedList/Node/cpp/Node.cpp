/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Node structure for Linked List
// This is a basic building block for linked list implementation

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Constructor  | O(1)      | O(1)         | O(1)       |

#include <iostream>
using namespace std;

// structure to represent a Node in linked list
struct Node {
    int data;     // data stored in the node
    Node* next;   // pointer to the next node
    
    // constructor to initialize node with given value
    Node(int val) : data(val), next(nullptr) {}
};

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 