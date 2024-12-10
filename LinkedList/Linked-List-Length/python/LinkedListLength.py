# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for finding length of a Linked List
# This program demonstrates counting nodes in a linked list

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Count Length | O(n)      | O(n)         | O(n)       |

# class to represent a Node in linked list
class Node:
    # Constructor to initialize a node with data
    def __init__(self, data):
        self.data = data  # data stored in the node
        self.next = None  # reference to the next node

# Function to count the number of nodes in the linked list
def count_list_size(head):
    size = 0
    temp = head
    while temp is not None:
        size += 1  # Increment size for each node
        temp = temp.next  # Move to the next node
    return size

# main function
if __name__ == "__main__":
    # Create a linked list: 1 -> 2 -> 3 -> 5
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(5)

    # Count the number of nodes in the list
    size = count_list_size(head)
    print("Number of nodes in the list:", size)

#Sample Input: None (Static list creation: 1 -> 2 -> 3 -> 5)
#Sample Output: Number of nodes in the list: 4

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 