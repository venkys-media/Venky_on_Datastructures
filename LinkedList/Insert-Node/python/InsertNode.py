# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for inserting a node at a specific position in Linked List
# This program demonstrates insertion at any given position

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Insertion    | O(1)      | O(n)         | O(n)       |

# class to represent a Node in linked list
class Node:
    # Constructor to initialize the node
    def __init__(self, val):
        self.data = val   # Node data
        self.next = None  # Reference to the next node

# Function to insert a node at a specific position
def insert_node(head, data, position):
    new_node = Node(data)

    if position == 1:  # Insert at the head
        new_node.next = head
        return new_node

    current = head
    for _ in range(1, position - 1):
        if current is None:
            print("Invalid position!")
            return head
        current = current.next

    if current is None:  # Position is beyond the list length
        print("Invalid position!")
        return head

    new_node.next = current.next
    current.next = new_node
    return head

# Function to print the linked list
def print_list(head):
    current = head
    while current is not None:
        print(current.data, end=" -> ")
        current = current.next
    print("None")

# main function
if __name__ == "__main__":
    # Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(4)
    head.next.next.next.next = Node(5)

    # Print the original list
    print("Original list: ", end="")
    print_list(head)

    # Insert a new node with value 2.5 at position 3
    head = insert_node(head, 2.5, 3)

    # Print the modified list
    print("List after inserting 2.5 at position 3: ", end="")
    print_list(head)

#Sample Input: List: 1->2->3->4->5, Insert: value=2.5, position=3
#Sample Output: List after inserting 2.5 at position 3: 1 -> 2 -> 2.5 -> 3 -> 4 -> 5 -> None

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@venkysio 