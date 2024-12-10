# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for deleting a node at specific position in Linked List
# This program demonstrates deletion at any given position

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Deletion     | O(1)      | O(n)         | O(n)       |

# class to represent a Node in linked list
class Node:
    # Constructor to initialize the node
    def __init__(self, data):
        self.data = data  # Node data
        self.next = None  # Reference to the next node

# Function to count the size of the list
def count_list_size(head):
    size = 0
    temp = head
    while temp is not None:
        size += 1
        temp = temp.next
    return size

# Function to delete a node at a specific position
def delete_any_node(head, node_num):
    if head is None or node_num < 1:
        print("Invalid operation.")
        return head

    if node_num == 1:
        return head.next  # Delete head

    current = head
    for i in range(1):
        if current.next is None or i >= node_num - 1:
            print("Position exceeds list size.")
            return head
        current = current.next

    if current.next is None:
        print("Position exceeds list size.")
        return head

    current.next = current.next.next  # Bypass node
    return head

# Function to print the linked list
def print_list(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

# main function
def main():
    # Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(4)
    head.next.next.next.next = Node(5)

    print("Original Linked List:")
    print_list(head)

    head = delete_any_node(head, 3)  # Delete node at position 3

    print("After deleting position 3:")
    print_list(head)

if __name__ == "__main__":
    main()

#Sample Input: List: 1->2->3->4->5, Delete position: 3
#Sample Output: List after deletion: 1 2 4 5

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 