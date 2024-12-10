# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Linked List Traversal
# This program demonstrates traversing and inserting nodes in a linked list

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Traversal    | O(n)      | O(n)         | O(n)       |
#|Insertion    | O(1)      | O(n)         | O(n)       |

# class to represent a Node in linked list
class Node:
    # Constructor to initialize the node
    def __init__(self, data):
        self.data = data  # data stored in the node
        self.next = None  # reference to the next node

# Function to traverse and print the linked list
def traverse(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")

# Function to insert a new node at the end
def insert(head, data):
    new_node = Node(data)
    
    if not head:
        return new_node
    
    temp = head
    while temp.next:
        temp = temp.next
    
    temp.next = new_node
    return head

# main function
if __name__ == "__main__":
    head = None

    # Insert some nodes
    head = insert(head, 10)
    head = insert(head, 20)
    head = insert(head, 30)
    head = insert(head, 50)
    head = insert(head, 60)
    head = insert(head, 70)

    # Print the linked list
    print("Linked list: ", end="")
    traverse(head)

#Sample Input: None (Static node insertion)
#Sample Output: Linked list: 10 -> 20 -> 30 -> 50 -> 60 -> 70 -> None

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 