# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Linked List with user input (Method 2)
# This program demonstrates creation of linked list by traversing to end

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Insertion    | O(1)      | O(n)         | O(n)       |
#|Traversal    | O(n)      | O(n)         | O(n)       |

# class to represent a Node in linked list
class Node:
    # Constructor to initialize the node
    def __init__(self, data):
        self.data = data  # data stored in the node
        self.next = None  # reference to the next node

# Function to print the linked list
def print_list(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

# main function
def main():
    head = None  # head of the linked list

    # take number of nodes as input
    n = int(input("Enter the number of nodes: "))

    # create linked list with n nodes
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

    # Print the linked list
    print("\nThe linked list is:")
    print_list(head)

if __name__ == "__main__":
    main()

#Sample Input: 3
#             10 20 30
#Sample Output: 10 20 30

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 