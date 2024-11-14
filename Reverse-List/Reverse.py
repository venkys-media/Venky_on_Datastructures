class Node:
    def __init__(self, val):
        self.data = val
        self.next = None


def reverse_list(head):
    prev = None
    current = head
    next_node = None

    while current is not None:
        next_node = current.next  # Store the next node
        current.next = prev        # Reverse the current node's pointer
        prev = current             # Move pointers one position ahead
        current = next_node

    head = prev
    return head


def print_list(head):
    current = head
    while current is not None:
        print(current.data, end=" -> ")
        current = current.next
    print("None")


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

    # Reverse the linked list
    head = reverse_list(head)

    # Print the reversed list
    print("Reversed list: ", end="")
    print_list(head)

    # Clean up remaining nodes (optional in Python)
    while head is not None:
        temp = head
        head = head.next
        del temp
