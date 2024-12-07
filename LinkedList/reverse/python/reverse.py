# Copyrights to venkys.io
# Visit https://venkys.io for more information

# Python program for implementing Linked List Reversal
# This program demonstrates reversing a linked list iteratively

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Reversal     | O(n)      | O(n)         | O(n)       |
#|Traversal    | O(n)      | O(n)         | O(n)       |

# class to represent a Node in linked list
class Node:
    # Constructor to initialize the node
    def __init__(self, data):
        self.data = data  # data stored in the node
        self.next = None  # reference to the next node

# Function to reverse the linked list
def reverse_list(head):
    current = head
    prev = None
    
    # traverse and reverse links
    while current is not None:
        next_node = current.next  # Store the next node
        current.next = prev       # Reverse the current node's pointer
        prev = current            # Move prev to current
        current = next_node       # Move current to next
    
    return prev  # New head of reversed list

# Function to print the linked list
def print_list(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

# main function
def main():
    # Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(4)
    head.next.next.next.next = Node(5)

    # Print original list
    print("Original Linked List:")
    print_list(head)

    # Reverse the linked list
    head = reverse_list(head)

    # Print reversed list
    print("Reversed Linked List:")
    print_list(head)

if __name__ == "__main__":
    main()

#Sample Input: 1 -> 2 -> 3 -> 4 -> 5
#Sample Output: 5 -> 4 -> 3 -> 2 -> 1

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@venkysio 