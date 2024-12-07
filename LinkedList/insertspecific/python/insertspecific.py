# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for inserting a node at specific position in Linked List
# This program demonstrates insertion at any given position

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Insertion    | O(1)      | O(n)         | O(n)       |

# class to represent a Node in linked list
class Node:
    # Constructor to initialize a node
    def __init__(self, data):
        self.data = data  # Node data
        self.next = None  # Reference to the next node

# Function to insert a node at a specific position
def insert_node(head, data, position):
    new_node = Node(data)
    if position == 1:  # Insert at the head
        new_node.next = head
        return new_node

    current = head
    for i in range(1, position - 1):
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

    # Insert a new node with value 2 at position 3
    head = insert_node(head, 2, 3)

    # Print the updated linked list
    print("Updated Linked List:", end=" ")
    print_list(head)

if __name__ == "__main__":
    main()

#Sample Input: List: 1->2->3->4->5, Insert: value=2, position=3
#Sample Output: Updated Linked List: 1 2 2 3 4 5

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@venkysio 