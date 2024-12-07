# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for deleting first node in Linked List
# This program demonstrates deletion of head node

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Deletion     | O(1)      | O(1)         | O(1)       |

# class to represent a Node in linked list
class Node:
    # Constructor to initialize the node
    def __init__(self, data):
        self.data = data  # Node data
        self.next = None  # Reference to the next node

# Function to delete the first node
def delete_first_node(head):
    # If the list is empty
    if head is None:
        return None

    # If the list has only one node
    if head.next is None:
        return None  # Explicitly set head to None

    # If the list has multiple nodes
    head = head.next  # Move head to the next node
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
    head = None  # Head of the linked list

    n = int(input("Enter the number of nodes: "))

    # Create linked list with n nodes
    for i in range(n):
        data = int(input(f"Enter data for node {i + 1}: "))
        new_node = Node(data)

        if head is None:
            head = new_node  # First node becomes head
        else:
            temp = head
            while temp.next is not None:
                temp = temp.next  # Traverse to the last node
            temp.next = new_node  # Link new node at the end

    print("Original Linked List:")
    print_list(head)

    # Deleting the first node
    head = delete_first_node(head)

    print("Linked List after deleting the first node:")
    print_list(head)

if __name__ == "__main__":
    main()

#Sample Input: n=5, nodes: 1 2 3 4 5
#Sample Output: Original List: 1 2 3 4 5
#              After deletion: 2 3 4 5

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@venkysio 