# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Linked List with user input (Method 1)
# This program demonstrates creation of linked list using previous pointer

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Insertion    | O(1)      | O(1)         | O(1)       |
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
    head = None      # head of the linked list
    previous = None  # track previous node

    # take number of nodes as input
    n = int(input("Enter the number of nodes: "))

    # create linked list with n nodes
    for i in range(n):
        data = int(input(f"Enter data for node {i + 1}: "))
        current = Node(data)
        
        if head is None:
            head = current      # First node becomes head
        else:
            previous.next = current  # Link previous node to current
        previous = current      # Update previous to current

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