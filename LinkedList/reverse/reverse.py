class Node:
    def __init__(self, data):
        self.data = data  # Node data
        self.next = None  # Pointer to the next node

def reverse_list(head):
    current = head
    prev = None

    while current is not None:
        next_node = current.next  # Store the next node
        current.next = prev       # Reverse the current node's pointer
        prev = current            # Move prev to current
        current = next_node       # Move current to next

    head = prev  # Update head to the new front
    return head

def print_list(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

def main():
    # Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(4)
    head.next.next.next.next = Node(5)

    print("Original Linked List:", end=" ")
    print_list(head)

    # Reverse the linked list
    head = reverse_list(head)

    print("Reversed Linked List:", end=" ")
    print_list(head)

if __name__ == "__main__":
    main()