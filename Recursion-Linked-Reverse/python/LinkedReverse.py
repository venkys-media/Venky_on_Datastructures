# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for reversing a linked list using recursion
# This program demonstrates recursive approach to reverse list

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Recursion    | O(n)      | O(n)         | O(n)       |

# class to represent a Node in linked list
class Node:
    def __init__(self, val):
        self.data = val  # Data part of the node
        self.next = None  # Reference to the next node

def reverse(head):
    # Base case: if head is None or there's only one node
    if head is None or head.next is None:
        return head

    # Recursive call to reverse the rest of the list
    rest = reverse(head.next)

    # Adjust pointers
    head.next.next = head  # Make the next node point to the current node
    head.next = None       # Set the next of current node to None

    return rest            # Return the new head of the reversed list

def print_list(head):
    while head is not None:
        print(head.data, end=" ")  # Print the data of the current node
        head = head.next            # Move to the next node
    print()                        # Print a new line at the end

def main():
    # Create a linked list: 1 -> 2 -> 3 -> 4
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(4)

    # Print the original list
    print("Original List: ", end="")
    print_list(head)

    # Reverse the linked list
    head = reverse(head)

    # Print the reversed list
    print("Reversed List: ", end="")
    print_list(head)

if __name__ == "__main__":
    main()

#Sample Input: List: 1->2->3->4
#Sample Output: Original List: 1 2 3 4
#              Reversed List: 4 3 2 1

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@venkysio 