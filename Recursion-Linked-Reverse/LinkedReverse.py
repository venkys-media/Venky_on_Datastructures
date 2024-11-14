class Node:
    def __init__(self, val):
        self.data = val  # Data part of the node
        self.next = None  # Pointer to the next node

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
